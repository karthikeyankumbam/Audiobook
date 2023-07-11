package com.personal.customerms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/test")
    public ResponseEntity<String> testCustomerController(){
        return new ResponseEntity<String>("Customer controller is working", HttpStatus.OK);
    }
}
