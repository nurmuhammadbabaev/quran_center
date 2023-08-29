package com.example.quran.mapper.impl;

import com.example.quran.dto.CalculatorRequest;
import com.example.quran.dto.CalculatorResponse;
import com.example.quran.mapper.CalculatorMapper;
import com.example.quran.model.entity.Calculator;

import java.util.List;

public class CalculatorMapperImpl implements CalculatorMapper {
    @Override
    public Calculator create(CalculatorRequest calculatorRequest) {
        if (calculatorRequest == null) {
            return null;
        }
        Calculator calculator = new Calculator();
        calculator.setPlus(calculatorRequest.getPlus());
        calculator.setMinus(calculatorRequest.getMinus());
        calculator.setMultiplication(calculatorRequest.getMultiplication());
        calculator.setDivision(calculatorRequest.getDivision());
        calculator.setPercent(calculatorRequest.getPercent());
        return calculator;
    }

    @Override
    public Calculator update(Calculator calculator, CalculatorRequest calculatorRequest) {
        calculator.setPlus(calculatorRequest.getPlus());
        calculator.setDivision(calculatorRequest.getDivision());
        calculator.setPercent(calculatorRequest.getPercent());
        calculator.setMinus(calculatorRequest.getMinus());
        return calculator;
    }

    @Override
    public CalculatorResponse view(Calculator calculator) {
        return null;
    }

    @Override
    public List<CalculatorResponse> views(List<Calculator> calculators) {
        return null;
    }
}
