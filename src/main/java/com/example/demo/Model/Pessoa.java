package com.example.demo.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
    private String data_nascimento;

}
