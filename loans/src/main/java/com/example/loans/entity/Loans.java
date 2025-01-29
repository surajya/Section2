package com.example.loans.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanId;

    private String loanType;

    private long loanNumber;

    private String mobileNumber;

    private int totalLoan;

    private int paidAmount;

    private int outstandingAmount;
}
