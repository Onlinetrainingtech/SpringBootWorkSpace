package com.example.SpringBootExampleB11.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController
{
     @RequestMapping("/")
     public ResponseEntity<String>indexPage()
     {
    	 return new ResponseEntity<String>("FirstSpringBootApplicaition",HttpStatus.OK);
     }
}
