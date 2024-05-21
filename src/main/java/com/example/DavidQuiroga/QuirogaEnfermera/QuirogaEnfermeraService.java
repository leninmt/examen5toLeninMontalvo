package com.example.DavidQuiroga.QuirogaEnfermera;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class QuirogaEnfermeraService {
    @Autowired
    private QuirogaEnfermeraRepository quirogaEnfermeraRepository;

    //create
    public QuirogaEnfermera save(QuirogaEnfermera entity)
    {
        return quirogaEnfermeraRepository.save(entity);
    }

    //findbyis
    public QuirogaEnfermera findById(long id)
    {
        return quirogaEnfermeraRepository.findById(id).orElse(null);
    }


    //delete
    public void deleteById(long id)
    {
        quirogaEnfermeraRepository.deleteById(id);
        {
            quirogaEnfermeraRepository.deleteById(id);
        }
    }

    public List<QuirogaEnfermera> findAll()
    {
        return quirogaEnfermeraRepository.findAll();
    }

    public ResponseEntity<QuirogaEnfermera>updateById(long id, QuirogaEnfermera enfermeraActualizar)
    {
        try
        {
            QuirogaEnfermera enfermeraExistente = findById(id);
            if(enfermeraExistente == null) return ResponseEntity.notFound().build();

            if(enfermeraActualizar.getName() != null) enfermeraExistente.setName(enfermeraActualizar.getName());
            if(enfermeraActualizar.getExperiencia() != null) enfermeraExistente.setExperiencia(enfermeraActualizar.getExperiencia());
            if(enfermeraActualizar.getSalida() != null) enfermeraExistente.setSalida(enfermeraActualizar.getSalida());
            if(enfermeraActualizar.getSueldo()!= null) enfermeraExistente.setSueldo(enfermeraExistente.getSueldo());

            QuirogaEnfermera EnfermeraGuardado = save(enfermeraExistente);
            return ResponseEntity.ok(EnfermeraGuardado);

        } catch (Exception e)
        {
            return ResponseEntity.internalServerError().build();
        }
    }
}
