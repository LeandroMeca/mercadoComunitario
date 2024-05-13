package entity;

import java.math.BigDecimal;




public class Conta {
    
    int id;
    BigDecimal valor;

    public Conta() {
    }

    @Override
    public String toString() {
        return "Valor{" + "id=" + id + ", valor=" + valor + '}';
    }
    
    

    public Conta(int id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
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
        final Conta other = (Conta) obj;
        return this.id == other.id;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    
}
