/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabycakeproject;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 202302757596
 */
public class Clientes {

    static Clientes get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nome;
    private String pedido;
    private String telefone;
    private String endereco;
    private String entrega;

    public Clientes ( String nome, String pedido, String telefone, String endereco, String entrega) {
        this.nome = nome;
        this.pedido = pedido;
        this.telefone = telefone;
        this.endereco = endereco;
        this.entrega = entrega;
    }

    Clientes(JTextField txtnome, JTextArea txtpedido, JTextField txtcontato, JTextArea txtendereco, JTextField txtentrega) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String Pedido) {
        this.pedido = pedido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String Endereco) {
        this.endereco = endereco;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String Entrega) {
        this.entrega = entrega;
    }

    void set(int index, Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    

