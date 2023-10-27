/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author arral
 */
public class Proveedor {
    private String id;
    private String nombre;
    private String numero;
    private String correo;
    private String idDiaeReparto;

    public Proveedor(String id, String nombre, String numero, String correo, String idDiaeReparto) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
        this.idDiaeReparto = idDiaeReparto;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getCorreo() {
        return correo;
    }

    public String getIdDiaeReparto() {
        return idDiaeReparto;
    }

       public void setId(int id) {
       if(id > 0)
           this.id ="Pr_" + id;
       else
           System.out.println("Valor ID invalido");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdDiaeReparto(String idDiaeReparto) {
        this.idDiaeReparto = idDiaeReparto;
    }


    @Override
    public String toString() {
        return "proveedor [id=" + id + ", nombre=" + nombre + ", numero=" + numero + "]";
    }
}
