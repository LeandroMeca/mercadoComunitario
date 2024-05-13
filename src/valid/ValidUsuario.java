package valid;

import java.util.Objects;




public final class ValidUsuario {

    private String nome;
    private String rg;
    private int idade;

   
    
    
    
    
    
    public boolean saveUsuario(String nome, int idade, String rg){
        boolean isTrue=false;
        if(!this.getNome().equals("") || this.getIdade()>0 || !this.getRg().equals("")){
           isTrue=true; 
        }
        return isTrue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.rg);
        hash = 97 * hash + this.idade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ValidUsuario other = (ValidUsuario) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.rg, other.rg);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    
    
}
