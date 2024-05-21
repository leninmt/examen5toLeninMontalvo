package com.example.LeninMontalvo.MontalvoInscripcion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MontalvoInscripcionService {

    @Autowired
    private MontalvoInscripcionRepository montalvoInscripcionRepository;

    public MontalvoInscripcion save(MontalvoInscripcion entity) {
        return montalvoInscripcionRepository.save(entity);
    }

    public MontalvoInscripcion findById(Long id) {
        return montalvoInscripcionRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        montalvoInscripcionRepository.deleteById(id);
    }

    public List<MontalvoInscripcion> findAll() {
        return montalvoInscripcionRepository.findAll();
    }

    public ResponseEntity<MontalvoInscripcion> updateById(Long id, MontalvoInscripcion entity) {
        Optional<MontalvoInscripcion> optionalInscripcion = montalvoInscripcionRepository.findById(id);
        if (optionalInscripcion.isPresent()) {
            MontalvoInscripcion inscripcionToUpdate = optionalInscripcion.get();
            inscripcionToUpdate.setFechaInscripcion(entity.getFechaInscripcion());
            inscripcionToUpdate.setEstudiante(entity.getEstudiante());
            inscripcionToUpdate.setCurso(entity.getCurso());
            montalvoInscripcionRepository.save(inscripcionToUpdate);
            return ResponseEntity.ok(inscripcionToUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}