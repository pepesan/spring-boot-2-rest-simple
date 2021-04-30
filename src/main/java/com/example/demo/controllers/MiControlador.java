package com.example.demo.controllers;

import com.example.demo.domain.Dato;
import com.example.demo.domain.DatoComplejo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MiControlador {
    @GetMapping("/welcome")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
    @GetMapping(value = "/datoComplejo")
    public DatoComplejo devuelveDatoComplejo(){
        DatoComplejo datoComplejo = new DatoComplejo();
        datoComplejo.setId(2);
        datoComplejo.setNombre("PEAZO DATO!!");
        datoComplejo.setCreatedAt(new Date());
        return datoComplejo;
    }

}
