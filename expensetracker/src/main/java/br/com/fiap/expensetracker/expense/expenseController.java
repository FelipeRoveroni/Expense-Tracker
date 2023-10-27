package br.com.fiap.expensetracker.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expense")
public class expenseController {

    @Autowired
    ExpenseService service;

    @GetMapping
    public String index(Model model){
        model.addAttribute("expense", service.findAll());
        return "expense/index";
    }
}
