/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.cirilo.FoiBrinks.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Vectro26 Network
 */
@Entity

@Table(name = "PagamentoCartao")

public class PagamentoCartao implements Serializable {
            private static final long serialVersionUID = 1L;

    
            @Id
    private String numeroCartao;
    @OneToOne
    private Clientes clientes;
    @OneToOne
    private Venda venda;
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

     
    
}
