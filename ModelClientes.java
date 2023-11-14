package com.mycompany.javabycakeproject;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelClientes extends AbstractTableModel {

    private ArrayList<Clientes> clientes = new ArrayList<>();
    private String[] colunas = {"Nome", "Pedido", "Telefone", "Endereço", "Entrega"};

    public void cadastraPedidos(Clientes cliente) {
        System.out.println("Cadastrando pedidos: " + cliente);
        this.clientes.add(cliente);
        fireTableRowsInserted(this.clientes.size() - 1, this.clientes.size() - 1);
    }
    public Clientes returnClientes(int index) {
    if (index >= 0 && index < clientes.size()) {
        return clientes.get(index);
    }
    return null;
    }
    
    public void alterarPedidos(int index, Clientes novoCliente) {
    novoCliente.set(index, novoCliente);
    fireTableDataChanged();
        
}


    
    public void removerPedidos(int indexParaRemover) {
    if (indexParaRemover >= 0 && indexParaRemover < clientes.size()) {
        clientes.remove(indexParaRemover);
        this.fireTableDataChanged();
    } else {
        System.out.println("Índice inválido para remoção.");
    }
}

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
        Clientes cliente = clientes.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getPedido();
            case 2:
                return cliente.getTelefone();
            case 3:
                return cliente.getEndereco();
            case 4:
                return cliente.getEntrega();
            default:
                return null; // Isso pode ser ajustado conforme necessário
        }
    }

    void alterarPedidos(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   

    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    

    