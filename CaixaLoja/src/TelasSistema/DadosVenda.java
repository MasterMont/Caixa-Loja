package TelasSistema;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaCrediario;

/**
 * @author RamonFernandes
 */
public class DadosVenda extends javax.swing.JFrame {
    ConectaCrediario con_crediario = new ConectaCrediario();


    public DadosVenda() {
        initComponents();
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        bt_pesquisa = new javax.swing.JButton();
        jl_nome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dados da Venda no Crediário");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nota", "Cliente", "Produto", "Vlr Unit", "Quant", "Total", "Data"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Imprimir");

        jLabel1.setText("DADOS DE VENDA PARA CLIENTES");

        jl_nota.setText("nota");

        bt_pesquisa.setText("pesquisar nota");
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });

        jl_nome.setText("nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jl_nota)
                        .addGap(61, 61, 61)
                        .addComponent(jl_nome)
                        .addGap(61, 61, 61)
                        .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nota)
                    .addComponent(bt_pesquisa)
                    .addComponent(jl_nome))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed
        String sql = "select * from crediario where cliente='"+jl_nome.getText()+"'";
        //JOptionPane.showMessageDialog(null,"sql= "+sql);
        con_crediario.executeSQL(sql);
        try {
            con_crediario.resultSet.first();
            preeencher_jtable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não encontrou esta nota"+ex);
        }
    }//GEN-LAST:event_bt_pesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(DadosVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_nota;
    // End of variables declaration//GEN-END:variables

public void recebe(String recebedor){
    jl_nota.setText(recebedor);

}

public void recebeNome(String nome){
    jl_nome.setText(nome);

}

    private void preeencher_jtable() {
        //falta testar
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);//nota
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);//nomeCliente
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);//produto 
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);//VALOR unit
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);//quant
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);//total
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);//data
          con_crediario.executeSQL("select * from crediario where nota="+jl_nota.getText()+"");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("nota"),con_crediario.resultSet.getString("cliente"),con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("valor_unit"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("total_compra"),con_crediario.resultSet.getString("data")});
           }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }

}
