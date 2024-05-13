package dao;

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
            String sql = "insert into endereçoFamilia(id,endereco) values(" + idEndereco + ",'" + endereco + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir cliente " + ex);
        }

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

}
