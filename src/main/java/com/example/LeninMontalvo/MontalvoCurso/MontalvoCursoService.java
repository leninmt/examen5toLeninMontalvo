package com.example.LeninMontalvo.MontalvoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MontalvoCursoService {

    @Autowired
    private MontalvoCursoRepository montalvoCursoRepository;

    public MontalvoCurso save(MontalvoCurso entity) {
        return montalvoCursoRepository.save(entity);
    }

    public MontalvoCurso findById(Long id) {
        return montalvoCursoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        montalvoCursoRepository.deleteById(id);
    }

    public List<MontalvoCurso> findAll() {
        return montalvoCursoRepository.findAll();
    }

    public ResponseEntity<MontalvoCurso> updateById(Long id, MontalvoCurso entity) {
        Optional<MontalvoCurso> optionalCurso = montalvoCursoRepository.findById(id);
        if (optionalCurso.isPresent()) {
            MontalvoCurso cursoToUpdate = optionalCurso.get();
            cursoToUpdate.setNombreCurso(entity.getNombreCurso());
            montalvoCursoRepository.save(cursoToUpdate);
            return ResponseEntity.ok(cursoToUpdate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}