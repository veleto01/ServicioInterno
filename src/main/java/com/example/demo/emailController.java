package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/emails")
public class emailController {

    @Autowired
    private emailService emailService;
    
    @Autowired
    private email email;

    @PostMapping("/registration-email")
    public void sendRegistrationEmail(@RequestBody List<String> data) {
    	email = new email(data.get(1), "Registro MADCLOTHES ","¡Gracias por resgistrarte, disfruta de nuestra tienda");
        emailService.sendEmail(email);
    }
}
