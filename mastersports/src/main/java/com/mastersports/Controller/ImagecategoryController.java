package com.mastersports.Controller;

import com.mastersports.Entity.ImageSubcategory;
import com.mastersports.Entity.Imagecategory;
import com.mastersports.ServiceImpl.Imagecategoryserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/mastersports")
@CrossOrigin //(origins = "http://localhost:4200")
public class ImagecategoryController {

    @Autowired
    private Imagecategoryserviceimpl imageService;

    @PostMapping("/save")
    public String saveImage(@RequestParam("file") MultipartFile file,
                            @RequestParam("nameofproduct") String nameofproduct,
                            @RequestParam("price") double price) {
        try {
            return imageService.saveImage(file, nameofproduct, price);
        } catch (IOException e) {
            e.printStackTrace(); // Handle exception appropriately
            return "Error saving image";
        }
    }

    @GetMapping("/get")
    public ResponseEntity<List<Imagecategory>> getAllImagePaths() {
        List<Imagecategory> imagePaths = imageService.getAllImages();
        System.out.println(imagePaths.toString());
        return ResponseEntity.ok().body(imagePaths);
    }



}
