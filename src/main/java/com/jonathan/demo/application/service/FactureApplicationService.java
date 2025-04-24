//package com.jonathan.demo.application.service;
//
//import com.jonathan.demo.application.dto.FactureDto;
//import com.jonathan.demo.application.mapper.FactureMapper;
//import com.jonathan.demo.domain.entity.Facture;
//import com.jonathan.demo.domain.service.FactureDomainService;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class FactureApplicationService {
//    private final FactureDomainService factureService;
//
//    public FactureApplicationService(FactureDomainService factureService) {
//        this.factureService = factureService;
//    }
//
//    public FactureDto create(FactureDto factureDto){
//        Facture facture = FactureMapper.toDomain(factureDto);
//        Facture save = this.factureService.create(facture);
//        return FactureMapper.toDto(save);
//    }
//
//    public FactureDto getFactureById(long id){
//        Optional<Facture> facture = this.factureService.getFactureById(id);
//        return facture.map(FactureMapper::toDto)
//                .orElseThrow(()-> new RuntimeException("Factura no encontrada"));
//    }
//}
