package com.example.quran.repository;

import com.example.quran.model.entity.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator,Long> {
}
