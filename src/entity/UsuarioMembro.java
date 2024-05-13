package entity;

import java.math.BigDecimal;

public class UsuarioMembro{

    int id;
    String nomeMembro;
    String idadeMembro;
    String rg;

    public UsuarioMembro(int id, String nomeMembro, String idadeMembro, String rg) {
        this.id = id;
        this.nomeMembro = nomeMembro;
        this.idadeMembro = idadeMembro;
        this.rg=rg;

    }

    public UsuarioMembro() {
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }




 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }

    public String getIdadeMembro() {
        return idadeMembro;
    }

    public void setIdadeMembro(String idadeMembro) {
        this.idadeMembro = idadeMembro;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
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
        final UsuarioMembro other = (UsuarioMembro) obj;
        return this.id == other.id;
    }

}
