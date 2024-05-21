package com.example.LeninMontalvo.MontalvoEstudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MontalvoEstudianteService {

    @Autowired
    private MontalvoEstudianteRepository montalvoEstudianteRepository;

    public MontalvoEstudiante save(MontalvoEstudiante entity) {
        return montalvoEstudianteRepository.save(entity);
    }

    public MontalvoEstudiante findById(Long id) {
        return montalvoEstudianteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        montalvoEstudianteRepository.deleteById(id);
    }

    public List<MontalvoEstudiante> findAll() {
        return montalvoEstudianteRepository.findAll();
    }

    public ResponseEntity<MontalvoEstudiante> updateById(Long id, MontalvoEstudiante entity) {
        Optional<MontalvoEstudiante> optionalEstudiante = montalvoEstudianteRepository.findById(id);
        if (optionalEstudiante.isPresent()) {
            MontalvoEstudiante estudianteToUpdate = optionalEstudiante.get();
            estudianteToUpdate.setName(entity.getName());
            estudianteToUpdate.setCedula(entity.getCedula());
            estudianteToUpdate.setFechaNacimiento(entity.getFechaNacimiento());
           
            montalvoEstudianteRepository.save(estudianteToUpdate);
            return ResponseEntity.ok(estudianteToUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
