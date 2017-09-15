
package relatorios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaRecebimento;

/**
 *
 * @author RamonFernandes
 */
public final class RelatorioClientesQuitados extends javax.swing.JFrame {
    ConectaCrediario con_crediario = new ConectaCrediario();
    ConectaRecebimento con_recebimento = new ConectaRecebimento();
    double total,valorPago,totalDivida,resultado;
    int nota;
    public RelatorioClientesQuitados() {
        initComponents();
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        
        preecher_Jtable();
        /*
       
        try {
            while(con_crediario.resultSet.next()){
                nota = con_crediario.resultSet.getInt("nota");
                con_recebimento.executeSQL("select * from pagamentos_recebidos where nota="+nota+"");
                if(con_recebimento.resultSet.next()){
                 con_crediario.executeSQL("select * from crediario where nota="+nota+"");
                 preecher_Jtable();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RelatorioClientesQuitados.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
        
        
        
      
        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jt_nomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_cliente = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jl_nomeCli = new javax.swing.JLabel();
        jl_total_divida = new javax.swing.JLabel();
        jl_data_compra = new javax.swing.JLabel();
        jl_vencimento = new javax.swing.JLabel();
        jl_vlr_recebido = new javax.swing.JLabel();
        jl_situacao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_vlotar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Clientes Quitados");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 36)); // NOI18N
        jLabel1.setText("RELATÓRIO DE CLIENTES QUITADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setText("DIGITE O NOME DO CLIENTE:");

        jt_nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeClienteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOTA", "CLIENTE", "PROD", "VLR.UNIT", "QUANT", "TOTAL", "DATA", "VENC"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOTA", "CLIENTE", "VLR.REC", "DATA"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("DADOS DAS COMPRAS REALIZADAS PELO CLIENTE:");

        jLabel4.setText("DADOS DOS PAGAMENTOS REALIZADOS:");

        jl_cliente.setText("nome");

        jl_nota.setText("nota");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jl_nomeCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_nomeCli.setText("nome");

        jl_total_divida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_total_divida.setText("total");

        jl_data_compra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_data_compra.setText("dat");

        jl_vencimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_vencimento.setText("vencimento");

        jl_vlr_recebido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_vlr_recebido.setText("valorRecebido");

        jl_situacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl_situacao.setText("situacao");

        jLabel6.setText("NOME DO CLIENTE:");

        jLabel7.setText("TOTAL DA COMPRA:");

        jLabel8.setText("DATA DA COMPRA:");

        jLabel9.setText("VENCIMENTO:");

        jLabel10.setText("VALOR RECEBIDO: R$ ");

        jLabel11.setText("SITUAÇÃO DO CLIENTE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_vencimento)
                    .addComponent(jl_nomeCli)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl_total_divida)
                                        .addComponent(jl_data_compra))
                                    .addGap(251, 251, 251))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(174, 174, 174)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(174, 174, 174)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_vlr_recebido))
                            .addComponent(jl_situacao)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nomeCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jl_vlr_recebido))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_total_divida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_data_compra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_vencimento))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_situacao)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel5.setText("aperte enter");

        bt_vlotar.setText("VOLTAR");
        bt_vlotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vlotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(bt_vlotar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nota)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_cliente)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_cliente)
                    .addComponent(jLabel5)
                    .addComponent(bt_vlotar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nota)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeClienteActionPerformed
        String sql = "select * from crediario where cliente like '%"+jt_nomeCliente.getText()+"%' order by nota";
        con_crediario.executeSQL(sql);
        preecher_Jtable();
       
    }//GEN-LAST:event_jt_nomeClienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        setaTextField();
        setTabelaPagamentos();
        setaTextFieldLabel();
        situacao();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        setaTextField();
        setTabelaPagamentos();
        setaTextFieldLabel();
        situacao();
    }//GEN-LAST:event_jTable1KeyReleased

    private void bt_vlotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vlotarActionPerformed
        con_crediario.executeSQL("select * from crediario order by nota");
        preecher_Jtable();
        preecher_JtablePagamentos();
        jt_nomeCliente.setText("");
        jt_nomeCliente.requestFocus();
        jl_cliente.setText("NOME");
        jl_data_compra.setText("");
        jl_nomeCli.setText("");
        jl_nota.setText("0");
        jl_situacao.setText("");
        jl_total_divida.setText("");
        jl_vencimento.setText("");
        jl_vlr_recebido.setText("");
    }//GEN-LAST:event_bt_vlotarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioClientesQuitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientesQuitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientesQuitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioClientesQuitados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioClientesQuitados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_vlotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jl_cliente;
    private javax.swing.JLabel jl_data_compra;
    private javax.swing.JLabel jl_nomeCli;
    private javax.swing.JLabel jl_nota;
    private javax.swing.JLabel jl_situacao;
    private javax.swing.JLabel jl_total_divida;
    private javax.swing.JLabel jl_vencimento;
    private javax.swing.JLabel jl_vlr_recebido;
    private javax.swing.JTextField jt_nomeCliente;
    // End of variables declaration//GEN-END:variables


     public void preecher_Jtable(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);//nota
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);//cliente
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);//prod
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);//vlr Unit
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);//quant
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);//total
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(30);//data
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(30);//venc
        
      // con_saida.executeSQL("select * from saida_medicamento");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("nota"),con_crediario.resultSet.getString("cliente"),con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("valor_unit"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("total_compra"),con_crediario.resultSet.getString("data"),con_crediario.resultSet.getString("vencimento")});
            }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
     
     public void setaTextField(){
     int indiceLinha = jTable1.getSelectedRow();
        jl_nota.setText(jTable1.getValueAt(indiceLinha, 0).toString());
        jl_cliente.setText(jTable1.getValueAt(indiceLinha, 1).toString());
       // jl_datacompra.setText(jTable1.getValueAt(indiceLinha, 2).toString());
       // jl_vencimento.setText(jTable1.getValueAt(indiceLinha, 3).toString());
       // jl_total.setText(jTable1.getValueAt(indiceLinha, 4).toString());
        
    }
     
      public void setaTextFieldLabel(){
     int indiceLinha = jTable1.getSelectedRow();
        jl_nomeCli.setText(jTable1.getValueAt(indiceLinha, 1).toString());
        jl_total_divida.setText(jTable1.getValueAt(indiceLinha, 5).toString());
        jl_data_compra.setText(jTable1.getValueAt(indiceLinha, 6).toString());
        jl_vencimento.setText(jTable1.getValueAt(indiceLinha, 7).toString());
       // jl_total.setText(jTable1.getValueAt(indiceLinha, 4).toString());
        
    }

    private void preecher_JtablePagamentos() {
           
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);//nota
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);//cliente
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(40);//vlr Receb
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(10);//data
        
        
      // con_saida.executeSQL("select * from saida_medicamento");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_recebimento.resultSet.next()) {
                modelo.addRow(new Object[]{con_recebimento.resultSet.getString("nota"),con_recebimento.resultSet.getString("nomecliente"),con_recebimento.resultSet.getString("valor_pago"),con_recebimento.resultSet.getString("data_pag")});
            }
            con_recebimento.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
        
    }
    public void setTabelaPagamentos(){
        String sqlnota = "select * from pagamentos_recebidos where nota="+jl_nota.getText()+"";
        con_recebimento.executeSQL(sqlnota);
        preecher_JtablePagamentos();
       
    }
    
    public void situacao(){
        String sqlsit = "select * from pagamentos_recebidos where nota = "+jl_nota.getText()+"";
         total = 0;
         con_recebimento.executeSQL(sqlsit);
         
        try {
            //con_recebimento.resultSet.first();
            while (con_recebimento.resultSet.next()) {
                 valorPago = con_recebimento.resultSet.getDouble("valor_pago");
                //double quant = con_estoque.resultSet.getInt("quantidade");
                total = total + valorPago;
            }
            jl_vlr_recebido.setText(""+total);
             totalDivida = Double.parseDouble(jl_total_divida.getText());
             resultado = totalDivida - total;
            if(resultado == 0 ){
                jl_situacao.setText("Esta nota esta PAGA.");
            }else if(resultado > 0){
                jl_situacao.setText("Esta nota ainda esta em aberto.");
            }else if(resultado < 0){
                jl_situacao.setText("Cliente com credito de R$ "+resultado);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    
    
    }
    


}
