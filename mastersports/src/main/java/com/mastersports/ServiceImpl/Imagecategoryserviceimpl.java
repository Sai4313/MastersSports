package com.mastersports.ServiceImpl;

import com.mastersports.Entity.Imagecategory;
import com.mastersports.Repository.ImagecategoryRepository;
import com.mastersports.Services.Imagecategoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class Imagecategoryserviceimpl implements Imagecategoryservice {


    @Value("${categoryuploadpath}")
    String uploadPath;

    @Autowired
    private ImagecategoryRepository imageRepository;

    @Override
    public String saveImage(MultipartFile file, String nameofproduct, double price) throws IOException {

//        System.out.println( "UPLOAD PATH "+uploadPath);
//        String fileName = file.getOriginalFilename();
//        Path filePath = Paths.get(uploadPath, fileName);
//        Files.write(filePath, file.getBytes());
//
//        // Save the path only in database
//        Imagecategory image = new Imagecategory();
//        image.setFileName(fileName);
//        image.setNameofproduct(nameofproduct);
//        image.setPrice(price);
//        imageRepository.save(image);
//        return fileName;
    	
    	
    	 String fileName = file.getOriginalFilename();
    	    Path filePath = Paths.get(uploadPath, fileName);
    	    
    	    try {
    	        System.out.println("UPLOAD PATH " + uploadPath);
    	        Files.write(filePath, file.getBytes());

    	        // Save the path only in database
    	        Imagecategory image = new Imagecategory();
    	        image.setFileName(fileName);
    	        image.setNameofproduct(nameofproduct);
    	        image.setPrice(price);
    	        imageRepository.save(image);
    	        
    	        return fileName;
    	    } catch (IOException e) {
    	        System.err.println("Error writing file to disk: " + e.getMessage());
    	     
    	        throw new RuntimeException("Failed to save image file", e);
    	    } catch (Exception e) {
    	        System.err.println("Unexpected error: " + e.getMessage());
    	        throw new RuntimeException("Unexpected error occurred", e);
    	    }
    }

    @Override
    public List<Imagecategory> getAllImages() {
    	 try {
    	        return imageRepository.findAll();
    	    } catch (Exception e) {
    	       
    	        System.err.println("Error retrieving images: " + e.getMessage());
    	        throw new RuntimeException("Failed to retrieve images", e);
    	    }
    }



}