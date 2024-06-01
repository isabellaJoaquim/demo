package com.example.demo.Model;

import org.springframework.format.datetime.standard.DateTimeContext;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "acesso")
public class Acesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Data e Hora")
    private DateTimeContext Data;

   @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DateTimeContext getData() {
        return Data;
    }

    public void setData(DateTimeContext Data) {
        this.Data = Data;
    }
}
