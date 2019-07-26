package com.tk.exam1.service.impl;

import com.tk.exam1.mapper.AdrMapper;
import com.tk.exam1.mapper.CustomerMapper;
import com.tk.exam1.model.Customer;
import com.tk.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    AdrMapper adrMapper;
    @Override
    public Long createCustomer(Customer customer) {
        String address = customer.getAddress();
        Long adressId = adrMapper.findAddressIdByAdress(address);
        customer.setAddress_id(adressId);
        customerMapper.createCustomer(customer);
        return customer.getCustomer_id();

    }

    @Override
    public void deleteCustomer(Long id) {
       customerMapper.deleteCustomer(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }
}
