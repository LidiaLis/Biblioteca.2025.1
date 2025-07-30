package dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAOGenerico {
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("config.properties"));
        } catch (IOException ex) {
            Logger.getLogger(DAOGenerico.class.getName()).log(Level.SEVERE, null, ex);
        }

    String url = props.getProperty("db.url");
    String user = props.getProperty("db.user");
    String password = props.getProperty("db.password");
    Connection conn = DriverManager.getConnection(url, user, password);

        return conn;
    }
    
     public static int executarComando(String query, Object... params) throws SQLException, ClassNotFoundException {
        PreparedStatement sql = (PreparedStatement)  getConexao().prepareStatement(query);
        for (int i = 0; i < params.length; i++) {
            sql.setObject(i+1,params[i]);
        }
        int result = sql.executeUpdate();
        sql.close();
        return result;
     }
     
     public static ResultSet executarConsulta(String query, Object... params) throws SQLException, ClassNotFoundException {
        PreparedStatement sql = (PreparedStatement)  getConexao().prepareStatement(query);
        for (int i = 0; i < params.length; i++) {
            sql.setObject(i+1,params[i]);
        }
        return sql.executeQuery();
    }

}