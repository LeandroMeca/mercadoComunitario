package dao;

import entity.ProdutoPereciveis;
import static factory.Conections.createConnections;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoProdutoPereciveis {

    public int saveProdutoPerecivel(String nome, double peso, BigDecimal preco) {
        Connection con;
        ResultSet rs;
        con = createConnections();
        int idUp = 0;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_pereciveis(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
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

    public void saveProdutoCadastrados_pereciveis(int quantidade, String nome, double peso, BigDecimal preco) {
        Connection con;
        con = createConnections();
        Statement st;

        try {
            for (int i = 0; i < quantidade; i++) {
                st = con.createStatement();
                String sql = "insert into produto_pereciveis_cadastrado(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
                st.execute(sql);
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

    public int saveProdutoHortifruti(String nome, BigDecimal preco) {
        Connection con;
        ResultSet rs;
        con = createConnections();
        int idUp = 0;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_hortifruti(nome,preco,disponibilidade) values('" + nome.toUpperCase() + "'," + preco + ", '" + 1 + "')";
            st.execute(sql);
            rs = st.executeQuery("select * from produto_hortifruti");
            while (rs.next()) {
                idUp = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }
        return idUp;
    }

    public List<ProdutoPereciveis> getProduto() {
        List<ProdutoPereciveis> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_pereciveis_cadastrado";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoPereciveis produto = new ProdutoPereciveis();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPeso(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }

    public List<ProdutoPereciveis> getProdutoCadastrados() {
        List<ProdutoPereciveis> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_pereciveis";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoPereciveis produto = new ProdutoPereciveis();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPeso(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }

    
    public List<ProdutoPereciveis> getProdutoCadastrados(String produtos) {
        List<ProdutoPereciveis> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_pereciveis where nome = '" + produtos + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoPereciveis produto = new ProdutoPereciveis();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPeso(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    
    
    public void deleteProduto(String produto){
        Connection con;
        con = createConnections();   
        Statement st;
        try {
            st = con.createStatement();
            String sql = "delete from produto_pereciveis_cadastrado where nome = '"+produto+"' limit 1 ";
            st.execute(sql);
       
        } catch (SQLException ex) {
            System.out.println("erro ao deletar produo " + ex);
        }
    }
    
}
