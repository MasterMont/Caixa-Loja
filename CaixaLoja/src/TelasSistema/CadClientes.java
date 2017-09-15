
package TelasSistema;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.ConectaCliente;

/**
 *
 * @author RamonFernandes
 */
public class CadClientes extends javax.swing.JFrame {
    ConectaCliente con_cliente = new ConectaCliente();
    int navegador = 0;

    public CadClientes() {
        initComponents();
        con_cliente.conexao();
        con_cliente.executeSQL("select * from clientes");
        
          try {
            con_cliente.resultSet.first();
              mostrar_dados();
             // preecher_Jtable();
            
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
        jt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_tel1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_apelido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_tel2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_conjuge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jt_rg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_cpf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jt_rua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jt_bairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jt_cidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jt_uf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jt_pontoReferencia = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTES");

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("CADASTRO DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
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

        jt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeActionPerformed(evt);
            }
        });

        jLabel3.setText("TEL 1:");

        jt_tel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_tel1ActionPerformed(evt);
            }
        });

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

        jLabel12.setText("UF.:");

        jLabel13.setText("PONTO DE REFERÊNCIA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(jt_pontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jt_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_pontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        bt_CadProdutos.setText("CADASTRAR");
        bt_CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadProdutosActionPerformed(evt);
            }
        });

        bt_novo.setText("NOVO");
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
        botaoVoltarPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarPrimeiroActionPerformed(evt);
            }
        });

        botaoVoltaAnterior.setText("<");
        botaoVoltaAnterior.setToolTipText("registro anterior");
        botaoVoltaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setText(">");
        botaoProximo.setToolTipText("proximo registro");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoIrUltimo.setText(">>");
        botaoIrUltimo.setToolTipText("ir para o ultimo registro");
        botaoIrUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIrUltimoActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_tel2))
                            .addComponent(jt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_id)
                                .addGap(16, 16, 16))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_cpf))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_conjuge)))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_id)
                    .addComponent(bt_pesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jt_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jt_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_conjuge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bt_CadProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoIrUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltaAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_tel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_tel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_tel1ActionPerformed

    private void bt_CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadProdutosActionPerformed

        try {
            String sqlCadastrar = "insert into clientes(nome,tel,apelido,idet,cpf,rua,bairro,cidade,pontoreferencia,conjuge,tel2) values ('"+jt_nome.getText()+"','"+jt_tel1.getText()+"','"+jt_apelido.getText()+"','"+jt_rg.getText()+"','"+jt_cpf.getText()+"','"+jt_rua.getText()+"','"+jt_bairro.getText()+"','"+jt_cidade.getText()+"','"+jt_pontoReferencia.getText()+"','"+jt_conjuge.getText()+"','"+jt_tel2.getText()+"')";
           // JOptionPane.showMessageDialog(null, "sql= "+sqlCadastrar);
            con_cliente.statement.executeUpdate(sqlCadastrar);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            limparCampos();
            //con_cliente.resultSet.first();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Err.. "+ex);
        }
        //con_cliente.desconecta();
    }//GEN-LAST:event_bt_CadProdutosActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        limparCampos();
        bt_CadProdutos.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        try{
            String sql = "update clientes set nome='"+jt_nome.getText()+"', tel='"+jt_tel1.getText()+"', apelido='"+jt_apelido.getText()+"',idet='"+jt_rg.getText()+"', cpf='"+jt_cpf.getText()+"', rua='"+jt_rua.getText()+"', bairro='"+jt_bairro.getText()+"', cidade='"+jt_cidade.getText()+"', pontoreferencia='"+jt_pontoReferencia.getText()+"', conjuge='"+jt_conjuge.getText()+"', tel2='"+jt_tel2.getText()+"' where id="+jl_id.getText();
            con_cliente.statement.executeUpdate(sql);
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
        pesquisaCliente();
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

    private void jt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeActionPerformed
        pesquisaCliente();
    }//GEN-LAST:event_jt_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadClientes().setVisible(true);
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
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jl_id;
    private javax.swing.JTextField jt_apelido;
    private javax.swing.JTextField jt_bairro;
    private javax.swing.JTextField jt_cidade;
    private javax.swing.JTextField jt_conjuge;
    private javax.swing.JTextField jt_cpf;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JTextField jt_pontoReferencia;
    private javax.swing.JTextField jt_rg;
    private javax.swing.JTextField jt_rua;
    private javax.swing.JTextField jt_tel1;
    private javax.swing.JTextField jt_tel2;
    private javax.swing.JTextField jt_uf;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jl_id.setText("");
        jt_nome.setText("");
        jt_tel1.setText("");
        jt_tel2.setText("");
        jt_rg.setText("");
        jt_cpf.setText("");
        jt_conjuge.setText("");
        jt_apelido.setText("");
        jt_rua.setText("");
        jt_bairro.setText("");
        jt_cidade.setText("");
        jt_pontoReferencia.setText("");
        jt_nome.requestFocus();
                
    }

    public void mostrar_dados(){
             try {
                     jl_id.setText(con_cliente.resultSet.getString("id"));
                     jt_nome.setText(con_cliente.resultSet.getString("nome"));
                     jt_tel1.setText(con_cliente.resultSet.getString("tel"));
                     jt_tel2.setText(con_cliente.resultSet.getString("tel2"));
                     jt_apelido.setText(con_cliente.resultSet.getString("apelido"));
                     jt_rg.setText(con_cliente.resultSet.getString("idet"));
                     jt_cpf.setText(con_cliente.resultSet.getString("cpf"));
                     jt_conjuge.setText(con_cliente.resultSet.getString("conjuge"));
                     jt_rua.setText(con_cliente.resultSet.getString("rua"));
                     jt_bairro.setText(con_cliente.resultSet.getString("bairro"));
                     jt_cidade.setText(con_cliente.resultSet.getString("cidade"));
                     jt_pontoReferencia.setText(con_cliente.resultSet.getString("pontoreferencia"));

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

    private void pesquisaCliente() {
         bt_alterar.setEnabled(true);
          try {
            con_cliente.executeSQL("select * from clientes where nome like '%"+jt_nome.getText()+"%'");
            con_cliente.resultSet.first();
            jl_id.setText(con_cliente.resultSet.getString("id"));
            jt_nome.setText(con_cliente.resultSet.getString("nome"));
            jt_tel1.setText(con_cliente.resultSet.getString("tel"));
            jt_apelido.setText(con_cliente.resultSet.getString("apelido"));
            jt_rg.setText(con_cliente.resultSet.getString("idet"));
            jt_cpf.setText(con_cliente.resultSet.getString("cpf"));
            jt_rua.setText(con_cliente.resultSet.getString("rua"));
            jt_bairro.setText(con_cliente.resultSet.getString("bairro"));
            jt_cidade.setText(con_cliente.resultSet.getString("cidade"));
            jt_pontoReferencia.setText(con_cliente.resultSet.getString("pontoreferencia"));
            jt_conjuge.setText(con_cliente.resultSet.getString("conjuge"));
            jt_tel2.setText(con_cliente.resultSet.getString("tel2"));
            
            JOptionPane.showMessageDialog(null, "ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex);
        }
    }
}
