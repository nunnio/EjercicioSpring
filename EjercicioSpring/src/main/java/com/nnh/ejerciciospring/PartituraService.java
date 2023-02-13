package com.nnh.ejerciciospring;

import com.nnh.ejerciciospring.model.Partitura;

import java.util.List;
import java.util.Optional;

public interface PartituraService {
    List<Partitura> findAll();

    Optional<Partitura> findById(Long id);

    void save(Partitura p);

    void deleteById(Long id);
}
