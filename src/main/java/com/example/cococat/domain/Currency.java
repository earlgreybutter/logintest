package com.example.cococat.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Currency {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String name;
    private String code; 
    private BigDecimal amount;
    private BigDecimal rate; 

    public Currency(String name, String code, BigDecimal amount, BigDecimal rate){

        this.name = name;
        this.code = code;
        this.amount = amount;
        this.rate = rate;
    }
}