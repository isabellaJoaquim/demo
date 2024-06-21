package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Form.Pessoa.PessoaForm;
import com.example.demo.Repository.PessoaRepository;

import jakarta.validation.Valid;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;
    private String attributeName;

    @GetMapping("/pessoa/create")
    public String create() {
        return "pessoa/create";
    }

    @PostMapping("/pessoa/create")
    public String create(@Valid PessoaForm pessoaForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
       
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", redirectAttributes);
            return"pessoa/create";
        }
        
        pessoaRepository.save(pessoaForm.toEntity());
        return"pessoa/create";
    }
}


