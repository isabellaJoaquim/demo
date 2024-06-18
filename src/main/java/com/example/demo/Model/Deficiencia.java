package com.example.demo.Model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
@Getter
@Setter
@Table(name = "deficiencia")
public class Deficiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Nome", length =100)
    private String nome;

    @ManyToMany
    private List<Pessoa> pessoas;

    public long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name="categoria_id")
    private Categoria categoria;

}
