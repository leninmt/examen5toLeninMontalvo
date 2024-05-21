package com.example.DavidQuiroga.QuirogaPaciente;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuirogaPacienteService {
    @Autowired
    private QuirogaPacienteRepository quirogaPacienteRepository;

    //! Create
    public QuirogaPaciente save(QuirogaPaciente entity)
    {
        return quirogaPacienteRepository.save(entity);
    }

    //!findById
    public QuirogaPaciente findById(long id)
    {
        return quirogaPacienteRepository.findById(id).orElse(null);
    }

    //! Delete
    public void deleteById(long id)
    {
        quirogaPacienteRepository.deleteById(id);
        {
            quirogaPacienteRepository.deleteById(id);
        }
    }

    //! Select All
    public List<QuirogaPaciente> findAll()
    {
        return quirogaPacienteRepository.findAll();
    }

    //!update by id
    public ResponseEntity<QuirogaPaciente>updateById(long id, QuirogaPaciente pacienteActualizar)
    {
        try
        {
            QuirogaPaciente pacienteExistente = findById(id);
            if (pacienteExistente == null) return ResponseEntity.notFound().build();

            if (pacienteActualizar.getName() != null) pacienteExistente.setName(pacienteActualizar.getName());
            
            if (pacienteActualizar.getEmail() != null) pacienteExistente.setEmail(pacienteActualizar.getEmail());
            
            QuirogaPaciente PacienteGuardado = save(pacienteExistente);
            return ResponseEntity.ok(PacienteGuardado);
            
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
