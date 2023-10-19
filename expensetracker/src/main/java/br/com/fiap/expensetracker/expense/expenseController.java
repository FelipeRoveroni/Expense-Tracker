package br.com.fiap.expensetracker.expense;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expense")
public class expenseController {
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("expenses", List.of("Despesa 1", "Despesa 2", "Despesa 3"));
        return "expense/index";
    }
}
