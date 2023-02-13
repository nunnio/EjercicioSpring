package com.nnh.ejerciciospring;

import com.nnh.ejerciciospring.model.Partitura;
import org.springframework.data.repository.CrudRepository;

public interface PartituraRepository extends CrudRepository<Partitura, Long> {
}
