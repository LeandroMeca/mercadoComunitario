package entity;



public class Endereco {
    
    private int id;
    private String endereco;

    public Endereco(int id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
