package com.mastersports.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mastersports.Entity.billing;

@Repository
public interface billingrepository extends JpaRepository<billing,Long> {

}
