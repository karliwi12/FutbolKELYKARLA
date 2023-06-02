package futbolxd.Ventanas;

import Futbolxd.Ventanas.Inicio;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class EntrarUsuario extends javax.swing.JFrame {
    
    // datos de las contraseñas y el id 
    private String[] contraseñas = {"Copitoluna", "Thiago", "kyliam", "kely", "karla"};
    private int[] id = {1003674922, 26766119, 123456789, 12345, 987654321,1065865685};
    

    public EntrarUsuario() 
    {
        initComponents();
        
        // llamar la imagen del archivo, (ruta imagen y el label)
        SetImageLabel(FondoEntrarUsuario, "src/futbolxd/imagenes/Fondo_nose.jpg");
        SetImageLabel(ImagenPresentacion, "src/futbolxd/imagenes/Proyecto.png");
        this.setLocationRelativeTo(this);
        
    } // EntrarUsuario 

    // funcion para ajustar el tamaño de la imagen que se llama por medio de la ruta
    public void SetImageLabel(JLabel labelname, String root) {
        
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
        
    } // setImageLabel


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUsuario = new javax.swing.JPanel();
        panelUnete = new javax.swing.JPanel();
        BotonAtrasX = new javax.swing.JButton();
        ImagenPresentacion = new javax.swing.JLabel();
        txtAccesoFootball = new javax.swing.JLabel();
        txtClub = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        varID = new javax.swing.JTextField();
        BotonAcceso = new javax.swing.JButton();
        varContraseña = new javax.swing.JPasswordField();
        FondoEntrarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelUsuario.setMinimumSize(new java.awt.Dimension(750, 820));
        PanelUsuario.setPreferredSize(new java.awt.Dimension(710, 820));
        PanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUnete.setBackground(new java.awt.Color(255, 255, 255));
        panelUnete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        panelUnete.setForeground(new java.awt.Color(0, 0, 0));

        BotonAtrasX.setBackground(new java.awt.Color(0, 0, 0));
        BotonAtrasX.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BotonAtrasX.setForeground(new java.awt.Color(255, 255, 255));
        BotonAtrasX.setText("X");
        BotonAtrasX.setBorder(null);
        BotonAtrasX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasXActionPerformed(evt);
            }
        });

        txtAccesoFootball.setBackground(new java.awt.Color(0, 0, 0));
        txtAccesoFootball.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtAccesoFootball.setForeground(new java.awt.Color(0, 0, 0));
        txtAccesoFootball.setText("Acceso a Football");

        txtClub.setBackground(new java.awt.Color(0, 0, 0));
        txtClub.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        txtClub.setForeground(new java.awt.Color(0, 0, 0));
        txtClub.setText("Club");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");

        varID.setBackground(new java.awt.Color(255, 255, 255));
        varID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        varID.setForeground(new java.awt.Color(0, 0, 0));
        varID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varIDActionPerformed(evt);
            }
        });
        varID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varIDKeyTyped(evt);
            }
        });

        BotonAcceso.setBackground(new java.awt.Color(0, 102, 102));
        BotonAcceso.setForeground(new java.awt.Color(0, 0, 0));
        BotonAcceso.setText("Acceso");
        BotonAcceso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccesoActionPerformed(evt);
            }
        });

        varContraseña.setBackground(new java.awt.Color(255, 255, 255));
        varContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        varContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUneteLayout = new javax.swing.GroupLayout(panelUnete);
        panelUnete.setLayout(panelUneteLayout);
        panelUneteLayout.setHorizontalGroup(
            panelUneteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUneteLayout.createSequentialGroup()
                .addComponent(ImagenPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelUneteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUneteLayout.createSequentialGroup()
                        .addGroup(panelUneteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUneteLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panelUneteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(varID, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(varContraseña)))
                            .addGroup(panelUneteLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtAccesoFootball))
                            .addGroup(panelUneteLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(BotonAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelUneteLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(txtClub)))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUneteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAtrasX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        panelUneteLayout.setVerticalGroup(
            panelUneteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelUneteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BotonAtrasX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtAccesoFootball)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClub)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(varContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BotonAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        PanelUsuario.add(panelUnete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 670, 540));

        FondoEntrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        FondoEntrarUsuario.setDoubleBuffered(true);
        PanelUsuario.add(FondoEntrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasXActionPerformed
        // Abre la ventana de Inicio
        Inicio Inicioframe = new Inicio();
        Inicioframe.setVisible(true);
        
        // Cierra esta Ventana
        this.dispose();
    }//GEN-LAST:event_BotonAtrasXActionPerformed


    private void BotonAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccesoActionPerformed
        // cuando no ingresan nada en el campo 
        if (varContraseña.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "el codigo esta vacio!");
        } // isEmpty
        
        // si no sigue este codigo
        else {

            // String a tipo int  
            int codigo = Integer.parseInt(varID.getText());
            
            // booelan de falso 
            boolean ValidarId = false;
            boolean validarContraseña = false;

            // recorrer la array para validar el codigo
            for (int codigosLista : id) {
                if (codigo == codigosLista) {
                    ValidarId = true;
                    break;
                }
            } // for id 
            
            // recorre la Array para validar la Contraseña
            for (String password : contraseñas) 
            {
                if (varContraseña.getText().equals(password)) {
                    validarContraseña = true;
                    break;
                }
            } // for contraseñas

            // se cumplen las dos funciones y se cambia de ventana
            if (ValidarId && validarContraseña) 
            {
                JOptionPane.showMessageDialog(null, "Secion Inicada");
                
                // abre el menu usuario 
                MenuUsuario MenuUsuarioframe = new MenuUsuario();
                MenuUsuarioframe.setVisible(true);
                this.dispose(); // cierra esta ventana
                
            } // Validar Id && ValidarContraseña
                
            // muestra el mesaje mal contra & id
            else 
            {
                varContraseña.setText("");
                varID.setText("");
                JOptionPane.showMessageDialog(null, "mal ingresada la contraseña o codigo id ");
            } // else

        }// if (campo vacio)

    }//GEN-LAST:event_BotonAccesoActionPerformed

    private void varIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varIDKeyTyped
        
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        } // chater if 
    }//GEN-LAST:event_varIDKeyTyped

    private void varContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varContraseñaActionPerformed

    private void varIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varIDActionPerformed


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
            java.util.logging.Logger.getLogger(EntrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAcceso;
    private javax.swing.JButton BotonAtrasX;
    private javax.swing.JLabel FondoEntrarUsuario;
    private javax.swing.JLabel ImagenPresentacion;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelUnete;
    private javax.swing.JLabel txtAccesoFootball;
    private javax.swing.JLabel txtClub;
    private javax.swing.JPasswordField varContraseña;
    private javax.swing.JTextField varID;
    // End of variables declaration//GEN-END:variables
}
