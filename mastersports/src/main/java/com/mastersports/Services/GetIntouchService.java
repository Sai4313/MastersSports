package com.mastersports.Services;

import com.mastersports.Entity.GetInTouch;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GetIntouchService {

    public void add(GetInTouch getInTouch);
    public List<GetInTouch> getAllInTouch();

    public int count();

    void delete(@PathVariable Long id);
}
