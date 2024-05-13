package dao;

import static factory.Conections.createConnections;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoConta {

    public void savarConta(int idMembro, BigDecimal valor) {
        Connection con;

        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into conta(id,valor) values(" + idMembro + "," + valor + ")";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

   

    
}
