package com.example.quran.service.impl;

import com.example.quran.dto.CalculatorRequest;
import com.example.quran.dto.CalculatorResponse;
import com.example.quran.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public CalculatorResponse create(CalculatorRequest calculatorRequest) {
        return null;
    }

    @Override
    public CalculatorResponse update(Long id, CalculatorRequest calculatorRequest) {
        return null;
    }

    @Override
    public CalculatorResponse getById(Long id) {
        return null;
    }

    @Override
    public CalculatorResponse deleteById(Long id) {
        return null;
    }

    @Override
    public List<CalculatorResponse> getAll() {
        return null;
    }
}
