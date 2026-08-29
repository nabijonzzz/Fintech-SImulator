package com.example.fintech_simulator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferResponse {
    private String transactionId;
    private String status;
    private String message;
}
