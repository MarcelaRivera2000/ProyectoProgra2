package proyectoprogra.pkg2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        Ficheros_Binarios f = new Ficheros_Binarios();

        try {
            f.escribir(usuarios);
        } catch (IOException ex) {
        }
        initComponents();
        this.setLocationRelativeTo(null);
        tipo_usuarioR.addItem("  --------------------  ");
        tipo_usuarioR.addItem("Administrador");
        tipo_usuarioR.addItem("Ofertador");
        tipo_usuarioR.addItem("Cliente");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        no_R = new javax.swing.JTextField();
        ni_R = new javax.swing.JTextField();
        pa_R = new javax.swing.JTextField();
        cor_R = new javax.swing.JTextField();
        co_R = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fe_R = new datechooser.beans.DateChooserCombo();
        tipo_usuario = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        P_Pri_Ofertador = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_membrecias = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_C_ofertador = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jT_Empresas = new javax.swing.JTable();
        Restablecer = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Perfil_U = new javax.swing.JFrame();
        N_Perfil = new javax.swing.JLabel();
        Cu_Perfil = new javax.swing.JLabel();
        U_Perfil = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Co_Perfil = new javax.swing.JLabel();
        P_Perfil = new javax.swing.JLabel();
        T_Perfil = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        VendedorDirecto = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jT_C_ofertador1 = new javax.swing.JTable();
        Subastador = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Publicidad = new javax.swing.JFrame();
        Ti_Publicidad = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Des_Publicidad = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jT_Publicidad = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jT_C_ofertador3 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        Cliente = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        Busqueda = new javax.swing.JFrame();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        Membrecias_Ofertadores = new javax.swing.JFrame();
        jButton16 = new javax.swing.JButton();
        jCheckBox_Directo = new javax.swing.JCheckBox();
        jCheckBox_Subastador = new javax.swing.JCheckBox();
        jCheckBox_Rentador = new javax.swing.JCheckBox();
        jCheckBox_Carwash = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Agregar_Carro_OF = new javax.swing.JFrame();
        Ag_Tranmision = new javax.swing.JTextField();
        Ag_tipo = new javax.swing.JTextField();
        Ag_ano = new javax.swing.JTextField();
        Ag_Cilindraje = new javax.swing.JTextField();
        Ag_modelo = new javax.swing.JTextField();
        Ag_marca = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jT_C_ofertador2 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        Agregar_Admins = new javax.swing.JFrame();
        jScrollPane16 = new javax.swing.JScrollPane();
        UsuariosAdmin_jt = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        admin_nombre = new javax.swing.JTextField();
        admin_usuario = new javax.swing.JTextField();
        admin_pais = new javax.swing.JTextField();
        admin_cumple = new datechooser.beans.DateChooserCombo();
        admin_correo = new javax.swing.JTextField();
        admin_contra = new javax.swing.JPasswordField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        P_Pri_Administrador = new javax.swing.JFrame();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        contra_L = new javax.swing.JPasswordField();
        usuario_L = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tipo_usuarioR = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nickname: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Pais o region:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Cumpleaños:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Correo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Ubicacion: ");

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fe_R.setCalendarPreferredSize(new java.awt.Dimension(510, 360));
        fe_R.setFormat(2);
        fe_R.setLocale(new java.util.Locale("es", "ES", ""));

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de usuario:");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ni_R)
                            .addComponent(no_R)
                            .addComponent(co_R, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(pa_R)
                            .addComponent(cor_R)
                            .addComponent(fe_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_R, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ni_R, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(co_R, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pa_R, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fe_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cor_R, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(71, 71, 71)
                .addComponent(jButton3)
                .addGap(25, 25, 25))
        );

        jButton7.setText("Perfil");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jT_membrecias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo ", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jT_membrecias);

        jT_C_ofertador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Año", "Cilindraje", "Tipo", "Transmicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jT_C_ofertador);
        if (jT_C_ofertador.getColumnModel().getColumnCount() > 0) {
            jT_C_ofertador.getColumnModel().getColumn(3).setHeaderValue("Cilindraje");
            jT_C_ofertador.getColumnModel().getColumn(4).setHeaderValue("Tipo");
            jT_C_ofertador.getColumnModel().getColumn(5).setResizable(false);
            jT_C_ofertador.getColumnModel().getColumn(5).setHeaderValue("Transmicion");
        }

        jLabel12.setText("Membrecias");

        jLabel14.setText("Carros");

        jLabel25.setText("NOMBRE EMPRESA SEPA PUTAS CUAL ES XD");

        jButton13.setText("Agregar publicidad");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton18.setText("Agregar Carro");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jT_Empresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logo", "Nombre", "Tipo", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jT_Empresas);

        javax.swing.GroupLayout P_Pri_OfertadorLayout = new javax.swing.GroupLayout(P_Pri_Ofertador.getContentPane());
        P_Pri_Ofertador.getContentPane().setLayout(P_Pri_OfertadorLayout);
        P_Pri_OfertadorLayout.setHorizontalGroup(
            P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_Pri_OfertadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Pri_OfertadorLayout.createSequentialGroup()
                        .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(16, 16, 16))
                    .addGroup(P_Pri_OfertadorLayout.createSequentialGroup()
                        .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(jLabel14)
                            .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13))
                        .addGap(101, 101, 101))))
        );
        P_Pri_OfertadorLayout.setVerticalGroup(
            P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Pri_OfertadorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel25)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(P_Pri_OfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_Pri_OfertadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_Pri_OfertadorLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addGap(32, 32, 32))
        );

        jButton6.setText("Restablecer");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setText("Ingresa una dirección de correo electrónico a la que ");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setText("se te pueda enviarte un código de verificación.");

        javax.swing.GroupLayout RestablecerLayout = new javax.swing.GroupLayout(Restablecer.getContentPane());
        Restablecer.getContentPane().setLayout(RestablecerLayout);
        RestablecerLayout.setHorizontalGroup(
            RestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestablecerLayout.createSequentialGroup()
                .addGap(0, 189, Short.MAX_VALUE)
                .addGroup(RestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addGroup(RestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        RestablecerLayout.setVerticalGroup(
            RestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestablecerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel17.setText("Nombre: ");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel18.setText("Usuario: ");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel19.setText("Pais:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel20.setText("Cumpleaños:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel21.setText("Correo:");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel22.setText("Tipo de usuario:");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel23.setText("Ubicacion:");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("EDITAR INFORMACION PERSONAL");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jButton17.setText("Volver");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Perfil_ULayout = new javax.swing.GroupLayout(Perfil_U.getContentPane());
        Perfil_U.getContentPane().setLayout(Perfil_ULayout);
        Perfil_ULayout.setHorizontalGroup(
            Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Perfil_ULayout.createSequentialGroup()
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(U_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(Cu_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Co_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addGroup(Perfil_ULayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                                .addComponent(jButton17)))))
                .addGap(15, 15, 15))
        );
        Perfil_ULayout.setVerticalGroup(
            Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Perfil_ULayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(U_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cu_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Co_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jButton17))
                .addGap(18, 18, 18))
        );

        jButton4.setText("Volver");

        jButton8.setText("Agregar Publicidad");

        jLabel26.setText("Vendedor directo");

        jButton9.setText("Negociaciones");

        jLabel27.setText("Carros");

        jT_C_ofertador1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Año", "Cilindraje", "Tipo", "Transmicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jT_C_ofertador1);

        javax.swing.GroupLayout VendedorDirectoLayout = new javax.swing.GroupLayout(VendedorDirecto.getContentPane());
        VendedorDirecto.getContentPane().setLayout(VendedorDirectoLayout);
        VendedorDirectoLayout.setHorizontalGroup(
            VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGroup(VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VendedorDirectoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel26))
                    .addGroup(VendedorDirectoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)
                            .addComponent(jButton4))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        VendedorDirectoLayout.setVerticalGroup(
            VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel26)
                .addGap(10, 10, 10)
                .addComponent(jLabel27)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel28.setText("subastador");

        jLabel29.setText("Carros");

        jButton5.setText("Subastar");

        jButton10.setText("Agregar publicidad");

        javax.swing.GroupLayout SubastadorLayout = new javax.swing.GroupLayout(Subastador.getContentPane());
        Subastador.getContentPane().setLayout(SubastadorLayout);
        SubastadorLayout.setHorizontalGroup(
            SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubastadorLayout.createSequentialGroup()
                .addGroup(SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubastadorLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel28))
                    .addGroup(SubastadorLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(SubastadorLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        SubastadorLayout.setVerticalGroup(
            SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubastadorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SubastadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SubastadorLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addGap(40, 40, 40))
        );

        Ti_Publicidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ti_PublicidadActionPerformed(evt);
            }
        });

        Des_Publicidad.setColumns(20);
        Des_Publicidad.setRows(5);
        jScrollPane6.setViewportView(Des_Publicidad);

        jLabel30.setText("Titulo");

        jLabel31.setText("Descripcion ");

        jButton11.setText("Volver");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel32.setText("Publicidad");

        jT_Publicidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuario", "Titulo", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jT_Publicidad);

        jLabel33.setText("Publicidad disponible");

        jT_C_ofertador3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Año", "Cilindraje", "Tipo", "Transmicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jT_C_ofertador3);

        jButton23.setText("Agregar carro");

        jLabel53.setText("Carros disponibles");

        jButton24.setText("Eliminar publicidad");

        javax.swing.GroupLayout PublicidadLayout = new javax.swing.GroupLayout(Publicidad.getContentPane());
        Publicidad.getContentPane().setLayout(PublicidadLayout);
        PublicidadLayout.setHorizontalGroup(
            PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicidadLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PublicidadLayout.createSequentialGroup()
                                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PublicidadLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton23))
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                                .addGap(31, 31, 31))
                            .addGroup(PublicidadLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PublicidadLayout.createSequentialGroup()
                                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PublicidadLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton24))
                                    .addComponent(jScrollPane7))
                                .addGap(28, 28, 28)))
                        .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicidadLayout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Ti_Publicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31)
                                .addComponent(jLabel30)
                                .addComponent(jLabel32))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );
        PublicidadLayout.setVerticalGroup(
            PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicidadLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ti_Publicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jButton11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton23)
                .addGap(11, 11, 11))
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable6);

        jButton14.setText("Busqueda");

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente.getContentPane());
        Cliente.getContentPane().setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Año", "Cilindraje", "Tipo", "Transmision"
            }
        ));
        jScrollPane9.setViewportView(jTable7);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel34.setText("Marca:");

        jLabel35.setText("Modelo: ");

        jLabel36.setText("Año:");

        jLabel37.setText("Cilindraje:");

        jLabel38.setText("Transmisión:");

        jLabel39.setText("Tipo:");

        jButton15.setText("Buscar");

        javax.swing.GroupLayout BusquedaLayout = new javax.swing.GroupLayout(Busqueda.getContentPane());
        Busqueda.getContentPane().setLayout(BusquedaLayout);
        BusquedaLayout.setHorizontalGroup(
            BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton15)
                        .addGroup(BusquedaLayout.createSequentialGroup()
                            .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel34)
                                .addComponent(jLabel35))
                            .addGap(18, 18, 18)
                            .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jTextField2)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5)
                                .addComponent(jTextField7)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        BusquedaLayout.setVerticalGroup(
            BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BusquedaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jButton16.setText("Agregar al carrito");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jCheckBox_Directo.setText("Vendedor Directo  ($9.99)");

        jCheckBox_Subastador.setText("Subastador  ($9.99)");

        jCheckBox_Rentador.setText("Rentador  ($9.99)");

        jCheckBox_Carwash.setText("Carwash  ($9.99)");

        jLabel40.setText("Esto le permitirá administrar sus vehículos, publicidad, negociaciones y venta directa con los clientes.");

        jLabel41.setText("Significa que subirá sus vehículos a vender y su publicidad.");

        jLabel42.setText("Significa que podrá administrar sus servicios de renta(UBER, BUSITO o MUDANZA), incluyéndola ");

        jLabel43.setText("programación y reservas disponibles para sus clientes.");

        jLabel44.setText("Significa que podrá administrar un calendario con las citas de sus clientes y la facturación correspondiente");

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel45.setText("El usuario Ofertador tiene distintos tipos de membrecias, ");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel46.setText("seleccione el que mas se adecue a sus deseos:");

        javax.swing.GroupLayout Membrecias_OfertadoresLayout = new javax.swing.GroupLayout(Membrecias_Ofertadores.getContentPane());
        Membrecias_Ofertadores.getContentPane().setLayout(Membrecias_OfertadoresLayout);
        Membrecias_OfertadoresLayout.setHorizontalGroup(
            Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Membrecias_OfertadoresLayout.createSequentialGroup()
                .addGroup(Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton16))
                    .addGroup(Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel41))
                    .addGroup(Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)))
                    .addGroup(Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_Rentador)
                            .addComponent(jCheckBox_Carwash)
                            .addComponent(jCheckBox_Subastador)
                            .addComponent(jCheckBox_Directo)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Membrecias_OfertadoresLayout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addGroup(Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Membrecias_OfertadoresLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(80, 80, 80))))
        );
        Membrecias_OfertadoresLayout.setVerticalGroup(
            Membrecias_OfertadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Membrecias_OfertadoresLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addGap(30, 30, 30)
                .addComponent(jCheckBox_Directo)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Subastador)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Rentador)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_Carwash)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(40, 40, 40)
                .addComponent(jButton16)
                .addGap(27, 27, 27))
        );

        jLabel47.setText("Marca:");

        jLabel48.setText("Modelo");

        jLabel49.setText("Año: ");

        jLabel50.setText("Transmision:");

        jLabel51.setText("Tipo:");

        jLabel52.setText("Cilindraje:");

        jT_C_ofertador2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Año", "Cilindraje", "Tipo", "Transmicion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jT_C_ofertador2);

        jButton19.setText("Agregar");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Eliminar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Modificar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Volver");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Agregar_Carro_OFLayout = new javax.swing.GroupLayout(Agregar_Carro_OF.getContentPane());
        Agregar_Carro_OF.getContentPane().setLayout(Agregar_Carro_OFLayout);
        Agregar_Carro_OFLayout.setHorizontalGroup(
            Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                        .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel52)
                                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ag_Cilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ag_Tranmision, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ag_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ag_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ag_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ag_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Agregar_Carro_OFLayout.setVerticalGroup(
            Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_Carro_OFLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                        .addComponent(Ag_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Ag_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ag_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Ag_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Ag_Tranmision, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ag_Cilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                        .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_Carro_OFLayout.createSequentialGroup()
                                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addGap(64, 64, 64))
                                    .addComponent(jLabel48))
                                .addGap(38, 38, 38)
                                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_Carro_OFLayout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addGap(66, 66, 66))
                                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(72, 72, 72))
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel52)))
                .addGap(26, 26, 26)
                .addComponent(jButton19)
                .addGap(290, 290, 290)
                .addComponent(jButton22)
                .addGap(14, 14, 14))
            .addGroup(Agregar_Carro_OFLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton21))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        UsuariosAdmin_jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Cumpleaños", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(UsuariosAdmin_jt);

        jButton26.setText("Agregar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        admin_cumple.setCalendarPreferredSize(new java.awt.Dimension(510, 360));
        admin_cumple.setLocale(new java.util.Locale("es", "ES", ""));

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setText("Nombre: ");

        jLabel64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel64.setText("Nickname: ");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setText("Contraseña:");

        jLabel66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel66.setText("Pais o region:");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel67.setText("Cumpleaños:");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setText("Correo:");

        jLabel61.setText("USUARIOS ADMINISTRATIVOS");

        javax.swing.GroupLayout Agregar_AdminsLayout = new javax.swing.GroupLayout(Agregar_Admins.getContentPane());
        Agregar_Admins.getContentPane().setLayout(Agregar_AdminsLayout);
        Agregar_AdminsLayout.setHorizontalGroup(
            Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel63)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68))
                        .addGap(54, 54, 54)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(admin_usuario)
                            .addComponent(admin_nombre)
                            .addComponent(admin_contra)
                            .addComponent(admin_pais)
                            .addComponent(admin_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel61)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_AdminsLayout.createSequentialGroup()
                        .addComponent(jButton26)
                        .addGap(12, 12, 12)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        Agregar_AdminsLayout.setVerticalGroup(
            Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(33, 33, 33)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65))
                        .addGap(29, 29, 29)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(admin_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66))
                        .addGap(33, 33, 33)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(admin_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(admin_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jButton26))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jButton27.setText("Agregar Nuevo Admin");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("Subasta");

        jButton29.setText("Administrar perfil de la empresa");

        jButton30.setText("Reporteria");

        jLabel60.setText("Tabla de usuarios,opciones de modificar cualquier cosa de los usuarios");

        javax.swing.GroupLayout P_Pri_AdministradorLayout = new javax.swing.GroupLayout(P_Pri_Administrador.getContentPane());
        P_Pri_Administrador.getContentPane().setLayout(P_Pri_AdministradorLayout);
        P_Pri_AdministradorLayout.setHorizontalGroup(
            P_Pri_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Pri_AdministradorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(P_Pri_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(jButton28)
                    .addComponent(jButton27)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30))
                .addContainerGap(694, Short.MAX_VALUE))
        );
        P_Pri_AdministradorLayout.setVerticalGroup(
            P_Pri_AdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Pri_AdministradorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton27)
                .addGap(18, 18, 18)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28)
                .addGap(18, 18, 18)
                .addComponent(jButton30)
                .addGap(18, 18, 18)
                .addComponent(jLabel60)
                .addContainerGap(576, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO: ");

        jLabel2.setText("CONTRASEÑA: ");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Restablecer Contraseña/Usuario");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(usuario_L)
                            .addComponent(jLabel1)
                            .addComponent(contra_L)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipo_usuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_usuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contra_L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String usuario;
    String tipo;
    String contra;
    ArrayList<Usuario> usuarios = new ArrayList();
    String marca, modelo, Cilindraje, tipoo, trans;
    int ano;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //usuarios.add(new Usuario("cliente", "marce", "123", "Marcela Eunice Rivera Varela", "Honduras", "mvrivera", "sepa putas", "14/01/20"));
        usuarios.add(new Ofertadores("Ofertador", "juan", "123", "juan miguel", "fsdf", "sdf", "fsd", "34/56/7"));
        usuarios.add(new Ofertadores("Ofertador", "juana", "123", "juan miguel", "fsdf", "sdf", "fsd", "34/56/7"));
        usuarios.add(new Ofertadores("Administrador", "marce", "123", "juan miguel", "fsdf", "sdf", "fsd", "34/56/7"));
        tipo = (String) tipo_usuarioR.getSelectedItem();
        usuario = usuario_L.getText();
        contra = contra_L.getText();
        int contbb = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getUsuario()).equals(usuario) && (usuarios.get(i).getContra()).equals(contra)
                    && (usuarios.get(i).getTipo().equals(tipo))) {
                posi = i;
                contbb++;
                System.out.println("bienvenido");
                if ((usuarios.get(i).getTipo()).equals("Ofertador")) {
                    NAME.setText(usuarios.get(posi).getNombre());
                    llenarTabla();
                    System.out.println("aqui: ");
                    this.P_Pri_Ofertador.pack();
                    this.P_Pri_Ofertador.setLocationRelativeTo(this);
                    this.setVisible(false);
                    this.P_Pri_Ofertador.setVisible(true);
                } else if ((usuarios.get(i).getTipo()).equals("Administrador")) {
                    this.P_Pri_Administrador.pack();
                    this.P_Pri_Administrador.setLocationRelativeTo(this);
                    this.setVisible(false);
                    this.P_Pri_Administrador.setVisible(true);

                }
                break;
            }
        }
        if (contbb == 0) {
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrecta");
            usuario_L.setText("");
            contra_L.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    int n_empresa;

    public void llenarTabla() {
        DefaultTableModel m = (DefaultTableModel) jT_C_ofertador.getModel();
        DefaultTableModel k = (DefaultTableModel) jT_membrecias.getModel();

        for (int i = m.getRowCount() - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        for (int i = k.getRowCount() - 1; i >= 0; i--) {
            k.removeRow(i);
        }
        //Tabla membrecias
        for (Membrecias i : ((Ofertadores) usuarios.get(posi)).getMembrecias()) {
            Object[] membrecia = {i.getTipo(), i.getDescripcion()};
            k.addRow(membrecia);
        }
        //Tabla autos
        for (Autos i : ((Ofertadores) usuarios.get(posi)).getAutos()) {
            Object[] auto = {i.getMarca(), i.getModelo(), i.getAño(), i.getCilindraje(), i.getTipo(), i.getTransmision()};
            m.addRow(auto);
        }

        jT_C_ofertador.setModel(m);
        jT_C_ofertador2.setModel(m);
        jT_C_ofertador3.setModel(m);
        jT_membrecias.setModel(k);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.Registro.pack();
        this.Registro.setLocationRelativeTo(this);
        this.setVisible(false);
        this.Registro.setVisible(true);
        tipo_usuario.removeAllItems();
        tipo_usuario.addItem("  --------------------  ");
        tipo_usuario.addItem("Cliente");
        tipo_usuario.addItem("Ofertador");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tipo = (String) tipo_usuario.getSelectedItem();
        if (tipo.equals("  --------------------  ") || ni_R.getText().equals("") || co_R.getText().equals("") || no_R.getText().equals("") || pa_R.getText().equals("") || fe_R.getText().equals("") || cor_R.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de informacion pedidos");
        } else {
            int p = 0;
            for (int i = 0; i < usuarios.size(); i++) {
                if ((usuarios.get(i).getUsuario()).equals(ni_R.getText())) {
                    p++;
                }
            }
            if (p == 0) {
                if (tipo.equals("Ofertador")) {
                    this.Membrecias_Ofertadores.pack();
                    this.Membrecias_Ofertadores.setLocationRelativeTo(this);
                    this.Registro.setVisible(false);
                    this.Membrecias_Ofertadores.setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya esta ocupado");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed

    }//GEN-LAST:event_tipo_usuarioActionPerformed

    int posi = 0;

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.Restablecer.pack();
        this.Restablecer.setLocationRelativeTo(this);
        this.setVisible(false);
        this.Restablecer.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.P_Pri_Ofertador.setVisible(false);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        Object[] tipop = {" ------------------------------------------------- ", "Nombre", "Nickname", "Pais", "Cumpleaños", "Correo", "Ubicacion", "Contraseña"};
        Object kk = null;
        String aux = "";
        try {
            kk = JOptionPane.showInputDialog(null, "Selecciona el de dato que desea modificar", "Elegir", JOptionPane.QUESTION_MESSAGE, null, tipop, tipop[0]);
        } catch (Exception e) {
        }
        String kkk = (String) kk;

        switch (kkk) {
            case "Nombre":
                try {
                    aux = JOptionPane.showInputDialog("Nombre:");
                } catch (Exception e) {

                }
                usuarios.get(posi).setNombre(aux);
                N_Perfil.setText(aux);
                break;
            case "Nickname":
                try {
                    aux = JOptionPane.showInputDialog("Usuario:");
                } catch (Exception e) {

                }
                usuarios.get(posi).setUsuario(aux);
                U_Perfil.setText(aux);
                break;
            case "Pais":
                try {
                    aux = JOptionPane.showInputDialog("Pais:");
                } catch (Exception e) {

                }
                usuarios.get(posi).setPais(aux);
                P_Perfil.setText(aux);
                break;
            case "Cumpleaños":
                System.out.println("Un estamos viendo que pedo");
                break;
            case "Correo":
                try {
                    aux = JOptionPane.showInputDialog("Correo:");
                } catch (Exception e) {

                }
                usuarios.get(posi).setCorreo(aux);
                Co_Perfil.setText(aux);
                break;
            case "Contraseña":
                try {
                    aux = JOptionPane.showInputDialog("Contraseña:");
                } catch (Exception e) {

                }
                usuarios.get(posi).setContra(aux);

                break;
            case "Ubicacion":
                System.out.println("estamos viendo que pedo");
                break;

        }
        JOptionPane.showMessageDialog(null, "SU DATO SE A ACTUALIZADO CORRECTAMENTE");

    }//GEN-LAST:event_jLabel24MouseClicked

    public ArrayList<String> publicidad = new ArrayList();

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String ti = Ti_Publicidad.getText();
        String de = Des_Publicidad.getText();
        String names = usuarios.get(posi).getNombre();
        String tem = "\n**************************************\n" + "USUARIO: " + names + "\nTITULO: " + ti + "\nDESCRIPCION: " + de + "\n**************************************\n";
        publicidad.add(tem);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void Ti_PublicidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ti_PublicidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ti_PublicidadActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        this.P_Pri_Ofertador.pack();
        this.P_Pri_Ofertador.setLocationRelativeTo(this);
        this.Publicidad.setVisible(false);
        this.P_Pri_Ofertador.setVisible(true);
        Ti_Publicidad.setText("");
        Des_Publicidad.setText("");


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        this.Publicidad.pack();
        this.Publicidad.setLocationRelativeTo(this);
        this.P_Pri_Ofertador.setVisible(false);
        this.Publicidad.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int cont = 0;
        usuarios.add(new Ofertadores(tipo, ni_R.getText(), co_R.getText(), no_R.getText(), pa_R.getText(), cor_R.getText(), " ", Cu_Perfil.getText()));
        if (jCheckBox_Carwash.isSelected()) {
            System.out.println("yey");
            cont++;
            ((Ofertadores) usuarios.get(posi)).getMembrecias().add((new Carwash("Carwash", "Calendario con las citas y facturación correspondiente")));
        }
        if (jCheckBox_Directo.isSelected()) {
            cont++;
            ((Ofertadores) usuarios.get(posi)).getMembrecias().add((new Vendedor_Directo(" ", 0, "Vendedor directo", "Administrar sus vehículos,publicidad,negociaciones y venta directa")));
        }
        if (jCheckBox_Rentador.isSelected()) {
            cont++;
            ((Ofertadores) usuarios.get(posi)).getMembrecias().add((new Renta("Rentador", "Administra sus servicios de renta incluyéndo programación y reservas")));

        }
        if (jCheckBox_Subastador.isSelected()) {
            cont++;
            ((Ofertadores) usuarios.get(posi)).getMembrecias().add((new Subastador("Subastador", "Sube sus vehículos a vender y su publicidad")));
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione alguna membrecia");
        } else {
            usuarios.add(new Usuario(tipo, ni_R.getText(), co_R.getText(), no_R.getText(), pa_R.getText(), cor_R.getText(), "ubicacion", fe_R.getText()));
            System.out.println(tipo + " " + ni_R.getText() + " " + co_R.getText() + " " + no_R.getText() + " " + pa_R.getText() + " " + cor_R.getText() + "ubicacion" + fe_R.getText());
            ni_R.setText("");
            co_R.setText("");
            no_R.setText("");
            pa_R.setText("");
            cor_R.setText("");
            fe_R.setText("");

            this.setLocationRelativeTo(this);
            this.Membrecias_Ofertadores.setVisible(false);
            this.setVisible(true);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.P_Pri_Ofertador.pack();
        this.P_Pri_Ofertador.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(false);
        this.P_Pri_Ofertador.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        marca = Ag_marca.getText();
        modelo = Ag_modelo.getText();
        Cilindraje = Ag_Cilindraje.getText();
        tipo = Ag_tipo.getText();
        trans = Ag_Tranmision.getText();
        ano = Integer.parseInt(Ag_ano.getText());
        ((Ofertadores) usuarios.get(posi)).getAutos().add(new Autos(marca, modelo, Cilindraje, tipo, trans, ano));

        llenarTabla();
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");

        System.out.println("gg");

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        llenarTabla();
        this.Agregar_Carro_OF.pack();
        this.Agregar_Carro_OF.setLocationRelativeTo(this);
        this.P_Pri_Ofertador.setVisible(false);
        this.Agregar_Carro_OF.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        this.Agregar_Carro_OF.pack();
        this.P_Pri_Ofertador.setLocationRelativeTo(this);
        this.Agregar_Carro_OF.setVisible(false);
        this.P_Pri_Ofertador.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int o = jT_C_ofertador2.getSelectedRow();
        DefaultTableModel tm = (DefaultTableModel) jT_C_ofertador2.getModel();
        if (o >= 0) {
            Object[] Modi = {" ------------------------------------------------- ", "Marca", "Modelo", "Año", "Tipo", "Transmision", "Cilindraje"};
            Object opcion = null;
            try {
                opcion = JOptionPane.showInputDialog(null, "Selecciona lo que desea modificar", "Elegir", JOptionPane.QUESTION_MESSAGE, null, Modi, Modi[0]);
            } catch (Exception e) {

            }
            String op = (String) opcion;
            if (op.equals("Marca")) {
                marca = JOptionPane.showInputDialog("Nombre de la nueva marca: ");
                ((Ofertadores) usuarios.get(posi)).getAutos().get(o).setMarca(marca);

            } else if (op.equals("Modelo")) {
                modelo = JOptionPane.showInputDialog("Nombre de el nuevo modelo: ");
                ((Ofertadores) usuarios.get(posi)).getAutos().get(o).setModelo(modelo);
            } else if (op.equals("Año")) {
                ano = Integer.parseInt(JOptionPane.showInputDialog("Nombre de la nueva marca: "));
                ((Ofertadores) usuarios.get(posi)).getAutos().get(o).setAño(ano);
            } else if (op.equals("Tipo")) {
                int cont2 = 0;
                for (Membrecias membrecias : (((Ofertadores) usuarios.get(posi)).getMembrecias())) {
                    System.out.println("entraaaa");
                    if (membrecias instanceof Renta) {
                        cont2++;
                        System.out.println("entra");
                    }
                }

                if (cont2 > 0) {
                    Object[] tipop = {"Busito", "Uber", "Mudanza", "Carro"};
                    Object kk = JOptionPane.showInputDialog(null, "Selecciona el tipo de carro al que desea modificar", "Elegir", JOptionPane.QUESTION_MESSAGE, null, tipop, tipop[0]);
                    String kkk = (String) kk;
                    System.out.println("kk");
                    ((Ofertadores) usuarios.get(posi)).getAutos().get(o).setTipo(kkk);
                    llenarTabla();
                }

            } else if (op.equals("Transmision")) {

            } else if (op.equals("Cilindraje")) {

            }
            llenarTabla();
        }


    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int filaEliminar = jT_C_ofertador2.getSelectedRow();
        DefaultTableModel tm = (DefaultTableModel) jT_C_ofertador2.getModel();
        if (filaEliminar >= 0) {
            tm.removeRow(filaEliminar);
            ((Ofertadores) usuarios.get(posi)).getAutos().remove(filaEliminar);
        }


    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        //String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha
        usuarios.add(new Administrador("Administrador", admin_usuario.getText(), admin_contra.getText(), admin_nombre.getText(),
                admin_pais.getText(), admin_correo.getText(), " ", admin_cumple.getText()));
        DefaultTableModel admins = (DefaultTableModel) UsuariosAdmin_jt.getModel();
        for (int i = admins.getRowCount() - 1; i >= 0; i--) {
            admins.removeRow(i);

        }
        for (Usuario i : usuarios) {
            if (i instanceof Administrador) {
                Object[] o = {i.getNombre(), i.getUsuario(), i.getFecha(), i.getCorreo()};
                admins.addRow(o);
            }

        }
        UsuariosAdmin_jt.setModel(admins);
        admin_nombre.setText("");
        admin_usuario.setText("");
        admin_contra.setText("");
        admin_correo.setText("");
        admin_cumple.setText("");
        admin_pais.setText("");
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        this.Agregar_Admins.pack();
        this.Agregar_Admins.setLocationRelativeTo(this);
        this.P_Pri_Ofertador.setVisible(false);
        this.Agregar_Admins.setVisible(true);

    }//GEN-LAST:event_jButton27ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ag_Cilindraje;
    private javax.swing.JTextField Ag_Tranmision;
    private javax.swing.JTextField Ag_ano;
    private javax.swing.JTextField Ag_marca;
    private javax.swing.JTextField Ag_modelo;
    private javax.swing.JTextField Ag_tipo;
    private javax.swing.JFrame Agregar_Admins;
    private javax.swing.JFrame Agregar_Carro_OF;
    private javax.swing.JFrame Busqueda;
    private javax.swing.JFrame Cliente;
    private javax.swing.JLabel Co_Perfil;
    private javax.swing.JLabel Cu_Perfil;
    private javax.swing.JTextArea Des_Publicidad;
    private javax.swing.JFrame Membrecias_Ofertadores;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel N_Perfil;
    private javax.swing.JLabel P_Perfil;
    private javax.swing.JFrame P_Pri_Administrador;
    private javax.swing.JFrame P_Pri_Ofertador;
    private javax.swing.JFrame Perfil_U;
    private javax.swing.JFrame Publicidad;
    private javax.swing.JFrame Registro;
    private javax.swing.JFrame Restablecer;
    private javax.swing.JFrame Subastador;
    private javax.swing.JLabel T_Perfil;
    private javax.swing.JTextField Ti_Publicidad;
    private javax.swing.JLabel U_Perfil;
    private javax.swing.JTable UsuariosAdmin_jt;
    private javax.swing.JFrame VendedorDirecto;
    private javax.swing.JPasswordField admin_contra;
    private javax.swing.JTextField admin_correo;
    private datechooser.beans.DateChooserCombo admin_cumple;
    private javax.swing.JTextField admin_nombre;
    private javax.swing.JTextField admin_pais;
    private javax.swing.JTextField admin_usuario;
    private javax.swing.JPasswordField co_R;
    private javax.swing.JPasswordField contra_L;
    private javax.swing.JTextField cor_R;
    private datechooser.beans.DateChooserCombo fe_R;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox_Carwash;
    private javax.swing.JCheckBox jCheckBox_Directo;
    private javax.swing.JCheckBox jCheckBox_Rentador;
    private javax.swing.JCheckBox jCheckBox_Subastador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jT_C_ofertador;
    private javax.swing.JTable jT_C_ofertador1;
    private javax.swing.JTable jT_C_ofertador2;
    private javax.swing.JTable jT_C_ofertador3;
    private javax.swing.JTable jT_Empresas;
    private javax.swing.JTable jT_Publicidad;
    private javax.swing.JTable jT_membrecias;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField ni_R;
    private javax.swing.JTextField no_R;
    private javax.swing.JTextField pa_R;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JComboBox<String> tipo_usuarioR;
    private javax.swing.JTextField usuario_L;
    // End of variables declaration//GEN-END:variables
}
