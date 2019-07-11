package com.example.demo.controllers;

import com.example.demo.domain.Dato;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dato")
public class MiRestController {
    // Obtiene el listado de Elementos
    @GetMapping("/")
    public List<Dato> getDatos(){
        List<Dato> listado = new ArrayList<Dato>();
        // Simulamos obtener el listado de la BBDD
        for (int i = 0; i < 10; i++) {
            Dato dato= new Dato();
            dato.setId(i);
            dato.setCadena("Mi cadena "+i);
            listado.add(dato);
        }
        return listado;
    }
    @PostMapping("/")
    public Dato addDato(@Valid @RequestBody Dato dato)
            throws ServletException, IOException {
        // Simulamos devolver el objeto añadido a la BBDD
        return dato;
    }

    @GetMapping("/{id}")
    public Dato showDatoById(@PathVariable("id") Integer id)
            throws ServletException, IOException {
        // Simulamos obtener el objeto de la BBDD
        Dato dato= new Dato();
        dato.setId(id);
        dato.setCadena("Mi cadena "+id);
        return dato;
    }

    @PutMapping("/{id}")
    public Dato editDatoById(@PathVariable Integer id,
                             @Valid @RequestBody Dato dato)
            throws ServletException, IOException {
        // Simulamos devolver el objeto modificado de la BBDD
        dato.setId(id);
        dato.setCadena(dato.getCadena());
        return dato;
    }
    @DeleteMapping("/{id}")
    public Dato deleteDatoById(@PathVariable Integer id)
            throws ServletException, IOException {
        // Simulamos devolver el objeto borrado de la BBDD
        Dato dato= new Dato();
        dato.setId(id);
        dato.setCadena("Mi cadena borrada");
        return dato;
    }
}
