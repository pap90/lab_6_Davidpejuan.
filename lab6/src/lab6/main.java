/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author david
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_nesflis = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_nesflis = new javax.swing.JTree();
        mostrarnombre = new javax.swing.JLabel();
        mostrarduracion = new javax.swing.JLabel();
        mostrarcategoria = new javax.swing.JLabel();
        mostraractores = new javax.swing.JLabel();
        mostrardirector = new javax.swing.JLabel();
        mostrarproductora = new javax.swing.JLabel();
        mostraridioma = new javax.swing.JLabel();
        mostrardoblaje = new javax.swing.JLabel();
        mostrarsubtitulos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jd_agregarserie = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pf_contraseña = new javax.swing.JPasswordField();

        jLabel4.setText("nombre");

        jLabel5.setText("duracion");

        jLabel6.setText("categoria");

        jLabel7.setText("actores");

        jLabel8.setText("director");

        jLabel9.setText("productora");

        jLabel10.setText("idioma");

        jLabel11.setText("tiene doblaje");

        jLabel12.setText("tiene sub. en español");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("nesflis");
        jt_nesflis.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_nesflis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_nesflisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_nesflis);

        mostrarnombre.setText("jLabel13");

        mostrarduracion.setText("jLabel14");

        mostrarcategoria.setText("jLabel15");

        mostraractores.setText("jLabel16");

        mostrardirector.setText("jLabel17");

        mostrarproductora.setText("jLabel18");

        mostraridioma.setText("jLabel19");

        mostrardoblaje.setText("jLabel20");

        mostrarsubtitulos.setText("jLabel21");

        jButton2.setText("agregar pelicula");

        jButton3.setText("agregar serie");

        javax.swing.GroupLayout jd_nesflisLayout = new javax.swing.GroupLayout(jd_nesflis.getContentPane());
        jd_nesflis.getContentPane().setLayout(jd_nesflisLayout);
        jd_nesflisLayout.setHorizontalGroup(
            jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nesflisLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_nesflisLayout.createSequentialGroup()
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrardoblaje)
                            .addComponent(mostraridioma)
                            .addComponent(mostrarproductora)
                            .addComponent(mostrardirector)
                            .addComponent(mostraractores)
                            .addComponent(mostrarcategoria)
                            .addComponent(mostrarduracion)
                            .addComponent(mostrarnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jd_nesflisLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarsubtitulos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))))
        );
        jd_nesflisLayout.setVerticalGroup(
            jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nesflisLayout.createSequentialGroup()
                .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jd_nesflisLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_nesflisLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mostrarnombre))
                        .addGap(29, 29, 29)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mostrarduracion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(mostrarcategoria))
                        .addGap(30, 30, 30)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mostraractores))
                        .addGap(18, 18, 18)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mostrardirector))
                        .addGap(32, 32, 32)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(mostrarproductora))
                        .addGap(32, 32, 32)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(mostraridioma))
                        .addGap(27, 27, 27)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(mostrardoblaje))))
                .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_nesflisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(mostrarsubtitulos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_nesflisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jd_nesflisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addContainerGap())))
        );

        jLabel13.setText("nombre");

        jLabel14.setText("duracion");

        jLabel15.setText("categoria");

        jLabel16.setText("actores");

        jLabel17.setText("temporadas");

        jLabel18.setText("productora");

        jLabel19.setText("jLabel19");

        jLabel20.setText("doblaje");

        jLabel21.setText("jLabel21");

        jLabel22.setText("jLabel22");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        javax.swing.GroupLayout jd_agregarserieLayout = new javax.swing.GroupLayout(jd_agregarserie.getContentPane());
        jd_agregarserie.getContentPane().setLayout(jd_agregarserieLayout);
        jd_agregarserieLayout.setHorizontalGroup(
            jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarserieLayout.createSequentialGroup()
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(66, 66, 66)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(48, 48, 48)
                                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(jd_agregarserieLayout.createSequentialGroup()
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(64, 64, 64)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jd_agregarserieLayout.setVerticalGroup(
            jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarserieLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_agregarserieLayout.createSequentialGroup()
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel21)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel22)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jd_agregarserieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("usuario(nombre): ");

        jLabel2.setText("contraseña");

        jButton1.setText("log in");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setText("log in");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(pf_contraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(pf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        administrarseries as = new administrarseries("./series.txt");
        as.cargarArchivo();
        for (series s : as.getListaseries()) {
            System.out.println(s.getNombre());
        }
        administrarusuarios au = new administrarusuarios("./usuarios.txt");
        au.cargarArchivo();
        administrarpelis ap = new administrarpelis("./peliculas.txt");
        ap.cargarArchivo();
        if (ap.getListapeliculas().size() >= 0) {
            DefaultTreeModel modeloarbol = (DefaultTreeModel) jt_nesflis.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloarbol.getRoot();
            String nombre, categoria, director, compañia, idioma, doblaje, subtitulos, productora;
            int duracion, temporadas;
            ArrayList<String> actores = new ArrayList();
            for (peliculas p : ap.getListapeliculas()) {
                int centinela = -1;
                nombre = p.getNombre();
                categoria = p.getCategoria();
                director = p.getDirector();
                compañia = p.getCompañia();
                idioma = p.getIdioma();
                doblaje = p.getDoblaje();
                subtitulos = p.getSubtitulos();
                duracion = p.getDuracion();
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().equals("peliculas")) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(new peliculas(nombre, duracion, categoria, director, compañia, idioma, doblaje, subtitulos));
                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(n);
                        centinela = 1;
                    }
                }
                if (centinela == -1) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode("peliculas");
                    DefaultMutableTreeNode pe = new DefaultMutableTreeNode(new peliculas(nombre, duracion, categoria, director, compañia, idioma, doblaje, subtitulos));
                    n.add(pe);
                    raiz.add(n);
                }
            }
            for (series p : as.getListaseries()) {
                int centinela = -1;
                nombre = p.getNombre();
                categoria = p.getCategoria();
                productora = p.getProductora();
                idioma = p.getIdioma();
                doblaje = p.getDoblaje();
                subtitulos = p.getSubtitulos();
                duracion = p.getDuracion();
                temporadas = p.getTemporadas();
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().equals("series")) {
                        DefaultMutableTreeNode n = new DefaultMutableTreeNode(new series(nombre, duracion, categoria, temporadas, productora, idioma, doblaje, subtitulos));
                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(n);
                        centinela = 1;
                    }
                }
                if (centinela == -1) {
                    DefaultMutableTreeNode n = new DefaultMutableTreeNode("series");
                    DefaultMutableTreeNode pe = new DefaultMutableTreeNode(new series(nombre, duracion, categoria, temporadas, productora, idioma, doblaje, subtitulos));
                    n.add(pe);
                    raiz.add(n);
                }
            }
            modeloarbol.reload();
        }
        for (usuarios u : au.getListapersonas()) {
            if (tf_usuario.getText().equals(u.getNombre()) && pf_contraseña.getText().equals(u.getContraseña())) {
                actual = u;
                jd_nesflis.setModal(true);
                jd_nesflis.pack();
                jd_nesflis.setLocationRelativeTo(this);
                jd_nesflis.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jt_nesflisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_nesflisMouseClicked
        // TODO add your handling code here:
        Object v1 = jt_nesflis.getSelectionPath().getLastPathComponent();
        nodo_seleccionado = (DefaultMutableTreeNode) v1;
        if (nodo_seleccionado.getUserObject() instanceof peliculas) {
            pelicula_seleccionada = (peliculas) nodo_seleccionado.getUserObject();
            mostrarnombre.setText(pelicula_seleccionada.getNombre());
            mostraractores.setText(pelicula_seleccionada.getActores().toString());
            mostrarcategoria.setText(pelicula_seleccionada.getCategoria());
            mostrardirector.setText(pelicula_seleccionada.getDirector());
            mostrardoblaje.setText(pelicula_seleccionada.getDoblaje());
            mostrarduracion.setText(String.valueOf(pelicula_seleccionada.getDuracion()));
            mostraridioma.setText(pelicula_seleccionada.getIdioma());
            mostrarsubtitulos.setText(pelicula_seleccionada.getSubtitulos());
            mostrarproductora.setText(pelicula_seleccionada.getCompañia());
        }
        if (nodo_seleccionado.getUserObject() instanceof series) {
            serie_seleccionada=(series) nodo_seleccionado.getUserObject();
            mostrarnombre.setText(serie_seleccionada.getNombre());
            mostraractores.setText(serie_seleccionada.getActores().toString());
            mostrarcategoria.setText(serie_seleccionada.getCategoria());
            mostrardoblaje.setText(serie_seleccionada.getDoblaje());
            mostrarduracion.setText(String.valueOf(serie_seleccionada.getDuracion()));
            mostraridioma.setText(serie_seleccionada.getIdioma());
            mostrarsubtitulos.setText(serie_seleccionada.getSubtitulos());
            mostrarproductora.setText(serie_seleccionada.getProductora());
        }
        
    }//GEN-LAST:event_jt_nesflisMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JDialog jd_agregarserie;
    private javax.swing.JDialog jd_nesflis;
    private javax.swing.JTree jt_nesflis;
    private javax.swing.JLabel mostraractores;
    private javax.swing.JLabel mostrarcategoria;
    private javax.swing.JLabel mostrardirector;
    private javax.swing.JLabel mostrardoblaje;
    private javax.swing.JLabel mostrarduracion;
    private javax.swing.JLabel mostraridioma;
    private javax.swing.JLabel mostrarnombre;
    private javax.swing.JLabel mostrarproductora;
    private javax.swing.JLabel mostrarsubtitulos;
    private javax.swing.JPasswordField pf_contraseña;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
    usuarios actual = new usuarios();
    DefaultMutableTreeNode nodo_seleccionado;
    series serie_seleccionada;
    peliculas pelicula_seleccionada;
}
