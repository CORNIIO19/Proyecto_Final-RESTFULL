package cua.uam.mx.dal.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    // deserialize de la fecha de ingreso
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fecha_ingreso;
    

    Employee() {}

    Employee (int id, String name, Date fecha_ingreso ) {
        this.id = id;
        this.name = name;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getFechaIngreso() {
        return fecha_ingreso;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFechaIngreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(fecha_ingreso, employee.fecha_ingreso); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.fecha_ingreso );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fecha_ingreso='" + fecha_ingreso + '\'' +
                '}'; 


}
}
