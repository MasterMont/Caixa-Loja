
package relatorios;

import TelasSistema.DadosClientesCobranca;
import TelasSistema.VendasSimples;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaBancoFornecedor;
import utilitarios.ConectaEstoque;

/**
 *
 * @author RamonFernandes
 */
public class RelatorioEstoque extends javax.swing.JFrame {
    ConectaEstoque con_estoque = new ConectaEstoque();
    VendasSimples enviaProduto;
    RelatorioProduto produto;
    
    public RelatorioEstoque() {
        initComponents();
        con_estoque.conexao();
        
        con_estoque.executeSQL("select * from estoque_merc order by nome");
        preecher_JtableProduto();
        
        somaProdEstoque();
        somaProdPrecoCusto();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jt_pesqProduto = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jl_total = new javax.swing.JLabel();
        bt_Voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_total_custo = new javax.swing.JLabel();
        jl_produto = new javax.swing.JLabel();
        bt_enviar_prod_venda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bt_estoqueCritico = new javax.swing.JButton();
        bt_rel_prod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RELATÓRIO DE ESTOQUE");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("ESTOQUE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(480, 480, 480))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD", "PRODUTO", "MARCA", "CUSTO", "VENDA", "DATA", "QUANT", "FORNECEDOR"
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

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("DIGITE O NOME DO PRODUTO:");

