package dao;

import entity.ProdutoHigienePessoal;
import entity.ProdutoPereciveis;
import static factory.Conections.createConnections;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class DaoHigienePessoal {
    
    public int saveProdutoHigienePessoal(String nome, double peso, BigDecimal preco) {
        Connection con;
        ResultSet rs;
        con = createConnections();
        int idUp = 0;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into produto_higiene_pessoal(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
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
    
    public void saveProdutoCadastrados_higiene(int quantidade, String nome, double peso, BigDecimal preco) {
        Connection con;
        con = createConnections();
        Statement st;

        try {
            for (int i = 0; i < quantidade; i++) {
                st = con.createStatement();
                String sql = "insert into produto_higiene_pessoal_cadastrado(nome,peso,preco) values('" + nome.toUpperCase() + "'," + peso + "," + preco + ")";
                st.execute(sql);
            }

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }
    
    public List<ProdutoHigienePessoal> getProduto() {
        List<ProdutoHigienePessoal> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_higiene_pessoal_cadastrado";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHigienePessoal produto = new ProdutoHigienePessoal();
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

    public List<ProdutoHigienePessoal> getProduto_Higiene_Cadastrados() {
        List<ProdutoHigienePessoal> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_higiene_pessoal";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHigienePessoal produto = new ProdutoHigienePessoal();
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
    
    public List<ProdutoHigienePessoal> getProdutoCadastrados(String produtos) {
        List<ProdutoHigienePessoal> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from produto_higiene_pessoal where nome = '" + produtos + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ProdutoHigienePessoal produto = new ProdutoHigienePessoal();
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
            String sql = "delete from produto_higiene_pessoal_cadastrado where nome = '"+produto+"' limit 1 ";
            st.execute(sql);
       
        } catch (SQLException ex) {
            System.out.println("erro ao deletar produo " + ex);
        }
    }
}
