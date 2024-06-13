package com.mastersports.ServiceImpl;

import com.mastersports.Entity.ImageSubcategory;
import com.mastersports.Entity.Imagecategory;
import com.mastersports.Repository.Imagesubcategoryrepository;
import com.mastersports.Services.ImageSubcategoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Service
public class ImageSubcategoryserviceImp implements ImageSubcategoryservice {

    @Value("${uploadpath}")
     String uploadPath;

    @Autowired
    private Imagesubcategoryrepository imagesubRepository;

    @Override
    public String saveImage(MultipartFile subcategoryfilename, String smalldescription, double price, Imagecategory categoryid) throws IOException {
        String fileName = subcategoryfilename.getOriginalFilename();
        Path filePath = Paths.get(uploadPath, fileName);
        Files.write(filePath, subcategoryfilename.getBytes());

        ImageSubcategory image = new ImageSubcategory();
        image.setSubcategoryfilename(fileName);
        image.setSmalldescription(smalldescription);
        image.setPrice(price);
        image.setImagecategory(categoryid);
        imagesubRepository.save(image);

        return fileName;
    }


    @Override
    public List<ImageSubcategory> getAllsubImages() {
        return imagesubRepository.findAll();
    }
    public List<ImageSubcategory> getEntitiesByCategoryId(long categoryId) {  // Updated to long
        return imagesubRepository.findByImagecategory_Id(categoryId);
    }

}
