package com.welintonBorges.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Instalacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco enderecoInstalacao;

    //@JsonIgnore
    @JsonBackReference
    @OneToMany(mappedBy = "instalacao", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fatura> listaFatura = new ArrayList<Fatura>();

    private String codigo;
    private Date dataInstalacao;

    protected Instalacao() {

    }

    public Instalacao(String codigo, Date dataInstalacao) {
        super();
        this.codigo = codigo;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String toString() {
        return "Instalacao [id=" + id + ", cliente=" + cliente + ", enderecoInstalacao=" + enderecoInstalacao
                + ", listaFatura=" + listaFatura + ", codigo=" + codigo + ", dataInstalacao=" + dataInstalacao + "]";
    }
}
