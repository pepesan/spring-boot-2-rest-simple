package com.example.demo.controllers;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cutre/{id}")
public class CutreController {
    public void cogeParam(
            HttpRequest httpRequest,
            HttpResponse httpResponse){

    }
}
