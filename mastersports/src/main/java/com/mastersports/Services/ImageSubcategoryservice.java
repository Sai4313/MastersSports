package com.mastersports.Services;

import com.mastersports.Entity.ImageSubcategory;
import com.mastersports.Entity.Imagecategory;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageSubcategoryservice {

    public String saveImage(MultipartFile subcategoryfilename, String smalldescription, double price, Imagecategory category_id) throws IOException;

    public List<ImageSubcategory> getAllsubImages();

}
