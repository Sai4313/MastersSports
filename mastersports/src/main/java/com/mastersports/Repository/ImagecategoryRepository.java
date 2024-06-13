package com.mastersports.Repository;

import com.mastersports.Entity.Imagecategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagecategoryRepository extends JpaRepository<Imagecategory, Integer> {

}
