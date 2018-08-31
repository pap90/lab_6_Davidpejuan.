/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class series {
    private String nombre;
    private int duracion;
    private String categoria;
    private ArrayList <String> actores=new ArrayList();
    private int temporadas;
    private String productora;
    private String idioma;
    private String doblaje;
    private String subtitulos;

    public series() {
    }

    public series(String nombre, int duracion, String categoria, int temporadas, String productora, String idioma, String doblaje, String subtitulos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.temporadas = temporadas;
        this.productora = productora;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos = subtitulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
