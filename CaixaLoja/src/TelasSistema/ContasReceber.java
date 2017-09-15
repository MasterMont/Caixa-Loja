
package TelasSistema;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
public final class ContasReceber extends javax.swing.JFrame {
    
    ConectaDevedores con_devedores = new ConectaDevedores();
    ConectaRecebimento con_receber = new ConectaRecebimento();
     double total,total2,total3;
    
    int navegador = 0;
    double valorPago, restante, totalDivida;
    ReceberPagamento nota_rebebimento;
    DadosClientesCobranca enviaNome;
    DadosVenda nota;
    PagamentosRecebidos pag_recebidos;
    DecimalFormat obj_formatado = new DecimalFormat();
    //DadosCliente enviaNomeCliente;
    Data mostrar_data;

   public ContasReceber() {
        initComponents();
               
        con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev order by nomecliente");
        
        
        
       
        
         try {
            con_devedores.resultSet.first();
            mostrar_dados();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);     
        }
        preecher_valor_pago();
        preencherValorRestante();
        situacao();
        preecher_JtablePagamentos();
        valor_Conta_Receber();
                
        mostrar_data = new Data();
        mostrar_data.le_data();
        jl_data_atual.setText(mostrar_data.dia+"-"+mostrar_data.mes+"-"+mostrar_data.ano);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoVoltarPrimeiro = new javax.swing.JButton();
        botaoVoltaAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoIrUltimo = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jl_id = new javax.swing.JLabel();
        jl_nomeCliente = new javax.swing.JLabel();
        jl_nota = new javax.swing.JLabel();
        jl_data_compra = new javax.swing.JLabel();
        jl_vencimento = new javax.swing.JLabel();
        jl_valortotal = new javax.swing.JLabel();
        bt_recebPagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jt_pesquisarCliente = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jl_valorPago = new javax.swing.JLabel();
        jl_situacao = new javax.swing.JLabel();
        jl_restante = new javax.swing.JLabel();
        bt_cadClientes = new javax.swing.JButton();
        bt_dadosVenda = new javax.swing.JButton();
        bt_todos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_data_atual = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bt_buscarContas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jl_vlr_contas_Receber = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contas a Receber");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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

        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltarPrimeiro)
                .addGap(9, 9, 9)
                .addComponent(botaoVoltaAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProximo)
                .addGap(9, 9, 9)
                .addComponent(botaoIrUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addComponent(bt_sair)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVoltarPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(botaoVoltaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoIrUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Devedor"));

        jl_id.setText("id");

        jl_nomeCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_nomeCliente.setText("Nome Cliente:");

        jl_nota.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jl_data_compra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_data_compra.setText("Data Compra:");

        jl_vencimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_vencimento.setText("Vencimento:");

        jl_valortotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_valortotal.setText("Valor total:");

        bt_recebPagamento.setText("Receber Pagamento");
        bt_recebPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_recebPagamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Nota:");

        jLabel3.setText("Data Venda:");

        jLabel4.setText("Vencimento:");

        jLabel5.setText("Valor da Divida:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jl_id))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_recebPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_nomeCliente)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_nota)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jl_data_compra)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jl_vencimento))))))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nota)
                    .addComponent(jl_data_compra)
                    .addComponent(jl_vencimento))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_recebPagamento)
                    .addComponent(jl_valortotal)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamentos Realizado"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Pesquisar Cliente:");

        jt_pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_pesquisarClienteActionPerformed(evt);
            }
        });

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Pagamento:"));

        jl_valorPago.setText("Valor Pago");
        jl_valorPago.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jl_valorPagoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jl_valorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jl_valorPagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jl_valorPagoFocusLost(evt);
            }
        });

        jl_situacao.setText("situacao");

        jl_restante.setText("Valor restante:");

        bt_cadClientes.setText("Dados do Cliente");
        bt_cadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadClientesActionPerformed(evt);
            }
        });

        bt_dadosVenda.setText("Dados Venda");
        bt_dadosVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dadosVendaActionPerformed(evt);
            }
        });

        bt_todos.setText("Valores Recebidos");
        bt_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_todosActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor Recebido:");

        jLabel8.setText("Valor Restante:");

        jLabel9.setText("Situação:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bt_cadClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bt_dadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(bt_todos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_valorPago)
                    .addComponent(jLabel7))
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jl_restante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_situacao)
                    .addComponent(jLabel9))
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_valorPago)
                    .addComponent(jl_restante)
                    .addComponent(jl_situacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadClientes)
                    .addComponent(bt_dadosVenda)
                    .addComponent(bt_todos))
                .addContainerGap())
        );

        jl_data_atual.setText("data");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Contas para Receber"));

        bt_buscarContas.setText("Buscar");
        bt_buscarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarContasActionPerformed(evt);
            }
        });

        jLabel10.setText("R$");

        jl_vlr_contas_Receber.setText("0.0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_buscarContas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_vlr_contas_Receber)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jl_vlr_contas_Receber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(bt_buscarContas)
                .addContainerGap())
        );

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jt_pesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl_data_atual)
                                        .addGap(54, 54, 54)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_pesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar)
                    .addComponent(jl_data_atual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarPrimeiroActionPerformed
       try {
           con_devedores.resultSet.last();
           navegador = 1;
           mostrar_dados();
           preecher_valor_pago();
           preencherValorRestante();
           situacao();
           preecher_JtablePagamentos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltarPrimeiroActionPerformed

    private void botaoVoltaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaAnteriorActionPerformed
         try {
            con_devedores.resultSet.next();
            navegador = 1;
            mostrar_dados();            
            preecher_valor_pago();
            preencherValorRestante();
            situacao();
            preecher_JtablePagamentos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoVoltaAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        
        try {
            con_devedores.resultSet.previous();
            navegador = 2;
            mostrar_dados();
            preecher_valor_pago();
            preencherValorRestante();
            preecher_JtablePagamentos();
            situacao();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
      
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoIrUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIrUltimoActionPerformed
        
        try {
            con_devedores.resultSet.first();
            navegador = 2;
            mostrar_dados();
            preecher_valor_pago();
            preencherValorRestante();
            preecher_JtablePagamentos();
            situacao();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
        }
    }//GEN-LAST:event_botaoIrUltimoActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        con_devedores.desconecta();
        //con_receber.desconecta();
        dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_recebPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_recebPagamentoActionPerformed
        
        if(nota_rebebimento == null){
            nota_rebebimento = new ReceberPagamento();
            nota_rebebimento.setVisible(true);
            nota_rebebimento.recebe(jl_nota.getText());
            nota_rebebimento.recebeNome(jl_nomeCliente.getText());
            nota_rebebimento.recebevalor(jl_valortotal.getText());
            nota_rebebimento.recebeValorRestante(jl_restante.getText());
            dispose();
        }else{
            nota_rebebimento.setVisible(true);
            nota_rebebimento.setState(ReceberPagamento.NORMAL);
            nota_rebebimento.recebe(jl_nota.getText());
            nota_rebebimento.recebeNome(jl_nomeCliente.getText());
            nota_rebebimento.recebevalor(jl_valortotal.getText());
            nota_rebebimento.recebeValorRestante(jl_restante.getText());
            dispose();
        }
    }//GEN-LAST:event_bt_recebPagamentoActionPerformed

    private void jl_valorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jl_valorPagoFocusLost
       
    }//GEN-LAST:event_jl_valorPagoFocusLost

    private void jl_valorPagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jl_valorPagoFocusGained
         
    }//GEN-LAST:event_jl_valorPagoFocusGained

    private void jl_valorPagoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jl_valorPagoAncestorAdded
      
    }//GEN-LAST:event_jl_valorPagoAncestorAdded

    private void bt_cadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadClientesActionPerformed
        if(enviaNome == null){
            enviaNome = new DadosClientesCobranca();
            enviaNome.setVisible(true);
            enviaNome.recebe(jl_nomeCliente.getText());
            //dispose();
        }else{
            enviaNome.setVisible(true);
            enviaNome.setState(enviaNome.NORMAL);
            enviaNome.recebe(jl_nomeCliente.getText());
           // dispose();
        }
    }//GEN-LAST:event_bt_cadClientesActionPerformed

    private void bt_dadosVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dadosVendaActionPerformed
       if(nota == null){
            nota = new DadosVenda();
            nota.setVisible(true);
            nota.recebe(jl_nota.getText());
            nota.recebeNome(jl_nomeCliente.getText());
            //dispose();
        }else{
            nota.setVisible(true);
            nota.setState(enviaNome.NORMAL);
            nota.recebe(jl_nota.getText());
            nota.recebeNome(jl_nomeCliente.getText());
           // dispose();
        }
    }//GEN-LAST:event_bt_dadosVendaActionPerformed

    private void bt_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_todosActionPerformed
        //new PagamentosRecebidos().show();
         if(pag_recebidos == null){
            pag_recebidos = new PagamentosRecebidos();
            pag_recebidos.setVisible(true);
            pag_recebidos.recebeNota(jl_nota.getText());
            //dispose();
        }else{
            pag_recebidos.setVisible(true);
            pag_recebidos.setState(enviaNome.NORMAL);
            pag_recebidos.recebeNota(jl_nota.getText());
           // dispose();
        }
    }//GEN-LAST:event_bt_todosActionPerformed

    private void bt_buscarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarContasActionPerformed
        new SelecionarContasDatas().show();
    }//GEN-LAST:event_bt_buscarContasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document document = null;
          OutputStream outputStream = null;
          document = new Document(PageSize.A4,30,20,20,30);
          Paragraph p1,p2,p3,p4,p5,p6,p7,p8,p9;
                
                 try{
                     outputStream = new FileOutputStream("Dados_cliente_devedor.pdf");
                     PdfWriter.getInstance(document, outputStream);
                     document.open();
                     //Font font = new Font(Font.CENTER_BASELINE,18,Font.BOLD,new Color(100,200,100));
                     
                     p1 = new Paragraph("CLIENTE DEVEDOR\n\n");
                     document.add(p1);
                    
                     p2 = new Paragraph("NOME: "+jl_nomeCliente.getText());
                     document.add(p2);
                     p3 = new Paragraph("NOTA: "+jl_nota.getText());
                     document.add(p3);
                     p4 = new Paragraph("DATA VENDA: "+jl_data_compra.getText());
                     document.add(p4);
                     p5 = new Paragraph("VENCIMENTO: "+jl_vencimento.getText());
                     document.add(p5);
                     p6 = new Paragraph("VALOR DA DÍVIDA.: "+jl_valortotal.getText());
                     document.add(p6);
                     p7 = new Paragraph("VALOR PAGO: "+jl_valorPago.getText());
                     document.add(p7);
                     p8 = new Paragraph("VALOR RESTANTE: "+jl_restante.getText());
                     document.add(p8);
                     p9 = new Paragraph("SITUAÇÃO: "+jl_situacao.getText()+"\n\n\n");
                     document.add(p9);
                     
                     PdfPTable tabela = new PdfPTable(2);
                        PdfPCell cabecalho = new PdfPCell(new Paragraph("DADOS DOS PAGAMENTOS RECEBIDOS"));
                        cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cabecalho.setBorder(PdfPCell.NO_BORDER);
                        cabecalho.setBackgroundColor(new BaseColor(100,150,200));
                        cabecalho.setColspan(2);
                        tabela.addCell(cabecalho);
                        tabela.addCell("DATA");
                        tabela.addCell("VALOR");
                        
                        try {
                            con_receber.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
                            con_receber.resultSet.first();
                            tabela.addCell(con_receber.resultSet.getString("data_pag"));
                            tabela.addCell(con_receber.resultSet.getString("valor_pago"));
                           // con_receber.resultSet.first();
                        while (con_receber.resultSet.next()) {
                            tabela.addCell(con_receber.resultSet.getString("data_pag"));
                            tabela.addCell(con_receber.resultSet.getString("valor_pago"));
                           
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao tentar listar.1 Err ="+ex);
                    }
                   document.add(tabela);
                     
                     
              } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar listar.2 Err ="+ex);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar listar.3 Err ="+ex);
      
       } finally{
        document.close(); 
        
    }                                             
