/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabycake;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 202303535287
 */
public class ModelClientes extends AbstractTableModel {

    ArrayList<Clientes> clientes = new ArrayList();
    
    String[] colunas = {"Nome", "Pedido", "Telefone", "Endereço", "Entrega" };
        
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return clientes.get(rowIndex).getNome();
        } else if (columnIndex == 1) {
            return clientes.get(rowIndex).getPedido();
        } else if (columnIndex == 2) {
            return clientes.get(rowIndex).getTelefone();
        } else if (columnIndex == 3) {
            return clientes.get(rowIndex).getEndereco();
        } else {
            return clientes.get(rowIndex).getEntrega();
        }
    }
}
