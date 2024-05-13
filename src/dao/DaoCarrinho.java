package dao;

import entity.Carrinho;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoCarrinho {

    List<Carrinho> lista;

    public List<Carrinho> getDadosCarrinho() {
        lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_carrinho";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Carrinho usuario = new Carrinho();

                usuario.setNome(rs.getString("usuario"));
                usuario.setProduto(rs.getString("nome"));
                usuario.setPeso(rs.getDouble("peso"));
                usuario.setPreco(rs.getBigDecimal("preco"));
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    
  

}
