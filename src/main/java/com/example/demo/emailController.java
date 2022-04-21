package com.example.demo;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.*;



@RestController
public class emailController {

    @Autowired
    private emailService envioCorreo;

    @PostMapping("/email")
    public ResponseEntity<Void> enviarNotificacion(@RequestBody email Email){
        boolean respuesta=envioCorreo.send(Email);
        if(respuesta){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
