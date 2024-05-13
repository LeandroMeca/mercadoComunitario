package dao;

import entity.Usuarios;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuario {

    List<Usuarios> lista;

    public int saveUsuario(String nome, int idade, String rg, String telefone) {
        Connection con;
        int idUp = 0;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "insert into pessoa(nome,idade,rg, telefone) values('" + nome.toUpperCase() + "'," + idade + ",'" + rg + "',"
                    + "'" + telefone + "')";
            st.execute(sql);
            rs = st.executeQuery("select * from pessoa");
            while (rs.next()) {
                idUp = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("erro ao inserir titular " + ex);
        }
        return idUp;
    }

    public List<Usuarios> saveUsuarioPoo(int id, String nome, String idade, String rg, String telefone) {
        lista = new ArrayList<>();

        Usuarios usuario = new Usuarios();
        usuario.setNome(nome);
        usuario.setIdade(idade);
        usuario.setRg(rg);
        usuario.setTelefone(telefone);
        lista.add(usuario);

        return lista;
    }

    public List<Usuarios> getCliente() {
        lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from pessoa";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setIdade(rs.getString("idade"));
                usuario.setRg(rs.getString("rg"));
                usuario.setTelefone(rs.getString("telefone"));
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }

    public List<Usuarios> getCliente(String rg) {
        List<Usuarios> lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from pessoa where rg = '" + rg + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setIdade(rs.getString("idade"));
                usuario.setRg(rs.getString("rg"));
                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }

    public int getIdUsuarioForUpdate(int id) {

        int aInt = 0;
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "select * from pessoa where id = " + id + " ";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                aInt = rs.getInt("id");

            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return aInt;

    }

    public void updateUsuario(Usuarios usuarios){
        Connection con;
        con = createConnections();
        Statement st;
        try {
            st = con.createStatement();
            String sql = "update pessoa set nome = '" + usuarios.getNome().toUpperCase() + "', idade = " + usuarios.getIdade() + ", rg = '"+ usuarios.getRg() + "', "
                + " telefone = '" + usuarios.getTelefone() + "'   where id = "+usuarios.getId()+" ";
            st.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("erro ao inserir titular " + ex);
        }
    }
    
}
