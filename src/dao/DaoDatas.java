
package dao;

import entity.Datas;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro
 */
public class DaoDatas {

    public List<Datas> getDataSaidaCarrinho() {
        List<Datas> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;

        try {

            SimpleDateFormat hora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            SimpleDateFormat horaEn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            st = con.createStatement();
            String sql = "select * from data_transacao";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Datas datas = new Datas();
                Date parse = horaEn.parse( rs.getString("data_final"));
                String format = hora.format(parse);
                System.out.println("datas "+format);
                datas.setDataSaidaString(format);
              // datas.setDataSaidaString(rs.getString("data_final"));
                lista.add(datas);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoDatas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
