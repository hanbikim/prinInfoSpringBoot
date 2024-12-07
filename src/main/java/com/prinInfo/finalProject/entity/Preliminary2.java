package com.prinInfo.finalProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "preliminary2")
public class Preliminary2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "action_taken_name")
    private String actionTakenName;

    @Column(name = "loan_amount_000s")
    private Double loanAmount;

    @Column(name = "rate_spread")
    private Double rateSpread;

    @Column(name = "lien_status")
    private Integer lienStatus;

    @Column(name = "purchaser_type")
    private Integer purchaserType;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionTakenName() {
        return actionTakenName;
    }

    public void setActionTakenName(String actionTakenName) {
        this.actionTakenName = actionTakenName;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getRateSpread() {
        return rateSpread;
    }

    public void setRateSpread(Double rateSpread) {
        this.rateSpread = rateSpread;
    }

    public Integer getLienStatus() {
        return lienStatus;
    }

    public void setLienStatus(Integer lienStatus) {
        this.lienStatus = lienStatus;
    }

    public Integer getPurchaserType() {
        return purchaserType;
    }

    public void setPurchaserType(Integer purchaserType) {
        this.purchaserType = purchaserType;
    }
}

