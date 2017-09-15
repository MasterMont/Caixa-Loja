
package TelasSistema;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.ConectaCliente;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk; 
import com.itextpdf.text.Document; 
import com.itextpdf.text.Image; 
import com.itextpdf.text.PageSize; 
import com.itextpdf.text.Paragraph; 
import com.itextpdf.text.Phrase; 
import com.itextpdf.text.pdf.BarcodeEAN; 
import com.itextpdf.text.pdf.PdfContentByte; 
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Ramon Fernandes
 */
public class CodBarras extends javax.swing.JFrame {
    String num;

    ConectaCliente con_barras = new ConectaCliente();
    public CodBarras() {
        initComponents();
        con_barras.conexao();
        con_barras.executeSQL("select * from codigobarras");
        try {
            con_barras.resultSet.last();
           // long ultCod = con_barras.resultSet.getLong("numero");// + 1;
           // jl_numero.setText(""+ultCod);
            jl_numero.setText(""+con_barras.resultSet.getLong("numero"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro"+ ex);
        }
          
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_numero = new javax.swing.JLabel();
        bt_proximo = new javax.swing.JButton();
        bt_imprime = new javax.swing.JButton();
        jt_quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_numero.setText("numero");

        bt_proximo.setText("proximo");
        bt_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_proximoActionPerformed(evt);
            }
        });

        bt_imprime.setText("imprime");
        bt_imprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_imprimeActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite a quantidade:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("GERAR CÓDIGO DE BARRAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl_numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jt_quantidade))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_proximo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_imprime, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero)
                    .addComponent(bt_proximo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_imprime)
                    .addComponent(jt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_imprimeActionPerformed
        adicionar();
        num = jl_numero.getText();
        gerarCod();
        
    }//GEN-LAST:event_bt_imprimeActionPerformed

    private void bt_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_proximoActionPerformed
          
        con_barras.executeSQL("select * from codigobarras");
        
        try {
            con_barras.resultSet.last();
            long ultCod = con_barras.resultSet.getLong("numero") + 1;
            jl_numero.setText(""+ultCod);
           // jl_numero.setText(""+con_barras.resultSet.getLong("numero"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro"+ ex);
        }
    }//GEN-LAST:event_bt_proximoActionPerformed

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
            java.util.logging.Logger.getLogger(CodBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_imprime;
    private javax.swing.JButton bt_proximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jl_numero;
    private javax.swing.JTextField jt_quantidade;
    // End of variables declaration//GEN-END:variables

    public void gerarCod(){
    // System.out.println("Barcode Linha de Código "); 
// criando um objeto da classe Document 
    Document document = new Document(PageSize.A4, 50, 50, 50, 50); 
   
        try {
        //Aqui começamos a utilizar as classes do iText: o documento
        //criado acima será
       //direcionado para um arquivo PDF.
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:/Etiquetas/Codigo_Barra_Java_Linha_Codigo.pdf"));
       //abrindo o documento.
     
       document.open();
         int t = Integer.parseInt(jt_quantidade.getText());
        for(int i = 1;i <= t; i++){
       //adicionando um novo paragrafo.
      // document.add(new Paragraph("CÓDIGOS DE BARRA"));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        //Comecando a configurar o cod de barras
       PdfContentByte cb = writer.getDirectContent();
       BarcodeEAN codeEAN = new BarcodeEAN();
        //O iText suporta os principais tipos de código de barra, como Barcode39,
       //  Barcode128 (128, 128_UCC, 128_RAW),  BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc
       codeEAN.setCodeType(codeEAN.EAN13);
       codeEAN.setCode(num);
       //codeEAN.setCode(jt);
       Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
       document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
        }
       }
       catch (Exception de)
       {            
           de.printStackTrace();
        }        
           document.close();
            try {
            Desktop.getDesktop().open(new File("C:/Etiquetas/Codigo_Barra_Java_Linha_Codigo.pdf"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar abrir o pdf. Err ="+ex);
        }
        } 
         
    
    public void adicionar(){
        try {       
            String sql;
                  sql = "insert into codigobarras values("+jl_numero.getText()+")";
                  //JOptionPane.showMessageDialog(null,"sql  "+sql);
                  con_barras.statement.executeUpdate(sql);
        } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Erro adicionar codigo de barras! aki"+ex);
        }
    }
}