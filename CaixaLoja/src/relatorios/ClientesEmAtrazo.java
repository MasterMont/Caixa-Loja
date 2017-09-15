
package relatorios;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaDevedores;
import utilitarios.ConectaRecebimento;
import utilitarios.Data;

/**
 *
 * @author Ramon Fernandes
 */
public final class ClientesEmAtrazo extends javax.swing.JFrame {
        ConectaDevedores con_devedores = new ConectaDevedores();
        ConectaRecebimento con_recebimento = new ConectaRecebimento();
        Data mostrar_data;
        String sqlDevedores;// = "SELECT * FROM clientesdev WHERE data_venc BETWEEN '"+jt_data_inicio1.getText()+"' AND '"+jt_data_fim1.getText()+"'";
    
    public ClientesEmAtrazo() {
        initComponents(); 
        mostrar_data = new Data();
        mostrar_data.le_data();
        jl_data_hoje.setText(mostrar_data.dia+"-"+mostrar_data.mes+"-"+mostrar_data.ano);
        
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
        
        
        sqlDevedores = "SELECT * FROM clientesdev WHERE data_venc BETWEEN '19-03-2017' AND '"+jl_data_hoje.getText()+"'";
        con_devedores.conexao();
        con_devedores.executeSQL(sqlDevedores);
            try {
                if(con_devedores.resultSet.next()){
                  preecher_JtableDevedores();
                }else{
                    JOptionPane.showMessageDialog(null, "Não existe clientes em atraso.");
                }
                  
            } catch (SQLException ex) {
                Logger.getLogger(ClientesEmAtrazo.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_data_hoje = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTES COM CONTAS EM ATRAZO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CLIENTES EM ATRASO");

        jl_data_hoje.setText("data");

        jl_nota.setText("nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(403, 1008, Short.MAX_VALUE)
                .addComponent(jl_data_hoje)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(373, 373, 373)
                .addComponent(jl_nota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jl_data_hoje)
                .addGap(31, 70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nota)))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nota", "Cliente", "dataCompra", "Venc", "Total"
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

        jLabel4.setText("DADOS DOS PAGAMENTOS REALIZADOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
      setaTextField();
      setTabelaPagamentos();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       setaTextField();
       setTabelaPagamentos();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ClientesEmAtrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesEmAtrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesEmAtrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesEmAtrazo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesEmAtrazo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jl_data_hoje;
    private javax.swing.JLabel jl_nota;
    // End of variables declaration//GEN-END:variables

 public void preecher_JtableDevedores(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);//nota
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);//cliente
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);//dataCompra
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);//venc
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);//total
       
        con_devedores.executeSQL("SELECT * FROM clientesdev WHERE data_venc BETWEEN '19-03-2017' AND '"+jl_data_hoje.getText()+"'");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_devedores.resultSet.next()) {
                modelo.addRow(new Object[]{con_devedores.resultSet.getString("nota"),con_devedores.resultSet.getString("nomecliente"),con_devedores.resultSet.getString("datacompra"),con_devedores.resultSet.getString("vencimento"),con_devedores.resultSet.getString("valortotal")});
            }
            con_devedores.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
 
   private void preecher_JtablePagamentos() {
           
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);//nota
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);//cliente
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(10);//vlr Receb
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
 
   public void setaTextField(){
         int indiceLinha = jTable1.getSelectedRow();
         jl_nota.setText(jTable1.getValueAt(indiceLinha, 0).toString());
         //jl_cliente.setText(jTable1.getValueAt(indiceLinha, 1).toString()); 
    }
   
   public void setTabelaPagamentos(){
        String sqlnota = "select * from pagamentos_recebidos where nota="+jl_nota.getText()+"";
        con_recebimento.executeSQL(sqlnota);
        preecher_JtablePagamentos();
       
    }
}
