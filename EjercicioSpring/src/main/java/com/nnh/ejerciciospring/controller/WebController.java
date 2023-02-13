package com.nnh.ejerciciospring.controller;

import com.nnh.ejerciciospring.PartituraServiceImp;
import com.nnh.ejerciciospring.model.Partitura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    PartituraServiceImp psi;

    @PostMapping("/alta")
    public void alta(Partitura p){
        psi.save(p);
    }

    @GetMapping("/partituras")
    public List<Partitura> muestra(){
        return psi.findAll();
    }

    @PutMapping("/actualiza/{id}")
    public Partitura actualiza(@PathVariable Long id, Partitura p){
        if(psi.findById(id).isPresent()){
            psi.save(p);
        }
        return p;
    }

    @DeleteMapping("/elimina/{id}")
    public void elimina(@PathVariable Long id){
        psi.deleteById(id);
    }
}
