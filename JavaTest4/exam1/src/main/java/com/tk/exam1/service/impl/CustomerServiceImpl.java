package com.tk.exam1.service.impl;

import com.tk.exam1.mapper.AdrMapper;
import com.tk.exam1.mapper.CustomerMapper;
import com.tk.exam1.model.Customer;
import com.tk.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    AdrMapper adrMapper;
    @Override
    public Long createCustomer(Customer customer) {
        String address = customer.getAddress();
       //为了测试方便，其他数据指定
        customer.setActive(1l);
        customer.setStore_id(2l);
        customer.setCreate_date(new Date());
        customer.setLast_update(new Date());
        Long adressId = adrMapper.findAddressIdByAdress(address);
        customer.setAddress_id(adressId);
        customerMapper.createCustomer(customer);
        return customer.getCustomer_id();

    }

    @Override
    public Long deleteCustomer(Long id) {
       return customerMapper.deleteCustomer(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {

        String address = customer.getAddress();
        Long adressId=null;
        if(address!=null){
             adressId = adrMapper.findAddressIdByAdress(address);
        }
        customer.setAddress_id(adressId);
        //更新后
        customerMapper.updateCustomer(customer);
        //重新查询并返回
        Customer newCustomer = customerMapper.findCustomerById(customer.getCustomer_id());
        String newAddress = adrMapper.findAdressByAdressId(customer.getAddress_id());
        newCustomer.setAddress(newAddress);
        return newCustomer;
    }
}