try {
            Desktop.getDesktop().open(new File("Dados_cliente_devedor.pdf"));
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao tentar abrir o pdf. Err ="+ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        pesquisarCliente();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void jt_pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_pesquisarClienteActionPerformed
        pesquisarCliente();
    }//GEN-LAST:event_jt_pesquisarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContasReceber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoIrUltimo;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoVoltaAnterior;
    private javax.swing.JButton botaoVoltarPrimeiro;
    private javax.swing.JButton bt_buscarContas;
    private javax.swing.JButton bt_cadClientes;
    private javax.swing.JButton bt_dadosVenda;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_recebPagamento;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_todos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jl_data_atual;
    private javax.swing.JLabel jl_data_compra;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_nomeCliente;
    private javax.swing.JLabel jl_nota;
    private javax.swing.JLabel jl_restante;
    private javax.swing.JLabel jl_situacao;
    private javax.swing.JLabel jl_valorPago;
    private javax.swing.JLabel jl_valortotal;
    private javax.swing.JLabel jl_vencimento;
    private javax.swing.JLabel jl_vlr_contas_Receber;
    private javax.swing.JTextField jt_pesquisarCliente;
    // End of variables declaration//GEN-END:variables

    public void mostrar_dados(){
             try {
                     jl_id.setText(con_devedores.resultSet.getString("id"));
                     jl_nomeCliente.setText(con_devedores.resultSet.getString("nomecliente"));
                     jl_nota.setText(con_devedores.resultSet.getString("nota"));
                     jl_data_compra.setText(con_devedores.resultSet.getString("datacompra"));
                     jl_vencimento.setText(con_devedores.resultSet.getString("vencimento"));
                     jl_valortotal.setText(con_devedores.resultSet.getString("valortotal"));
                     
             } catch (SQLException ex) {
                 if(navegador == 1){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no primeiro registro!");
                 }else if(navegador == 2){
                     JOptionPane.showMessageDialog(null,"Atenção! você ja esta no último registro!");
                 }else{
                     JOptionPane.showMessageDialog(null,"Não localizou os dados"+ex);
                 }
                 navegador = 0;

             }

     }

    private void preecher_valor_pago() {
        
        con_receber.conexao();
        con_receber.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
        total = 0;
        try {
            while (con_receber.resultSet.next()) {
                total = total + con_receber.resultSet.getDouble("valor_pago");
            }
            //obj_formatado.applyPattern("#,##00,0");
            jl_valorPago.setText(""+total);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
            
    }
    
     private void valor_Conta_Receber() {
        
         con_devedores.conexao();
        con_devedores.executeSQL("select * from clientesdev where vencimento between '10/03/2017' and '"+jl_data_atual.getText()+"'");
        // con_receber.conexao();
        //con_receber.executeSQL("select * from pagamentos_recebidos where data_pag between '10/03/2017' and '"+jl_data_atual.getText()+"'");
       
        total = 0;
       // total2 = 0;
        //total3 = 0;
        try {
            while (con_devedores.resultSet.next()) {
                total = total + con_devedores.resultSet.getDouble("valortotal");
            }
          //  while (con_receber.resultSet.next()) {
            //    total2 = total2 + con_receber.resultSet.getDouble("valortotal");
            //}  
            
            //total3 = total - total2;
            //obj_formatado.applyPattern("#,##00,0");
            jl_vlr_contas_Receber.setText(""+total);
            //jl_vlr_contas_Receber.setText(obj_formatado.format("%.f2"+total));VERIFICAR SE DEU CERTO
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
        }
            
    }
    
    public void preencherValorRestante(){
        
        valorPago = Double.parseDouble(jl_valorPago.getText());
        totalDivida = Double.parseDouble(jl_valortotal.getText());
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
    
    public void preecher_JtablePagamentos(){
          
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
       
        con_receber.executeSQL("select * from pagamentos_recebidos where nota="+jl_nota.getText()+"");
        
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_receber.resultSet.next()) {
                modelo.addRow(new Object[]{con_receber.resultSet.getString("data_pag"),con_receber.resultSet.getString("valor_pago")});
            }
            con_receber.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }

    private void pesquisarCliente() {
            String sqlpesquisa = "select * from clientesdev where nomecliente like '%"+jt_pesquisarCliente.getText()+"%'";
        con_devedores.executeSQL(sqlpesquisa);
        try {
            con_devedores.resultSet.first();
            mostrar_dados();
            preecher_valor_pago();
           preencherValorRestante();
           situacao();
           preecher_JtablePagamentos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher os dados."+ex);
        }
    }
    
    
   

}
