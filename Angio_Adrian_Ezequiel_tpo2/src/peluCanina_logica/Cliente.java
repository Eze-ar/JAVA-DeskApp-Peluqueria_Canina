package peluCanina_logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Cliente implements Serializable { //implements Serializable recomendado por NetBeans
    @Id
    @GeneratedValue //por defecto toma: 
                    //GeneratedValue(strategy = GenerationType.AUTO)
    private int num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(String nombre_perro, String raza, String color, String alergico, 
                   String atencion_especial, String nombre_duenio, String celular_duenio, 
                   String observaciones) {
        
        Cliente cliente = new Cliente();
        
        cliente.setNombre_perro(nombre_perro);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(atencion_especial);
        cliente.setNombre_duenio(nombre_duenio);
        cliente.setCelular_duenio(celular_duenio);
        cliente.setObservaciones(observaciones);
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String isAlergico() {
        return alergico;
    }

    public String isAtencion_especial() {
        return atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
