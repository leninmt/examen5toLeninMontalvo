package com.example.LeninMontalvo.MontalvoInscripcion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscripcion")
public class MontalvoInscripcionController {
    
    @Autowired
    private MontalvoInscripcionService montalvoInscripcionService;

    // Create
    @PostMapping
    public MontalvoInscripcion save(@RequestBody MontalvoInscripcion entity) {
        return montalvoInscripcionService.save(entity);
    }

    // Select by id
    @GetMapping("/{id}")
    public MontalvoInscripcion findById(@PathVariable Long id) {
        return montalvoInscripcionService.findById(id);
    }

    // Update
    @PutMapping
    public MontalvoInscripcion update(@RequestBody MontalvoInscripcion entity) {
        return montalvoInscripcionService.save(entity);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        montalvoInscripcionService.deleteById(id);
    }

    // Select all
    @GetMapping
    public List<MontalvoInscripcion> findAll() {
        return montalvoInscripcionService.findAll();
    }

    // Update by id
    @PutMapping("/{id}")
    public ResponseEntity<MontalvoInscripcion> updateById(@PathVariable Long id, @RequestBody MontalvoInscripcion entity) {
        return montalvoInscripcionService.updateById(id, entity);
    }
}