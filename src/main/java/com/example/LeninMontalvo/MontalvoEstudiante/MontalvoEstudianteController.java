package com.example.LeninMontalvo.MontalvoEstudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class MontalvoEstudianteController {
    
    @Autowired
    private MontalvoEstudianteService montalvoEstudianteService;

    // Create
    @PostMapping
    public MontalvoEstudiante save(@RequestBody MontalvoEstudiante entity) {
        return montalvoEstudianteService.save(entity);
    }

    // Select by id
    @GetMapping("/{id}")
    public MontalvoEstudiante findById(@PathVariable Long id) {
        return montalvoEstudianteService.findById(id);
    }

    // Update
    @PutMapping
    public MontalvoEstudiante update(@RequestBody MontalvoEstudiante entity) {
        return montalvoEstudianteService.save(entity);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        montalvoEstudianteService.deleteById(id);
    }

    // Select all
    @GetMapping
    public List<MontalvoEstudiante> findAll() {
        return montalvoEstudianteService.findAll();
    }

    // Update by id
    @PutMapping("/{id}")
    public ResponseEntity<MontalvoEstudiante> updateById(@PathVariable Long id, @RequestBody MontalvoEstudiante entity) {
        return montalvoEstudianteService.updateById(id, entity);
    }
}