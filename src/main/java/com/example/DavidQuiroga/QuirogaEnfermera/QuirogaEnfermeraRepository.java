package com.example.DavidQuiroga.QuirogaEnfermera;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuirogaEnfermeraRepository  extends CrudRepository<QuirogaEnfermera, Long>{
    List<QuirogaEnfermera> findAll();
}
