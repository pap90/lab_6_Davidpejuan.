/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author david
 */
public class usuarios {
    private String nombre;
    private int codigo;
    private String contraseña;

    public usuarios() {
    }

    public usuarios(String nombre, int codigo, String contraseña) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "usuarios{" + "nombre=" + nombre + ", codigo=" + codigo + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
