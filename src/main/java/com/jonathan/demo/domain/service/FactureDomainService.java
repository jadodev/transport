//package com.jonathan.demo.domain.service;
//
//import com.jonathan.demo.domain.entity.Facture;
//import com.jonathan.demo.domain.port.in.FactureServicePortIn;
//import com.jonathan.demo.domain.port.out.FactureRepositoryPort;
//
//import java.util.Optional;
//
//public class FactureDomainService implements FactureServicePortIn {
//    private FactureRepositoryPort factureRepository;
//
//    public FactureDomainService(FactureRepositoryPort factureRepository) {
//        this.factureRepository = factureRepository;
//    }
//
//    @Override
//    public Facture create(Facture facture) {
//        return this.factureRepository.save(facture);
//    }
//
//    @Override
//    public Optional<Facture> getFactureById(long id) {
//        return this.factureRepository.getFactureById(id);
//    }
//}
