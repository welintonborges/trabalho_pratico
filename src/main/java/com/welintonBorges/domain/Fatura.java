package com.welintonBorges.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
public class Fatura {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_instalacao")
    private Instalacao instalacao;

    private String codigo;
    private Date dataLeitura;
    private Date dataVencimento;
    private int numeroLeitura;
    private double valorConta;

    protected Fatura() {

    }

    public Fatura(String codigo, Date dataLeitura, Date dataVencimento, int numeroLeitura, double valorConta) {
        super();
        this.codigo = codigo;
        this.dataLeitura = dataLeitura;
        this.dataVencimento = dataVencimento;
        this.numeroLeitura = numeroLeitura;
        this.valorConta = valorConta;
    }

    @Override
    public String toString() {
        return "Fatura [id=" + id + ", instalacao=" + instalacao + ", codigo=" + codigo + ", dataLeitura=" + dataLeitura
                + ", dataVencimento=" + dataVencimento + ", numeroLeitura=" + numeroLeitura + ", valorConta="
                + valorConta + "]";
    }

}
