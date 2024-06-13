package com.mastersports.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Imagecategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String fileName;

    private String nameofproduct;

    private double price;

}