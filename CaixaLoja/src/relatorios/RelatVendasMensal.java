
package relatorios;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaCartao;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaVenda;

/**
 *
 * @author RamonFernandes
 */
public final class RelatVendasMensal extends javax.swing.JFrame {
    ConectaVenda con_vendas = new ConectaVenda();
    ConectaCartao con_vendascartao = new ConectaCartao();
    ConectaCrediario con_crediario = new ConectaCrediario();
    double total,precoVenda,quantidade;

    public RelatVendasMensal() {
        initComponents();
        con_vendas.conexao();
        con_vendas.executeSQL("select * from vendas");
        preecher_VendasAvista();
        somavendas();
        con_vendascartao.conexao();
        con_vendascartao.executeSQL("select * from vendascartao");
        preecher_VendasCartao();
        somavendasCartao();
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        preecher_crediario();
        somacrediario();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_data_inicial = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_deta_final = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jl_total_venda = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jl_total_crediario = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_total_cartao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATORIO DE VENDAS MENSAL");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("RELATÓRIO MENSAL DE VENDAS");

        jLabel2.setText("DATA INICIO:");

        try {
            jt_data_inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("DATA FIM:");

        try {
            jt_deta_final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "QUANT", "VALOR", "DATA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "QUANT", "VALOR", "DATA"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setText("TABELA DE VENDAS A VISTA:");

        jLabel5.setText("TABELA DE VENDAS FIADO:");

        jLabel6.setText("TOTAL: R$ ");

        jl_total_venda.setText("0.0");

        jLabel8.setText("TOTAL: R$");

        jl_total_crediario.setText("0.0");

        bt_pesquisar.setText("PESQUISAR");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        bt_voltar.setText("voltar");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "QUANT", "VALOR", "DATA"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel7.setText("TABELA DE VENDAS NO CARTÃO:");

        jLabel9.setText("TOTAL:R$ ");

        jl_total_cartao.setText("0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_total_venda)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_total_crediario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_total_cartao))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jt_data_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_deta_final, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(bt_voltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(372, 372, 372))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_data_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_deta_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_pesquisar)
                            .addComponent(bt_voltar))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jl_total_venda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jl_total_crediario)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jl_total_cartao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String sqlVendas,sqlCartao, sqlcrediario;
        sqlVendas = "SELECT * FROM vendas WHERE data_venc BETWEEN '"+jt_data_inicial.getText()+"' AND '"+jt_deta_final.getText()+"'";
        sqlCartao = "SELECT * FROM vendascartao WHERE data_venc BETWEEN '"+jt_data_inicial.getText()+"' AND '"+jt_deta_final.getText()+"'";
        sqlcrediario = "SELECT * FROM crediario WHERE data_venc BETWEEN '"+jt_data_inicial.getText()+"' AND '"+jt_deta_final.getText()+"'";
        con_vendas.executeSQL(sqlVendas);
        preecher_VendasAvista();
        somavendas();
        con_vendascartao.executeSQL(sqlCartao);
        preecher_VendasCartao();
        somavendasCartao();
        con_crediario.executeSQL(sqlcrediario);        
        preecher_crediario();
        somacrediario();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        con_vendas.executeSQL("select * from vendas");
        preecher_VendasAvista();
        somavendas();
        con_vendascartao.executeSQL("select * from vendascartao");
        preecher_VendasCartao();
        somavendasCartao();
        con_crediario.executeSQL("select * from crediario");
        preecher_crediario();
        somacrediario();
        
        // FALTA IMPLEMENTAR PESQUISA PARA DATAS ANTERIORES A 05-05-2017
        
    }//GEN-LAST:event_bt_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatVendasMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatVendasMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatVendasMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatVendasMensal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatVendasMensal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jl_total_cartao;
    private javax.swing.JLabel jl_total_crediario;
    private javax.swing.JLabel jl_total_venda;
    private javax.swing.JFormattedTextField jt_data_inicial;
    private javax.swing.JFormattedTextField jt_deta_final;
    // End of variables declaration//GEN-END:variables

    
    public void preecher_VendasAvista(){
          
       // jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);//cod
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);//prod
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);//quant
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);//valor
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);//data
     
      // con_saida.executeSQL("select * from saida_medicamento");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_vendas.resultSet.next()) {
                modelo.addRow(new Object[]{con_vendas.resultSet.getString("nome"),con_vendas.resultSet.getString("quantidade"),con_vendas.resultSet.getString("total_compra"),con_vendas.resultSet.getString("data")});
            }
            con_vendas.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na venda avista.."+ e);
        }
    }
    
    public void preecher_VendasCartao(){
          
       // jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);//cod
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);//prod
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);//quant
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);//valor
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);//data
     
        DefaultTableModel modelo = (DefaultTableModel)jTable3.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_vendascartao.resultSet.next()) {
                modelo.addRow(new Object[]{con_vendascartao.resultSet.getString("nome"),con_vendascartao.resultSet.getString("quantidade"),con_vendascartao.resultSet.getString("total_compra"),con_vendascartao.resultSet.getString("data")});
            }
            con_vendascartao.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na venda avista.."+ e);
        }
    }
    
    public void preecher_crediario(){
          
        //jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);//cod
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(70);//prod
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(40);//quant
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(40);//valor
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(40);//DATA
        
        
      // con_saida.executeSQL("select * from saida_medicamento");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("total_compra"),con_crediario.resultSet.getString("data")});
            }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados crediario.."+ e);
        }
    }
    
    public void somavendas(){
        total = 0;
         //con_estoque.executeSQL("select * from estoque_merc");
        try {
            con_vendas.resultSet.first();
            while (con_vendas.resultSet.next()) {
                 precoVenda = con_vendas.resultSet.getDouble("total_compra");
                 quantidade = con_vendas.resultSet.getInt("quantidade");
                total = total + precoVenda * quantidade;
                //total = total + con_estoque.resultSet.getDouble("total_compra");
            }
            jl_total_venda.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    }    
     public void somavendasCartao(){
        total = 0;
         //con_estoque.executeSQL("select * from estoque_merc");
        try {
            con_vendascartao.resultSet.first();
            while (con_vendascartao.resultSet.next()) {
                 precoVenda = con_vendascartao.resultSet.getDouble("total_compra");
                 quantidade = con_vendascartao.resultSet.getInt("quantidade");
                total = total + precoVenda * quantidade;
                //total = total + con_estoque.resultSet.getDouble("total_compra");
            }
            jl_total_cartao.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    } 
     public void somacrediario(){
        total = 0;
         //con_estoque.executeSQL("select * from estoque_merc");
        try {
            con_crediario.resultSet.first();
            while (con_crediario.resultSet.next()) {
                precoVenda = con_crediario.resultSet.getDouble("total_compra");
                quantidade = con_crediario.resultSet.getInt("quantidade");
                total = total + precoVenda * quantidade;
                //total = total + con_estoque.resultSet.getDouble("total_compra");
            }
            jl_total_crediario.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    } 
    
}
