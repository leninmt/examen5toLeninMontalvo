package com.example.DavidQuiroga.QuirogaPaciente;


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
public class QuirogaPacienteController {
    @Autowired
    private QuirogaPacienteService quirogaPacienteService;

    //!Create
    @PostMapping(value = "paciente")
    public QuirogaPaciente save(@RequestBody QuirogaPaciente entity)
    {
        return quirogaPacienteService.save(entity);
    }

    //!Select by id
    @GetMapping(value = "paciente/{id}")
    public QuirogaPaciente findById(@PathVariable Long id)
    {
        return quirogaPacienteService.findById(id);
    }

    //! update
    @PutMapping(value = "paciente")
    public QuirogaPaciente Update(@RequestBody QuirogaPaciente entity)
    {
        return quirogaPacienteService.save(entity);
    }

    //! Delete
    @DeleteMapping(value = "paciente/{id}")
    public void deleteById(@PathVariable Long id)
    {
        quirogaPacienteService.deleteById(id);
    }

    //! Select all
    @GetMapping(value = "paciente")
    public List<QuirogaPaciente> findAll()
    {
        return quirogaPacienteService.findAll();
    }

    //! Update by id
    @PutMapping(value = "paciente/{id}")
    public ResponseEntity<QuirogaPaciente> updateById(@PathVariable Long id,@RequestBody QuirogaPaciente entity)
    {
        return quirogaPacienteService.updateById(id, entity);
    }
}
