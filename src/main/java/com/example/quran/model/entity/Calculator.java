package com.example.quran.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "calculators")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private char plus;
    private char minus;
    private char multiplication;
    private char division;
    private char percent;
}
