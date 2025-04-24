//package com.jonathan.demo.infrastructure.controller;
//
//import com.jonathan.demo.application.dto.FactureDto;
//import com.jonathan.demo.application.service.FactureApplicationService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins = "*")
//@RequestMapping("/factures")
//public class FactureController {
//    private final FactureApplicationService factureService;
//
//    public FactureController(FactureApplicationService factureService) {
//        this.factureService = factureService;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<FactureDto> getFactureById(@PathVariable("id") long id){
//        FactureDto facture = factureService.getFactureById(id);
//        return  ResponseEntity.ok(facture);
//    }
//}
