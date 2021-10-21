package es.sergiomendez.ejercicio2.repositories;

import es.sergiomendez.ejercicio2.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
