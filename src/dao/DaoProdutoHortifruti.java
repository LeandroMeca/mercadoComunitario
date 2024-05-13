package dao;

import entity.ProdutoHortifruti;
import static factory.Conections.createConnections;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class DaoProdutoHortifruti {
    
    
        public int saveProdutoHortifruti(String nome, double peso, BigDecimal preco) {
        Connection con;
        ResultSet rs;
        con = createConnections();
        int idUp = 0;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_hortifruti(nome,peso,preco,disponibilidade) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ","+1+")";
            st.execute(sql);
            rs = st.executeQuery("select * from produto_pereciveis");
            while (rs.next()) {
                idUp = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }
        return idUp;
    }
    
    
        public List<ProdutoHortifruti> getProdutoHortifruti() {
        List<ProdutoHortifruti> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_hortifruti";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHortifruti produto = new ProdutoHortifruti();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPreco(rs.getBigDecimal("preco"));
                produto.setDisponibilidade(rs.getBoolean("disponibilidade"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    

        public List<ProdutoHortifruti> getProdutoCadastradosHortifruti() {
        List<ProdutoHortifruti> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_hortifruti";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHortifruti produto = new ProdutoHortifruti();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPreco(rs.getBigDecimal("preco"));
                produto.setPeso(rs.getDouble("peso"));
                produto.setDisponibilidade(rs.getBoolean("disponibilidade"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
          
            
        public List<ProdutoHortifruti> getProdutoCadastradosHortifruti(String produtos) {
        List<ProdutoHortifruti> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_hortifruti where nome = '" + produtos + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHortifruti produto = new ProdutoHortifruti();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPreco(rs.getBigDecimal("preco"));
                produto.setDisponibilidade(rs.getBoolean("disponibilidade"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
            

        
        public void setDisponibilidadeHortifruti(String alimento, boolean disponivel) {
        Connection con;

        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "update produto_hortifruti set disponibilidade = " +disponivel+ " where nome = '" + alimento+ "' ";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }
    }
        
}


