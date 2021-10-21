package es.sergiomendez.ejercicio3.repositories;

import es.sergiomendez.ejercicio3.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
