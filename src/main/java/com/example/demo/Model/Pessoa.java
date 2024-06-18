package com.example.demo.Model;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "descricao", length = 200)
    private String descricao;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 100)
    private String telefone;

    @Column(name = "nome_responsavel", length = 100)
    private String nome_responsavel;

    @Column(name = "aprovacao", length = 100)
    private String aprovacao;

    @Column(name = "data_nascimento", length = 100)
    private LocalDate data_nascimento;

    @ManyToMany
    private List<Deficiencia> deficiencias;

    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

}