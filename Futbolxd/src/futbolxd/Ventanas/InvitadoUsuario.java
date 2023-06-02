
package futbolxd.Ventanas;

import Futbolxd.Ventanas.Inicio;
import futbolxd.clases.ArchivoPlano;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class InvitadoUsuario extends javax.swing.JFrame {
    
     // se llama el archivo
    ArchivoPLanoRegistro archi = new ArchivoPLanoRegistro();
    ArchivoPlano archivo = new ArchivoPlano();
    
    public InvitadoUsuario() {
        initComponents();
        Resultados.setVisible(false);
        Equipos.setVisible(false);
        
        SetImageLabel(Fondo, "src/futbolxd/imagenes/Fondo_Inicio.jpg");
        SetImageLabel(FondoResultados, "src/futbolxd/imagenes/Fondo_.jpg");
        SetImageLabel(FondoEquipos, "src/futbolxd/imagenes/Fondo_.jpg");
        this.setLocationRelativeTo(this);
        
        // llenar las tablas (Equipos) y (resultados)
        LLenarTablaResultados();
        LLenarTabla();
    }
    
        public void LLenarTabla() 
    {
        ArrayList<Object[]> DatosTabla = archivo.leer();
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaEquipo.getModel();
        modeloTabla.setNumRows(0);

        for (Object[] linea : DatosTabla) {
            modeloTabla.addRow(linea);

        }
    } // Llenar tabla
    
        
        
    // LLenar Tabla Resultados con el archivoplano de registro
    public void LLenarTablaResultados () {
        ArrayList<Object[]> DatosTabla = archi.leerDatos();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaResultados.getModel();
        modeloTabla.setNumRows(0);

        for (Object[] linea : DatosTabla) {
            modeloTabla.addRow(linea);

        }
    } // LLenarTablaResultados
        
    // funcion para ajustar el tamaño de la imagen que se llama por medio de la ruta
    public void SetImageLabel(JLabel labelname, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonReusltados = new javax.swing.JButton();
        Resultados = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        BotonCerrarResultados = new javax.swing.JButton();
        FondoResultados = new javax.swing.JLabel();
        BotonEquipos = new javax.swing.JButton();
        Equipos = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEquipo = new javax.swing.JTable();
        BotonCerrarEquipo = new javax.swing.JButton();
        FondoEquipos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonReusltados.setBackground(new java.awt.Color(255, 255, 255));
        botonReusltados.setFont(new java.awt.Font("Microsoft JhengHei UI", 3, 12)); // NOI18N
        botonReusltados.setForeground(new java.awt.Color(0, 0, 0));
        botonReusltados.setText("Resultados");
        botonReusltados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReusltadosActionPerformed(evt);
            }
        });
        jPanel1.add(botonReusltados, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 24, 100, 30));

        Resultados.setBackground(new java.awt.Color(255, 255, 255));
        Resultados.setForeground(new java.awt.Color(0, 51, 51));
        Resultados.setVisible(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaResultados.setBackground(new java.awt.Color(255, 255, 255));
        tablaResultados.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 14)); // NOI18N
        tablaResultados.setForeground(new java.awt.Color(0, 0, 0));
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "PARTIDOS"
            }
        ));
        tablaResultados.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(tablaResultados);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        BotonCerrarResultados.setBackground(new java.awt.Color(0, 0, 0));
        BotonCerrarResultados.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BotonCerrarResultados.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarResultados.setText("Cerrar");
        BotonCerrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarResultadosActionPerformed(evt);
            }
        });
        jPanel4.add(BotonCerrarResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 110, 40));
        jPanel4.add(FondoResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 640));

        javax.swing.GroupLayout ResultadosLayout = new javax.swing.GroupLayout(Resultados.getContentPane());
        Resultados.getContentPane().setLayout(ResultadosLayout);
        ResultadosLayout.setHorizontalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 608, Short.MAX_VALUE)
        );
        ResultadosLayout.setVerticalGroup(
            ResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadosLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 620, 640));

        BotonEquipos.setBackground(new java.awt.Color(255, 255, 255));
        BotonEquipos.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        BotonEquipos.setForeground(new java.awt.Color(0, 0, 0));
        BotonEquipos.setText("Equipos");
        BotonEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEquiposActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 90, 30));

        Equipos.setForeground(new java.awt.Color(0, 51, 51));
        Equipos.setVisible(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaEquipo.setBackground(new java.awt.Color(255, 255, 255));
        TablaEquipo.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        TablaEquipo.setForeground(new java.awt.Color(0, 0, 0));
        TablaEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Equipo", "Entrenador"
            }
        ));
        TablaEquipo.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(TablaEquipo);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        BotonCerrarEquipo.setBackground(new java.awt.Color(0, 0, 0));
        BotonCerrarEquipo.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        BotonCerrarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarEquipo.setText("Cerrar");
        BotonCerrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarEquipoActionPerformed(evt);
            }
        });
        jPanel5.add(BotonCerrarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 90, 40));
        jPanel5.add(FondoEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 610));

        javax.swing.GroupLayout EquiposLayout = new javax.swing.GroupLayout(Equipos.getContentPane());
        Equipos.getContentPane().setLayout(EquiposLayout);
        EquiposLayout.setHorizontalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EquiposLayout.setVerticalGroup(
            EquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 40));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReusltadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReusltadosActionPerformed
        Resultados.setVisible(true);
        Equipos.setVisible(false);
    }//GEN-LAST:event_botonReusltadosActionPerformed

    private void BotonEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEquiposActionPerformed
        Equipos.setVisible(true);
        Resultados.setVisible(false);
    }//GEN-LAST:event_BotonEquiposActionPerformed

    private void BotonCerrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarEquipoActionPerformed
         Equipos.setVisible(false);
    }//GEN-LAST:event_BotonCerrarEquipoActionPerformed

    private void BotonCerrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarResultadosActionPerformed
        Resultados.setVisible(false);
    }//GEN-LAST:event_BotonCerrarResultadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Inicio inicioframe = new Inicio();
       inicioframe.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InvitadoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvitadoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvitadoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvitadoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvitadoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarEquipo;
    private javax.swing.JButton BotonCerrarResultados;
    private javax.swing.JButton BotonEquipos;
    private javax.swing.JInternalFrame Equipos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoEquipos;
    private javax.swing.JLabel FondoResultados;
    private javax.swing.JInternalFrame Resultados;
    private javax.swing.JTable TablaEquipo;
    private javax.swing.JButton botonReusltados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
