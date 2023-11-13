/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabycake;

public class EntidadeClientes {

    private String Nome;
    private String Pedido;
    private String Telefone;
    private String Endereco;
    private String Entrega;

    public EntidadeClientes(String Nome, String Pedido, String Telefone, String Endereco, String Entrega) {
        this.Nome = Nome;
        this.Pedido = Pedido;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Entrega = Entrega;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEntrega() {
        return Entrega;
    }

    public void setEntrega(String Entrega) {
        this.Entrega = Entrega;
    }

}

