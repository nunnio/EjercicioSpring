package com.nnh.ejerciciospring;

import com.nnh.ejerciciospring.model.Partitura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartituraServiceImp implements PartituraService{
    @Autowired
    PartituraRepository pr;

    @Override
    public List<Partitura> findAll() {
        return (List<Partitura>) pr.findAll();
    }

    @Override
    public Optional<Partitura> findById(Long id) {
        return pr.findById(id);
    }

    @Override
    public void save(Partitura p) {
        pr.save(p);
    }

    @Override
    public void deleteById(Long id) {
        pr.deleteById(id);
    }
}