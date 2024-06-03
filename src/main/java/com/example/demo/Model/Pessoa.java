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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
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

    @OneToMany
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeResponsavel() {
        return nome_responsavel;
    }

    public void setNomeResponsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }

    public LocalDate getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
