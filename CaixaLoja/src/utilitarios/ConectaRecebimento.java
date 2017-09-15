package utilitarios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RamonFernandes
 */
public class ConectaRecebimento {
    public Statement statement;
    public ResultSet resultSet;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/sistemaVendasEstoque";
    private String usuario = "postgres";
    private String senha = "ramon";
    public Connection conn;
    
    
    public void conexao(){
          try {
            System.setProperty("jdbc.Drivers", driver);  
            conn = DriverManager.getConnection(caminho, usuario, senha);
              //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao conectar!"+ex.getMessage());
        }
    }
    
    public void executeSQL(String sql){
        try{
             statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
             resultSet = statement.executeQuery(sql);
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null,"Não foi Possível"+
                    "executar o comando sql, "+sqlex+" o sql passado foi "+sql);
        }
    }
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexao!"+ex.getMessage());
        }
    }
    
}
