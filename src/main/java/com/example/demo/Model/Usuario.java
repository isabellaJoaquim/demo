package com.example.demo.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;

    @ManyToOne
    @JoinColumn(name="nivel_accesso_id")
    private NivelAcesso nivelAcessoExemplo;

    @ManyToMany
    private List<NivelAcesso> nivelAcesso;

    @Column(name = "ativo", nullable = true)
    @ColumnDefault("true")
    private boolean ativo = true;

}
