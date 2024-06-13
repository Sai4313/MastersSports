package com.mastersports.Repository;

import com.mastersports.Entity.GetInTouch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Getintouchrepository extends JpaRepository<GetInTouch,Integer> {
}
