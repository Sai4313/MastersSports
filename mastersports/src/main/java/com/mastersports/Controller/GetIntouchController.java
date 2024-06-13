package com.mastersports.Controller;

import com.mastersports.Entity.GetInTouch;
import com.mastersports.ServiceImpl.Getintouchserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mastersports")
@CrossOrigin
public class GetIntouchController {

    @Autowired
    private Getintouchserviceimpl getintouchserviceimpl;

    @PostMapping("/getintouch")
    public ResponseEntity<String> getIntouch(@RequestBody GetInTouch getInTouch) {
        try {
            getintouchserviceimpl.add(getInTouch);
            return ResponseEntity.ok(getInTouch.toString());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while processing the request.");
        }
    }

    @GetMapping("/notification")
    public List<GetInTouch> getNotification() {
        return getintouchserviceimpl.getAllInTouch();
    }

    @GetMapping("/count")
    public int count() {
        int count;
        try {
            count = getintouchserviceimpl.count();
        } catch (Exception e) {
            count = 0;
        }
        return count;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        getintouchserviceimpl.delete(id);
    }

    @GetMapping("/grreetind")
    public String sai()
    {
        return "WELCOME TO THE MASTER SPORTS";
    }

    @RequestMapping(value = "/demo", method=RequestMethod.GET)
    public String demomethod()
    {
        return "saikrishna";
    }

}
