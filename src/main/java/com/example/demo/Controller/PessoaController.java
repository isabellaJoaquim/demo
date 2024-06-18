package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Pessoa;


@Controller
public class PessoaController {

    @GetMapping("/pessoa/create")
    public String create() {
        return "pessoa/create";
    }

    @PostMapping("/pessoa/create")
    public String create(Pessoa pessoa) {
        System.out.println(pessoa.getNome());

        return "pessoa/create";
    }
}
