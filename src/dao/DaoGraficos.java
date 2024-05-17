package dao;

import entity.DataGraficos;
import entity.Usuarios;
import static factory.Conections.createConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class DaoGraficos {
    DataGraficos data  = new DataGraficos();

    
    public  List<DataGraficos> getCliente( String mes) {
        
        
        List lista = new ArrayList<>();
        Connection con;
        con = createConnections();
        ResultSet rs;
        Statement st;
        try {
            st = con.createStatement();
            String sql = "SELECT sum(mercadoComunitario.produto_carrinho.preco) as valor from mercadoComunitario.produto_carrinho inner join mercadoComunitario.data_transacao as tb on month(tb.data_final) = '"+mes+"'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if(mes.equals("1")){
                    data.setJan(rs.getBigDecimal("valor"));
                }
                if(mes.equals("2")){
                    data.setFev(rs.getBigDecimal("valor"));
                }
                if(mes.equals("3")){
                    data.setMar(rs.getBigDecimal("valor"));
                }
                if(mes.equals("4")){
                    data.setAbr(rs.getBigDecimal("valor"));
                }
                if(mes.equals("5") && rs.getBigDecimal("valor")!=null){
                    data.setMai(rs.getBigDecimal("valor"));
                }
                if(mes.equals("6")&& rs.getBigDecimal("valor")!=null){
                    data.setJun(rs.getBigDecimal("valor"));
                }
                if(mes.equals("7")){
                    data.setJul(rs.getBigDecimal("valor"));
                }
                if(mes.equals("8")){
                    data.setAgo(rs.getBigDecimal("valor"));
                }
                if(mes.equals("9")){
                    data.setSet(rs.getBigDecimal("valor"));
                }
                if(mes.equals("10")){
                    data.setOut(rs.getBigDecimal("valor"));
                }
                if(mes.equals("11")){
                    data.setNov(rs.getBigDecimal("valor"));
                }
                if(mes.equals("12")){
                    data.setDez(rs.getBigDecimal("valor"));
                }
                
               lista.add(data);
          
            }
        } catch (SQLException ex) {
            System.out.println("erro a pegar cliente " + ex);
        }

        return lista;
    }
    
}
