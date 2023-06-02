package futbolxd.Ventanas;

import futbolxd.clases.ArchivoPlano;
import futbolxd.clases.Equipo;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EliminarEquipo extends javax.swing.JFrame {
    
    // importamos las clases que vamos a utilizar
    ArchivoPlano archivo = new ArchivoPlano();
    Equipo equipo = new Equipo();
    
    public EliminarEquipo() 
    {
        
        initComponents();
        SetImageLabel(Fondo, "src/futbolxd/imagenes/Fondo_Inicio.jpg");
        this.setLocationRelativeTo(this);
        
        // no pone visible la ventana de modificar
        varNombreEntrenador.setVisible(false);
        
        // llena la tabla de equipo
        LLenarTabla();
    }

        // funcion para ajustar el tamaño de la imagen que se llama por medio de la ruta
    public void SetImageLabel(JLabel labelname, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
    
      
    public void LLenarTabla() {
        ArrayList<Object[]> DatosTabla = archivo.leer();
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaDatos.getModel();
        modeloTabla.setNumRows(0);

        for (Object[] linea : DatosTabla) {
            modeloTabla.addRow(linea);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        varNombreEntrenador = new javax.swing.JInternalFrame();
        txt1 = new javax.swing.JLabel();
        varNombreEntre = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        BotonCambiar = new javax.swing.JButton();
        varNombreEqui = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        varCodigoEliminar = new javax.swing.JTextField();
        paneltexto = new javax.swing.JPanel();
        TEXT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BotonAtrasX = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        varNombreEntrenador.setBackground(new java.awt.Color(0, 102, 102));
        varNombreEntrenador.setForeground(new java.awt.Color(0, 51, 51));
        varNombreEntrenador.setVisible(true);

        txt1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txt1.setText("Nombre:");

        varNombreEntre.setBackground(new java.awt.Color(255, 255, 255));
        varNombreEntre.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 12)); // NOI18N
        varNombreEntre.setForeground(new java.awt.Color(0, 0, 0));

        txt2.setText("Entrenador");

        BotonCambiar.setBackground(new java.awt.Color(255, 255, 255));
        BotonCambiar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BotonCambiar.setForeground(new java.awt.Color(0, 51, 51));
        BotonCambiar.setText("CAMBIAR");
        BotonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarActionPerformed(evt);
            }
        });

        varNombreEqui.setBackground(new java.awt.Color(255, 255, 255));
        varNombreEqui.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 12)); // NOI18N
        varNombreEqui.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout varNombreEntrenadorLayout = new javax.swing.GroupLayout(varNombreEntrenador.getContentPane());
        varNombreEntrenador.getContentPane().setLayout(varNombreEntrenadorLayout);
        varNombreEntrenadorLayout.setHorizontalGroup(
            varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                        .addComponent(txt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                        .addComponent(txt2)
                        .addGap(26, 26, 26)
                        .addComponent(varNombreEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(211, Short.MAX_VALUE))))
            .addGroup(varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(varNombreEqui, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );
        varNombreEntrenadorLayout.setVerticalGroup(
            varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                .addGroup(varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txt1))
                    .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BotonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varNombreEntrenadorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varNombreEntre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2))
                .addGap(14, 14, 14))
            .addGroup(varNombreEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(varNombreEntrenadorLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(varNombreEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        fondo.add(varNombreEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 460, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo:");

        varCodigoEliminar.setBackground(new java.awt.Color(255, 255, 255));
        varCodigoEliminar.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 12)); // NOI18N
        varCodigoEliminar.setForeground(new java.awt.Color(0, 0, 0));
        varCodigoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varCodigoEliminarActionPerformed(evt);
            }
        });
        varCodigoEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varCodigoEliminarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(varCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 350, 70));

        paneltexto.setBackground(new java.awt.Color(255, 255, 255));
        paneltexto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paneltexto.setForeground(new java.awt.Color(255, 255, 255));
        paneltexto.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N

        TEXT.setBackground(new java.awt.Color(255, 255, 255));
        TEXT.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        TEXT.setForeground(new java.awt.Color(0, 51, 51));
        TEXT.setText("ELIMINAR O MODIFICA EQUIPO");
        TEXT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paneltextoLayout = new javax.swing.GroupLayout(paneltexto);
        paneltexto.setLayout(paneltextoLayout);
        paneltextoLayout.setHorizontalGroup(
            paneltextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltextoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(TEXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneltextoLayout.setVerticalGroup(
            paneltextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo.add(paneltexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 370, 60));

        TablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        TablaDatos.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaDatos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TablaDatos.setGridColor(new java.awt.Color(204, 204, 204));
        TablaDatos.setRowHeight(30);
        TablaDatos.setSelectionBackground(new java.awt.Color(0, 51, 51));
        TablaDatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaDatos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        TablaDatos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        TablaDatos.setShowGrid(true);
        jScrollPane1.setViewportView(TablaDatos);
        TablaDatos.getAccessibleContext().setAccessibleName("");

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 460, 220));

        BotonAtrasX.setBackground(new java.awt.Color(0, 51, 51));
        BotonAtrasX.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonAtrasX.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtrasX.setText("X");
        BotonAtrasX.setBorder(null);
        BotonAtrasX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasXActionPerformed(evt);
            }
        });
        fondo.add(BotonAtrasX, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 50, 40));

        BotonEliminar.setBackground(new java.awt.Color(0, 51, 51));
        BotonEliminar.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        fondo.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 110, 32));

        BotonModificar.setBackground(new java.awt.Color(0, 51, 51));
        BotonModificar.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 14)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        fondo.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 120, 32));
        fondo.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasXActionPerformed
        MenuUsuario atrasframe = new MenuUsuario();

        atrasframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasXActionPerformed

    private void varCodigoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varCodigoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varCodigoEliminarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // validar que el campo no este vacio    
        if (varCodigoEliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "el codigo esta vacio!");
        } 
        // sigue si no se comple la otra funcion
        else {
            boolean encontrado = archivo.eliminarEquipo(varCodigoEliminar.getText());
            if (encontrado) {
                LLenarTabla();
                JOptionPane.showMessageDialog(null, "Equipo eliminado");
                varCodigoEliminar.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
                varCodigoEliminar.setText("");
            }
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed
    
    
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        
        // validar que el campo no este vacio    
        if (varCodigoEliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "el codigo esta vacio!");
        } 
        // sigue si no se comple la otra funcion
        else {
            boolean buena = archivo.modificarEquipo(varCodigoEliminar.getText());
            if (buena) {
                varNombreEntrenador.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
                varCodigoEliminar.setText("");
                varNombreEntrenador.setVisible(false);
            }
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarActionPerformed
        if (varNombreEntre.getText().isEmpty()||varNombreEqui.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "el codigo esta vacio!");
        }
        else{
            // String a tipo int  
            int codigo = Integer.parseInt(varCodigoEliminar.getText());
            equipo.setNumeroRandom(codigo);
            
            equipo.setNombreEquipo(varNombreEqui.getText());
            equipo.setNombreEntrenador(varNombreEntre.getText());
            
            String fila = equipo.getNumeroRandom()+ ";" + equipo.getNombreEquipo() + ";" + equipo.getNombreEntrenador() + "\n";
            //le mandamos a la clase archivo la fila
            archivo.escribir(fila);
            
            LLenarTabla();
            
            // limpiar varCodigo
            varCodigoEliminar.setText("");
            
            
        } // else 
        
        // le quita lo visible al frame
        varNombreEntrenador.setVisible(false);
    }//GEN-LAST:event_BotonCambiarActionPerformed

    private void varCodigoEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varCodigoEliminarKeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_varCodigoEliminarKeyTyped

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
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtrasX;
    private javax.swing.JButton BotonCambiar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel TEXT;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneltexto;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JTextField varCodigoEliminar;
    private javax.swing.JTextField varNombreEntre;
    private javax.swing.JInternalFrame varNombreEntrenador;
    private javax.swing.JTextField varNombreEqui;
    // End of variables declaration//GEN-END:variables
}
