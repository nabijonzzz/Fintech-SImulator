package com.example.fintech_simulator.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Card {
    @Id
    private String cardNumber;
    private String ownerName;
    private BigDecimal balance;
    private String currency;
}
