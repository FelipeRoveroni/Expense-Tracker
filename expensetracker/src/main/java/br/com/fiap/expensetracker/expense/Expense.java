package br.com.fiap.expensetracker.expense;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Expense {
    
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id_despesa;

    @NotBlank
    @Size(min = 20)
    String descricao;

    @Positive
    Number valor;
    
    String data_despesa;
    String metodo_pagamento;
    Integer status_despesa;

}
