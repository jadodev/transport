package com.jonathan.demo.domain.port.in;

import com.jonathan.demo.domain.entity.Facture;

import java.util.Optional;

public interface FactureServicePortIn {
    Facture create(Facture facture);
    Optional<Facture> getFactureById(long id);
}
