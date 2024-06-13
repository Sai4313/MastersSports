package com.mastersports.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ImageSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subcategoryfilename;

    private String smalldescription;

    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Imagecategory imagecategory;


    public Imagecategory getImagecategory() {
        return imagecategory;
    }

    public long getCategoryId() {  // Updated return type to long
        return imagecategory != null ? imagecategory.getId() : 0L;
    }
}
