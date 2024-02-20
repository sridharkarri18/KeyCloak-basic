package com.example.KeyCloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Mycontroller {

    @GetMapping("/al")
    @PreAuthorize("hasRole('admin')")
    public String message() {
        return "Welcome admin";
    }

    @GetMapping("/ee")
    @PreAuthorize("hasRole('user')")
    public String messageToUser() {
        return "Welcome user";
    }


}
