package com.mastersports.ServiceImpl;


import com.mastersports.Entity.userLogin;
import com.mastersports.Repository.userLoginRepository;
import com.mastersports.Services.userLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements userLoginService {

    @Autowired
    private userLoginRepository userloginrepo;


    @Override
    public boolean isValidUser(String email, String password) {
        userLogin user = userloginrepo.findByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
