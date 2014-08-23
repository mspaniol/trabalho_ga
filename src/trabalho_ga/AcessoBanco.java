package trabalho_ga;

import java.sql.*;

/**
 * Classe responsável pela conexão com o banco de dados MySQL
 * @author mozart
 */
public class AcessoBanco 
{
    /**
     * função que executa uma query no banco e retorna o resultado
     * @param sql 
     */
    public void executar(String sql) throws Exception
    {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/trabalho_ga?zeroDateTimeBehavior=convertToNull";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root"; 
        String password = "";
        
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            
            conn.close();
            
        } catch (Exception e) {
            throw e;
        }
    }
}
