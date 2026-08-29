package com.example.fintech_simulator.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.fintech_simulator.entity.Card;

public interface CardRepository extends CrudRepository<Card, String> {
}
