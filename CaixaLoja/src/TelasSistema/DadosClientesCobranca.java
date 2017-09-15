
package TelasSistema;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.ConectaCliente;

/**
 *
 * @author RamonFernandes
 */
public class DadosClientesCobranca extends javax.swing.JFrame {
    ConectaCliente con_cliente = new ConectaCliente();
    int navegador = 0;

    public DadosClientesCobranca() {
        initComponents();
        con_cliente.conexao();
        con_cliente.executeSQL("select * from clientes");
        
          try {
            con_cliente.resultSet.first();
              mostrar_dados();
             limparCampos();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);     
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jl_rua = new javax.swing.JLabel();
        jl_referencia = new javax.swing.JLabel();
        jl_bairro = new javax.swing.JLabel();
        jl_cidade = new javax.swing.JLabel();
        bt_CadProdutos = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jl_id = new javax.swing.JLabel();
        bt_pesquisar = new javax.swing.JButton();
        botaoVoltarPrimeiro = new javax.swing.JButton();
        botaoVoltaAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoIrUltimo = new javax.swing.JButton();
        jl_nome = new javax.swing.JLabel();
        jl_tel1 = new javax.swing.JLabel();
        jl_tel2 = new javax.swing.JLabel();
        jl_apelido = new javax.swing.JLabel();
        jl_rg = new javax.swing.JLabel();
        jl_cpf = new javax.swing.JLabel();
        jl_conjuge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTES");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("DADOS DE CLIENTES P/ COBRANÇA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setText("NOME:");

        jLabel3.setText("TEL 1:");

        jLabel5.setText("APELIDO:");

        jLabel6.setText("TEL. 2:");

        jLabel7.setText("CÔNJUGE:");

        jLabel8.setText("RG.:");

        jLabel9.setText("CPF.:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N

        jLabel4.setText("RUA:");

        jLabel10.setText("BAIRRO:");

        jLabel11.setText("CIDADE:");

        jLabel13.setText("PONTO DE REFERÊNCIA:");

        jl_rua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_rua.setText("jLabel21");

        jl_referencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_referencia.setText("jLabel22");

        jl_bairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_bairro.setText("jLabel23");

        jl_cidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_cidade.setText("jLabel24");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_referencia)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_bairro)
                                .addGap(252, 252, 252)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_cidade))
                            .addComponent(jl_rua)))
                    .addComponent(jLabel13))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jl_rua))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jl_bairro)
                    .addComponent(jl_cidade))
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_referencia)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        bt_CadProdutos.setText("CADASTRAR");
        bt_CadProdutos.setEnabled(false);
        bt_CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadProdutosActionPerformed(evt);
            }
        });

        bt_novo.setText("NOVO");
        bt_novo.setEnabled(false);
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_alterar.setText("ALTERAR");
        bt_alterar.setEnabled(false);
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jl_id.setText("id");

        bt_pesquisar.setText("PESQUISAR");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        botaoVoltarPrimeiro.setText(" <<");
        botaoVoltarPrimeiro.setToolTipText("ir para o primeiro registro");
        botaoVoltarPrimeiro.setEnabled(false);
        botaoVoltarPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarPrimeiroActionPerformed(evt);
            }
        });

        botaoVoltaAnterior.setText("<");
        botaoVoltaAnterior.setToolTipText("registro anterior");
        botaoVoltaAnterior.setEnabled(false);
        botaoVoltaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setText(">");
        botaoProximo.setToolTipText("proximo registro");
        botaoProximo.setEnabled(false);
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoIrUltimo.setText(">>");
        botaoIrUltimo.setToolTipText("ir para o ultimo registro");
        botaoIrUltimo.setEnabled(false);
        botaoIrUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrUltimoActionPerformed(evt);
            }
        });

        jl_nome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_nome.setText("jLabel14");

        jl_tel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tel1.setText("jLabel15");

        jl_tel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_tel2.setText("jLabel16");

        jl_apelido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_apelido.setText("jLabel17");

        jl_rg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_rg.setText("jLabel18");

        jl_cpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_cpf.setText("jLabel19");

        jl_conjuge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl_conjuge.setText("jLabel20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(botaoVoltarPrimeiro)
                .addGap(9, 9, 9)
                .addComponent(botaoVoltaAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProximo)
                .addGap(9, 9, 9)
                .addComponent(botaoIrUltimo)
                .addGap(18, 18, 18)
                .addComponent(bt_CadProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_nome)
                        .addGap(270, 270, 270)
                        .addComponent(bt_pesquisar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jl_cpf))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_tel1)
                            .addGap(159, 159, 159)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jl_tel2))))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jl_id)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 59, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_apelido)
                        .addGap(275, 275, 275))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_rg))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jl_conjuge)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jl_id)
                    .addComponent(bt_pesquisar)
                    .addComponent(jl_nome))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jl_tel2)
                    .addComponent(jl_apelido)
                    .addComponent(jl_tel1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jl_rg)
                    .addComponent(jl_cpf))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jl_conjuge))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_CadProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botaoIrUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(botaoProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltaAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadProdutosActionPerformed

       // try {
           // String sqlCadastrar = "insert into clientes(nome,tel,apelido,idet,cpf,rua,bairro,cidade,pontoreferencia,conjuge,tel2) values ('"+jt_nome.getText()+"','"+jt_tel1.getText()+"','"+jt_apelido.getText()+"','"+jt_rg.getText()+"','"+jt_cpf.getText()+"','"+jt_rua.getText()+"','"+jt_bairro.getText()+"','"+jt_cidade.getText()+"','"+jt_pontoReferencia.getText()+"','"+jt_conjuge.getText()+"','"+jt_tel2.getText()+"')";
           // JOptionPane.showMessageDialog(null, "sql= "+sqlCadastrar);
           // con_cliente.statement.executeUpdate(sqlCadastrar);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            limparCampos();
            //con_cliente.resultSet.first();

     //   } catch (SQLException ex) {
        //    JOptionPane.showMessageDialog(null, "Err.. "+ex);
      //  }
        //con_cliente.desconecta();
    }//GEN-LAST:event_bt_CadProdutosActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        limparCampos();
        bt_CadProdutos.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        try{
          //  String sql = "update clientes set nome='"+jt_nome.getText()+"', tel='"+jt_tel1.getText()+"', apelido='"+jt_apelido.getText()+"',idet='"+jt_rg.getText()+"', cpf='"+jt_cpf.getText()+"', rua='"+jt_rua.getText()+"', bairro='"+jt_bairro.getText()+"', cidade='"+jt_cidade.getText()+"', pontoreferencia='"+jt_pontoReferencia.getText()+"', conjuge='"+jt_conjuge.getText()+"', tel2='"+jt_tel2+"' where id="+jl_id.getText();
            //con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");

            con_cliente.executeSQL("select * from clientes");
            con_cliente.resultSet.next();
            limparCampos();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao tentar alterar este registro. Err"+erro);

        }
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        con_cliente.desconecta();
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
         bt_alterar.setEnabled(true);
          try {
            con_cliente.executeSQL("select * from clientes where nome = '"+jl_nome.getText()+"'");
            con_cliente.resultSet.first();
            jl_id.setText(con_cliente.resultSet.getString("id"));
            jl_nome.setText(con_cliente.resultSet.getString("nome"));
            jl_tel1.setText(con_cliente.resultSet.getString("tel"));
            jl_apelido.setText(con_cliente.resultSet.getString("apelido"));
            jl_rg.setText(con_cliente.resultSet.getString("idet"));
            jl_cpf.setText(con_cliente.resultSet.getString("cpf"));
            jl_rua.setText(con_cliente.resultSet.getString("rua"));
            jl_bairro.setText(con_cliente.resultSet.getString("bairro"));
            jl_cidade.setText(con_cliente.resultSet.getString("cidade"));
            jl_referencia.setText(con_cliente.resultSet.getString("pontoreferencia"));
            jl_conjuge.setText(con_cliente.resultSet.getString("conjuge"));
            jl_tel2.setText(con_cliente.resultSet.getString("tel2"));
            
            JOptionPane.showMessageDialog(null, "ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex);
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void botaoVoltarPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarPrimeiroActionPerformed
        try {
            con_cliente.resultSet.first();
            mostrar_dados();
            // preecher_Jtable();
             navegador = 2;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltarPrimeiroActionPerformed

    private void botaoVoltaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaAnteriorActionPerformed
        try {
            con_cliente.resultSet.previous();

            mostrar_dados();
            //preecher_Jtable();
            navegador = 2;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltaAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        try {
            con_cliente.resultSet.next();

            mostrar_dados();
            //preecher_Jtable();
            navegador = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoIrUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrUltimoActionPerformed
        try {
            con_cliente.resultSet.last();
            mostrar_dados();
            //preecher_Jtable();
             navegador = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoIrUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(DadosClientesCobranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosClientesCobranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosClientesCobranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosClientesCobranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosClientesCobranca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoIrUltimo;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoVoltaAnterior;
    private javax.swing.JButton botaoVoltarPrimeiro;
    private javax.swing.JButton bt_CadProdutos;
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jl_apelido;
    private javax.swing.JLabel jl_bairro;
    private javax.swing.JLabel jl_cidade;
    private javax.swing.JLabel jl_conjuge;
    private javax.swing.JLabel jl_cpf;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_referencia;
    private javax.swing.JLabel jl_rg;
    private javax.swing.JLabel jl_rua;
    private javax.swing.JLabel jl_tel1;
    private javax.swing.JLabel jl_tel2;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jl_id.setText("");
       // jl_nome.setText("");
        jl_tel1.setText("");
        jl_tel2.setText("");
        jl_rg.setText("");
        jl_cpf.setText("");
        jl_conjuge.setText("");
        jl_apelido.setText("");
        jl_rua.setText("");
        jl_bairro.setText("");
        jl_cidade.setText("");
        jl_referencia.setText("");
       // jl_nome.requestFocus();
                
    }
    
    public void recebe(String recebedor){
    jl_nome.setText(recebedor);

}

    public void mostrar_dados(){
             try {
                     jl_id.setText(con_cliente.resultSet.getString("id"));
                     jl_nome.setText(con_cliente.resultSet.getString("nome"));
                     jl_tel1.setText(con_cliente.resultSet.getString("tel"));
                     jl_tel2.setText(con_cliente.resultSet.getString("tel2"));
                     jl_apelido.setText(con_cliente.resultSet.getString("apelido"));
                     jl_rg.setText(con_cliente.resultSet.getString("idet"));
                     jl_cpf.setText(con_cliente.resultSet.getString("cpf"));
                     jl_conjuge.setText(con_cliente.resultSet.getString("conjuge"));
                     jl_rua.setText(con_cliente.resultSet.getString("rua"));
                     jl_bairro.setText(con_cliente.resultSet.getString("bairro"));
                     jl_cidade.setText(con_cliente.resultSet.getString("cidade"));
                     jl_referencia.setText(con_cliente.resultSet.getString("pontoreferencia"));

             } catch (SQLException ex) {
                 if(navegador == 1){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no último registro!");
                     //navegador = 0;
                 }else if(navegador == 2){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no primeiro registro!");
                     //navegador = 0;
                 }else{
                     JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
                 }
                 navegador = 0;

             }

     }
}
