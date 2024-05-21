package com.example.DavidQuiroga.QuirogaDoctor;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class QuirogaDoctorService {
    @Autowired
    private QuirogaDoctorRepository quirogaDoctorRepository;

    //!Create
    public QuirogaDoctor save(QuirogaDoctor entity)
    {
        return quirogaDoctorRepository.save(entity);
    }

    //!findById
    public QuirogaDoctor findById(long id)
    {
        return quirogaDoctorRepository.findById(id).orElse(null);
    }

    //!Delete
    public void deleteById(long id)
    {
        quirogaDoctorRepository.deleteById(id);
        {
            quirogaDoctorRepository.deleteById(id);
        }
    }

    //!select all
    public List<QuirogaDoctor> findAll()
    {
        return quirogaDoctorRepository.findAll();
    }

    //!update by id
    public ResponseEntity<QuirogaDoctor>updateById(long id, QuirogaDoctor doctorActualizar)
    {
        try
        {
            QuirogaDoctor doctorExistente = findById(id);
            if(doctorExistente == null)  return ResponseEntity.notFound().build();

            if(doctorActualizar.getName() != null) doctorExistente.setName(doctorActualizar.getName());
            if(doctorActualizar.getLicencia() != null) doctorExistente.setLicencia(doctorActualizar.getLicencia());

            QuirogaDoctor DoctorGuardado = save(doctorExistente);
            return ResponseEntity.ok(DoctorGuardado);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
