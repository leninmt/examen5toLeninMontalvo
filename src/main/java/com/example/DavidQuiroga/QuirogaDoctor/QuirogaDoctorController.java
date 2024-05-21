package com.example.DavidQuiroga.QuirogaDoctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class QuirogaDoctorController {
    @Autowired
    private QuirogaDoctorService quirogaDoctorService;

    //!Create
    @PostMapping(value = "doctor")
    public QuirogaDoctor save(@RequestBody QuirogaDoctor entity)
    {
        return quirogaDoctorService.save(entity);
    }

    //!Select by id
    @GetMapping(value = "doctor/{id}")
    public QuirogaDoctor findById(@PathVariable Long id)
    {
        return quirogaDoctorService.findById(id);
    }

    //!update
    @PutMapping(value = "doctor")
    public QuirogaDoctor Update(@RequestBody QuirogaDoctor entity)
    {
        return quirogaDoctorService.save(entity);
    }

    //!Delete
    @DeleteMapping(value = "doctor/{id}")
    public void deleteById(@PathVariable Long id)
    {
        quirogaDoctorService.deleteById(id);
    }

    //!Select all
    @GetMapping(value = "doctor")
    public List<QuirogaDoctor> findAll()
    {
        return quirogaDoctorService.findAll();
    }

    //!Update by id
    @PutMapping(value = "doctor/{id}")
    public ResponseEntity<QuirogaDoctor> updateById(@PathVariable Long id, @RequestBody QuirogaDoctor entity)
    {
        return quirogaDoctorService.updateById(id, entity);
    }
}
