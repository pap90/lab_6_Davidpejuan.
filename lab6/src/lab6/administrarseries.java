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
public class administrarseries {

    private ArrayList<series> listaseries = new ArrayList();
    private File archivo = null;

    public administrarseries(String path) {
        archivo = new File(path);
    }

    public ArrayList<series> getListaseries() {
        return listaseries;
    }

    public void setListaseries(ArrayList<series> listaseries) {
        this.listaseries = listaseries;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaseries = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    String nombre;
                    int duracion;
                    String categoria;
                    ArrayList<String> temp = new ArrayList();
                    int temporadas;
                    String productora;
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
                    temporadas=sc.nextInt();
                    productora = sc.next();
                    idioma = sc.next();
                    doblaje = sc.next();
                    subtitulos = sc.next();
                    listaseries.add(new series(nombre, duracion, categoria, temporadas, productora, idioma, doblaje, subtitulos));
                    listaseries.get(listaseries.size() - 1).setActores(temp);

                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                sc.close();
            }
        }//fin if
    }
}
