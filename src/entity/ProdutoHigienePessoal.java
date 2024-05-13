package entity;

import java.math.BigDecimal;




public class ProdutoHigienePessoal {
    
     private int id;
    private String nomeProduto;
    private double pesoUniMl;
    private BigDecimal preco;


    public ProdutoHigienePessoal() {
    }

    public ProdutoHigienePessoal(int id, String nomeProduto, double pesoUniMl, BigDecimal preco) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.pesoUniMl = pesoUniMl;
        this.preco = preco;
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

    public double getPesoUniMl() {
        return pesoUniMl;
    }

    public void setPesoUniMl(double pesoUniMl) {
        this.pesoUniMl = pesoUniMl;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    
    
    
}
