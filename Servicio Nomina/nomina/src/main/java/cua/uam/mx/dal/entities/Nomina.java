package cua.uam.mx.dal.entities;

import java.util.Objects;

//import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
//@Nonnull
public class Nomina {
    private @Id
    @GeneratedValue int id;
    private String rol;
    private String salario;
    

    Nomina() {}

    Nomina (int id, String rol, String salario ) {
        this.id = id;
        this.rol = rol;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public String getSalario() {
        return salario;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nomina)) return false;
        Nomina nomina = (Nomina) o;
        return Objects.equals(id, nomina.id) &&
                Objects.equals(rol, nomina.rol) &&
                Objects.equals(salario, nomina.salario);
    
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.rol, this.salario );
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", rol='" + rol + '\'' +
                ", salario='" + salario + '\'' +
                '}'; 


}
}
