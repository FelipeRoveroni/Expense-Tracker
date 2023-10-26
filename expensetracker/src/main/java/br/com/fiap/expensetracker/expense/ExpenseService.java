package br.com.fiap.expensetracker.expense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepository repository;

    public List<Expense> findAll() {
        return repository.findAll();
    }

}
