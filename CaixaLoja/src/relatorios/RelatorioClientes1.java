
package relatorios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaCliente;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaRecebimento;

/**
 *
 * @author RamonFernandes
 */
public final class RelatorioClientes1 extends javax.swing.JFrame {
    ConectaCliente con_clientesdev = new ConectaCliente();
    ConectaRecebimento con_recebimento = new ConectaRecebimento();
    ConectaCrediario con_crediario = new ConectaCrediario();
    int navegador = 0;
    double total, receb,valor_divida;
    
    public RelatorioClientes1() {
        initComponents();
        con_clientesdev.conexao();        
        con_clientesdev.executeSQL("select * from clientesdev order by nomecliente");
        atualiza_combox_cliente();
        
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
        
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        jc_comboClientes = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jl_nome_cliente = new javax.swing.JLabel();
        jl_data_compra = new javax.swing.JLabel();
        jl_vencimento = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jl_total_compra = new javax.swing.JLabel();
        jl_valor_recebido = new javax.swing.JLabel();
        jl_restante = new javax.swing.JLabel();
        jl_situacao = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bt_detalhes_compra = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bt_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE ESTOQUE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("RELATÓRIO DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("SELECIONE O NOME DO CLIENTE:");

        bt_pesquisar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        bt_pesquisar.setText("PESQUISAR");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        jc_comboClientes.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jc_comboClientes.setForeground(new java.awt.Color(51, 51, 51));
        jc_comboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>" }));
        jc_comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_comboClientesActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("VENCIMENTO:");

        jLabel6.setText("TOTAL:");

        jLabel7.setText("NOTA:");

        jLabel3.setText("NOME:");

        jLabel4.setText("DATA DA COMPRA:");

        jLabel8.setText("VALOR RECEBIDO:");

        jLabel10.setText("VALOR RESTANTE:");

        jLabel11.setText("SITUAÇÃO:");

        jLabel13.setText("R$");

        jLabel14.setText("R$");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("TABELA DE PAGAMENTOS RECEBIDOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOTA", "VALOR RECEBIDO", "DATA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jl_nome_cliente.setText("cliente");

        jl_data_compra.setText("  \\  \\");

            jl_vencimento.setText("  \\  \\");

                jl_nota.setText("0");

                jl_total_compra.setText("0.0");

                jl_valor_recebido.setText("0.0");

                jl_restante.setText("0.0");

                jl_situacao.setText("situação");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nome_cliente)
                            .addComponent(jl_data_compra)
                            .addComponent(jl_vencimento)
                            .addComponent(jl_total_compra)
                            .addComponent(jl_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jl_restante))
                                    .addComponent(jl_situacao)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_valor_recebido)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jl_nota))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jl_nome_cliente))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jl_data_compra))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jl_valor_recebido))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jl_restante))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jl_situacao)))))
                                    .addComponent(jl_vencimento))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jl_total_compra))))
                        .addContainerGap(39, Short.MAX_VALUE))
                );

                jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                bt_detalhes_compra.setText("MAIS DETALHES");
                bt_detalhes_compra.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        bt_detalhes_compraActionPerformed(evt);
                    }
                });

                jLabel9.setText("SELECIONAR TODAS AS COMPRAS REALIZADAS PELO CLIENTE.");

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                    },
                    new String [] {
                        "NOTA", "CLIENTE", "PROD", "VALOR UNIT", "QUANT", "TOTAL"
                    }
                ));
                jScrollPane2.setViewportView(jTable2);

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(bt_detalhes_compra)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(122, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bt_detalhes_compra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                );

                bt_sair.setText("SAIR");
                bt_sair.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        bt_sairActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jc_comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(504, 504, 504)
                                .addComponent(bt_sair)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_pesquisar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jc_comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_sair)
                        .addContainerGap(14, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
            }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        pesquisarCliente();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_detalhes_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_detalhes_compraActionPerformed
        String sql = "select * from crediario where cliente='"+jl_nome_cliente.getText()+"'";
        con_crediario.executeSQL(sql);
        //JOptionPane.showMessageDialog(null,"sql"+sql);
        try {
            con_crediario.resultSet.first();
            preecherCrediario();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar para tabela crediario. "+ex);
        }
    }//GEN-LAST:event_bt_detalhes_compraActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void jc_comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_comboClientesActionPerformed
        try {
            String sqlBusc;
            sqlBusc = "select * from clientesdev where nomecliente = '"+jc_comboClientes.getSelectedItem()+"'";
            if(jc_comboClientes.getSelectedItem() == "<selecione>"){
                //jt_condCliente.setText("");
                return;
            }else{
                con_clientesdev.executeSQL(sqlBusc);
                con_clientesdev.resultSet.first();
               // pesquisarCliente();
            }

            //JOptionPane.showMessageDialog(null, "ok"+sqlBusc);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
    }//GEN-LAST:event_jc_comboClientesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RelatorioClientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioClientes1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_detalhes_compra;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox jc_comboClientes;
    private javax.swing.JLabel jl_data_compra;
    private javax.swing.JLabel jl_nome_cliente;
    private javax.swing.JLabel jl_nota;
    private javax.swing.JLabel jl_restante;
    private javax.swing.JLabel jl_situacao;
    private javax.swing.JLabel jl_total_compra;
    private javax.swing.JLabel jl_valor_recebido;
    private javax.swing.JLabel jl_vencimento;
    // End of variables declaration//GEN-END:variables

    
     public void mostrar_dados(){
             try {
                     jl_nota.setText(con_clientesdev.resultSet.getString("nota"));
                     jl_nome_cliente.setText(con_clientesdev.resultSet.getString("nomecliente"));
                     jl_data_compra.setText(con_clientesdev.resultSet.getString("datacompra"));
                     jl_vencimento.setText(con_clientesdev.resultSet.getString("vencimento"));
                     jl_total_compra.setText(con_clientesdev.resultSet.getString("valortotal"));
                    

             } catch (SQLException ex) {
                 if(navegador == 1){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no último registro!");
                    // navegador = 0;
                 }else if(navegador == 2){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no primeiro registro!");
                    // navegador = 0;
                 }else{
                     JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
                 }
                 navegador = 0;

             }

     }
     
     public void preecherPagamentosRecebidos(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        con_recebimento.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_recebimento.resultSet.next()) {
                modelo.addRow(new Object[]{con_recebimento.resultSet.getString("nota"),con_recebimento.resultSet.getString("valor_pago"),con_recebimento.resultSet.getString("data_pag")});
            }
            con_recebimento.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
     
      public void preecherCrediario(){
          
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(20);
        
        con_crediario.executeSQL("select * from crediario where cliente='"+jl_nome_cliente.getText()+"'");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("nota"),con_crediario.resultSet.getString("cliente"),con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("valor_unit"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("total_compra")});
            }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela crediario"+ e);
        }
    }
     
      private void preecher_valor_pago() {
        
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
        total = 0;
        try {
            while (con_recebimento.resultSet.next()) {
                total = total + con_recebimento.resultSet.getDouble("valor_pago");
            }
            //obj_formatado.applyPattern("#,##00,0");
            jl_valor_recebido.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
            
    }
    
     private void valor_restante() {
       receb = 0;
       valor_divida = 0;
       total = 0;
       receb = Double.parseDouble(jl_valor_recebido.getText());
       valor_divida = Double.parseDouble(jl_total_compra.getText());
       total = valor_divida - receb;
       jl_restante.setText(""+total);
       if(valor_divida == receb){
           jl_situacao.setText("CONTA PAGA!");
       }else{
           jl_situacao.setText("EM DÉBITO!");
       }
       
          
    }

    private void pesquisarCliente() {
                String sql = "select * from clientesdev where nomecliente='"+jc_comboClientes.getSelectedItem()+"'";
            con_clientesdev.executeSQL(sql);
        try {
            con_clientesdev.resultSet.first();
             mostrar_dados();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erro ao tentar selecionar clientesdev  err="+ex);
        }
        try {
             con_recebimento.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
            con_recebimento.resultSet.first();
            preecherPagamentosRecebidos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao preencher a tabela de pagamentos"+ex);
        }
         preecher_valor_pago();
            valor_restante();
    }
    
    public void atualiza_combox_cliente(){
      
        try {
          
            con_clientesdev.resultSet.first();
            while(con_clientesdev.resultSet.next())
                jc_comboClientes.addItem(con_clientesdev.resultSet.getString("nomecliente"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);     
        }
    }
    
    
   
}
