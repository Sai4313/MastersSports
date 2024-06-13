package com.mastersports.Repository;

import com.mastersports.Entity.userLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userLoginRepository extends JpaRepository<userLogin, Integer> {
    userLogin findByEmail(String email);

}
