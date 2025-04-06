package com.chaos.fullstacktradingapp.model;

import java.time.LocalDateTime;

import com.chaos.fullstacktradingapp.Domain.WithdrawalStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Withdrawal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private WithdrawalStatus status;

    private Long Amount;

    @ManyToOne
    private User user;

    private LocalDateTime date=LocalDateTime.now();
}
