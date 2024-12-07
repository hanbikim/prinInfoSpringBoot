package com.prinInfo.finalProject.service;

import com.prinInfo.finalProject.entity.Preliminary2;
import com.prinInfo.finalProject.repository.PreliminaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PreliminaryService {
    private final PreliminaryRepository repository;

    public PreliminaryService(PreliminaryRepository repository) {
        this.repository = repository;
    }

    public List<Preliminary2> getFilteredLoans(Map<String, String> filters) {
        // Handle dynamic filtering logic if needed
        return repository.findLoansByPurchaserTypes(List.of(0, 1, 2, 3, 4, 8));
    }

    public void updatePurchaserType(Map<String, String> filters) {
        // Implement update logic here (as needed)
    }
}
