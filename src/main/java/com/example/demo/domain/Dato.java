package com.example.demo.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class Dato implements Serializable {
    @NotNull
    private Integer id;
    @NotNull
    private String cadena;
}
