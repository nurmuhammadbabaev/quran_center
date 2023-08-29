package com.example.quran.mapper;

import com.example.quran.dto.CalculatorRequest;
import com.example.quran.dto.CalculatorResponse;
import com.example.quran.dto.CenterRequest;
import com.example.quran.dto.CenterResponse;
import com.example.quran.model.entity.Calculator;
import com.example.quran.model.entity.Center;

import java.util.List;

public interface CalculatorMapper {

    Calculator create(CalculatorRequest calculatorRequest);

    Calculator update(Calculator calculator, CalculatorRequest calculatorRequest);

    CalculatorResponse view(Calculator calculator);

    List<CalculatorResponse> views(List<Calculator> calculators);
}
