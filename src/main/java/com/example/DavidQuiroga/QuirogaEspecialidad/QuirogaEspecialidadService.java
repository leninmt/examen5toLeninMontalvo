package com.example.DavidQuiroga.QuirogaEspecialidad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuirogaEspecialidadService {
    @Autowired
    private QuirogaEspecialidadRepository especialidadRepository;

    //!Create
    public QuirogaEspecialidad save(QuirogaEspecialidad entity)
    {
        return especialidadRepository.save(entity);
    }

    //!Find by id
    public QuirogaEspecialidad findById(long id)
    {
        return especialidadRepository.findById(id).orElse(null);
    }

    //!Delete
    public void deleteById(long id)
    {
        especialidadRepository.deleteById(id);
        {
            especialidadRepository.deleteById(id);
        }
    }

    //!Select all
    public List<QuirogaEspecialidad> findAll()
    {
        return especialidadRepository.findAll();
    }

    //!Update by id
    public ResponseEntity<QuirogaEspecialidad>updateById(long id, QuirogaEspecialidad especialidadActualizar)
    {
        try
        {
            QuirogaEspecialidad especialidadExistente = findById(id);
            if(especialidadExistente == null) return ResponseEntity.notFound().build();

            if(especialidadExistente.getName() != null) especialidadExistente.setName(especialidadActualizar.getName());
            if(especialidadExistente.getDescription() != null) especialidadExistente.setDescription(especialidadActualizar.getDescription());

            QuirogaEspecialidad EspecialidadGuardado = save(especialidadExistente);
            return ResponseEntity.ok(EspecialidadGuardado);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
