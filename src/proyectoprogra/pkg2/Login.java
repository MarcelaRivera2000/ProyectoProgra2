package proyectoprogra.pkg2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Pagina_principal = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Publi = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
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
        VendedorDirecto = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
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
        contra_L = new javax.swing.JPasswordField();
        usuario_L = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

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

        jT_Publi.setColumns(20);
        jT_Publi.setRows(5);
        jScrollPane1.setViewportView(jT_Publi);

        jLabel11.setText("**********************Publicidad*************************");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jLabel12.setText("Membrecias");

        jLabel14.setText("Carros");

        jLabel25.setText("NOMBRE EMPRESA SEPA PUTAS CUAL ES XD");

        jButton13.setText("prueba");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pagina_principalLayout = new javax.swing.GroupLayout(Pagina_principal.getContentPane());
        Pagina_principal.getContentPane().setLayout(Pagina_principalLayout);
        Pagina_principalLayout.setHorizontalGroup(
            Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pagina_principalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagina_principalLayout.createSequentialGroup()
                        .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel25)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(Pagina_principalLayout.createSequentialGroup()
                        .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addGap(165, 165, 165)))
                .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(Pagina_principalLayout.createSequentialGroup()
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addGap(16, 16, 16))
        );
        Pagina_principalLayout.setVerticalGroup(
            Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pagina_principalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel25)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pagina_principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Pagina_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pagina_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pagina_principalLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton13)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18))
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
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21))))
                .addContainerGap(119, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(26, 26, 26))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable3);

        jButton4.setText("Volver");

        jButton8.setText("Agregar Publicidad");

        jLabel26.setText("Vendedor directo");

        jButton9.setText("Negociaciones");

        jLabel27.setText("Carros");

        javax.swing.GroupLayout VendedorDirectoLayout = new javax.swing.GroupLayout(VendedorDirecto.getContentPane());
        VendedorDirecto.getContentPane().setLayout(VendedorDirectoLayout);
        VendedorDirectoLayout.setHorizontalGroup(
            VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VendedorDirectoLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(VendedorDirectoLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VendedorDirectoLayout.setVerticalGroup(
            VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VendedorDirectoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel26)
                .addGap(10, 10, 10)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VendedorDirectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(VendedorDirectoLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

        javax.swing.GroupLayout PublicidadLayout = new javax.swing.GroupLayout(Publicidad.getContentPane());
        Publicidad.getContentPane().setLayout(PublicidadLayout);
        PublicidadLayout.setHorizontalGroup(
            PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicidadLayout.createSequentialGroup()
                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PublicidadLayout.createSequentialGroup()
                                    .addComponent(jButton11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12))
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                                .addComponent(Ti_Publicidad, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel32)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PublicidadLayout.setVerticalGroup(
            PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PublicidadLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ti_Publicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PublicidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PublicidadLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicidadLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addGap(28, 28, 28))))
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
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(usuario_L, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contra_L, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel13)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contra_L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String usuario;
    String contra;
    ArrayList<Usuario> usuarios = new ArrayList();


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarios.add(new Usuario("cliente", "marce", "123", "Marcela Eunice Rivera Varela", "Honduras", "mvrivera", "sepa putas", "14/01/20"));
        usuario = usuario_L.getText();
        contra = contra_L.getText();
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getUsuario()).equals(usuario) && (usuarios.get(i).getContra()).equals(contra)) {
                System.out.println("bienvenido");
                NAME.setText(usuarios.get(posi).getNombre());
                this.Pagina_principal.pack();
                this.Pagina_principal.setLocationRelativeTo(this);
                this.setVisible(false);
                this.Pagina_principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        String tipo = (String) tipo_usuario.getSelectedItem();
        if (tipo.equals("  --------------------  ") || ni_R.getText().equals("") || co_R.getText().equals("") || no_R.getText().equals("") || pa_R.getText().equals("") || fe_R.getText().equals("") || cor_R.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos de informacion pedidos");
        } else {
            int p = 0;
            for (int i = 0; i < usuarios.size(); i++) {
                if ((usuarios.get(i).getUsuario()).equals(ni_R.getText())) {
                    p++;
                }
            }
            if (p > 0) {
                JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya esta ocupado");
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
                this.Registro.setVisible(false);
                this.setVisible(true);

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
        this.Pagina_principal.setVisible(false);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        int o = Integer.parseInt(JOptionPane.showInputDialog("1.Editar nombre\n2.Editar nickname\n3.Editar Pais\n4.Editar Cumpleaños\n5.Editar Correo\n6.Editar Ubicacion "));
        switch (o) {
            case 1:
                JOptionPane.showInputDialog("Ingrese ");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
                
        }


    }//GEN-LAST:event_jLabel24MouseClicked
public ArrayList<String> publicidad=new ArrayList();
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       String ti=Ti_Publicidad.getText();
       String de=Des_Publicidad.getText();
       String names=usuarios.get(posi).getNombre();
       String tem="\n**************************************\n"+"USUARIO: "+names+"\nTITULO: "+ti+"\nDESCRIPCION: "+de+"\n**************************************\n";
       publicidad.add(tem);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void Ti_PublicidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ti_PublicidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ti_PublicidadActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        for (String i : publicidad) {
            jT_Publi.setText(i);
        }
        this.Pagina_principal.pack();
        this.Pagina_principal.setLocationRelativeTo(this);
        this.Publicidad.setVisible(false);
        this.Pagina_principal.setVisible(true);
        Ti_Publicidad.setText("");
         Des_Publicidad.setText("");
        
        
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       this.Publicidad.pack();
        this.Publicidad.setLocationRelativeTo(this);
        this.Pagina_principal.setVisible(false);
        this.Publicidad.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

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
    private javax.swing.JLabel Co_Perfil;
    private javax.swing.JLabel Cu_Perfil;
    private javax.swing.JTextArea Des_Publicidad;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel N_Perfil;
    private javax.swing.JLabel P_Perfil;
    private javax.swing.JFrame Pagina_principal;
    private javax.swing.JFrame Perfil_U;
    private javax.swing.JFrame Publicidad;
    private javax.swing.JFrame Registro;
    private javax.swing.JFrame Restablecer;
    private javax.swing.JFrame Subastador;
    private javax.swing.JLabel T_Perfil;
    private javax.swing.JTextField Ti_Publicidad;
    private javax.swing.JLabel U_Perfil;
    private javax.swing.JFrame VendedorDirecto;
    private javax.swing.JPasswordField co_R;
    private javax.swing.JPasswordField contra_L;
    private javax.swing.JTextField cor_R;
    private datechooser.beans.DateChooserCombo fe_R;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jT_Publi;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField ni_R;
    private javax.swing.JTextField no_R;
    private javax.swing.JTextField pa_R;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JTextField usuario_L;
    // End of variables declaration//GEN-END:variables
}
