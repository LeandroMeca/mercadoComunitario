package dao;

import entity.Endereco;
import entity.Usuarios;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoEnderecoFamilia {

    public void saveEndereco(int idEndereco, String endereco) {
        Connection con;
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into endereçoFamilia(id,endereco) values(" + idEndereco + ",'" + endereco.toUpperCase() + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

    }

    public List<Endereco> getEndereco(){
  
        List<Endereco> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from endereçoFamilia";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setEndereco(rs.getString("endereco"));
                
                lista.add(endereco);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }
       return lista;
    }
    
    
    public String getEndereco(int id) {
        String endereco = null;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from endereçoFamilia where id = " + id + " ";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                endereco = rs.getString("endereco");

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }
        return endereco;
    }
    
    
     public void updateEndereco(Endereco endereco){
        Connection con;
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "update endereçoFamilia set endereco = '" + endereco.getEndereco() + "' where id = "+endereco.getId()+" ";
            st.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("erro ao inserir titular " + ex);
        }
    }

}
