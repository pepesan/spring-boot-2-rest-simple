package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class DatoComplejo {
    private Integer id;
    private String nombre;
    private Date createdAt;
}
