
package relatorios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaVenda;

/**
 *
 * @author Ramon Fernandes
 */
public class RelatorioProduto extends javax.swing.JFrame {
    ConectaVenda con_vendas = new ConectaVenda();
    ConectaCrediario con_fiado = new ConectaCrediario();

    
    public RelatorioProduto() {
        initComponents();
        
        con_fiado.conexao();
        con_fiado.executeSQL("select * from crediario");
        
        con_vendas.conexao();
        con_vendas.executeSQL("select * from vendas");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_produto = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE PRODUTO");

        jl_produto.setText("nomeProduto");

        bt_pesquisar.setText("pesquisa");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "VLRUNIT", "QTD", "TOTAL", "DATA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CLIENTE", "PROD", "UNT", "QTD", "TOTAL", "DATA"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("RELATÓRIO DE VENDAS DE PRODUTO");

        jLabel2.setText("AVISTA:");

        jLabel3.setText("FIADO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(206, 206, 206)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_pesquisar)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_produto)
                            .addComponent(bt_pesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        String sql,sqlFiado;
        sql = "select * from vendas where nome='"+jl_produto.getText()+"'";
        sqlFiado = "select * from crediario where nome='"+jl_produto.getText()+"'";
       
       con_vendas.executeSQL(sql);
       preecher_JtableAvista();
       con_fiado.executeSQL(sqlFiado);
       preecher_JtableFiado();
          
    }//GEN-LAST:event_bt_pesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jl_produto;
    // End of variables declaration//GEN-END:variables
    public void recebeNomeProduto(String recebedor){
    jl_produto.setText(recebedor);

}
    
    public void preecher_JtableAvista(){
          
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);//nomeCliente
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(30);//produto
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(10);//vlr unit
        jTable2.getColumnModel().getColumn(3).setPreferredWidth(10);//qtd
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(20);//total
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(30);//data
       
        con_fiado.executeSQL("select * from crediario where nome='"+jl_produto.getText()+"'");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_fiado.resultSet.next()) {
                modelo.addRow(new Object[]{con_fiado.resultSet.getString("cliente"),con_fiado.resultSet.getString("nome"),con_fiado.resultSet.getString("valor_unit"),con_fiado.resultSet.getString("quantidade"),con_fiado.resultSet.getString("total_compra"),con_fiado.resultSet.getString("data")});
            }
            con_fiado.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }

    private void preecher_JtableFiado() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);//nome
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);//vlr unit
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);//qtd
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);//total
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);//data
       
        con_vendas.executeSQL("select * from vendas where nome='"+jl_produto.getText()+"'");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_vendas.resultSet.next()) {
                modelo.addRow(new Object[]{con_vendas.resultSet.getString("nome"),con_vendas.resultSet.getString("valor_unit"),con_vendas.resultSet.getString("quantidade"),con_vendas.resultSet.getString("total_compra"),con_vendas.resultSet.getString("data")});
            }
            con_vendas.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
}
