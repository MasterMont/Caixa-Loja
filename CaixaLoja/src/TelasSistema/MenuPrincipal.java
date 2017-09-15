
package TelasSistema;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import relatorios.ClientesEmAtrazo;
import relatorios.RelatVendasMensal;
import relatorios.RelatorioCadFornecedores;
import relatorios.RelatorioClientes1;
import relatorios.RelatorioClientesQuitados;
import relatorios.RelatorioEstoque;
import utilitarios.Backup;
import utilitarios.Data;

/**
 *
 * @author RamonFernandes
 */
public class MenuPrincipal extends javax.swing.JFrame {
     Data mostrar_data;
     Backup backup;
     String seta_look = "com.birosoft.liquid.LiquidLookAndFeel";
     
    
    public MenuPrincipal() {
        initComponents();
        
        mostrar_data = new Data();
        mostrar_data.le_data();
        jl_data.setText(mostrar_data.dia+"-"+mostrar_data.mes+"-"+mostrar_data.ano);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bt_cadastroProdutos = new javax.swing.JButton();
        bt_vendas = new javax.swing.JButton();
        bt_estoque = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jl_data = new javax.swing.JLabel();
        bt_codBarras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_mercadoria = new javax.swing.JMenuItem();
        jm_clientes = new javax.swing.JMenuItem();
        jm_fornecedores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_aparencia2 = new javax.swing.JMenuItem();
        jm_aparencia3 = new javax.swing.JMenuItem();
        jm_aparencia4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jm_relatorio_vendasmensal = new javax.swing.JMenu();
        jm_clientesCadastrados = new javax.swing.JMenuItem();
        jm_relVendas = new javax.swing.JMenuItem();
        jm_relEstoque = new javax.swing.JMenuItem();
        jm_relFornecedores = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jm_clientesQuitados = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jm_venda_clientes = new javax.swing.JMenuItem();
        jm_venda_simples = new javax.swing.JMenuItem();
        jm_servicos_clientes = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jm_financeiro = new javax.swing.JMenu();
        jm_contasReceber = new javax.swing.JMenuItem();
        jm_receberPag = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setBackground(new java.awt.Color(51, 0, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_cadastroProdutos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        bt_cadastroProdutos.setText("CADASTRO");
        bt_cadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastroProdutosActionPerformed(evt);
            }
        });

