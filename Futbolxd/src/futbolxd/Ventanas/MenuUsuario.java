package futbolxd.Ventanas;

import Futbolxd.Ventanas.Inicio;
import futbolxd.clases.ArchivoPlano;
import futbolxd.clases.Equipo;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuUsuario extends javax.swing.JFrame {

    // se llama el archivo
    ArchivoPLanoRegistro archi = new ArchivoPLanoRegistro();
    ArchivoPlano archivo = new ArchivoPlano();
    
    
    

    public MenuUsuario() {
        initComponents();

        // llamar la imagen del archivo, (ruta imagen y el label)
        SetImageLabel(FondoMenuIcono, "src/futbolxd/imagenes/Icono.png");
        SetImageLabel(FondoMenuMenu, "src/futbolxd/imagenes/Fondo_nose.jpg");
        SetImageLabel(Fondo2, "src/futbolxd/imagenes/Fondo_.jpg");
        SetImageLabel(Fondo4, "src/futbolxd/imagenes/Fondo_.jpg");
        SetImageLabel(Fondopj3, "src/futbolxd/imagenes/Fondo_Acceso.jpg");
        this.setLocationRelativeTo(this);
        
        // El panel de Menu se ponga visible 
        jp1.setVisible(true);
        
        // llenar los combos con la informacionde equipo
        llenarCOMBO();
        
        // llenar las tablas (Equipos) y (resultados)
        LLenarTablaResultados();
        LLenarTabla();
       
   

    }
    
    
    // llenar tabla de equipos con archivo plano
    public void LLenarTabla() 
    {
        ArrayList<Object[]> DatosTabla = archivo.leer();
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaDatos.getModel();
        modeloTabla.setNumRows(0);

        for (Object[] linea : DatosTabla) {
            modeloTabla.addRow(linea);

        }
    } // Llenar tabla
    
    
    // LLenar Tabla Resultados con el archivoplano de registro
    public void LLenarTablaResultados () {
        ArrayList<Object[]> DatosTabla = archi.leerDatos();
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaResultado.getModel();
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
        
    } // SetImageLabel


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PanelFondo = new javax.swing.JPanel();
        PanelFondoMenu = new javax.swing.JPanel();
        BotonCerrarSesion = new javax.swing.JButton();
        FondoIcono = new javax.swing.JPanel();
        FondoMenuIcono = new javax.swing.JLabel();
        panelGestionarEquipos = new javax.swing.JPanel();
        txtRegistrarEquipos = new javax.swing.JLabel();
        panelVerResultado = new javax.swing.JPanel();
        txtVerResultados = new javax.swing.JLabel();
        PanelRegistrarPartido = new javax.swing.JPanel();
        txtRegistrarPartido = new javax.swing.JLabel();
        panelMenuSECION = new javax.swing.JPanel();
        txtMenu = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        Panelcambio = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        FondoMenuMenu = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaResultado = new javax.swing.JTable();
        Fondo2 = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        panelfecha = new javax.swing.JPanel();
        txtdia = new javax.swing.JLabel();
        vardia = new javax.swing.JTextField();
        txtaño = new javax.swing.JLabel();
        varAño = new javax.swing.JTextField();
        txtmes = new javax.swing.JLabel();
        varMess = new javax.swing.JTextField();
        PanelEquipoRegistro = new javax.swing.JPanel();
        txtEquipo = new javax.swing.JLabel();
        txtLocal = new javax.swing.JLabel();
        txtGoles1 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        varGoles1 = new javax.swing.JTextField();
        txtEquipoVisitante = new javax.swing.JLabel();
        combo3 = new javax.swing.JComboBox<>();
        varGoles2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        PanelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fondopj3 = new javax.swing.JLabel();
        jp4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BotonAgregarEquipo = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        Fondo4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusTraversalPolicyProvider(true);

        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondoMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelFondoMenu.setPreferredSize(new java.awt.Dimension(260, 820));

        BotonCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        BotonCerrarSesion.setText("Cerrar Sesion");
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        FondoMenuIcono.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FondoIconoLayout = new javax.swing.GroupLayout(FondoIcono);
        FondoIcono.setLayout(FondoIconoLayout);
        FondoIconoLayout.setHorizontalGroup(
            FondoIconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoMenuIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        FondoIconoLayout.setVerticalGroup(
            FondoIconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoMenuIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );

        panelGestionarEquipos.setBackground(new java.awt.Color(57, 88, 26));
        panelGestionarEquipos.setForeground(new java.awt.Color(255, 255, 255));
        panelGestionarEquipos.setToolTipText("GESTIONAR EQUIPOS");
        panelGestionarEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGestionarEquiposMouseClicked(evt);
            }
        });

        txtRegistrarEquipos.setBackground(new java.awt.Color(255, 255, 255));
        txtRegistrarEquipos.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtRegistrarEquipos.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistrarEquipos.setText("GESTIONAR EQUIPOS");
        txtRegistrarEquipos.setFocusable(false);
        txtRegistrarEquipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelGestionarEquiposLayout = new javax.swing.GroupLayout(panelGestionarEquipos);
        panelGestionarEquipos.setLayout(panelGestionarEquiposLayout);
        panelGestionarEquiposLayout.setHorizontalGroup(
            panelGestionarEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionarEquiposLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtRegistrarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGestionarEquiposLayout.setVerticalGroup(
            panelGestionarEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionarEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegistrarEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelVerResultado.setBackground(new java.awt.Color(57, 88, 26));
        panelVerResultado.setForeground(new java.awt.Color(255, 255, 255));
        panelVerResultado.setToolTipText("VER RESULTADOS");
        panelVerResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVerResultadoMouseClicked(evt);
            }
        });

        txtVerResultados.setBackground(new java.awt.Color(255, 255, 255));
        txtVerResultados.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtVerResultados.setForeground(new java.awt.Color(255, 255, 255));
        txtVerResultados.setText("VER RESULTADOS");
        txtVerResultados.setFocusable(false);
        txtVerResultados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelVerResultadoLayout = new javax.swing.GroupLayout(panelVerResultado);
        panelVerResultado.setLayout(panelVerResultadoLayout);
        panelVerResultadoLayout.setHorizontalGroup(
            panelVerResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVerResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panelVerResultadoLayout.setVerticalGroup(
            panelVerResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVerResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVerResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelRegistrarPartido.setBackground(new java.awt.Color(57, 88, 26));
        PanelRegistrarPartido.setForeground(new java.awt.Color(255, 255, 255));
        PanelRegistrarPartido.setToolTipText("REGISTRAR PARTIDOS");
        PanelRegistrarPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRegistrarPartidoMouseClicked(evt);
            }
        });

        txtRegistrarPartido.setBackground(new java.awt.Color(255, 255, 255));
        txtRegistrarPartido.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtRegistrarPartido.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistrarPartido.setText("REGISTRAR PARTIDO");
        txtRegistrarPartido.setFocusable(false);
        txtRegistrarPartido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelRegistrarPartidoLayout = new javax.swing.GroupLayout(PanelRegistrarPartido);
        PanelRegistrarPartido.setLayout(PanelRegistrarPartidoLayout);
        PanelRegistrarPartidoLayout.setHorizontalGroup(
            PanelRegistrarPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarPartidoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtRegistrarPartido)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PanelRegistrarPartidoLayout.setVerticalGroup(
            PanelRegistrarPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarPartidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRegistrarPartido, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMenuSECION.setBackground(new java.awt.Color(57, 88, 26));
        panelMenuSECION.setForeground(new java.awt.Color(255, 255, 255));
        panelMenuSECION.setToolTipText("MENU");
        panelMenuSECION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMenuSECIONMouseClicked(evt);
            }
        });

        txtMenu.setBackground(new java.awt.Color(255, 255, 255));
        txtMenu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtMenu.setText("MENU");
        txtMenu.setFocusable(false);
        txtMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMenuSECIONLayout = new javax.swing.GroupLayout(panelMenuSECION);
        panelMenuSECION.setLayout(panelMenuSECIONLayout);
        panelMenuSECIONLayout.setHorizontalGroup(
            panelMenuSECIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuSECIONLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuSECIONLayout.setVerticalGroup(
            panelMenuSECIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuSECIONLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoMenuLayout = new javax.swing.GroupLayout(PanelFondoMenu);
        PanelFondoMenu.setLayout(PanelFondoMenuLayout);
        PanelFondoMenuLayout.setHorizontalGroup(
            PanelFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuSECION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                .addComponent(PanelRegistrarPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelGestionarEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVerResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                .addGroup(PanelFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(FondoIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFondoMenuLayout.setVerticalGroup(
            PanelFondoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salir)
                .addGap(31, 31, 31)
                .addComponent(FondoIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(panelMenuSECION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(panelGestionarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelVerResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelRegistrarPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(BotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        panelGestionarEquipos.getAccessibleContext().setAccessibleDescription("REGISTRAR EQUIPOS");
        panelVerResultado.getAccessibleContext().setAccessibleDescription("VER PASRTIDOS");
        panelMenuSECION.getAccessibleContext().setAccessibleDescription("Menu");

        PanelFondo.add(PanelFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 820));

        Panelcambio.setBackground(new java.awt.Color(255, 255, 255));

        jp1.setBackground(new java.awt.Color(204, 255, 255));
        jp1.setMinimumSize(new java.awt.Dimension(490, 820));
        jp1.setName(""); // NOI18N

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoMenuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoMenuMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jp2.setBackground(new java.awt.Color(0, 51, 51));
        jp2.setMinimumSize(new java.awt.Dimension(478, 820));
        jp2.setPreferredSize(new java.awt.Dimension(478, 820));
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Resultados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jp2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 400, 80));

        TablaResultado.setBackground(new java.awt.Color(255, 255, 255));
        TablaResultado.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 14)); // NOI18N
        TablaResultado.setForeground(new java.awt.Color(0, 0, 0));
        TablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Partidos"
            }
        ));
        TablaResultado.setSelectionBackground(new java.awt.Color(0, 51, 51));
        TablaResultado.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaResultado.setShowGrid(false);
        jScrollPane3.setViewportView(TablaResultado);

        jp2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 410, 290));

        Fondo2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo2.setFont(new java.awt.Font("Microsoft JhengHei UI", 2, 14)); // NOI18N
        Fondo2.setForeground(new java.awt.Color(0, 0, 0));
        jp2.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 860));

        jp3.setBackground(new java.awt.Color(31, 46, 22));
        jp3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp3.setMinimumSize(new java.awt.Dimension(490, 820));
        jp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfecha.setBackground(new java.awt.Color(255, 255, 255));
        panelfecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelfecha.setForeground(new java.awt.Color(0, 0, 0));

        txtdia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtdia.setForeground(new java.awt.Color(0, 0, 0));
        txtdia.setText("DIA");

        vardia.setBackground(new java.awt.Color(255, 255, 255));
        vardia.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        vardia.setForeground(new java.awt.Color(0, 0, 0));
        vardia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vardiaKeyTyped(evt);
            }
        });

        txtaño.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtaño.setForeground(new java.awt.Color(0, 0, 0));
        txtaño.setText("AÑO");

        varAño.setBackground(new java.awt.Color(255, 255, 255));
        varAño.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        varAño.setForeground(new java.awt.Color(0, 0, 0));
        varAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varAñoKeyTyped(evt);
            }
        });

        txtmes.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtmes.setForeground(new java.awt.Color(0, 0, 0));
        txtmes.setText("MES");

        varMess.setBackground(new java.awt.Color(255, 255, 255));
        varMess.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        varMess.setForeground(new java.awt.Color(0, 0, 0));
        varMess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varMessKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelfechaLayout = new javax.swing.GroupLayout(panelfecha);
        panelfecha.setLayout(panelfechaLayout);
        panelfechaLayout.setHorizontalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(txtaño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(varAño, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(txtdia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vardia))
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(txtmes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varMess, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdia))
                .addGap(29, 29, 29)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmes)
                    .addComponent(varMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaño))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jp3.add(panelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 220));

        PanelEquipoRegistro.setBackground(new java.awt.Color(255, 255, 255));
        PanelEquipoRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelEquipoRegistro.setForeground(new java.awt.Color(0, 0, 0));

        txtEquipo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtEquipo.setForeground(new java.awt.Color(0, 0, 0));
        txtEquipo.setText("Equipo");

        txtLocal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        txtLocal.setForeground(new java.awt.Color(0, 0, 0));
        txtLocal.setText("Local");

        txtGoles1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtGoles1.setForeground(new java.awt.Color(0, 0, 0));
        txtGoles1.setText("GOLES");

        combo1.setBackground(new java.awt.Color(255, 204, 204));
        combo1.setForeground(new java.awt.Color(0, 0, 0));

        varGoles1.setBackground(new java.awt.Color(255, 204, 204));
        varGoles1.setForeground(new java.awt.Color(0, 0, 0));
        varGoles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varGoles1KeyTyped(evt);
            }
        });

        txtEquipoVisitante.setBackground(new java.awt.Color(0, 0, 0));
        txtEquipoVisitante.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        txtEquipoVisitante.setForeground(new java.awt.Color(0, 0, 0));
        txtEquipoVisitante.setText("EQUIPO VISITANTE");

        combo3.setBackground(new java.awt.Color(0, 0, 0));
        combo3.setForeground(new java.awt.Color(255, 255, 255));

        varGoles2.setBackground(new java.awt.Color(0, 0, 0));
        varGoles2.setForeground(new java.awt.Color(255, 255, 255));
        varGoles2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                varGoles2KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("GOLES");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Equipo");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("VS");

        javax.swing.GroupLayout PanelEquipoRegistroLayout = new javax.swing.GroupLayout(PanelEquipoRegistro);
        PanelEquipoRegistro.setLayout(PanelEquipoRegistroLayout);
        PanelEquipoRegistroLayout.setHorizontalGroup(
            PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEquipoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEquipoRegistroLayout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipoRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipoRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipoRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(varGoles2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipoRegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtGoles1)
                .addGap(18, 18, 18)
                .addComponent(varGoles1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEquipoVisitante)
                .addGap(33, 33, 33))
            .addGroup(PanelEquipoRegistroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEquipoRegistroLayout.setVerticalGroup(
            PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEquipoRegistroLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(txtLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEquipoRegistroLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipoVisitante, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varGoles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(16, 16, 16))
                    .addGroup(PanelEquipoRegistroLayout.createSequentialGroup()
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipo)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEquipoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGoles1)
                            .addComponent(varGoles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jp3.add(PanelEquipoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 430, 230));

        BotonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        jp3.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 100, 40));

        BotonAtras.setBackground(new java.awt.Color(255, 255, 255));
        BotonAtras.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 0));
        BotonAtras.setText("X");
        jp3.add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 50, 40));

        PanelRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrar Partido");

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jp3.add(PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 260, 70));
        jp3.add(Fondopj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 820));

        jp4.setBackground(new java.awt.Color(204, 204, 204));
        jp4.setMinimumSize(new java.awt.Dimension(490, 820));
        jp4.setPreferredSize(new java.awt.Dimension(490, 820));
        jp4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setToolTipText("EQUIPO");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("EQUIPOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 320, 60));
        jPanel3.getAccessibleContext().setAccessibleName("");

        TablaDatos.setBackground(new java.awt.Color(255, 255, 255));
        TablaDatos.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 14)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Equipo", "Entrenador"
            }
        ));
        TablaDatos.setAutoscrolls(false);
        TablaDatos.setRowHeight(30);
        TablaDatos.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(TablaDatos);

        jp4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 390, 480));

        BotonAgregarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregarEquipo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        BotonAgregarEquipo.setForeground(new java.awt.Color(0, 51, 51));
        BotonAgregarEquipo.setText("Agregar Equipo");
        BotonAgregarEquipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarEquipoActionPerformed(evt);
            }
        });
        jp4.add(BotonAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 700, 130, 50));

        BotonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 51, 51));
        BotonEliminar.setText("Eliminar Y Modificar");
        BotonEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jp4.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 160, 50));

        Fondo4.setBackground(new java.awt.Color(255, 255, 255));
        Fondo4.setForeground(new java.awt.Color(255, 255, 255));
        jp4.add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 820));

        javax.swing.GroupLayout PanelcambioLayout = new javax.swing.GroupLayout(Panelcambio);
        Panelcambio.setLayout(PanelcambioLayout);
        PanelcambioLayout.setHorizontalGroup(
            PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelcambioLayout.setVerticalGroup(
            PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelcambioLayout.createSequentialGroup()
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelcambioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jp1.getAccessibleContext().setAccessibleDescription("MENU");
        jp2.getAccessibleContext().setAccessibleDescription("VER RESULTADOS");
        jp3.getAccessibleContext().setAccessibleDescription("REGISTRAR PARTIDO");
        jp4.getAccessibleContext().setAccessibleDescription("GESTIONAR EQUIPOS");

        PanelFondo.add(Panelcambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 490, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        // abre la ventana de Inicio
        Inicio inicioframe = new Inicio();
        inicioframe.setVisible(true);

        // cierra esta ventana
        this.dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void panelGestionarEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGestionarEquiposMouseClicked

        // poner visible el panel (true) ocultar los demas (false) Muestra GestionarEquipo
        jp4.setVisible(true);
        jp3.setVisible(false);
        jp2.setVisible(false);
        jp1.setVisible(false);

    }//GEN-LAST:event_panelGestionarEquiposMouseClicked

    private void panelVerResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVerResultadoMouseClicked

        // poner visible el panel (true) ocultar los demas (false) Muestra VerResultados
        jp2.setVisible(true);
        jp3.setVisible(false);
        jp1.setVisible(false);
        jp4.setVisible(false);
        
        LLenarTablaResultados();
        
    }//GEN-LAST:event_panelVerResultadoMouseClicked

    private void PanelRegistrarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegistrarPartidoMouseClicked
        
        // poner visible el panel (true) ocultar los demas (false) muestra Registrar partido
        jp3.setVisible(true);
        jp2.setVisible(false);
        jp1.setVisible(false);
        jp4.setVisible(false);
        
    }//GEN-LAST:event_PanelRegistrarPartidoMouseClicked

    private void panelMenuSECIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuSECIONMouseClicked
        
        // poner visible el panel (true) ocultar los demas (false) muestra el menu
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        
    }//GEN-LAST:event_panelMenuSECIONMouseClicked

    private void BotonAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarEquipoActionPerformed
        
        // abre la ventana de agregarEquipo
        AgregarEquipo agregharAquipoframe = new AgregarEquipo();
        agregharAquipoframe.setVisible(true);
        
        // cierra esta ventana
        this.dispose();
        
    }//GEN-LAST:event_BotonAgregarEquipoActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // abre EliminarEquipo
        EliminarEquipo eliminarframe = new EliminarEquipo();
        eliminarframe.setVisible(true);
        
        // cierra esta ventana
        this.dispose();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // agregar partido
        Equipo equipo = new Equipo();
        if (varAño.getText().isEmpty()||vardia.getText().isEmpty()||
            varMess.getText().isEmpty()||varGoles1.getText().isEmpty()||
            varGoles2.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Formulario Vacio");
        } // isEmpty
        
        else {

            
            String primerEquipo = (combo1.getSelectedItem().toString());
            
            String SegundoEquipo = (combo3.getSelectedItem().toString());
            
            if (!String.valueOf(primerEquipo).equals(SegundoEquipo)){
           
            // pasa string a int
            
            int años = Integer.parseInt(varAño.getText());
            equipo.setAño(años);
            
            int dias = Integer.parseInt(vardia.getText());
            equipo.setAño(dias);
            
            int meses = Integer.parseInt(varMess.getText());
            equipo.setAño(meses);
            
            int goles1 = Integer.parseInt(varGoles1.getText());
            equipo.setGoles1(goles1);

            int goles2 = Integer.parseInt(varGoles2.getText());
            equipo.setGoles2(goles2);
            
            // para validar que se ponga la informacion bien de los dias
            if ( años >= 1000 && dias >= 1 && meses >= 1 && meses <= 12 && dias <= 31  ){
                
                if (goles1 >=  0 && goles1 <= 30 && goles2 >= 0 && goles2 <= 30  ){
                    // vaciar los JtextField
                    varGoles1.setText("");
                    vardia.setText("");
                    varAño.setText("");
                    varMess.setText("");
                    varGoles2.setText("");

                    // Enviar la informacion al archivo plano 
                    String linea = (dias + " / " + meses + " / " + años + "  " + primerEquipo + " (" + goles1 + ") " + " VS " + " (" + goles2 + ") " + SegundoEquipo + "   \n");
                    JOptionPane.showMessageDialog(null, "Partido Agregado!");
                    archi.escribir(linea);
                } // goles
                else{
                    JOptionPane.showMessageDialog(null, "los goles son mayor a 0");
                }
            
            }
            else{
                JOptionPane.showMessageDialog(null, "las fechas son incorrectas!");
            }
            
            }// if 
            else{
                JOptionPane.showMessageDialog(null, "Equipos deben ser diferentes");
            } // else nn
        } // else 
            
        
        // llena la tabla de resultado luego de ejecutarse todo
        LLenarTablaResultados();
        

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void varGoles2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varGoles2KeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_varGoles2KeyTyped

    private void varGoles1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varGoles1KeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_varGoles1KeyTyped

    private void vardiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vardiaKeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_vardiaKeyTyped

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void varMessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varMessKeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_varMessKeyTyped

    private void varAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_varAñoKeyTyped
        // solo pueda ingresar numeros 
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) 
        {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showConfirmDialog(null, "Ingresa solo números. ");
        }
    }//GEN-LAST:event_varAñoKeyTyped

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    
    
    
    // registrar partdio 
    public void llenarCOMBO() 
    {
         // pide la informacion de archivo para array
        ArrayList<Object[]> datosTabla = archivo.leer();
        combo1.removeAllItems();
        combo3.removeAllItems();
        for (Object[] fila : datosTabla)
        {   
            if (!String.valueOf(fila[1]).equals(combo3)){
            // llena los combos con la array del archivoplano
            String df = String.valueOf(fila[1]);
            combo1.addItem(df);
            combo3.addItem(df);
            }
        }

        System.out.println("" + archivo);
    } // llenarCombo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarEquipo;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JPanel FondoIcono;
    private javax.swing.JLabel FondoMenuIcono;
    private javax.swing.JLabel FondoMenuMenu;
    private javax.swing.JLabel Fondopj3;
    private javax.swing.JPanel PanelEquipoRegistro;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelFondoMenu;
    private javax.swing.JPanel PanelRegistrarPartido;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JPanel Panelcambio;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaResultado;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel panelGestionarEquipos;
    private javax.swing.JPanel panelMenuSECION;
    private javax.swing.JPanel panelVerResultado;
    private javax.swing.JPanel panelfecha;
    private javax.swing.JButton salir;
    private javax.swing.JLabel txtEquipo;
    private javax.swing.JLabel txtEquipoVisitante;
    private javax.swing.JLabel txtGoles1;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtRegistrarEquipos;
    private javax.swing.JLabel txtRegistrarPartido;
    private javax.swing.JLabel txtVerResultados;
    private javax.swing.JLabel txtaño;
    private javax.swing.JLabel txtdia;
    private javax.swing.JLabel txtmes;
    private javax.swing.JTextField varAño;
    private javax.swing.JTextField varGoles1;
    private javax.swing.JTextField varGoles2;
    private javax.swing.JTextField varMess;
    private javax.swing.JTextField vardia;
    // End of variables declaration//GEN-END:variables
}
