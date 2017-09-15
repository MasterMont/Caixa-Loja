
package TelasSistema;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.ConectaDevedores;
import utilitarios.ConectaRecebimento;
import utilitarios.Data;

/**
 *
 * @author RamonFernandes
 */
public class ReceberPagamento extends javax.swing.JFrame {
    Data mostrar_data;
    double restante, valor_rec, resultado;
    ConectaRecebimento con_recebimento = new ConectaRecebimento(); 
    ConectaDevedores con_devedores = new ConectaDevedores();
     
      
    public ReceberPagamento() {
        initComponents();
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
        
        con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev");
        
        mostrar_data = new Data();
        mostrar_data.le_data();
        jl_data.setText(mostrar_data.dia+"-"+mostrar_data.mes+"-"+mostrar_data.ano);
    

               
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jt_valorPago = new javax.swing.JTextField();
        jl_clienteDev = new javax.swing.JLabel();
        jl_data = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        jl_valorDivida = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_restante = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receber Pagamento");

        jLabel1.setText("Digite o valor:");

        jl_clienteDev.setText("nomeCliente");

        jl_data.setText("data");

        bt_salvar.setText("Salvar");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_cancelar.setText("Cancelar");

        jl_valorDivida.setText("valorDivida");

        jl_nota.setText("nota");

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Nota:");

        jLabel4.setText("Valor da Venda:");

        jLabel5.setText("Restante");

        jl_restante.setText("restante");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setText("RECEBER PAGAMENTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_restante)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jl_clienteDev))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(277, 277, 277)
                                .addComponent(jl_data))
                            .addComponent(jl_valorDivida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_nota, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(bt_cancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 262, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_clienteDev)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jl_data)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_valorDivida)
                    .addComponent(jl_nota))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(jl_restante)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salvar))
                .addGap(36, 36, 36)
                .addComponent(bt_cancelar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
          try {
            String sql = "insert into pagamentos_recebidos(nomecliente,nota,valor_pago,valor_divida,data_pag,data_pag_tdata) values ('"+jl_clienteDev.getText()+"',"+jl_nota.getText()+","+jt_valorPago.getText()+","+jl_valorDivida.getText()+",'"+jl_data.getText()+"','"+jl_data.getText()+"')";
            //JOptionPane.showMessageDialog(null, "sql= "+sql);
            con_recebimento.statement.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Recebido com Sucesso!");
            deletarClienteQuitado();
            new ContasReceber().show();
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Err.. "+ex);
        }
    }//GEN-LAST:event_bt_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(ReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceberPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jl_clienteDev;
    private javax.swing.JLabel jl_data;
    private javax.swing.JLabel jl_nota;
    private javax.swing.JLabel jl_restante;
    private javax.swing.JLabel jl_valorDivida;
    private javax.swing.JTextField jt_valorPago;
    // End of variables declaration//GEN-END:variables

public void recebe(String recebedor){
    jl_nota.setText(recebedor);

}

public void recebeNome(String nome){
    jl_clienteDev.setText(nome);

}
 
public void recebevalor(String valor){
    jl_valorDivida.setText(valor);

}

public void recebeValorRestante(String valor){
    jl_restante.setText(valor);

}
  public void deletarClienteQuitado(){
         
            restante = Double.parseDouble(jl_restante.getText());
            valor_rec = Double.parseDouble(jt_valorPago.getText());
            resultado = valor_rec - restante;
            if(resultado == 0){
                String sqlDelete = "delete from clientesdev where nota="+jl_nota.getText()+"";
                //JOptionPane.showMessageDialog(null, "sqldelete = "+sqlDelete);
                try {
                    con_devedores.statement.executeUpdate(sqlDelete);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "erro ao deletar cliente"+ex);
                }
               }else{
             //jt_recebimento.setText("");
           
           
            }
     }

}
