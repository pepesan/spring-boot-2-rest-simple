package com.example.demo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class DatoComplejo {
    private Integer id;
    private String nombre;
    private Date createdAt;
}
