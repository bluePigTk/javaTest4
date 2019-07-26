package com.tk.exam1.mapper;

import com.tk.exam1.model.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    Customer findCustomerByFirstNameAndLastName(Customer customer);
    void createCustomer(Customer customer);
     Long deleteCustomer(Long id);
    void updateCustomer(Customer customer);
    Customer findCustomerById(Long customerId);
}
