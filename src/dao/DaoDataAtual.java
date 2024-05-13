package dao;

import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoDataAtual {

    public String checkData() {
        String data = null;
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat sdfn = new SimpleDateFormat("MM");
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from data_atual";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                data = rs.getString("data");
                java.util.Date datesEntra = sdf.parse(data);
                data = sdfn.format(datesEntra);

                

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoDataAtual.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }
    
    

    public void salvarDataAtual(){
         Connection con;
        con = createConnections();
        Statement st;

        try {
            st = con.createStatement();
            String sql = "insert into data_atual(data) values('" + LocalDateTime.now() + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir data atual " + ex);
        }
    }
    
    
}
