package com.mastersports.Services;

import org.springframework.stereotype.Service;

@Service
public interface userLoginService {

    boolean isValidUser(String username, String password);
}
