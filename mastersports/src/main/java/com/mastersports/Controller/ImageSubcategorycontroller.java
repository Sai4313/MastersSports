package com.mastersports.Controller;

import com.mastersports.Entity.ImageSubcategory;
import com.mastersports.Entity.Imagecategory;
import com.mastersports.ServiceImpl.ImageSubcategoryserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/mastersports")
@CrossOrigin //(origins = "http://localhost:4200")
public class ImageSubcategorycontroller {

    @Autowired
    private ImageSubcategoryserviceImp imagesubcteoryservice;


    @PostMapping("/subcategorysave")
    public String saveImage(@RequestParam("subcategoryfilename") MultipartFile subcategoryfilename,
                            @RequestParam("smalldescription") String smalldescription,
                            @RequestParam("price") double price,
                            @RequestParam("category_id")Imagecategory categoryid) {
        try {
            return imagesubcteoryservice.saveImage(subcategoryfilename, smalldescription, price, categoryid);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error saving image";
        }
    }

    @GetMapping("/subimagesget")
    public ResponseEntity<List<ImageSubcategory>> getAllImagePaths() {
        List<ImageSubcategory> imagePaths = imagesubcteoryservice.getAllsubImages();
        return ResponseEntity.ok().body(imagePaths);
    }

    @GetMapping("/category/{categoryId}")
    public List<ImageSubcategory> getEntitiesByCategoryId(@PathVariable long categoryId) {  // Updated to long
        return imagesubcteoryservice.getEntitiesByCategoryId(categoryId);
    }
}
