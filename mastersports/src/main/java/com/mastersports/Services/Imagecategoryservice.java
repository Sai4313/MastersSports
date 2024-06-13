package com.mastersports.Services;


import com.mastersports.Entity.Imagecategory;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface Imagecategoryservice {
    public String saveImage(MultipartFile file,String nameofproduct,double price) throws IOException;
    public List<Imagecategory> getAllImages();
}
