package com.example.quran.service;

import com.example.quran.dto.CalculatorRequest;
import com.example.quran.dto.CalculatorResponse;
import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;
import com.example.quran.model.entity.Calculator;

import java.util.List;

public interface CalculatorService {

    CalculatorResponse create(CalculatorRequest calculatorRequest);

    CalculatorResponse update(Long id, CalculatorRequest calculatorRequest);

    CalculatorResponse getById(Long id);

    CalculatorResponse deleteById(Long id);

    List<CalculatorResponse> getAll();
}
