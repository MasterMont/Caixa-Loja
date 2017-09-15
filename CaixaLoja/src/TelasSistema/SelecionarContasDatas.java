
package TelasSistema;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaDevedores;
import utilitarios.ConectaRecebimento;
import utilitarios.Data;

/**
 *
 * @author RamonFernandes
 */
public class SelecionarContasDatas extends javax.swing.JFrame {
    ConectaDevedores con_devedores = new ConectaDevedores();
    ConectaRecebimento con_recebimento = new ConectaRecebimento();
    Data mostrarData;
    double total, valorPago,totalDivida,restante,valor_rec,resultado;
    DecimalFormat obj_formatado = new DecimalFormat();
    String sqlDelete;

    public SelecionarContasDatas() {
        initComponents();
        con_recebimento.conexao();
       // con_recebimento.executeSQL("select * from pagamentos_recebidos");
        
        con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev order by nomecliente");
         preecher_Jtable();
         
        mostrarData = new Data();
        mostrarData.le_data();
        jl_data_atual.setText(mostrarData.dia+"-"+mostrarData.mes+"-"+mostrarData.ano);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_buscarPorData1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jt_data_inicio1 = new javax.swing.JFormattedTextField();
        jt_data_fim1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jt_cliente = new javax.swing.JTextField();
        bt_nome = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_cliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jl_datacompra = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_vencimento = new javax.swing.JLabel();
        jl_data_atual = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jl_total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl_situacao = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jl_valor_recebido = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jl_restante = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jt_recebimento = new javax.swing.JTextField();
        bt_receber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELEÇÃO POR DATA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), null), "Pesquisa Clientes por Períodos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOTA", "CLIENTE", "DATA COMPRA", "VENCIMENTO", "TOTAL COMPRA"
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
        jScrollPane2.setViewportView(jTable1);

        bt_buscarPorData1.setText("BUSCAR");
        bt_buscarPorData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarPorData1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("DATA DE INICIO:");

        try {
            jt_data_inicio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jt_data_fim1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("DATA FIM:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jt_data_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jt_data_fim1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_data_fim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_data_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("CLIENTE:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        bt_nome.setText("BUSCAR");
        bt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nomeActionPerformed(evt);
            }
        });

        bt_voltar.setText("VOLTAR");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(bt_buscarPorData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_nome)
                .addGap(114, 114, 114))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(bt_voltar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_buscarPorData1)
                    .addComponent(bt_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(bt_voltar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), null), "Pesquisar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setText("NOTA:");

        jl_nota.setText("nota");

        jLabel5.setText("CLIENTE:");

        jl_cliente.setText("cliente");

        jLabel7.setText("DATA COMPRA:");

        jl_datacompra.setText("data");

        jLabel9.setText("VENCIMENTO:");

        jl_vencimento.setText("vencimento");

        jl_data_atual.setText("data");

        jLabel12.setText("TOTAL: R$");

        jl_total.setText("total");

        jLabel2.setText("SITUAÇÃO:");

        jl_situacao.setText("situacao");

        jLabel8.setText("TOTAL RECEBIDO:");

        jl_valor_recebido.setText("recebido");

        jLabel11.setText("RESTANTE:");

        jl_restante.setText("restante");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 153), null, null), "Receber pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 11))); // NOI18N

        jLabel6.setText("VALOR: ");

        jt_recebimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jt_recebimentoFocusGained(evt);
            }
        });
        jt_recebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_recebimentoActionPerformed(evt);
            }
        });

        bt_receber.setText("RECEBER PAGAMENTO");
        bt_receber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_receberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_recebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_receber)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_recebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(bt_receber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jl_nota)
                            .addComponent(jLabel5)
                            .addComponent(jl_cliente)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jl_datacompra)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jl_situacao))))
                                .addGap(128, 128, 128)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl_data_atual))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jl_vencimento)
                                            .addComponent(jl_valor_recebido))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_restante)
                                            .addComponent(jLabel11))))))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_total)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nota)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jl_data_atual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_datacompra)
                    .addComponent(jl_vencimento))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jl_total))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_valor_recebido)
                    .addComponent(jl_restante)
                    .addComponent(jl_situacao))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_buscarPorData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarPorData1ActionPerformed
        String sqlVendas = "SELECT * FROM clientesdev WHERE data_venc BETWEEN '"+jt_data_inicio1.getText()+"' AND '"+jt_data_fim1.getText()+"'";
        con_devedores.executeSQL(sqlVendas);
        preecher_Jtable();
    }//GEN-LAST:event_bt_buscarPorData1ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        setaTextField();
        preecher_valor_pago();
        preencherValorRestante();
        situacao();
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        setaTextField();
        preecher_valor_pago();
        preencherValorRestante();
        situacao();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jt_recebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_recebimentoActionPerformed
       
    }//GEN-LAST:event_jt_recebimentoActionPerformed

    private void jt_recebimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jt_recebimentoFocusGained
        bt_receber.enable(true);
    }//GEN-LAST:event_jt_recebimentoFocusGained

    private void bt_receberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_receberActionPerformed
         try {
            String sql = "insert into pagamentos_recebidos(nomecliente,nota,valor_pago,valor_divida,data_pag,data_pag_tdata) values ('"+jl_cliente.getText()+"',"+jl_nota.getText()+","+jt_recebimento.getText()+","+jl_total.getText()+",'"+jl_data_atual.getText()+"','"+jl_data_atual.getText()+"')";
            //JOptionPane.showMessageDialog(null, "sql= "+sql);
            con_recebimento.statement.executeUpdate(sql);
            //JOptionPane.showMessageDialog(null, "sql ="+sql);
            JOptionPane.showMessageDialog(null, "Recebido com Sucesso!");
            
            deletarClienteQuitado();
            jt_recebimento.setText("");
             
            String sqlVendas = "SELECT * FROM clientesdev";
            con_devedores.executeSQL(sqlVendas);
            preecher_Jtable();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Err.. "+ex);
        }
    }//GEN-LAST:event_bt_receberActionPerformed

    private void bt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nomeActionPerformed
        String sqlVendas = "SELECT * FROM clientesdev WHERE nomecliente like '%"+jt_cliente.getText()+"%'";
        con_devedores.executeSQL(sqlVendas);
        preecher_Jtable();
    }//GEN-LAST:event_bt_nomeActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        String sqlVendas = "SELECT * FROM clientesdev ORDER BY nomecliente";
        con_devedores.executeSQL(sqlVendas);
        preecher_Jtable();
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
            java.util.logging.Logger.getLogger(SelecionarContasDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarContasDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarContasDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarContasDatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarContasDatas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscarPorData1;
    private javax.swing.JButton bt_nome;
    private javax.swing.JButton bt_receber;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl_cliente;
    private javax.swing.JLabel jl_data_atual;
    private javax.swing.JLabel jl_datacompra;
    private javax.swing.JLabel jl_nota;
    private javax.swing.JLabel jl_restante;
    private javax.swing.JLabel jl_situacao;
    private javax.swing.JLabel jl_total;
    private javax.swing.JLabel jl_valor_recebido;
    private javax.swing.JLabel jl_vencimento;
    private javax.swing.JTextField jt_cliente;
    private javax.swing.JFormattedTextField jt_data_fim1;
    private javax.swing.JFormattedTextField jt_data_inicio1;
    private javax.swing.JTextField jt_recebimento;
    // End of variables declaration//GEN-END:variables

 public void preecher_Jtable(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);//nota
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);//cliente
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);//data compra
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);//vencimento
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);//total
        
      // con_saida.executeSQL("select * from saida_medicamento");
        
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
 
  public void setaTextField(){
     int indiceLinha = jTable1.getSelectedRow();
        jl_nota.setText(jTable1.getValueAt(indiceLinha, 0).toString());
        jl_cliente.setText(jTable1.getValueAt(indiceLinha, 1).toString());
        jl_datacompra.setText(jTable1.getValueAt(indiceLinha, 2).toString());
        jl_vencimento.setText(jTable1.getValueAt(indiceLinha, 3).toString());//depois mudar para data_venc
        jl_total.setText(jTable1.getValueAt(indiceLinha, 4).toString());
        
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
    
    public void preencherValorRestante(){
        
        valorPago = Double.parseDouble(jl_valor_recebido.getText());
        totalDivida = Double.parseDouble(jl_total.getText());
        restante = totalDivida - valorPago;
        // obj_formatado.applyPattern("#,##00,0");
       
        jl_restante.setText(""+obj_formatado.format(restante));
        jl_restante.setText(""+restante);
    }
    
     public void situacao(){
        if(restante <= 0){
            jl_situacao.setText("QUITADO!");
        }else if(restante > 0){
            jl_situacao.setText("EM DÉBITO.");
        } 
    }
     
     public void deletarClienteQuitado(){
         
            restante = Double.parseDouble(jl_restante.getText());
            valor_rec = Double.parseDouble(jt_recebimento.getText());
            resultado = valor_rec - restante;
            if(resultado == 0){
                sqlDelete = "delete from clientesdev where nota="+jl_nota.getText()+"";
                //JOptionPane.showMessageDialog(null, "sqldelete = "+sqlDelete);
                try {
                    con_devedores.statement.executeUpdate(sqlDelete);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "erro ao deletar cliente"+ex);
                }
               }else{
             jt_recebimento.setText("");
           
           
            }
     }
}
