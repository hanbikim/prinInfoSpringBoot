package com.prinInfo.finalProject.controller;

import com.prinInfo.finalProject.entity.Preliminary2;
import com.prinInfo.finalProject.service.PreliminaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class PreliminaryController {
    private final PreliminaryService service;

    public PreliminaryController(PreliminaryService service) {
        this.service = service;
    }

    @GetMapping("/filtered")
    public ResponseEntity<List<Preliminary2>> getFilteredLoans(@RequestParam Map<String, String> filters) {
        List<Preliminary2> loans = service.getFilteredLoans(filters);
        return ResponseEntity.ok(loans);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updatePurchaserType(@RequestParam Map<String, String> filters) {
        service.updatePurchaserType(filters);
        return ResponseEntity.ok("Loans updated successfully");
    }
}
