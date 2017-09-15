
package TelasSistema;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public final class VendasCrediario extends javax.swing.JFrame {
    ConectaCliente con_clientes = new ConectaCliente();
    ConectaBancoProduto con_produtos = new ConectaBancoProduto();
    //ConectaVenda con_venda = new ConectaVenda();
    ConectaCrediario con_crediario = new ConectaCrediario();
    ConectaDevedores con_devedores = new ConectaDevedores();
    ConectaRecebimento con_receber = new ConectaRecebimento();
    double total,entrada;
    Data mostrar_data;

    public VendasCrediario() {
        initComponents();
        con_receber.conexao();
        con_receber.executeSQL("select * from pagamentos_recebidos");
        
        con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev");
        
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
                
        con_clientes.conexao();
        con_clientes.executeSQL("select * from clientes order by nome");
        atualiza_combox_cliente();
        
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
        jc_comboClientes = new javax.swing.JComboBox();
        jt_pesqCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jt_numNota = new javax.swing.JTextField();
        bt_pesqNota = new javax.swing.JButton();
        bt_pesqCliente = new javax.swing.JButton();
        bt_cadNovoCliente = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        jl_data = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_codProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_nomeProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_quantidade = new javax.swing.JTextField();
        bt_adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jt_valorUnitario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jt_totalParcial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jt_vencimento = new javax.swing.JFormattedTextField();
        jl_quantidade_estoque = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bt_excluir = new javax.swing.JButton();
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

        jc_comboClientes.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jc_comboClientes.setForeground(new java.awt.Color(51, 51, 51));
        jc_comboClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>" }));
        jc_comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_comboClientesActionPerformed(evt);
            }
        });

        jt_pesqCliente.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_pesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_pesqClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Nº NOTA");

        jt_numNota.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_numNota.setForeground(new java.awt.Color(255, 0, 51));
        jt_numNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_numNotaActionPerformed(evt);
            }
        });

        bt_pesqNota.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_pesqNota.setForeground(new java.awt.Color(0, 0, 255));
        bt_pesqNota.setText("PESQUISAR NOTA");
        bt_pesqNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesqNotaActionPerformed(evt);
            }
        });

        bt_pesqCliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_pesqCliente.setForeground(new java.awt.Color(0, 0, 255));
        bt_pesqCliente.setText("PESQUISAR CLIENTE");
        bt_pesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesqClienteActionPerformed(evt);
            }
        });

        bt_cadNovoCliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_cadNovoCliente.setForeground(new java.awt.Color(0, 0, 255));
        bt_cadNovoCliente.setText("+");
        bt_cadNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadNovoClienteActionPerformed(evt);
            }
        });

        bt_novo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_novo.setForeground(new java.awt.Color(0, 0, 255));
        bt_novo.setText("NOVO");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
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
        jLabel6.setText("NOME PRODUTO");

        jt_nomeProd.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jt_nomeProd.setForeground(new java.awt.Color(255, 0, 51));
        jt_nomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeProdActionPerformed(evt);
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

        jl_quantidade_estoque.setText("0");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("estoque:");

        bt_excluir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_excluir.setForeground(new java.awt.Color(0, 0, 255));
        bt_excluir.setText("EXCLUIR");
        bt_excluir.setEnabled(false);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("VALOR DE ENTRADA:");

        jt_valorrecebido.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_valorrecebido.setForeground(new java.awt.Color(255, 0, 51));
        jt_valorrecebido.setText("0.0");
        jt_valorrecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_valorrecebidoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setText("RESTANTE:");

        jt_troco.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jt_troco.setForeground(new java.awt.Color(255, 0, 51));
        jt_troco.setText("0.0");
        jt_troco.setEnabled(false);

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
        jt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_totalActionPerformed(evt);
            }
        });

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
        bt_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_finalizarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_numNota, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_pesqNota)
                        .addGap(50, 50, 50)
                        .addComponent(bt_novo)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jl_data))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(526, 526, 526))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_condCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jc_comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jt_pesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_pesqCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_cadNovoCliente))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jt_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jt_nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jl_quantidade_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jt_totalParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addComponent(bt_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_adicionar)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_condCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_pesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_pesqCliente)
                            .addComponent(bt_cadNovoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_numNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt_pesqNota)
                                .addComponent(bt_novo)
                                .addComponent(jl_data)
                                .addComponent(jt_vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jt_nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_excluir)
                                    .addComponent(bt_adicionar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jt_totalParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jl_quantidade_estoque)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jt_valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_condClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_condClienteActionPerformed
         try {
             String sqlBusc;
             sqlBusc = "select * from clientes where id = '"+jt_condCliente.getText()+"'";
             con_clientes.executeSQL(sqlBusc);
             if(con_clientes.resultSet.next()){
                con_clientes.resultSet.first();
                jc_comboClientes.setSelectedItem(con_clientes.resultSet.getString("nome"));
                jt_vencimento.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "Não existe clientes com este codigo "+jt_condCliente.getText());
             return;
             }
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
    }//GEN-LAST:event_jt_condClienteActionPerformed

    private void jc_comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_comboClientesActionPerformed
         try {
             String sqlBusc;
             sqlBusc = "select * from clientes where nome = '"+jc_comboClientes.getSelectedItem()+"'";
           if(jc_comboClientes.getSelectedItem() == "<selecione>"){
               jt_condCliente.setText("");
               return;
           }else{
            con_clientes.executeSQL(sqlBusc);
            con_clientes.resultSet.first();
            jt_condCliente.setText(con_clientes.resultSet.getString("id"));
            jt_vencimento.requestFocus();
           }
           
            //JOptionPane.showMessageDialog(null, "ok"+sqlBusc);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
    }//GEN-LAST:event_jc_comboClientesActionPerformed

    private void bt_pesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesqClienteActionPerformed
        try {
            con_clientes.executeSQL("select * from clientes where nome like '%"+jt_pesqCliente.getText()+"%'");
            if(con_clientes.resultSet.next()){
                con_clientes.resultSet.first();
                jt_condCliente.setText(con_clientes.resultSet.getString("id"));
                jc_comboClientes.setSelectedItem(con_clientes.resultSet.getString("nome"));
                JOptionPane.showMessageDialog(null, "encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                jt_pesqCliente.setText("");
                return;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "err = "+ex);
        }
    }//GEN-LAST:event_bt_pesqClienteActionPerformed

    private void bt_cadNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadNovoClienteActionPerformed
        new CadClientes().show();
        dispose();
    }//GEN-LAST:event_bt_cadNovoClienteActionPerformed

    private void jt_codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_codProdutoActionPerformed
         try {
             String sqlBusc;
             sqlBusc = "select * from estoque_merc where cod_produto = '"+jt_codProduto.getText()+"'";
             con_produtos.executeSQL(sqlBusc);
             if(con_produtos.resultSet.next()){
                con_produtos.resultSet.first();
                jt_nomeProd.setText(con_produtos.resultSet.getString("nome"));
                jt_valorUnitario.setText(con_produtos.resultSet.getString("preco_venda"));
                jl_quantidade_estoque.setText(con_produtos.resultSet.getString("quantidade"));
                jt_quantidade.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "Não existe produto com este codigo "+jt_codProduto.getText());
                 jt_codProduto.setText("");
                 jt_codProduto.requestFocus();
             return;
             }
             
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
    }//GEN-LAST:event_jt_codProdutoActionPerformed

    private void jt_nomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeProdActionPerformed
        try {
            String sqlBusc;
             //sqlBusc = "select * from estoque_merc where nome = '"+jt_nomeProd.getText()+"'";
             sqlBusc ="select * from estoque_merc where nome like '%"+jt_nomeProd.getText()+"%'";
             con_produtos.executeSQL(sqlBusc);
             if(con_produtos.resultSet.next()){
                 con_produtos.resultSet.first();
                 jt_codProduto.setText(con_produtos.resultSet.getString("cod_produto"));
                 jt_nomeProd.setText(con_produtos.resultSet.getString("nome"));
                 jt_valorUnitario.setText(con_produtos.resultSet.getString("preco_venda"));
                 jl_quantidade_estoque.setText(con_produtos.resultSet.getString("quantidade"));
                 jt_quantidade.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "produto não encontrado");
                 jt_codProduto.setText("");
                 jt_valorUnitario.setText("");
                 return;
             }          
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro .. "+ex);
        }
    }//GEN-LAST:event_jt_nomeProdActionPerformed

    private void jt_quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_quantidadeActionPerformed
         if("".equals(jt_desconto.getText()))
            jt_desconto.setText("0");
        
        double valorUnit = Double.parseDouble(jt_valorUnitario.getText());
        double quant = Double.parseDouble(jt_quantidade.getText());
        double resultado = (quant * valorUnit);
        
        jt_totalParcial.setText(""+resultado);
        jt_total.setText(""+resultado);
        jt_desconto.requestFocus();
        
         //jt_condCliente.setText("00");
    }//GEN-LAST:event_jt_quantidadeActionPerformed

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_bt_adicionarActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
       novo();
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_pesqNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesqNotaActionPerformed
        String sqlnota = "select * from crediario where nota = "+jt_numNota.getText()+"";
        con_crediario.executeSQL(sqlnota);
        
        //JOptionPane.showMessageDialog(null, "sql "+sqlnota);
        try {
            con_crediario.resultSet.first();
            jt_condCliente.setText(""+con_crediario.resultSet.getString("cod_cliente"));
            //jt_vencimento.setText(""+con_crediario.resultSet.getString("vencimento"));
            jc_comboClientes.setSelectedItem(""+con_crediario.resultSet.getString("cliente"));
            if(con_crediario.resultSet.next()){
            con_crediario.resultSet.first();
              preecher_Jtable();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi encotrado nota desta pesquisa!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasCrediario.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_bt_pesqNotaActionPerformed

    private void jt_valorrecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorrecebidoActionPerformed
        double vl_receb = Double.parseDouble(jt_valorrecebido.getText());
        double total = Double.parseDouble(jt_total.getText());
        double troco = vl_receb - total;
        jt_troco.setText(""+troco);
        jt_totalParcial.requestFocus();
    }//GEN-LAST:event_jt_valorrecebidoActionPerformed

    private void bt_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_finalizarActionPerformed
         entrada = 0;
        try {
             String sqlDevedores;
                  sqlDevedores = "insert into clientesdev(nomecliente,nota,datacompra,vencimento,valortotal,data_venc) values('"+
                  jc_comboClientes.getSelectedItem()+"',"+jt_numNota.getText()+",'"+jl_data.getText()+"','"+jt_vencimento.getText()+"',"+jl_ttNota.getText()+",'"+jt_vencimento.getText()+"')";
            // JOptionPane.showMessageDialog(null,"sql  "+sqlDevedores);
            con_devedores.statement.executeUpdate(sqlDevedores);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar salvar nos devedores"+ex);
        }
        entrada = Double.parseDouble(jt_valorrecebido.getText());
        if( entrada > 0){
            receberEntrada();
        }else{
            JOptionPane.showMessageDialog(null, "Crediário sem entrada?");
        }
          jt_condCliente.setText("00");
          jt_codProduto.setText("00");
          jt_nomeProd.setText("");
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
        //dispose();
        
    }//GEN-LAST:event_bt_finalizarActionPerformed

    private void jt_valorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorUnitarioActionPerformed
        
    }//GEN-LAST:event_jt_valorUnitarioActionPerformed

    private void jt_descontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_descontoActionPerformed
         double compra, desconto, total;
        compra = Double.parseDouble(jt_total.getText());
        desconto = Double.parseDouble(jt_desconto.getText());
        if(desconto > 0){        
        total = compra - compra * (desconto/100);
        jt_valorComDesconto.setText(""+total);
        jt_totalParcial.setText(""+total);
        jt_valorrecebido.requestFocus();
        //jl_ttNota.setText(""+total);
        //atualizaValorVendaDesconto();
        //preecher_Jtable();
        }else{
            //JOptionPane.showMessageDialog(null, "Desconto Não pode ser maior que 50%!");
            
            jt_desconto.setText("0");
            jt_valorrecebido.requestFocus();
           // return;
        }

    }//GEN-LAST:event_jt_descontoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        bt_excluir.setEnabled(true);
        setaTextField();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        bt_excluir.setEnabled(true);
        setaTextField();
    }//GEN-LAST:event_jTable1KeyReleased

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        try{
            String sql,sqlcrediario;
            sql = "select * from clientesdev where nota="+jt_numNota.getText()+"";
            //JOptionPane.showMessageDialog(null, "sqlSelecionaClientes ="+sql);
            
            con_devedores.executeSQL(sql);
            con_devedores.resultSet.first();
            
            double valor_nota, total_excluido, result; 
            valor_nota = con_devedores.resultSet.getDouble("valortotal");
            total_excluido = Double.parseDouble(jt_totalParcial.getText());
            result = valor_nota - total_excluido;
            //JOptionPane.showMessageDialog(null, "resultado da atualização do valor da nota R$ ="+result);
            
            sqlcrediario = "select * from crediario where nota="+jt_numNota.getText()+" and cod_produto='"+jt_codProduto.getText()+"'";
            //JOptionPane.showMessageDialog(null, "sqlselecionaNotaCrediario ="+sqlcrediario);
            con_crediario.executeSQL(sqlcrediario);
            con_crediario.resultSet.first();
            
            String nome = "Excluir produto: "+con_crediario.resultSet.getString("nome")+"?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome, "<EXCLUIR>",JOptionPane.YES_NO_OPTION);
            if(opcao_escolhida == JOptionPane.YES_OPTION){
                
                sql = "update clientesdev set valortotal="+result+" where nota="+jt_numNota.getText()+"";
                // sql = "delete from clientesdev where nota="+jt_numNota.getText()+" and cod_produto='"+jt_codProduto.getText()+"'";
                //JOptionPane.showMessageDialog(null, "sqlDevedoresAtualiza ="+sql);
                
                sqlcrediario = "delete from crediario where nota="+jt_numNota.getText()+" and cod_produto='"+jt_codProduto.getText()+"'";
                //JOptionPane.showMessageDialog(null, "sqlcrediarioDeleta ="+sqlcrediario);
                 //if(con_devedores.resultSet.next()){
                   //con_devedores.resultSet.first();
                   con_devedores.statement.executeUpdate(sql);
                 //}  
                    int conseguiu_excluir = con_crediario.statement.executeUpdate(sqlcrediario);
                    
                    if(conseguiu_excluir == 1){
                        atualizaEstoqueExcluir();
                    JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
                    con_crediario.executeSQL("select * from crediario where nota="+jt_numNota.getText()+"");
                    con_crediario.resultSet.first();
                    preecher_Jtable();
                    jt_codProduto.setText("");
                    jt_nomeProd.setText("");
                    jt_quantidade.setText("");
                    jt_valorUnitario.setText("");
                    jt_totalParcial.setText("");
                }
          
            }else{
                
                return;
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro ao tentar excluir cliente."+erro);
    }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void jt_vencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_vencimentoActionPerformed
       jt_codProduto.requestFocus();
    }//GEN-LAST:event_jt_vencimentoActionPerformed

    private void jt_valorComDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_valorComDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_valorComDescontoActionPerformed

    private void jt_totalParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_totalParcialActionPerformed
        adicionar();
    }//GEN-LAST:event_jt_totalParcialActionPerformed

    private void jt_numNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_numNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_numNotaActionPerformed

    private void jt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_totalActionPerformed

    private void jt_pesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_pesqClienteActionPerformed
       try {
            con_clientes.executeSQL("select * from clientes where nome like '%"+jt_pesqCliente.getText()+"%'");
            if(con_clientes.resultSet.next()){
                con_clientes.resultSet.first();
                jt_condCliente.setText(con_clientes.resultSet.getString("id"));
                jc_comboClientes.setSelectedItem(con_clientes.resultSet.getString("nome"));
                JOptionPane.showMessageDialog(null, "encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                jt_pesqCliente.setText("");
                return;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "err = "+ex);
        }
    }//GEN-LAST:event_jt_pesqClienteActionPerformed
    
    public void setaTextField(){
        int indiceLinha = jTable1.getSelectedRow();
           jt_codProduto.setText(jTable1.getValueAt(indiceLinha, 0).toString());
           jt_nomeProd.setText(jTable1.getValueAt(indiceLinha, 1).toString());
           jt_quantidade.setText(jTable1.getValueAt(indiceLinha, 2).toString());
           jt_valorUnitario.setText(jTable1.getValueAt(indiceLinha, 3).toString());
           jt_totalParcial.setText(jTable1.getValueAt(indiceLinha, 4).toString());
           
    }
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
            java.util.logging.Logger.getLogger(VendasCrediario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasCrediario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasCrediario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasCrediario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasCrediario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_cadNovoCliente;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_finalizar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesqCliente;
    private javax.swing.JButton bt_pesqNota;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jc_comboClientes;
    private javax.swing.JLabel jl_data;
    private javax.swing.JLabel jl_quantidade_estoque;
    private javax.swing.JLabel jl_ttNota;
    private javax.swing.JTextField jt_codProduto;
    private javax.swing.JTextField jt_condCliente;
    private javax.swing.JTextField jt_desconto;
    private javax.swing.JTextField jt_nomeProd;
    private javax.swing.JTextField jt_numNota;
    private javax.swing.JTextField jt_pesqCliente;
    private javax.swing.JTextField jt_quantidade;
    private javax.swing.JTextField jt_total;
    private javax.swing.JTextField jt_totalParcial;
    private javax.swing.JTextField jt_troco;
    private javax.swing.JTextField jt_valorComDesconto;
    private javax.swing.JTextField jt_valorUnitario;
    private javax.swing.JTextField jt_valorrecebido;
    private javax.swing.JFormattedTextField jt_vencimento;
    // End of variables declaration//GEN-END:variables

 public void atualiza_combox_cliente(){
      
        try {
            con_clientes.resultSet.first();
            while(con_clientes.resultSet.next())
                jc_comboClientes.addItem(con_clientes.resultSet.getString("nome"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);     
        }
    }

    public void preecher_Jtable(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);//cod produto
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);//nome produto
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);//quant 
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);//VALOR unit
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);//valor total
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
   public void atualizaEstoque(){
        double quant,ttlvenda;
        try{
            con_produtos.executeSQL("select * from estoque_merc where cod_produto='"+jt_codProduto.getText()+"'");
            con_produtos.resultSet.first();
            quant= con_produtos.resultSet.getInt("quantidade");
            ttlvenda = Double.parseDouble(jt_quantidade.getText());
            
            quant = quant - ttlvenda;           
           // JOptionPane.showMessageDialog(null,"quantidade="+quant);
            
            
           String sql = "update estoque_merc set quantidade="+quant+" where cod_produto='"+jt_codProduto.getText()+"'";
           //JOptionPane.showMessageDialog(null,"sql="+sql);
           con_produtos.statement.executeUpdate(sql);
 
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Erro ao tentar alterar este registro. Err"+erro);
       }
    }
    
   public void atualizaEstoqueExcluir(){
        double quant,ttlvenda;
        try{
            con_produtos.executeSQL("select * from estoque_merc where cod_produto='"+jt_codProduto.getText()+"'");
            con_produtos.resultSet.first();
            quant= con_produtos.resultSet.getInt("quantidade");
            ttlvenda = Double.parseDouble(jt_quantidade.getText());
            
            quant = quant + ttlvenda;           
            String sql = "update estoque_merc set quantidade="+quant+" where cod_produto='"+jt_codProduto.getText()+"'";
           //JOptionPane.showMessageDialog(null,"sql="+sql);
           con_produtos.statement.executeUpdate(sql);
 
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null,"Erro ao tentar alterar este registro. Err"+erro);
       }
    }
    public void novo(){
        jt_condCliente.setText("");
       jc_comboClientes.setSelectedItem("<selecione>");
       jt_numNota.setText("");
       jt_codProduto.setText("");
       jt_nomeProd.setText("");
       jt_valorUnitario.setText("");
       jt_quantidade.setText("");
       jt_totalParcial.setText("");
       jl_quantidade_estoque.setText("");
       jt_total.setText("");
       jt_troco.setText("0.0");
       jt_desconto.setText("0");
       jt_vencimento.setText("");
       jl_ttNota.setText("0.0");
       jt_valorrecebido.setText("0.0");
        try {
            con_crediario.executeSQL("select * from crediario");
            //SELECT MAX(nota) FROM crediario -- seleciona o maior numero de nota
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
                  jt_numNota.getText()+","+jt_condCliente.getText()+",'"+jc_comboClientes.getSelectedItem()+"','"+jt_codProduto.getText()+"','"+jt_nomeProd.getText()+"',"+jt_valorUnitario.getText()+","+jt_quantidade.getText()+","+jt_totalParcial.getText()+",'"+jl_data.getText()+"','"+jt_vencimento.getText()+"',"+jl_ttNota.getText()+",'"+jt_vencimento.getText()+"')";
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
                  //receberEntrada();
                  mostrar_porcentagem();
                  atualizaEstoque();
                  somaProdVenda();
                  jt_codProduto.setText("");
                  jt_nomeProd.setText("");
                  jt_valorUnitario.setText("");
                  jt_quantidade.setText("");
                  jt_valorComDesconto.setText("");
                  jt_totalParcial.setText("");
                  jl_quantidade_estoque.setText("");
                  jt_codProduto.requestFocus();
        } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Erro adicionar! salvar akiWWW"+ex);
        }
      
    }
    
    public void mostrar_porcentagem(){
                  
	double lucro, valorVenda,precoCusto,percentual;

		valorVenda = Double.parseDouble(jt_totalParcial.getText());
		precoCusto = Double.parseDouble(jt_valorUnitario.getText());
                lucro = precoCusto - valorVenda;
		percentual = (precoCusto - valorVenda)/precoCusto * 100;
                 if(percentual < 0){
                    jt_desconto.setText("0");
                }else{
                    jt_desconto.setText(""+percentual);
                }
                //jt_desconto.setText(""+percentual);
              
    }
    
    public void receberEntrada(){
        try {
            String sql = "insert into pagamentos_recebidos(nomecliente,nota,valor_pago,valor_divida,data_pag) values ('"+jc_comboClientes.getSelectedItem()+"',"+jt_numNota.getText()+","+jt_valorrecebido.getText()+","+jt_total.getText()+",'"+jl_data.getText()+"')";
            //JOptionPane.showMessageDialog(null, "sql= "+sql);
           
            con_receber.statement.executeUpdate(sql);
                      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao receber entrada.. "+ex);
        }
    }
}
