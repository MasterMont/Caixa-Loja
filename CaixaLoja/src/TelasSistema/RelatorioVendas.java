
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.Backup;
import utilitarios.ConectaCrediario;
import utilitarios.ConectaRecebimento;
import utilitarios.ConectaVenda;

/**
 *
 * @author RamonFernandes
 */
public class RelatorioVendas extends javax.swing.JFrame {

    ConectaVenda con_venda = new ConectaVenda();
    ConectaCrediario con_crediario = new ConectaCrediario();
    ConectaRecebimento con_recebimento = new ConectaRecebimento();
    String sqlDinheiro,sqlCartao,sql2,sql3,sqlRecebimentos;
    double total;
    
    public RelatorioVendas() {
        initComponents();
        con_venda.conexao();
        con_venda.executeSQL("select * from vendas");
        
        con_crediario.conexao();
        con_crediario.executeSQL("select * from crediario");
        
        con_recebimento.conexao();
        con_recebimento.executeSQL("select * from pagamentos_recebidos");
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jt_dataVenda = new javax.swing.JFormattedTextField();
        bt_pesquisa = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        bt_imprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jl_total_vendas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_recebimentos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_total_caixa = new javax.swing.JLabel();
        bt_fecharCaixa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jt_total_crediario = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jl_cartao = new javax.swing.JLabel();
        bt_backup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio de vendas");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("RELATÓRIO DE VENDA E RECEBIMENTOS");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nota", "Produto", "Quant", "Vlr.Unit", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Vendas");

        try {
            jt_dataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jt_dataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_dataVendaActionPerformed(evt);
            }
        });

        bt_pesquisa.setText("Pesquisar");
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });

        jLabel7.setText("VENDAS AVISTA:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nota", "Produto", "Quant", "Vlr.Unit", "Total"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel8.setText("VENDAS PARA CLIENTES:");

        jLabel12.setText("DATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jt_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisa))
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Cliente", "Nota", "Valor Recebido", "Valor Divida"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setText("RECEBIMENTOS");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nota", "Produto", "Quant", "Vlr.Unit", "Total"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel10.setText("VENDAS NO CARTÃO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(210, 210, 210))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bt_imprimir.setText("IMPRIMIR CAIXA");
        bt_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_imprimirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("VENDAS DINHEIRO:");

        jl_total_vendas.setText("0.0");

        jLabel4.setText("RECEBIMENTOS:");

        jl_recebimentos.setText("0.0");

        jLabel5.setText("TOTAL DO CAIXA:");

        jl_total_caixa.setText("0.0");

        bt_fecharCaixa.setText("FECHAR CAIXA");
        bt_fecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharCaixaActionPerformed(evt);
            }
        });

        jLabel9.setText("TOTAL CREDIARIO:");

        jt_total_crediario.setText("0.0");

        jLabel11.setText("CARTÃO:");

        jl_cartao.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_fecharCaixa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jl_total_caixa))
                        .addGap(30, 30, 30)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_cartao)
                    .addComponent(jLabel11)
                    .addComponent(jt_total_crediario)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jl_total_vendas)
                    .addComponent(jLabel4)
                    .addComponent(jl_recebimentos))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_total_vendas)
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_cartao)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_recebimentos)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_total_crediario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_fecharCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_total_caixa)
                .addGap(85, 85, 85))
        );

        bt_backup.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        bt_backup.setText("BACKUP");
        bt_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_imprimir)
                        .addGap(66, 66, 66)
                        .addComponent(bt_backup)
                        .addGap(445, 445, 445))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_backup)
                    .addComponent(bt_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed
        pesquisaVendas();
        
    }//GEN-LAST:event_bt_pesquisaActionPerformed

    private void bt_fecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharCaixaActionPerformed
        double vendas,crediario,recebimentos,total,cartao;
        vendas = Double.parseDouble(jl_total_vendas.getText());
        recebimentos = Double.parseDouble(jl_recebimentos.getText());
        crediario = Double.parseDouble(jt_total_crediario.getText());
        cartao = Double.parseDouble(jl_cartao.getText());
        total = vendas + recebimentos + crediario + cartao;
        jl_total_caixa.setText(""+total);
    }//GEN-LAST:event_bt_fecharCaixaActionPerformed

    private void bt_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_imprimirActionPerformed
        Document document = null;
        OutputStream outputStream = null;
        document = new Document(PageSize.A4,30,20,20,30);

        try{
            outputStream = new FileOutputStream("CAIXA.pdf");
            PdfWriter.getInstance(document, outputStream);
            document.open();
            Paragraph paragrafo = new Paragraph("RELATORIO DO CAIXA NA DATA "+jt_dataVenda.getText()+"  \n\n");
            document.add(paragrafo);
            Paragraph p_total_vendas_dinh = new Paragraph("TOTAL DE VENDAS DINHEIRO: R$"+jl_total_vendas.getText());
                     document.add(p_total_vendas_dinh);
            Paragraph p_total_vendas_cartao = new Paragraph("TOTAL DE VENDAS CARTÃO: R$"+jl_cartao.getText());
                     document.add(p_total_vendas_cartao);         
            Paragraph p_total_fiado_clientes = new Paragraph("TOTAL DE FIADO: R$"+jt_total_crediario.getText());
                     document.add(p_total_fiado_clientes);         
            Paragraph p_total_recebimentos = new Paragraph("TOTAL DE RECEBIMENTO: R$"+jl_recebimentos.getText()+"\n\n\n\n");
                     document.add(p_total_recebimentos);
                     
            PdfPTable tabela = new PdfPTable(5);
            PdfPCell cabecalho = new PdfPCell(new Paragraph("Relatorio de caixa"));
            cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
            cabecalho.setBorder(PdfPCell.NO_BORDER);
            cabecalho.setBackgroundColor(new BaseColor(100,150,200));
            cabecalho.setColspan(5);
            tabela.addCell(cabecalho);
            tabela.addCell("NOTA");
            tabela.addCell("PRODUTO");
            tabela.addCell("QUANTIDADE");
            tabela.addCell("VALOR UNITÁRIO");
            tabela.addCell("TOTAL");
          
              try {
                    con_venda.resultSet.first();
                    tabela.addCell(con_venda.resultSet.getString("nota"));
                    tabela.addCell(con_venda.resultSet.getString("nome"));
                    tabela.addCell(con_venda.resultSet.getString("quantidade"));
                    tabela.addCell(con_venda.resultSet.getString("valor_unit"));
                    tabela.addCell(con_venda.resultSet.getString("total_compra"));
                while (con_venda.resultSet.next()) {
                    tabela.addCell(con_venda.resultSet.getString("nota"));
                    tabela.addCell(con_venda.resultSet.getString("nome"));
                    tabela.addCell(con_venda.resultSet.getString("quantidade"));
                    tabela.addCell(con_venda.resultSet.getString("valor_unit"));
                    tabela.addCell(con_venda.resultSet.getString("total_compra"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao tentar listar.1 Err ="+ex);
            }
           document.add(tabela);
            Paragraph p2 = new Paragraph("TOTAL DE VENDAS: R$"+jl_total_vendas.getText());
                     document.add(p2);
                     
            Paragraph paragrafo4 = new Paragraph("\n\nRELATORIO DE VENDAS NO CREDIARIO NA DATA "+jt_dataVenda.getText()+"  \n\n");
            document.add(paragrafo4);
            PdfPTable tabela4 = new PdfPTable(5);
            PdfPCell cabecalho4 = new PdfPCell(new Paragraph("RELATORIO DE VENDAS PARA CLIENTES"));
            cabecalho4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cabecalho4.setBorder(PdfPCell.NO_BORDER);
            cabecalho4.setBackgroundColor(new BaseColor(100,150,200));
            cabecalho4.setColspan(5);
            tabela4.addCell(cabecalho4);
            tabela4.addCell("NOTA");
            tabela4.addCell("PRODUTO");
            tabela4.addCell("QUANT");
            tabela4.addCell("VALOR UNITÁRIO");
            tabela4.addCell("TOTAL");
            
             try {
                    con_crediario.resultSet.first();
                    tabela4.addCell(con_crediario.resultSet.getString("nota"));
                    tabela4.addCell(con_crediario.resultSet.getString("nome"));
                    tabela4.addCell(con_crediario.resultSet.getString("quantidade"));
                    tabela4.addCell(con_crediario.resultSet.getString("valor_unit"));
                    tabela4.addCell(con_crediario.resultSet.getString("total_compra"));
                while (con_crediario.resultSet.next()) {
                    tabela4.addCell(con_crediario.resultSet.getString("nota"));
                    tabela4.addCell(con_crediario.resultSet.getString("nome"));
                    tabela4.addCell(con_crediario.resultSet.getString("quantidade"));
                    tabela4.addCell(con_crediario.resultSet.getString("valor_unit"));
                    tabela4.addCell(con_crediario.resultSet.getString("total_compra"));
                }
            
            
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao tentar listar crediario Err ="+ex);
            }
            
            document.add(tabela4);
            Paragraph p4 = new Paragraph("TOTAL DE VENDAS NO CREDITO 3D: R$"+jt_total_crediario.getText());
                     document.add(p4);         
           
            Paragraph paragrafo2 = new Paragraph("\n\nRELATORIO DE RECEBIMENTO NA DATA "+jt_dataVenda.getText()+"  \n\n");
            document.add(paragrafo2);
            PdfPTable tabela2 = new PdfPTable(4);
            PdfPCell cabecalho2 = new PdfPCell(new Paragraph("RELATORIO DE RECEBIMENTO"));
            cabecalho2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cabecalho2.setBorder(PdfPCell.NO_BORDER);
            cabecalho2.setBackgroundColor(new BaseColor(100,150,200));
            cabecalho2.setColspan(4);
            tabela2.addCell(cabecalho2);
            tabela2.addCell("NOME CLIENTE");
            tabela2.addCell("NOTA");
            tabela2.addCell("VALOR RECEBIDO");
            tabela2.addCell("VALOR DA DÍVIDA");
            
             try {
                    con_recebimento.resultSet.first();
                    tabela2.addCell(con_recebimento.resultSet.getString("nomecliente"));
                    tabela2.addCell(con_recebimento.resultSet.getString("nota"));
                    tabela2.addCell(con_recebimento.resultSet.getString("valor_pago"));
                    tabela2.addCell(con_recebimento.resultSet.getString("valor_divida"));
                while (con_recebimento.resultSet.next()) {
                    tabela2.addCell(con_recebimento.resultSet.getString("nomecliente"));
                    tabela2.addCell(con_recebimento.resultSet.getString("nota"));
                    tabela2.addCell(con_recebimento.resultSet.getString("valor_pago"));
                    tabela2.addCell(con_recebimento.resultSet.getString("valor_divida"));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao tentar listar.1 Err ="+ex);
            }
            
            document.add(tabela2);
            Paragraph p3 = new Paragraph("TOTAL DE RECEBIMENTOS: R$"+jl_recebimentos.getText());
                     document.add(p3);
            Paragraph p5 = new Paragraph("\n\nTOTAL DE CAIXA: R$"+jl_total_caixa.getText());
                     document.add(p5);         

        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar listar.2 Err ="+ex);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar listar.3 Err ="+ex);
        } finally{
            document.close();

        }
        try {
            Desktop.getDesktop().open(new File("CAIXA.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar abrir o pdf. Err ="+ex);
        }
    }//GEN-LAST:event_bt_imprimirActionPerformed

    private void jt_dataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dataVendaActionPerformed
         pesquisaVendas();

    }//GEN-LAST:event_jt_dataVendaActionPerformed

    private void bt_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backupActionPerformed
        Backup backup = new Backup();
        try {
            backup.realizaBackup();
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_backupActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_backup;
    private javax.swing.JButton bt_fecharCaixa;
    private javax.swing.JButton bt_imprimir;
    private javax.swing.JButton bt_pesquisa;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel jl_cartao;
    private javax.swing.JLabel jl_recebimentos;
    private javax.swing.JLabel jl_total_caixa;
    private javax.swing.JLabel jl_total_vendas;
    private javax.swing.JFormattedTextField jt_dataVenda;
    private javax.swing.JLabel jt_total_crediario;
    // End of variables declaration//GEN-END:variables


     public void preecher_Jtable(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);//nota
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);//cod produto
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);//nome produto
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);//quant 
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);//VALOR unit
        //sqlDinheiro = "select * from vendas where data='"+jt_data_antiga.getText()+"' and forma_pagamento='DINHEIRO'";
        con_venda.executeSQL("select * from vendas where data='"+jt_dataVenda.getText()+"' and forma_pagamento='DINHEIRO'");
       
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_venda.resultSet.next()) {
                
                modelo.addRow(new Object[]{con_venda.resultSet.getString("nota"),con_venda.resultSet.getString("nome"),con_venda.resultSet.getString("quantidade"),con_venda.resultSet.getString("valor_unit"),con_venda.resultSet.getString("total_compra")});
           }
            con_venda.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.XX."+ e);
        }
    }
     
     
      public void preecher_JtableCartao(){
        jTable4.getColumnModel().getColumn(0).setPreferredWidth(20);//nota
        jTable4.getColumnModel().getColumn(1).setPreferredWidth(200);//cod produto
        jTable4.getColumnModel().getColumn(2).setPreferredWidth(50);//nome produto
        jTable4.getColumnModel().getColumn(3).setPreferredWidth(50);//quant 
        jTable4.getColumnModel().getColumn(4).setPreferredWidth(50);//VALOR unit
        
        con_venda.executeSQL("select * from vendascartao where data='"+jt_dataVenda.getText()+"' and forma_pagamento='CARTÃO'");
       
        DefaultTableModel modelo = (DefaultTableModel)jTable4.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_venda.resultSet.next()) {
                
                modelo.addRow(new Object[]{con_venda.resultSet.getString("nota"),con_venda.resultSet.getString("nome"),con_venda.resultSet.getString("quantidade"),con_venda.resultSet.getString("valor_unit"),con_venda.resultSet.getString("total_compra")});
           }
            con_venda.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
      
     
     public void preecher_JtableCrediario(){
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(20);//nota
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(200);//cod produto
        jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);//nome produto
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(50);//quant 
        jTable3.getColumnModel().getColumn(4).setPreferredWidth(50);//VALOR unit
        //sql3 = "select * from crediario where data='"+jt_data_antiga.getText()+"'";
        con_crediario.executeSQL("select * from crediario where data='"+jt_dataVenda.getText()+"'");
       
        DefaultTableModel modelo = (DefaultTableModel)jTable3.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_crediario.resultSet.next()) {
                
                modelo.addRow(new Object[]{con_crediario.resultSet.getString("nota"),con_crediario.resultSet.getString("nome"),con_crediario.resultSet.getString("quantidade"),con_crediario.resultSet.getString("valor_unit"),con_crediario.resultSet.getString("total_compra")});
           }
            con_crediario.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    }
     
    
     
     public void preecher_Jtable_Recebimentos(){
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);//cod produto
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);//
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);//quant 
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);//VALOR unit
        
        con_recebimento.executeSQL("select * from pagamentos_recebidos where data_pag='"+jt_dataVenda.getText()+"'");
       
        DefaultTableModel modelo = (DefaultTableModel)jTable2.getModel();
        modelo.setNumRows(0);
        
        try {
            while (con_recebimento.resultSet.next()) {
                
                modelo.addRow(new Object[]{con_recebimento.resultSet.getString("nomecliente"),con_recebimento.resultSet.getString("nota"),con_recebimento.resultSet.getString("valor_pago"),con_recebimento.resultSet.getString("valor_divida")});
           }
            con_recebimento.resultSet.first();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao listar dados na tabela.."+ e);
        }
    } 
   
     
     public void totalizandoVendas(){
          total = 0;
                    con_venda.executeSQL("select * from vendas where data='"+jt_dataVenda.getText()+"' and forma_pagamento='DINHEIRO'");
                    
                   try {
                       con_venda.resultSet.first() ;
                       total = con_venda.resultSet.getDouble("total_compra");
                       while (con_venda.resultSet.next()) {
                           
                           total = total + con_venda.resultSet.getDouble("total_compra");
                       }
                       jl_total_vendas.setText(""+total);
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
                   }
     }
    
     
      public void totalizandoVendasCartao(){
          total = 0;
                    con_venda.executeSQL("select * from vendascartao where data='"+jt_dataVenda.getText()+"' and forma_pagamento='CARTÃO'");
                    
                   try {
                       con_venda.resultSet.first() ;
                       total = con_venda.resultSet.getDouble("total_compra");
                       while (con_venda.resultSet.next()) {
                           
                           total = total + con_venda.resultSet.getDouble("total_compra");
                       }
                       jl_cartao.setText(""+total);
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
                   }
     }
      
     
      public void totalizandoCrediario(){
          total = 0;
                    con_crediario.executeSQL("select * from crediario where data='"+jt_dataVenda.getText()+"'");
                    
                   try {
                       con_crediario.resultSet.first() ;
                       total = con_crediario.resultSet.getDouble("total_compra");
                       while (con_crediario.resultSet.next()) {
                           
                           total = total + con_crediario.resultSet.getDouble("total_compra");
                       }
                       jt_total_crediario.setText(""+total);
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
                   }
     }
     
     public void totalizandoRecebimentos(){
          total = 0;
                    con_recebimento.executeSQL("select * from pagamentos_recebidos where data_pag='"+jt_dataVenda.getText()+"'");
                   try {
                       con_recebimento.resultSet.first();
                       total = con_recebimento.resultSet.getDouble("valor_pago");
                       while (con_recebimento.resultSet.next()) {
                          total = total + con_recebimento.resultSet.getDouble("valor_pago");
                       }
                       jl_recebimentos.setText(""+total);
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null, "erro ao selecionar itens "+ex);
                   }
     }
       
     public void pesquisaVendas(){
        sqlCartao = "select * from vendascartao where data_venc= '"+jt_dataVenda.getText()+"' and forma_pagamento='CARTÃO'";
        sqlDinheiro = "select * from vendas where data_venc='"+jt_dataVenda.getText()+"' and forma_pagamento='DINHEIRO'";
        sql3 = "select * from crediario where data='"+jt_dataVenda.getText()+"'";
        sqlRecebimentos = "select * from pagamentos_recebidos where data_pag='"+jt_dataVenda.getText()+"'";
        con_venda.executeSQL(sqlDinheiro);
        
        try {
            if(con_venda.resultSet.next()){
                con_venda.resultSet.first();
                preecher_Jtable();
                totalizandoVendas();
               }else{
                JOptionPane.showMessageDialog(null, "Não houve vendas avista nesta data.");
             }
             con_recebimento.executeSQL(sqlRecebimentos);
            if(con_recebimento.resultSet.next()){
                con_recebimento.resultSet.first();
                preecher_Jtable_Recebimentos();
                totalizandoRecebimentos();
               }else{
                JOptionPane.showMessageDialog(null, "Não houve vendas Recebimento nesta data.");
             }
            con_crediario.executeSQL(sql3);
            if(con_crediario.resultSet.next()){
                con_crediario.resultSet.first();
                preecher_JtableCrediario();
                totalizandoCrediario();
            }else{
                JOptionPane.showMessageDialog(null, "Não houve vendas no crédito nesta data.");
            }
            con_venda.executeSQL(sqlCartao);
            if(con_venda.resultSet.next()){
                con_venda.resultSet.first();
                preecher_JtableCartao();
                totalizandoVendasCartao();
            }else{
                JOptionPane.showMessageDialog(null, "Não houve vendas no cartao nesta data.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro na busca por venda ="+ex);
        }
        
        

     }
     
  
}
