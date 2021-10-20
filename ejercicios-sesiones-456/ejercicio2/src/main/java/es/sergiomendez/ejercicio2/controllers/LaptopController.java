package es.sergiomendez.ejercicio2.controllers;

import es.sergiomendez.ejercicio2.entities.Laptop;
import es.sergiomendez.ejercicio2.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    // atributos
    private LaptopRepository laptopRepository;

    // constructores
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // Método que devuelve todas las laptop de la base de datos.
    // Endpoint: http://localhost:8080/api/laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAllLaptops() {
        return laptopRepository.findAll();
    }
}
