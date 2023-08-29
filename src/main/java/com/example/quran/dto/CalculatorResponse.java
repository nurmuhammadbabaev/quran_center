package com.example.quran.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorResponse {
    private Long id;
    private char plus;
    private char minus;
    private char multiplication;
    private char division;
    private char percent;
}
