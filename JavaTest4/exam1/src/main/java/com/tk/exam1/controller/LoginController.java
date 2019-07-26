package com.tk.exam1.controller;

import com.tk.exam1.model.ExamResult;
import com.tk.exam1.model.User;
import com.tk.exam1.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    Userservice userservice;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
        String msg = userservice.login(user);
        if (msg.equals("true")){
            return new ResponseEntity<String>("登陆成功",HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("该用户不存在",HttpStatus.BAD_REQUEST);
        }

    }
}
