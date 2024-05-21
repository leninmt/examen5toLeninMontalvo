package com.example.DavidQuiroga.QuirogaEspecialidad;


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
public class QuirogaEspecialidadController {
    @Autowired
    private QuirogaEspecialidadService quirogaEspecialidadService;

    //!Create
    @PostMapping(value = "especialidad")
    public QuirogaEspecialidad save(@RequestBody QuirogaEspecialidad entity)
    {
        return quirogaEspecialidadService.save(entity);
    }

    //!Select by id
    @GetMapping( value = "especialidad/{id}")
    public QuirogaEspecialidad findById(@PathVariable Long id)
    {
        return quirogaEspecialidadService.findById(id);
    }

    //!update
    @PutMapping(value = "especialidad")
    public QuirogaEspecialidad Update(@RequestBody QuirogaEspecialidad entity)
    {
        return quirogaEspecialidadService.save(entity);
    }

    //!Delete
    @DeleteMapping(value = "especialidad/{id}")
    public void deleteById(@PathVariable Long id)
    {
        quirogaEspecialidadService.deleteById(id);
    }

    //!Select all
    @GetMapping(value = "especialidad")
    public List<QuirogaEspecialidad> findAll()
    {
        return quirogaEspecialidadService.findAll();
    }

    //!Update by 
    @PutMapping(value = "especialidad/{id}")
    public ResponseEntity<QuirogaEspecialidad> updateById(@PathVariable Long id, @RequestBody QuirogaEspecialidad entity)
    {
        return quirogaEspecialidadService.updateById(id, entity);
    }
}
