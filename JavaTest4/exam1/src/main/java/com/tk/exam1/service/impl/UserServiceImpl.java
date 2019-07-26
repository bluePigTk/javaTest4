package com.tk.exam1.service.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.tk.exam1.mapper.CustomerMapper;
import com.tk.exam1.model.Customer;
import com.tk.exam1.model.ExamResult;
import com.tk.exam1.model.User;
import com.tk.exam1.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    CustomerMapper customerMapper;
    @Override
    public String login(User user) {
        Customer customer = new Customer();
        customer.setFirst_name(user.getName());
        customer.setLast_name(user.getPassword());
        Customer loginUser = customerMapper.findCustomerByFirstNameAndLastName(customer);
        if(loginUser==null){
            return  "false";
        }else {
            return  "true";
        }

    }
}
