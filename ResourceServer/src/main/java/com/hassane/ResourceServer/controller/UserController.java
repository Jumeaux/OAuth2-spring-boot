package com.hassane.ResourceServer.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping(value = "/status/check")
    @PreAuthorize("hasRole('USER')")
    public String userName(){
        return "Alhassane DIALLO";
    }


    @PreAuthorize("hasrole('test')")
    @GetMapping("name")
    public String getUserName() {
        return "new SomeData()";
    }

    
}
