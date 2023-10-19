package br.com.fiap.expensetracker.expense;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expense")
public class expenseController {
    
    @GetMapping
    public String index(Model model){
        model.addAttribute("expenses", "Lista de Despesas");
        return "expense/index";
    }
}
