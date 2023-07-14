package com.personal.customerms.service;

import com.personal.customerms.dto.CustomerDTO;
import com.personal.customerms.exception.CustomerException;

public interface CustomerService {
    public CustomerDTO registerCustomer(CustomerDTO customerDTO) throws CustomerException;
}
