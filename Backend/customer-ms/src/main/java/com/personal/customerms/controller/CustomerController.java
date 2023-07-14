package com.personal.customerms.controller;

import com.personal.customerms.dto.CustomerDTO;
import com.personal.customerms.exception.CustomerException;
import com.personal.customerms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody  CustomerDTO customerDTO) throws CustomerException {
        System.out.println("hi");
        customerService.registerCustomer(customerDTO);
        return new ResponseEntity<String>("Registered Succsessfully",HttpStatus.CREATED);
    }
    @GetMapping ("/test")
    public ResponseEntity<String> testCustomerController(){
        return new ResponseEntity<String>("Customer controller is working", HttpStatus.OK);
    }

}
