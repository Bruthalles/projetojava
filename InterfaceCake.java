/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.javabycake;


public class InterfaceCake extends javax.swing.JFrame {
    
    ModelClientes model = new ModelClientes();
    
    
    public InterfaceCake() {
        initComponents();
        tbPedidos.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblpedido = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblendereco = new javax.swing.JLabel();
        lblentrega = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtcontato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtendereco = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpedido = new javax.swing.JTextArea();
        txtentrega = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloCadastro.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        tituloCadastro.setText("Cadastro de Pedidos");

        lblNome.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblpedido.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblpedido.setText("Pedido:");

        lblTelefone.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblTelefone.setText("Contato:");

        lblendereco.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblendereco.setText("Endereço:");

        lblentrega.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        lblentrega.setText("Data de Entrega:");

        txtcontato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontatoActionPerformed(evt);
            }
        });

        txtendereco.setColumns(20);
        txtendereco.setRows(5);
        jScrollPane1.setViewportView(txtendereco);

        txtpedido.setColumns(20);
        txtpedido.setRows(5);
        jScrollPane2.setViewportView(txtpedido);

        tbPedidos.setModel(tbPedidos.getModel());
        jScrollPane3.setViewportView(tbPedidos);
        if (tbPedidos.getColumnModel().getColumnCount() > 0) {
            tbPedidos.getColumnModel().getColumn(0).setHeaderValue("Nome");
            tbPedidos.getColumnModel().getColumn(1).setHeaderValue("Pedido");
            tbPedidos.getColumnModel().getColumn(2).setHeaderValue("Contato");
            tbPedidos.getColumnModel().getColumn(3).setHeaderValue("Endereço");
            tbPedidos.getColumnModel().getColumn(4).setHeaderValue("Entrega");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcontato)
                                    .addComponent(txtnome)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblendereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpedido)
                            .addComponent(lblentrega))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(txtentrega)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(tituloCadastro)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tituloCadastro)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblpedido)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(txtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblendereco)
                        .addComponent(lblentrega)
                        .addComponent(txtentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontatoActionPerformed
       
    }//GEN-LAST:event_txtcontatoActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCake().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblendereco;
    private javax.swing.JLabel lblentrega;
    private javax.swing.JLabel lblpedido;
    private javax.swing.JTable tbPedidos;
    private javax.swing.JLabel tituloCadastro;
    private javax.swing.JTextField txtcontato;
    private javax.swing.JTextArea txtendereco;
    private javax.swing.JTextField txtentrega;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextArea txtpedido;
    // End of variables declaration//GEN-END:variables
}
