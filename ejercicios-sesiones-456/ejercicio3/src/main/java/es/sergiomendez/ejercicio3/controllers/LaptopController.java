package es.sergiomendez.ejercicio3.controllers;

import es.sergiomendez.ejercicio3.entities.Laptop;
import es.sergiomendez.ejercicio3.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        System.out.println("Laptops en la base de datos: " + laptopRepository.findAll().size());
        return laptopRepository.findAll();
    }

    // Método que crea una laptop recibida en formato JSON en la base de datos
    // Endpoint: http://localhost:8080/api/laptops/
    @PostMapping("/api/laptops")
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        System.out.println(laptop + " ha sido creada.");
        return laptopRepository.save(laptop);
    }
}
