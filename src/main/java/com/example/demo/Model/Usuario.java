package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;



@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    /*@ManyToOne
    @JoinColumn(name="nivel_accesso_id")
    private NivelAcesso nivelAcessoExemplo;*/


    @ManyToMany
    private List<NivelAcesso> nivelAcessos;

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }
  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
