package com.tk.exam1.service;

import com.tk.exam1.model.Customer;

public interface CustomerService {
    public Long createCustomer(Customer customer);
    public void  deleteCustomer(Long id);
    public Customer updateCustomer(Customer customer);
}
