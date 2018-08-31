/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class administrarpelis {

    private ArrayList<peliculas> listapeliculas = new ArrayList();
    private File archivo = null;

    public administrarpelis(String path) {
        archivo = new File(path);
    }

    public ArrayList<peliculas> getListapeliculas() {
        return listapeliculas;
    }

    public void setListapeliculas(ArrayList<peliculas> listapeliculas) {
        this.listapeliculas = listapeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listapeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    String nombre;
                    int duracion;
                    String categoria;
                    ArrayList<String> temp = new ArrayList();
                    String director;
                    String compañia;
                    String idioma;
                    String doblaje;
                    String subtitulos;
                    nombre = sc.next();

                    duracion = sc.nextInt();

                    categoria = sc.next();

                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp.add(s2.next());
                    }
                    director = sc.next();

                    compañia = sc.next();

                    idioma = sc.next();

                    doblaje = sc.next();

                    subtitulos = sc.next();

                    listapeliculas.add(new peliculas(nombre, duracion, categoria, director, compañia, idioma, doblaje, subtitulos));
                    listapeliculas.get(listapeliculas.size() - 1).setActores(temp);

                }
                System.out.println("fox");
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                sc.close();
            }
        }//fin if
    }

}
