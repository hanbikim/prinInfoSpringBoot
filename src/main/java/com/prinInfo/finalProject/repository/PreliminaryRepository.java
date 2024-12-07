package com.prinInfo.finalProject.repository;

import com.prinInfo.finalProject.entity.Preliminary2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreliminaryRepository extends JpaRepository<Preliminary2, Long> {
    @Query("SELECT p FROM Preliminary2 p WHERE p.actionTakenName = 'Loan originated' AND p.purchaserType IN (:types)")
    List<Preliminary2> findLoansByPurchaserTypes(@Param("types") List<Integer> types);
}
