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
public class administrarusuarios {
    private ArrayList<usuarios> listapersonas = new ArrayList();
    private File archivo = null;

    public administrarusuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuarios> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<usuarios> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        listapersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listapersonas.add(new usuarios(sc.next(), sc.nextInt(), sc.next()));
                }
            } catch (Exception ex) {
            } finally {
                sc.close();
            }
        }//fin if
    }
    
}
