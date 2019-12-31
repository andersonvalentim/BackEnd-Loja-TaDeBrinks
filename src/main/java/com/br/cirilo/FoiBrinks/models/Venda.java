/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.cirilo.FoiBrinks.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Vectro26 Network
 */
@Entity
@Table(name = "Venda")

public class Venda implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @OneToOne
    @JoinColumn(name="Produtos_idProdutos")
    Produtos produtos;
    @OneToOne
    @JoinColumn(name="Cliente_idCliente")
    Produtos cliente;
    
    @Id
   private String nomeProduto;
   private String formaDePagamento;
   private int qtdComprada;
   private double valorUnidade;
   private double valorTotal;
   private double impostoPago;
   private String nomeCliente;
   private String Vendedor_Nome;

    public String getVendedor_Nome() {
        return Vendedor_Nome;
    }

    public void setVendedor_Nome(String Vendedor_Nome) {
        this.Vendedor_Nome = Vendedor_Nome;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Produtos getCliente() {
        return cliente;
    }

    public void setCliente(Produtos cliente) {
        this.cliente = cliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

   

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getImpostoPago() {
        return impostoPago;
    }

    public void setImpostoPago(double impostoPago) {
        this.impostoPago = impostoPago;
    }
   

}
