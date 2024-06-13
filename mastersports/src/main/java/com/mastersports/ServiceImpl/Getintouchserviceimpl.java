package com.mastersports.ServiceImpl;

import com.mastersports.Entity.GetInTouch;
import com.mastersports.Repository.Getintouchrepository;
import com.mastersports.Services.GetIntouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class Getintouchserviceimpl implements GetIntouchService {

    @Autowired
    Getintouchrepository getintouchrepository;

    @Override
    public void add(GetInTouch getInTouch) {
        getintouchrepository.save(getInTouch);
    }

    @Override
    public List<GetInTouch> getAllInTouch() {
        return getintouchrepository.findAll();
    }

    @Override
    public int count() {
        return (int) getintouchrepository.count();
    }

    @Override
    public void delete( Long id) {
        getintouchrepository.deleteById(Math.toIntExact(id));
    }
}
