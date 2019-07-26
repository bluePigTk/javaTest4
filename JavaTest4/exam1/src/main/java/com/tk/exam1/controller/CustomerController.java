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
        Customer customer1 = customerService.updateCustomer(customer);
        return new ResponseEntity<Customer>(customer1,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable(name = "id") Long id){
        Long updates = customerService.deleteCustomer(id);
        if(updates==1){
            return new ResponseEntity<String>("删除成功",HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("不存在该用户",HttpStatus.OK);
        }

    }
}
