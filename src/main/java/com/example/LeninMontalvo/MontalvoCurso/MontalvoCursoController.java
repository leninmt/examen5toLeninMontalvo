package com.example.LeninMontalvo.MontalvoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class MontalvoCursoController {
    
    @Autowired
    private MontalvoCursoService montalvoCursoService;

    // Create
    @PostMapping
    public MontalvoCurso save(@RequestBody MontalvoCurso entity) {
        return montalvoCursoService.save(entity);
    }

    // Select by id
    @GetMapping("/{id}")
    public MontalvoCurso findById(@PathVariable Long id) {
        return montalvoCursoService.findById(id);
    }

    // Update
    @PutMapping
    public MontalvoCurso update(@RequestBody MontalvoCurso entity) {
        return montalvoCursoService.save(entity);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        montalvoCursoService.deleteById(id);
    }

    // Select all
    @GetMapping
    public List<MontalvoCurso> findAll() {
        return montalvoCursoService.findAll();
    }

    // Update by id
    @PutMapping("/{id}")
    public ResponseEntity<MontalvoCurso> updateById(@PathVariable Long id, @RequestBody MontalvoCurso entity) {
        return montalvoCursoService.updateById(id, entity);
    }
}