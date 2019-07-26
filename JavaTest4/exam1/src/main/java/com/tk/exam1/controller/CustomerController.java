package com.tk.exam1.controller;

import com.tk.exam1.model.Customer;
import com.tk.exam1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PutMapping("/create")
    public ResponseEntity<Long> createCustomer(@RequestBody Customer customer){
        Long id = customerService.createCustomer(customer);
        System.out.println(id);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }
    @PostMapping("/update")
    public ResponseEntity<Customer> updateUser(@RequestBody Customer customer){
                customerService.updateCustomer(customer);
        return new ResponseEntity<Customer>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/")
    public ResponseEntity<String> deleteUser(Long id){
            customerService.deleteCustomer(id);
            return new ResponseEntity<String>("删除成功",HttpStatus.OK);
    }
}
