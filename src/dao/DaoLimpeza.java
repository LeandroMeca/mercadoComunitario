package dao;

import entity.ProdutoHigienePessoal;
import entity.ProdutoLimpeza;
import static factory.Conections.createConnections;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DaoLimpeza {
    
    public int saveProdutoLimpeza(String nome, double peso, BigDecimal preco) {
        Connection con;
        ResultSet rs;
        con = createConnections();
        int idUp = 0;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_limpeza(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
            st.execute(sql);
            rs = st.executeQuery("select * from produto_higiene_pessoal");
            while (rs.next()) {
                idUp = rs.getInt("id");
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir produto higiene pessoal " + ex);
        }
        return idUp;
    }
    
    public void save_produto_cadastrados_limpeza(int quantidade, String nome, double peso, BigDecimal preco) {
        Connection con;
        con = createConnections();
        Statement st;

        try {
            for (int i = 0; i < quantidade; i++) {
                st = con.createStatement();
                String sql = "insert into produto_limpeza_cadastrado(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
                st.execute(sql);
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }
    
    public List<ProdutoLimpeza> getProduto() {
        List<ProdutoLimpeza> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_limpeza_cadastrado";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoLimpeza produto = new ProdutoLimpeza();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPesoUniMl(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }

    public List<ProdutoLimpeza> getProdutoCadastrados() {
        List<ProdutoLimpeza> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_limpeza";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoLimpeza produto = new ProdutoLimpeza();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPesoUniMl(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    
    public List<ProdutoLimpeza> getProdutoCadastrados(String produtos) {
        List<ProdutoLimpeza> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_limpeza where nome = '" + produtos + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoLimpeza produto = new ProdutoLimpeza();
                produto.setNomeProduto(rs.getString("nome"));
                produto.setPesoUniMl(rs.getDouble("peso"));
                produto.setPreco(rs.getBigDecimal("preco"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar higiene pessoal " + ex);
        }

        return lista;
    }
    
    
     public void deleteProduto(String produto){
        Connection con;
        con = createConnections();   
        Statement st;
        try {
            st = con.createStatement();
            String sql = "delete from produto_limpeza_cadastrado where nome = '"+produto+"' limit 1 ";
            st.execute(sql);
       
        } catch (SQLException ex) {
            System.out.println("erro ao deletar produo " + ex);
        }
    }
    
}
