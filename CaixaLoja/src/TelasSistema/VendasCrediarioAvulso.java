
package TelasSistema;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.ConectaBancoProduto;
import utilitarios.ConectaCliente;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaDevedores;
import utilitarios.ConectaRecebimento;
import utilitarios.ConectaVenda;
import utilitarios.Data;

/**
 *
 * @author RamonFernandes
 */

public final class VendasCrediarioAvulso extends javax.swing.JFrame {
   // ConectaCliente con_clientes = new ConectaCliente();
    ConectaBancoProduto con_produtos = new ConectaBancoProduto();
   // ConectaVenda con_venda = new ConectaVenda();
    ConectaCrediario con_crediario = new ConectaCrediario();
    ConectaDevedores con_devedores = new ConectaDevedores();
     ConectaRecebimento con_recebimento = new ConectaRecebimento();
    double total;
    Data mostrar_data;

    public VendasCrediarioAvulso() {
        initComponents();
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
        
        
        con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev");
        
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        
        //con_venda.conexao();
        //con_venda.executeSQL("select * from vendas");
        
        //con_clientes.conexao();
        //con_clientes.executeSQL("select * from clientes");
        
        con_produtos.conexao();
        con_produtos.executeSQL("select * from estoque_merc");
        novo();
        
        mostrar_data = new Data();
        mostrar_data.le_data();
        jl_data.setText(mostrar_data.dia+"-"+mostrar_data.mes+"-"+mostrar_data.ano);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jt_condCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_numNota = new javax.swing.JTextField();
        jl_data = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_codProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_descricao_servico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_quantidade = new javax.swing.JTextField();
        bt_adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jt_valorUnitario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_totalParcial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jt_vencimento = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jt_valorrecebido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jt_troco = new javax.swing.JTextField();
        jt_desconto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jt_total = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jt_valorComDesconto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_finalizar = new javax.swing.JButton();
        jl_ttNota = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jt_nome_cliente = new javax.swing.JTextField();
        jt_valorPago = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TELA DE VENDAS");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("COD.: CLIENTE");

        jt_condCliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_condCliente.setForeground(new java.awt.Color(255, 0, 51));
        jt_condCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_condClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Nº NOTA");

        jt_numNota.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_numNota.setForeground(new java.awt.Color(255, 0, 51));
        jt_numNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_numNotaActionPerformed(evt);
            }
        });

        jl_data.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jl_data.setText("data");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("COD.:");

        jt_codProduto.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_codProduto.setForeground(new java.awt.Color(255, 0, 51));
        jt_codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_codProdutoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("SERVIÇO AVULSO:");

        jt_descricao_servico.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_descricao_servico.setForeground(new java.awt.Color(255, 0, 51));
        jt_descricao_servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_descricao_servicoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("QUANT.:");

        jt_quantidade.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_quantidade.setForeground(new java.awt.Color(255, 0, 51));
        jt_quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_quantidadeActionPerformed(evt);
            }
        });

        bt_adicionar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_adicionar.setForeground(new java.awt.Color(0, 0, 255));
        bt_adicionar.setText("ADICIONAR");
        bt_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adicionarActionPerformed(evt);
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
                "COD", "NOME PROD", "QUANT", "VALOR UNIT", "VALOR TOTAL"
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

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("VALOR UNIT.:");

        jt_valorUnitario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_valorUnitario.setForeground(new java.awt.Color(255, 0, 51));
        jt_valorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_valorUnitarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL PARCIAL:");

        jt_totalParcial.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_totalParcial.setForeground(new java.awt.Color(255, 0, 51));
        jt_totalParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_totalParcialActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("VENCIMENTO:");

        jt_vencimento.setForeground(new java.awt.Color(255, 0, 51));
        try {
            jt_vencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jt_vencimento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_vencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_vencimentoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("FORMA DE PAGAMENTO:");

        jt_valorrecebido.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_valorrecebido.setForeground(new java.awt.Color(255, 0, 51));
        jt_valorrecebido.setText("0.0");
        jt_valorrecebido.setEnabled(false);
        jt_valorrecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_valorrecebidoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setText("TROCO:");

        jt_troco.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_troco.setForeground(new java.awt.Color(255, 0, 51));
        jt_troco.setText("0.0");

        jt_desconto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_desconto.setForeground(new java.awt.Color(255, 0, 51));
        jt_desconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_descontoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setText("DESCONTO:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("TOTAL:");

        jt_total.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_total.setForeground(new java.awt.Color(255, 0, 51));
        jt_total.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("TOTAL COM DESCONTO:");

        jt_valorComDesconto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_valorComDesconto.setForeground(new java.awt.Color(255, 0, 51));
        jt_valorComDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_valorComDescontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_troco, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jt_valorComDesconto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_desconto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jt_valorrecebido))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_desconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_valorComDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_valorrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_troco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_finalizar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_finalizar.setForeground(new java.awt.Color(0, 0, 255));
        bt_finalizar.setText("FINALIZAR");
        bt_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_finalizarMouseClicked(evt);
            }
        });
        bt_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_finalizarActionPerformed(evt);
            }
        });
        bt_finalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_finalizarKeyPressed(evt);
            }
        });

        jl_ttNota.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jl_ttNota.setForeground(new java.awt.Color(0, 0, 255));
        jl_ttNota.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel13.setText("TOTAL:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel13)
                .addGap(117, 117, 117)
                .addComponent(jl_ttNota)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(bt_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jl_ttNota)
                        .addContainerGap())))
        );

        jt_nome_cliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nome_clienteActionPerformed(evt);
            }
        });

        jt_valorPago.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_valorPago.setForeground(new java.awt.Color(255, 0, 0));
        jt_valorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_valorPagoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("VALOR DA ENTRADA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_numNota, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jt_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jl_data))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_condCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jt_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jt_descricao_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jt_valorUnitario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jt_valorPago, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jt_totalParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bt_adicionar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_condCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_numNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jt_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl_data)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_descricao_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_totalParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_adicionar)
                    .addComponent(jt_valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_condClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_condClienteActionPerformed
/*         try {
             String sqlBusc;
             sqlBusc = "select * from clientes where id = '"+jt_condCliente.getText()+"'";
             con_clientes.executeSQL(sqlBusc);
             if(con_clientes.resultSet.next()){
                con_clientes.resultSet.first();
                jt_nome_cliente.setText(con_clientes.resultSet.getString("nome"));
                jt_vencimento.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "Não existe clientes com este codigo "+jt_condCliente.getText());
             return;
             }
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }*/
    }//GEN-LAST:event_jt_condClienteActionPerformed

    private void jt_codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_codProdutoActionPerformed
        /* try {
             String sqlBusc;
             sqlBusc = "select * from estoque_merc where cod_produto = '"+jt_codProduto.getText()+"'";
             con_produtos.executeSQL(sqlBusc);
             if(con_produtos.resultSet.next()){
                con_produtos.resultSet.first();
                jt_descricao_servico.setText(con_produtos.resultSet.getString("nome"));
                jt_valorUnitario.setText(con_produtos.resultSet.getString("preco_venda"));
                //jt_quantidade.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "Não existe produto com este codigo "+jt_codProduto.getText());
             return;
             }
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }*/
    }//GEN-LAST:event_jt_codProdutoActionPerformed

    private void jt_descricao_servicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_descricao_servicoActionPerformed
        jt_valorUnitario.requestFocus();
    }//GEN-LAST:event_jt_descricao_servicoActionPerformed

    private void jt_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_quantidadeActionPerformed
         if("".equals(jt_desconto.getText()))
            jt_desconto.setText("0");
        
        double valorUnit = Double.parseDouble(jt_valorUnitario.getText());
        double quant = Double.parseDouble(jt_quantidade.getText());
        double resultado = (quant * valorUnit);
        
        jt_totalParcial.setText(""+resultado);
        jt_total.setText(""+resultado);
        jt_desconto.requestFocus();
    }//GEN-LAST:event_jt_quantidadeActionPerformed

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_bt_adicionarActionPerformed

    private void jt_valorrecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorrecebidoActionPerformed
        double vl_receb = Double.parseDouble(jt_valorrecebido.getText());
        double total = Double.parseDouble(jt_total.getText());
        double troco = vl_receb - total;
        jt_troco.setText(""+troco);
    }//GEN-LAST:event_jt_valorrecebidoActionPerformed

    private void bt_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_finalizarActionPerformed
         finalizar();
         
    }//GEN-LAST:event_bt_finalizarActionPerformed

    private void jt_valorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorUnitarioActionPerformed
        jt_totalParcial.setText(jt_valorUnitario.getText());
        jt_valorPago.setText("0");
        jt_valorPago.requestFocus();
    }//GEN-LAST:event_jt_valorUnitarioActionPerformed

    private void jt_descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_descontoActionPerformed
         double compra, desconto, total;
        compra = Double.parseDouble(jt_total.getText());
        desconto = Double.parseDouble(jt_desconto.getText());
        if(desconto <= 50){        
        total = compra - compra * (desconto/100);
        jt_valorComDesconto.setText(""+total);
        jt_totalParcial.setText(""+total);
        jt_totalParcial.requestFocus();
        //jl_ttNota.setText(""+total);
        //atualizaValorVendaDesconto();
        //preecher_Jtable();
        }else{
            JOptionPane.showMessageDialog(null, "Desconto Não pode ser maior que 50%!");
            jt_desconto.setText("");
            return;
        }

    }//GEN-LAST:event_jt_descontoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       
    }//GEN-LAST:event_jTable1KeyReleased

    private void jt_vencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_vencimentoActionPerformed
       jt_descricao_servico.requestFocus();
    }//GEN-LAST:event_jt_vencimentoActionPerformed

    private void jt_valorComDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorComDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_valorComDescontoActionPerformed

    private void jt_totalParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_totalParcialActionPerformed
        adicionar();
        
    }//GEN-LAST:event_jt_totalParcialActionPerformed

    private void jt_numNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_numNotaActionPerformed
        novo();
    }//GEN-LAST:event_jt_numNotaActionPerformed

    private void jt_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nome_clienteActionPerformed
        jt_vencimento.requestFocus();
    }//GEN-LAST:event_jt_nome_clienteActionPerformed

    private void bt_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_finalizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_finalizarMouseClicked

    private void bt_finalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_finalizarKeyPressed
       finalizar();
    }//GEN-LAST:event_bt_finalizarKeyPressed

    private void jt_valorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorPagoActionPerformed
        jt_totalParcial.requestFocus();
    }//GEN-LAST:event_jt_valorPagoActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(VendasCrediarioAvulso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasCrediarioAvulso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasCrediarioAvulso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasCrediarioAvulso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasCrediarioAvulso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl_data;
    private javax.swing.JLabel jl_ttNota;
    private javax.swing.JTextField jt_codProduto;
    private javax.swing.JTextField jt_condCliente;
    private javax.swing.JTextField jt_desconto;
    private javax.swing.JTextField jt_descricao_servico;
    private javax.swing.JTextField jt_nome_cliente;
    private javax.swing.JTextField jt_numNota;
    private javax.swing.JTextField jt_quantidade;
    private javax.swing.JTextField jt_total;
    private javax.swing.JTextField jt_totalParcial;
    private javax.swing.JTextField jt_troco;
    private javax.swing.JTextField jt_valorComDesconto;
    private javax.swing.JTextField jt_valorPago;
    private javax.swing.JTextField jt_valorUnitario;
    private javax.swing.JTextField jt_valorrecebido;
    private javax.swing.JFormattedTextField jt_vencimento;
    // End of variables declaration//GEN-END:variables

 

    public void preecher_Jtable(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);//cod produto
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);//nome produto
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);//quant 
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);//VALOR unit
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);//valor total
          con_crediario.executeSQL("select * from crediario where nota = "+jt_numNota.getText()+"");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("cod_produto"),con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("valor_unit"),con_crediario.resultSet.getString("total_compra")});
           }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }

    
    public void somaProdVenda(){
        total = 0;
         con_crediario.executeSQL("select * from crediario where nota="+jt_numNota.getText()+"");
        try {
            while (con_crediario.resultSet.next()) {
                total = total + con_crediario.resultSet.getDouble("total_compra");
            }
            jt_total.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
    
    }
  
    public void novo(){
        jt_condCliente.setText("00");
       jt_nome_cliente.setText("");
       jt_numNota.setText("");
       jt_codProduto.setText("00");
       jt_descricao_servico.setText("");
       jt_valorUnitario.setText("");
       jt_quantidade.setText("1");
       jt_totalParcial.setText("");
       jt_total.setText("");
       jl_ttNota.setText("0.0");
       jt_valorrecebido.setText("0.0");
       jt_nome_cliente.requestFocus();
        try {
            con_crediario.executeSQL("select * from crediario");
            con_crediario.resultSet.last();
            int ultCod = con_crediario.resultSet.getInt("nota") + 1;
            jt_numNota.setText(""+ultCod);
            preecher_Jtable(); 
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não localizou dados"+erro);
        }
    }
    
    public void adicionar(){
        
        try {       
            String sqlCrediario;  
                  sqlCrediario = "insert into crediario(nota,cod_cliente,cliente,cod_produto,nome,valor_unit,quantidade,total_compra,data,vencimento,total_nota,data_venc) values("+
                  jt_numNota.getText()+","+jt_condCliente.getText()+",'"+jt_nome_cliente.getText()+"','"+jt_codProduto.getText()+"','"+jt_descricao_servico.getText()+"',"+jt_valorUnitario.getText()+","+jt_quantidade.getText()+","+jt_totalParcial.getText()+",'"+jl_data.getText()+"','"+jt_vencimento.getText()+"',"+jl_ttNota.getText()+",'"+jt_vencimento.getText()+"')";
                  //JOptionPane.showMessageDialog(null,"sql  "+sqlCrediario);
                  con_crediario.statement.executeUpdate(sqlCrediario);
                  preecher_Jtable();
                  
                    total = 0;
                    con_crediario.executeSQL("select * from crediario where nota="+jt_numNota.getText()+"");
                   try {
                       while (con_crediario.resultSet.next()) {
                           total = total + con_crediario.resultSet.getDouble("total_compra");
                       }
                       jl_ttNota.setText(""+total);
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
                   }
                   preecher_Jtable();
                  receberEntrada();
                  somaProdVenda();
                  jt_codProduto.setText("");
                  jt_descricao_servico.setText("");
                  jt_valorUnitario.setText("");
                  jt_quantidade.setText("");
                  jt_valorComDesconto.setText("");
                  jt_valorPago.setText("");
                  jt_totalParcial.setText("");
                  bt_finalizar.requestFocus();
        } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Erro adicionar! salvar akiWWW"+ex);
        }
      
    }

    private void finalizar() {
         try {
             String sqlDevedores;
                  sqlDevedores = "insert into clientesdev(nomecliente,nota,datacompra,vencimento,valortotal,data_venc) values('"+
                  jt_nome_cliente.getText()+"',"+jt_numNota.getText()+",'"+jl_data.getText()+"','"+jt_vencimento.getText()+"',"+jl_ttNota.getText()+",'"+jt_vencimento.getText()+"')";
            // JOptionPane.showMessageDialog(null,"sql  "+sqlDevedores);
            con_devedores.statement.executeUpdate(sqlDevedores);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar salvar nos devedores"+ex);
        }
        
          jt_condCliente.setText("00");
          jt_codProduto.setText("00");
          jt_descricao_servico.setText("");
          jt_valorUnitario.setText("00");
          jt_quantidade.setText("00");
          jt_totalParcial.setText("00");
          jt_valorrecebido.setText("");
         
          total = 0;
         con_crediario.executeSQL("select * from crediario where nota="+jt_numNota.getText()+"");
        try {
            while (con_crediario.resultSet.next()) {
                total = total + con_crediario.resultSet.getDouble("total_compra");
            }
            jl_ttNota.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
         
        novo();
       // dispose();
       
    }
    
    public void receberEntrada(){
        try {
           
            String sql = "insert into pagamentos_recebidos(nomecliente,nota,valor_pago,valor_divida,data_pag,data_pag,tdata) values ('"+jt_nome_cliente.getText()+"',"+jt_numNota.getText()+","+jt_valorPago.getText()+","+jt_totalParcial.getText()+",'"+jl_data.getText()+"','"+jl_data.getText()+"')";
            //JOptionPane.showMessageDialog(null, "sql= "+sql);
            con_recebimento.statement.executeUpdate(sql);
            //con_recebimento.resultSet.first();
            
            //JOptionPane.showMessageDialog(null, "Recebido com Sucesso!");
            return;
           // new ContasReceber().show();
           // dispose();
           // con_recebimento.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao receber entrada.. "+ex);
        }
    }
}
