package dao;


import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DaoLogin {
    
    
    public boolean getCliente(String name, String senha) {
        
        boolean valid = false;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from login";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("dao.DaoLogin.getCliente() "+rs.getString("name")+"  "+rs.getString("senha"));
                if(rs.getString("name").equals(name) && rs.getString("senha").equals(senha)){
                    valid = true;
                }
             
                
             
            }
        } catch (SQLException ex) {
            System.out.println("erro a logar " + ex);
        }

        return valid;
    }
    
}