        bt_vendas.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        bt_vendas.setText("VENDA");
        bt_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vendasActionPerformed(evt);
            }
        });

        bt_estoque.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        bt_estoque.setText("ESTOQUE");
        bt_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_estoqueActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton4.setText("RELATÓRIOS DE VENDAS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bt_sair.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jl_data.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jl_data.setText("data");

        bt_codBarras.setText("CODIGO DE BARRAS");
        bt_codBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_codBarrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jl_data))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_cadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_codBarras)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(bt_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bt_cadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(bt_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(bt_codBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_data)
                .addGap(19, 19, 19))
        );

        jLabel2.setFont(new java.awt.Font("Elephant", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText(" \"SOLUÇÕES EM TI\" Rosário - MA");

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setText("CLIENTES EM ATRASO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        jm_mercadoria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_mercadoria.setText("MERCADORIAS");
        jm_mercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_mercadoriaActionPerformed(evt);
            }
        });
        jMenu1.add(jm_mercadoria);

        jm_clientes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_clientes.setText("CLIENTES");
        jm_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_clientesActionPerformed(evt);
            }
        });
        jMenu1.add(jm_clientes);

        jm_fornecedores.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_fornecedores.setText("FORNECEDORES");
        jm_fornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_fornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jm_fornecedores);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aparência");
        jMenu2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem1.setText("APARENCIA 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jm_aparencia2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_aparencia2.setText("APARENCIA 2");
        jm_aparencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_aparencia2ActionPerformed(evt);
            }
        });
        jMenu2.add(jm_aparencia2);

        jm_aparencia3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_aparencia3.setText("APARENCIA 3");
        jm_aparencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_aparencia3ActionPerformed(evt);
            }
        });
        jMenu2.add(jm_aparencia3);

        jm_aparencia4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_aparencia4.setText("APARENCIA 4");
        jm_aparencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_aparencia4ActionPerformed(evt);
            }
        });
        jMenu2.add(jm_aparencia4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estoque");
        jMenu3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jm_relatorio_vendasmensal.setText("Relatórios");
        jm_relatorio_vendasmensal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jm_relatorio_vendasmensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_relatorio_vendasmensalActionPerformed(evt);
            }
        });

        jm_clientesCadastrados.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_clientesCadastrados.setText("RELATÓRIO DE CLIENTES ");
        jm_clientesCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_clientesCadastradosActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jm_clientesCadastrados);

        jm_relVendas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_relVendas.setText("RELATÓRIO DE VENDA");
        jm_relVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_relVendasActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jm_relVendas);

        jm_relEstoque.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_relEstoque.setText("RELATÓRIO DE ESTOQUE");
        jm_relEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_relEstoqueActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jm_relEstoque);

        jm_relFornecedores.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_relFornecedores.setText("RELATORIO DE FORNECEDORES");
        jm_relFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_relFornecedoresActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jm_relFornecedores);

        jMenuItem2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuItem2.setText("RELATÓRIO MENSAL DE VENDAS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jMenuItem2);

        jm_clientesQuitados.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jm_clientesQuitados.setText("RELATÓRIO DE CLIENTES QUITADOS");
        jm_clientesQuitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_clientesQuitadosActionPerformed(evt);
            }
        });
        jm_relatorio_vendasmensal.add(jm_clientesQuitados);

        jMenuBar1.add(jm_relatorio_vendasmensal);

        jMenu5.setText("Vendas");
        jMenu5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jm_venda_clientes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_venda_clientes.setText("VENDAS PARA CLIENTES");
        jm_venda_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_venda_clientesActionPerformed(evt);
            }
        });
        jMenu5.add(jm_venda_clientes);

        jm_venda_simples.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_venda_simples.setText("VENDAS SIMPLES");
        jm_venda_simples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_venda_simplesActionPerformed(evt);
            }
        });
        jMenu5.add(jm_venda_simples);

        jm_servicos_clientes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_servicos_clientes.setText("SERVIÇOS P/ CLIENTES");
        jm_servicos_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_servicos_clientesActionPerformed(evt);
            }
        });
        jMenu5.add(jm_servicos_clientes);

        jMenuItem3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jMenuItem3.setText("VENDAS NO CARTÃO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jm_financeiro.setText("Financeiro");
        jm_financeiro.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jm_contasReceber.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_contasReceber.setText("CONTAS A RECEBER");
        jm_contasReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_contasReceberActionPerformed(evt);
            }
        });
        jm_financeiro.add(jm_contasReceber);

        jm_receberPag.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jm_receberPag.setText("RECEBER PAGAMENTO");
        jm_receberPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_receberPagMouseClicked(evt);
            }
        });
        jm_receberPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_receberPagActionPerformed(evt);
            }
        });
        jm_financeiro.add(jm_receberPag);

        jMenuBar1.add(jm_financeiro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastroProdutosActionPerformed
        new CadastroProdutos().show();
    }//GEN-LAST:event_bt_cadastroProdutosActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_estoqueActionPerformed
        new RelatorioEstoque().show();
    }//GEN-LAST:event_bt_estoqueActionPerformed

    private void jm_mercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_mercadoriaActionPerformed
        new CadastroProdutos().show();
    }//GEN-LAST:event_jm_mercadoriaActionPerformed

    private void jm_fornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_fornecedoresActionPerformed
        new CadFornecedores().show();
    }//GEN-LAST:event_jm_fornecedoresActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new RelatorioEstoque().show();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jm_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_clientesActionPerformed
        new CadClientes().show();
    }//GEN-LAST:event_jm_clientesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ClientesEmAtrazo().show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jm_relFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_relFornecedoresActionPerformed
        new RelatorioCadFornecedores().show();
    }//GEN-LAST:event_jm_relFornecedoresActionPerformed

    private void jm_clientesCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_clientesCadastradosActionPerformed
        new RelatorioClientes1().show();
    }//GEN-LAST:event_jm_clientesCadastradosActionPerformed

    private void jm_relEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_relEstoqueActionPerformed
        new RelatorioEstoque().show();
    }//GEN-LAST:event_jm_relEstoqueActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new RelatorioVendas().show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vendasActionPerformed
        new VendasSimples().show();
    }//GEN-LAST:event_bt_vendasActionPerformed

    private void jm_venda_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_venda_clientesActionPerformed
        new VendasCrediario().show();
    }//GEN-LAST:event_jm_venda_clientesActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
       // new VendasSimples().show();
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jm_venda_simplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_venda_simplesActionPerformed
         new VendasSimples().show();
    }//GEN-LAST:event_jm_venda_simplesActionPerformed

    private void jm_contasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_contasReceberActionPerformed
        new ContasReceber().show();
    }//GEN-LAST:event_jm_contasReceberActionPerformed

    private void jm_relVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_relVendasActionPerformed
        new RelatorioVendas().show();
    }//GEN-LAST:event_jm_relVendasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         seta_look = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
         aparencia();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jm_aparencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_aparencia2ActionPerformed
        seta_look = "javax.swing.plaf.metal.MetalLookAndFeel";
         aparencia();
    }//GEN-LAST:event_jm_aparencia2ActionPerformed

    private void jm_aparencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_aparencia3ActionPerformed
       seta_look = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
         aparencia();
    }//GEN-LAST:event_jm_aparencia3ActionPerformed

    private void jm_aparencia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_aparencia4ActionPerformed
       seta_look = "com.birosoft.liquid.LiquidLookAndFeel";
         aparencia();
    }//GEN-LAST:event_jm_aparencia4ActionPerformed

    private void jm_servicos_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_servicos_clientesActionPerformed
        new VendasCrediarioAvulso().show();
    }//GEN-LAST:event_jm_servicos_clientesActionPerformed

    private void jm_relatorio_vendasmensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_relatorio_vendasmensalActionPerformed
       
    }//GEN-LAST:event_jm_relatorio_vendasmensalActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         new RelatVendasMensal().show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jm_receberPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_receberPagMouseClicked
        
    }//GEN-LAST:event_jm_receberPagMouseClicked

    private void jm_receberPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_receberPagActionPerformed
        new SelecionarContasDatas().show();
    }//GEN-LAST:event_jm_receberPagActionPerformed

    private void jm_clientesQuitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_clientesQuitadosActionPerformed
        new RelatorioClientesQuitados().show();
    }//GEN-LAST:event_jm_clientesQuitadosActionPerformed

    private void bt_codBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_codBarrasActionPerformed
        new CodBarras().show();
    }//GEN-LAST:event_bt_codBarrasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new VendasCartao().show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastroProdutos;
    private javax.swing.JButton bt_codBarras;
    private javax.swing.JButton bt_estoque;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_vendas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_data;
    private javax.swing.JMenuItem jm_aparencia2;
    private javax.swing.JMenuItem jm_aparencia3;
    private javax.swing.JMenuItem jm_aparencia4;
    private javax.swing.JMenuItem jm_clientes;
    private javax.swing.JMenuItem jm_clientesCadastrados;
    private javax.swing.JMenuItem jm_clientesQuitados;
    private javax.swing.JMenuItem jm_contasReceber;
    private javax.swing.JMenu jm_financeiro;
    private javax.swing.JMenuItem jm_fornecedores;
    private javax.swing.JMenuItem jm_mercadoria;
    private javax.swing.JMenuItem jm_receberPag;
    private javax.swing.JMenuItem jm_relEstoque;
    private javax.swing.JMenuItem jm_relFornecedores;
    private javax.swing.JMenuItem jm_relVendas;
    private javax.swing.JMenu jm_relatorio_vendasmensal;
    private javax.swing.JMenuItem jm_servicos_clientes;
    private javax.swing.JMenuItem jm_venda_clientes;
    private javax.swing.JMenuItem jm_venda_simples;
    // End of variables declaration//GEN-END:variables

public void aparencia(){
     try{
                UIManager.setLookAndFeel(seta_look);
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
               // UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
               //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

             SwingUtilities.updateComponentTreeUI(this);
         }catch(Exception erro){
             JOptionPane.showMessageDialog(null, erro);
         }
    
    }
}
