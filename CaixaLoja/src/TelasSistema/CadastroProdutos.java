
package TelasSistema;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.ConectaBancoFornecedor;
import utilitarios.ConectaBancoProduto;


/**
 *
 * @author RamonFernandes
 */
public class CadastroProdutos extends javax.swing.JFrame {

    ConectaBancoProduto con_cadastro = new ConectaBancoProduto();
    ConectaBancoFornecedor con_fornecedor = new ConectaBancoFornecedor();
    DecimalFormat obj_formatado = new DecimalFormat();
      int navegador = 0;
      
    
    public CadastroProdutos() {
        initComponents();
        con_cadastro.conexao();
        con_fornecedor.conexao();
        con_cadastro.executeSQL("select * from estoque_merc");
        
        con_fornecedor.executeSQL("select * from fornecedor order by nome");
        atualiza_combox_fornecedor();
        
           try {
            con_cadastro.resultSet.first();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jt_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jt_preco_custo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jf_data_entrada = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_quantidade = new javax.swing.JTextField();
        jl_id = new javax.swing.JLabel();
        bt_pesquisa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jt_marca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_preco_venda = new javax.swing.JTextField();
        jc_fornecedor = new javax.swing.JComboBox();
        bt_cadFornecedor = new javax.swing.JButton();
        jt_porcentoLucro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jl_LucroAposVenda = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_CadProdutos = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        botaoVoltarPrimeiro = new javax.swing.JButton();
        botaoVoltaAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoIrUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE PRODUTOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setForeground(new java.awt.Color(153, 255, 204));

        jLabel2.setText("Cod.:");

        jt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_codActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço de Custo:");

        jt_preco_custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_preco_custoActionPerformed(evt);
            }
        });
        jt_preco_custo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_preco_custoKeyReleased(evt);
            }
        });

        jLabel5.setText("Data de Entrada:");

        try {
            jf_data_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Quantidade:");

        jl_id.setText("id");

        bt_pesquisa.setText("Pesquisar");
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });

        jLabel7.setText("Marca:");

        jLabel8.setText("Fornecedor:");

        jLabel9.setText("Preço de venda:");

        jt_preco_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_preco_vendaActionPerformed(evt);
            }
        });
        jt_preco_venda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_preco_vendaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_preco_vendaKeyTyped(evt);
            }
        });

        bt_cadFornecedor.setText("+");
        bt_cadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadFornecedorActionPerformed(evt);
            }
        });

        jt_porcentoLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_porcentoLucroActionPerformed(evt);
            }
        });
        jt_porcentoLucro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_porcentoLucroKeyReleased(evt);
            }
        });

        jLabel10.setText("% lucro");

        jl_LucroAposVenda.setText("lucro");
        jl_LucroAposVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jl_LucroAposVendaKeyReleased(evt);
            }
        });

        jLabel12.setText("Lucro:");

        jLabel11.setText("R$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jf_data_entrada)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jc_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_cadFornecedor)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(jl_id))
                                .addComponent(jt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jt_preco_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(jt_porcentoLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(51, 51, 51)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jt_preco_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(jl_LucroAposVenda))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_id)
                    .addComponent(bt_pesquisa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jc_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadFornecedor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jf_data_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_preco_custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_porcentoLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_preco_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_LucroAposVenda)
                            .addComponent(jLabel11))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bt_CadProdutos.setText("CADASTRAR");
        bt_CadProdutos.setEnabled(false);
        bt_CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadProdutosActionPerformed(evt);
            }
        });

        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(botaoVoltarPrimeiro)
                .addGap(9, 9, 9)
                .addComponent(botaoVoltaAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProximo)
                .addGap(9, 9, 9)
                .addComponent(botaoIrUltimo)
                .addGap(26, 26, 26)
                .addComponent(bt_CadProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_CadProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoIrUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoVoltarPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_codActionPerformed
        bt_CadProdutos.setEnabled(true);
        try {
             String sqlBusc;
             sqlBusc = "select * from estoque_merc where cod_produto = '"+jt_cod.getText()+"'";
             
                        
            con_cadastro.executeSQL(sqlBusc);
            if(con_cadastro.resultSet.next()){
                bt_alterar.setEnabled(true);
                con_cadastro.resultSet.first();
                String nome = "A mercadoria "+con_cadastro.resultSet.getString("nome")+" já Existe, deseja alterar?";
                int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome, "<ALTERAR>",JOptionPane.YES_NO_OPTION);
                if(opcao_escolhida == JOptionPane.YES_OPTION)  {          
                jl_id.setText(con_cadastro.resultSet.getString("id"));
                jt_cod.setText(con_cadastro.resultSet.getString("cod_produto"));
                jt_nome.setText(con_cadastro.resultSet.getString("nome"));
                jt_marca.setText(con_cadastro.resultSet.getString("marca"));
                jf_data_entrada.setText(con_cadastro.resultSet.getString("data_entrada"));
                jt_preco_custo.setText(con_cadastro.resultSet.getString("preco_custo"));
                jt_preco_venda.setText(con_cadastro.resultSet.getString("preco_venda"));
                jc_fornecedor.setSelectedItem(con_cadastro.resultSet.getString("fornecedor"));
                jt_quantidade.setText(con_cadastro.resultSet.getString("quantidade"));
                //JOptionPane.showMessageDialog(null, "Produto já Existe");
                bt_CadProdutos.setEnabled(false);            
                }else{
                    jt_cod.setText("");
                    return;
                }
            }else{
                jt_nome.requestFocus();
                return;
            }
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
        //con_cadastro.desconecta();
    }//GEN-LAST:event_jt_codActionPerformed

    private void jt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nomeActionPerformed

    private void bt_CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadProdutosActionPerformed
        
        try {
            String sqlCadastrar = "insert into estoque_merc(cod_produto,nome,marca,preco_custo,preco_venda,data_entrada,fornecedor,quantidade,lucro_porcentagem,lucro_real) values ('"+jt_cod.getText()+"','"+jt_nome.getText()+"','"+jt_marca.getText()+"',"+jt_preco_custo.getText()+","+jt_preco_venda.getText()+",'"+jf_data_entrada.getText()+"','"+jc_fornecedor.getSelectedItem()+"',"+jt_quantidade.getText()+","+jt_porcentoLucro.getText()+","+jl_LucroAposVenda.getText()+")";
           // JOptionPane.showMessageDialog(null, "sql= "+sqlCadastrar);
            con_cadastro.statement.executeUpdate(sqlCadastrar);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            limparCampos();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Err.. "+ex);
        }
       // con_cadastro.desconecta();
    }//GEN-LAST:event_bt_CadProdutosActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        con_cadastro.desconecta();
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        limparCampos();
        bt_CadProdutos.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
         try{
           String sql = "update estoque_merc set nome='"+jt_nome.getText()+"', marca='"+jt_marca.getText()+"', preco_custo="+jt_preco_custo.getText()+",preco_venda="+jt_preco_venda.getText()+", fornecedor='"+jc_fornecedor.getSelectedItem()+"', data_entrada='"+jf_data_entrada.getText()+"', quantidade="+jt_quantidade.getText()+" where id="+jl_id.getText();
           con_cadastro.statement.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
           
           con_cadastro.executeSQL("select * from estoque_merc");
           con_cadastro.resultSet.next();
           limparCampos();
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Erro ao tentar alterar este registro. Err"+erro);
       }
         //con_cadastro.desconecta();
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed
        bt_alterar.setEnabled(true);
          try {
            con_cadastro.executeSQL("select * from estoque_merc where cod_produto = '"+jt_cod.getText()+"'");
            con_cadastro.resultSet.first();
            jl_id.setText(con_cadastro.resultSet.getString("id"));
            jt_nome.setText(con_cadastro.resultSet.getString("nome"));
            jc_fornecedor.setSelectedItem(con_cadastro.resultSet.getString("fornecedor"));
            jt_marca.setText(con_cadastro.resultSet.getString("marca"));
            jt_quantidade.setText(con_cadastro.resultSet.getString("quantidade"));
            jt_preco_custo.setText(con_cadastro.resultSet.getString("preco_custo"));
            jt_preco_venda.setText(con_cadastro.resultSet.getString("preco_venda"));
            jf_data_entrada.setText(con_cadastro.resultSet.getString("data_entrada"));
            JOptionPane.showMessageDialog(null, "ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro"+ex);
        }
         // con_cadastro.desconecta();
    }//GEN-LAST:event_bt_pesquisaActionPerformed

    private void bt_cadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadFornecedorActionPerformed
        new CadFornecedores().show();
        con_cadastro.desconecta();
          dispose();
    }//GEN-LAST:event_bt_cadFornecedorActionPerformed

    private void jt_porcentoLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_porcentoLucroActionPerformed
       double lucro, valorVenda,precoCusto,percentual;
       precoCusto = Double.parseDouble(jt_preco_custo.getText());
       percentual = Double.parseDouble(jt_porcentoLucro.getText());
     
       lucro = precoCusto * (percentual/100);
       valorVenda = (precoCusto + lucro);
       jt_preco_venda.setText(""+valorVenda);
       jl_LucroAposVenda.setText(""+lucro);
      //obj_formatado.applyPattern("#,##0.00");
       
       //jt_preco_venda.setText(""+obj_formatado.format(valorVenda));
       //jl_LucroAposVenda.setText(""+obj_formatado.format(lucro));
       
    }//GEN-LAST:event_jt_porcentoLucroActionPerformed

    private void jt_preco_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_preco_vendaActionPerformed
        
	double lucro, valorVenda,precoCusto,percentual;

		valorVenda = Double.parseDouble(jt_preco_venda.getText());
		precoCusto = Double.parseDouble(jt_preco_custo.getText());
                lucro = valorVenda - precoCusto;
		percentual = (valorVenda - precoCusto)/precoCusto * 100;
                jt_porcentoLucro.setText(""+percentual);
                jl_LucroAposVenda.setText(""+lucro);
               // obj_formatado.applyPattern("#,##0.00");		
               //jt_porcentoLucro.setText(""+obj_formatado.format(percentual));
               //jl_LucroAposVenda.setText(""+obj_formatado.format(lucro));
    }//GEN-LAST:event_jt_preco_vendaActionPerformed

    private void botaoVoltarPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarPrimeiroActionPerformed
        try {
            con_cadastro.resultSet.first();
            mostrar_dados();
             navegador = 2;
           // preecher_Jtable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltarPrimeiroActionPerformed

    private void botaoVoltaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaAnteriorActionPerformed
        try {
            con_cadastro.resultSet.previous();

            mostrar_dados();
            //preecher_Jtable();
            navegador = 2;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltaAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        try {
            con_cadastro.resultSet.next();

            mostrar_dados();
            //preecher_Jtable();
            navegador = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoIrUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrUltimoActionPerformed
        try {
            con_cadastro.resultSet.last();
            mostrar_dados();
            navegador = 1;
            //preecher_Jtable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoIrUltimoActionPerformed

    private void jt_preco_custoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_preco_custoKeyReleased
       /* if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
               && (evt.getKeyCode() != 8 && evt.getKeyCode() != 46))
        if(jt_preco_custo.getText().length() > 0)
           jt_preco_custo.setText(jt_preco_custo.getText().
                  substring(0, jt_preco_custo.getText().length()-1));
        if(evt.getKeyCode() == 44)
           jt_preco_custo.setText(jt_preco_custo.getText()+".");*/
    }//GEN-LAST:event_jt_preco_custoKeyReleased

    private void jt_porcentoLucroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_porcentoLucroKeyReleased
        /*if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
               && (evt.getKeyCode() != 8 && evt.getKeyCode() != 46))
        if(jt_porcentoLucro.getText().length() > 0)
           jt_porcentoLucro.setText(jt_porcentoLucro.getText().
                  substring(0, jt_porcentoLucro.getText().length()-1));
        if(evt.getKeyCode() == 44)
           jt_porcentoLucro.setText(jt_porcentoLucro.getText()+".");*/
    }//GEN-LAST:event_jt_porcentoLucroKeyReleased

    private void jt_preco_vendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_preco_vendaKeyReleased
      /*  if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
               && (evt.getKeyCode() != 8 && evt.getKeyCode() != 46))
        if(jt_preco_venda.getText().length() > 0)
           jt_preco_venda.setText(jt_preco_venda.getText().
                  substring(0, jt_preco_venda.getText().length()-1));
        if(evt.getKeyCode() == 44)
           jt_preco_venda.setText(jt_preco_venda.getText()+".");*/
    }//GEN-LAST:event_jt_preco_vendaKeyReleased

    private void jl_LucroAposVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jl_LucroAposVendaKeyReleased
      /*  if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
               && (evt.getKeyCode() != 8 && evt.getKeyCode() != 46))
        if(jl_LucroAposVenda.getText().length() > 0)
           jl_LucroAposVenda.setText(jl_LucroAposVenda.getText().
                  substring(0, jl_LucroAposVenda.getText().length()-1));
        if(evt.getKeyCode() == 44)
           jl_LucroAposVenda.setText(jl_LucroAposVenda.getText()+".");*/
    }//GEN-LAST:event_jl_LucroAposVendaKeyReleased

    private void jt_preco_vendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_preco_vendaKeyTyped
      /*  if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57)
               && (evt.getKeyCode() != 8 && evt.getKeyCode() != 46))
        if(jl_LucroAposVenda.getText().length() > 0)
           jl_LucroAposVenda.setText(jl_LucroAposVenda.getText().
                  substring(0, jl_LucroAposVenda.getText().length()-1));
        if(evt.getKeyCode() == 44)
           jl_LucroAposVenda.setText(jl_LucroAposVenda.getText()+".");*/
    }//GEN-LAST:event_jt_preco_vendaKeyTyped

    private void jt_preco_custoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_preco_custoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_preco_custoActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
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
    private javax.swing.JButton bt_cadFornecedor;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JButton bt_sair;
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
    private javax.swing.JComboBox jc_fornecedor;
    private javax.swing.JFormattedTextField jf_data_entrada;
    private javax.swing.JLabel jl_LucroAposVenda;
    private javax.swing.JLabel jl_id;
    private javax.swing.JTextField jt_cod;
    private javax.swing.JTextField jt_marca;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JTextField jt_porcentoLucro;
    private javax.swing.JTextField jt_preco_custo;
    private javax.swing.JTextField jt_preco_venda;
    private javax.swing.JTextField jt_quantidade;
    // End of variables declaration//GEN-END:variables

    
    public void limparCampos(){
        jt_cod.setText("");
        jt_nome.setText("");
        jt_marca.setText("");
       // jc_fornecedor.setSelectedItem(null);
        jt_preco_custo.setText("");
        jt_preco_venda.setText("");
        jf_data_entrada.setText("");
        jt_quantidade.setText("");
        jt_porcentoLucro.setText("");
        jl_LucroAposVenda.setText("");
        jt_cod.requestFocus();    
    }
    
    
     public void atualiza_combox_fornecedor(){
      
        try {
          
            con_fornecedor.resultSet.first();
            while(con_fornecedor.resultSet.next())
                jc_fornecedor.addItem(con_fornecedor.resultSet.getString("nome"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);     
        }
    }

        public void mostrar_dados(){
             try {

                     jl_id.setText(con_cadastro.resultSet.getString("id"));
                     jt_cod.setText(con_cadastro.resultSet.getString("cod_produto"));
                     jt_nome.setText(con_cadastro.resultSet.getString("nome"));
                     jt_marca.setText(con_cadastro.resultSet.getString("marca"));
                     jt_quantidade.setText(con_cadastro.resultSet.getString("quantidade"));
                     jf_data_entrada.setText(con_cadastro.resultSet.getString("data_entrada"));
                     jt_preco_custo.setText(con_cadastro.resultSet.getString("preco_custo"));
                     jt_preco_venda.setText(con_cadastro.resultSet.getString("preco_venda"));
                     jc_fornecedor.setSelectedItem(con_cadastro.resultSet.getString("fornecedor"));
                     jt_porcentoLucro.setText(con_cadastro.resultSet.getString("lucro_porcentagem"));
                     jl_LucroAposVenda.setText(con_cadastro.resultSet.getString("lucro_real"));


             } catch (SQLException ex) {
                 if(navegador == 1){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no último registro!");
                 }else if(navegador == 2){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no primeiro registro!");
                 }else{
                     JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
                 }
                 navegador = 0;

             }

     }
}
