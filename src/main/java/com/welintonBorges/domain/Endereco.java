package com.welintonBorges.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    private String logradouro;
    private long numero;
    private String bairro;
    private String cidade;
    private String uf;

    protected Endereco() {

    }

    public Endereco(String logradouro, String bairro, String cidade, String uf) {
        super();
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro
                + ", cidade=" + cidade + ", uf=" + uf + "]";
    }


}