        jt_pesqProduto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jt_pesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_pesqProdutoActionPerformed(evt);
            }
        });

        bt_pesquisar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bt_pesquisar.setText("PESQUISAR");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("TOTAL PREÇO VENDA:");

        jl_total.setText("total");

        bt_Voltar.setText("voltar");
        bt_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_VoltarActionPerformed(evt);
            }
        });

        jLabel4.setText("R$");

        jLabel5.setText("TOTAL PREÇO CUSTO:  R$");

        jl_total_custo.setText("totalCusto");

        jl_produto.setText("produto");

        bt_enviar_prod_venda.setText("ENVIAR P/ VENDA");
        bt_enviar_prod_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_enviar_prod_vendaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setText("ESTOQUE CRÍTICO:");

        bt_estoqueCritico.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bt_estoqueCritico.setText("PESQUISAR");
        bt_estoqueCritico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_estoqueCriticoActionPerformed(evt);
            }
        });

        bt_rel_prod.setText("RELELATÓRIO DE PRODUTO");
        bt_rel_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rel_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_estoqueCritico, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jt_pesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Voltar)))
                .addContainerGap(398, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_total)
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_total_custo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_produto)
                .addGap(193, 193, 193)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_rel_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_enviar_prod_venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Voltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jt_pesqProduto)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bt_estoqueCritico)
                    .addComponent(bt_rel_prod))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jl_total)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jl_total_custo)
                    .addComponent(jl_produto)
                    .addComponent(bt_enviar_prod_venda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_pesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_pesqProdutoActionPerformed
            String sql ="select * from estoque_merc where nome like '%"+jt_pesqProduto.getText()+"%'";
            con_estoque.executeSQL(sql);
            preecher_JtableProduto();            
    }//GEN-LAST:event_jt_pesqProdutoActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        //String sql = "select * from estoque_merc where nome='"+jt_pesqProduto.getText()+"'";
        String sql ="select * from estoque_merc where nome like '%"+jt_pesqProduto.getText()+"%'";
            con_estoque.executeSQL(sql);
            preecher_JtableProduto();            
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_VoltarActionPerformed
        con_estoque.executeSQL("select * from estoque_merc order by nome");
        preecher_JtableProduto();
        jt_pesqProduto.setText("");
        jt_pesqProduto.requestFocus();
    }//GEN-LAST:event_bt_VoltarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        setaTextField();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        setaTextField();
    }//GEN-LAST:event_jTable1KeyReleased

    private void bt_enviar_prod_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_enviar_prod_vendaActionPerformed
         if(enviaProduto == null){
            enviaProduto = new VendasSimples();
            enviaProduto.setVisible(true);
            enviaProduto.recebe(jl_produto.getText());
            //dispose();
        }else{
            enviaProduto.setVisible(true);
            enviaProduto.setState(enviaProduto.NORMAL);
            enviaProduto.recebe(jl_produto.getText());
           // dispose();
        }
    }//GEN-LAST:event_bt_enviar_prod_vendaActionPerformed

    private void bt_estoqueCriticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_estoqueCriticoActionPerformed

        String sql ="select * from estoque_merc where quantidade < 3";
        con_estoque.executeSQL(sql);
        preecher_JtableProduto();
    }//GEN-LAST:event_bt_estoqueCriticoActionPerformed

    private void bt_rel_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rel_prodActionPerformed
        if(produto == null){
            produto = new RelatorioProduto();
            produto.setVisible(true);
            produto.recebeNomeProduto(jl_produto.getText());
            //dispose();
        }else{
            produto.setVisible(true);
            produto.setState(produto.NORMAL);
            produto.recebeNomeProduto(jl_produto.getText());
           // dispose();
        }
    }//GEN-LAST:event_bt_rel_prodActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Voltar;
    private javax.swing.JButton bt_enviar_prod_venda;
    private javax.swing.JButton bt_estoqueCritico;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_rel_prod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl_produto;
    private javax.swing.JLabel jl_total;
    private javax.swing.JLabel jl_total_custo;
    private javax.swing.JTextField jt_pesqProduto;
    // End of variables declaration//GEN-END:variables

    
     public void preecher_JtableProduto(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);//COD
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(220);//PRODUTO
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);//MARCA
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(15);//CUSTO
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(15);//VENDA
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);//DATA
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(15);//QUANT
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(20);//FORNECEDOR
        
      // con_saida.executeSQL("select * from saida_medicamento");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_estoque.resultSet.next()) {
                modelo.addRow(new Object[]{con_estoque.resultSet.getString("cod_produto"),con_estoque.resultSet.getString("nome"),con_estoque.resultSet.getString("marca"),con_estoque.resultSet.getString("preco_custo"),con_estoque.resultSet.getString("preco_venda"),con_estoque.resultSet.getString("data_entrada"),con_estoque.resultSet.getString("quantidade"),con_estoque.resultSet.getString("fornecedor")});
            }
            con_estoque.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
    
      public void somaProdEstoque(){
        double total = 0;
         con_estoque.executeSQL("select * from estoque_merc");
        try {
            while (con_estoque.resultSet.next()) {
                double precoVenda = con_estoque.resultSet.getDouble("preco_venda");
                double quant = con_estoque.resultSet.getInt("quantidade");
                total = total + precoVenda * quant;
                //total = total + con_estoque.resultSet.getDouble("total_compra");
            }
            jl_total.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    
    }
      
       public void somaProdPrecoCusto(){
        double total = 0;
         con_estoque.executeSQL("select * from estoque_merc");
        try {
            while (con_estoque.resultSet.next()) {
                double precoVenda = con_estoque.resultSet.getDouble("preco_custo");
                double quant = con_estoque.resultSet.getInt("quantidade");
                total = total + precoVenda * quant;
                //total = total + con_estoque.resultSet.getDouble("total_compra");
            }
            jl_total_custo.setText(String.format("%.2f",total ));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    
    }
    public void setaTextField(){
        int indiceLinha = jTable1.getSelectedRow();
           jl_produto.setText(jTable1.getValueAt(indiceLinha, 1).toString());
          // jt_nomeProd.setText(jTable1.getValueAt(indiceLinha, 1).toString());
          // jt_quantidade.setText(jTable1.getValueAt(indiceLinha, 2).toString());
          // jt_valorUnitario.setText(jTable1.getValueAt(indiceLinha, 3).toString());
          // jt_totalParcial.setText(jTable1.getValueAt(indiceLinha, 4).toString());
           
    }
}
