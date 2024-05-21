package com.example.DavidQuiroga.QuirogaDoctor;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface QuirogaDoctorRepository extends CrudRepository<QuirogaDoctor, Long> {
    List<QuirogaDoctor> findAll();
}
