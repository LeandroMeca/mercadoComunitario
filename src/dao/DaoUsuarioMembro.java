package dao;

import entity.UsuarioMembro;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuarioMembro {

    public List<UsuarioMembro> getCliente() {
        List<UsuarioMembro> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from pessoa";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                UsuarioMembro usuario = new UsuarioMembro();
                usuario.setId(rs.getInt("id"));
                usuario.setNomeMembro(rs.getString("nome"));
  
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    
    
    public void saveUsuarioMembro(int idMembro, String nome) {
        Connection con;
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into membros(id,nome) values(" + idMembro + ",'" + nome.toUpperCase() + "')";
            st.execute(sql);

        } catch (SQLException ex) {
            System.out.println("erro ao inserir membros  " + ex);
        }

    }

    public List<UsuarioMembro> getIdUsuarioMembro(int id) {
        List<UsuarioMembro> membros = new ArrayList<>();

        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from membros where id = " + id + " ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                UsuarioMembro usuarioMembro = new UsuarioMembro();
                usuarioMembro.setId(rs.getInt("id"));
                usuarioMembro.setNomeMembro(rs.getString("nome"));
                membros.add(usuarioMembro);

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return membros;

    }

    public int getIdUsuarioMembroForUpdate(int id) {

        int aInt = 0;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "SELECT count(pessoa.id) as idd FROM pessoa inner join membros on pessoa.id = membros.id where pessoa.id= "+id+" ";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                aInt = rs.getInt("idd");

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return aInt;

    }

}
