package com.example.DavidQuiroga.QuirogaEnfermera;

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
public class QuirogaEnfermeraController {
    @Autowired
    private QuirogaEnfermeraService quirogaEnfermeraService;

    @PostMapping(value = "enfermera")
    public QuirogaEnfermera save(@RequestBody QuirogaEnfermera entity)
    {
        return quirogaEnfermeraService.save(entity);
    }

    @GetMapping(value = "enfermera/{id}")
    public QuirogaEnfermera findById(@PathVariable Long id)
    {
        return quirogaEnfermeraService.findById(id);
    }


    @PutMapping(value = "enfermera")
    public QuirogaEnfermera Update(@RequestBody QuirogaEnfermera entity)
    {
        return quirogaEnfermeraService.save(entity);
    }

    @DeleteMapping(value = "enfermera/{id}")
    public void deleteById(@PathVariable Long id)
    {
        quirogaEnfermeraService.deleteById(id);
    }

    @GetMapping(value = "enfermera")
    public List<QuirogaEnfermera> findAll()
    {
        return quirogaEnfermeraService.findAll();
    }

    @PutMapping(value = "enfermera/{id}")
    public ResponseEntity<QuirogaEnfermera> updateById(@PathVariable Long id, @RequestBody QuirogaEnfermera entity)
    {
        return quirogaEnfermeraService.updateById(id, entity);
    }

}
