package com.personal.customerms.service;

import com.personal.customerms.dto.CustomerDTO;
import com.personal.customerms.entity.Customer;
import com.personal.customerms.exception.CustomerException;
import com.personal.customerms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public CustomerDTO registerCustomer(CustomerDTO customerDTO) throws CustomerException {
        boolean emailNotExists = customerRepository.findByUsername(customerDTO.getUsername()).isEmpty();
        boolean usernameNotExists = customerRepository.findByUsername(customerDTO.getUsername()).isEmpty();
        if(emailNotExists){
            if(usernameNotExists){
                Customer customer=new Customer();
                customer.setEmail(customerDTO.getEmail());
                customer.setFullName(customerDTO.getFullName());
                customer.setUsername(customerDTO.getUsername());
                customer.setPassword(passwordEncoder.encode(customerDTO.getPassword()));
                customer.setIsAdmin(customerDTO.getIsAdmin());
                customer.setStatus(true);
                Customer savedCustomer = customerRepository.save(customer);
                customerDTO.setId(savedCustomer.getId());
                return customerDTO;
            }else{
                throw  new CustomerException("USERNAME.EXISTS");
            }
        }else{
            throw  new CustomerException("EMAIL.EXISTS");
        }
    }
}
