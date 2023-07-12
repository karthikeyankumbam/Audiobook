package com.personal.customerms.controller;

import com.personal.customerms.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/test")
    public ResponseEntity<String> testCustomerController(){
        return new ResponseEntity<String>("Customer controller is working", HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody  CustomerDTO customerDTO){
        return new ResponseEntity<String>("Registered Succsessfully",HttpStatus.CREATED);
    }
}
