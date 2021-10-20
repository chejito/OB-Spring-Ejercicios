package es.sergiomendez.ejercicio1sesiones456;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "¡¡Buenas!!";
    }



}
