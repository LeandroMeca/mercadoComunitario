package entity;

import java.math.BigDecimal;




public class ProdutoHortifruti {
    
    int id;
    String nomeProduto;
    double peso;
    BigDecimal preco;
    boolean disponibilidade;

    public ProdutoHortifruti(int id, String nomeProduto, double peso, BigDecimal preco) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.peso = peso;
        this.preco = preco;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }



    
    
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

  

    public ProdutoHortifruti() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

  
    
    
    
}
