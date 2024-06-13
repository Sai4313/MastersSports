package com.mastersports.Controller;
import com.mastersports.Entity.userLogin;
import com.mastersports.ServiceImpl.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mastersports")
@CrossOrigin //(origins = "http://localhost:4200")
public class userLoginController {

    @Autowired
    private UserLoginServiceImpl userloginImpl;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody userLogin loginRequest) {
        boolean isValid = userloginImpl.isValidUser(loginRequest.getEmail(), loginRequest.getPassword());

        if (isValid) {
             return ResponseEntity.ok().body("{\"message\": \"Login successful\"}");
        } else {
            return ResponseEntity.badRequest().body("{\"error\": \"Invalid username or password\"}");
        }
    }
}
