package com.example.LeninMontalvo.MontalvoEstudiante;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MontalvoEstudianteRepository extends CrudRepository<MontalvoEstudiante, Long> {
    List<MontalvoEstudiante> findAll();
}
