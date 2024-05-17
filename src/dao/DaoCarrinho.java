package dao;

import entity.Carrinho;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCarrinho {

    List<Carrinho> lista;

    public List<Carrinho> getDadosCarrinho() {
        lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            
            SimpleDateFormat hora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            SimpleDateFormat horaEn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            st = con.createStatement();
            String sql = "select * from produto_carrinho";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Carrinho usuario = new Carrinho();

                usuario.setNome(rs.getString("usuario"));
                usuario.setProduto(rs.getString("nome"));
                usuario.setPeso(rs.getDouble("peso"));
                usuario.setPreco(rs.getBigDecimal("preco"));
                
                Date parse = horaEn.parse( rs.getString("data_saida"));
                String format = hora.format(parse);
                System.out.println("datas "+format);
                
                usuario.setDataSaida(format);
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        } catch (ParseException ex) {
            Logger.getLogger(DaoCarrinho.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    
  

}
