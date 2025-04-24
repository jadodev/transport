package com.jonathan.demo.domain.port.out;

import com.jonathan.demo.domain.entity.Facture;

import java.util.Optional;

public interface FactureRepositoryPort {
    Facture save(Facture facture);
    Optional<Facture> getFactureById(long id);
}
