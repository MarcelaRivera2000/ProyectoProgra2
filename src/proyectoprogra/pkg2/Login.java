package proyectoprogra.pkg2;

import datechooser.beans.DateChooserDialog;
import datechooser.beans.DateChooserPanel;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JFrame {

    String usuario;
    String tipo;
    String contra;
    ArrayList<Usuario> usuarios = new ArrayList();
    String marca, modelo, Cilindraje, tipoo, trans;
    int ano, posi;
    Ficheros_Binarios b = new Ficheros_Binarios("./FicherosB.bin");
    Archivos_Texto f = new Archivos_Texto("Clientes.txt", usuarios);

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        b.cargarArchivo();
        for (Ofertadores2 i : b.getListaPersonas()) {
            usuarios.add((Ofertadores2) i);
        }
        /*f.Leer();
        for (Usuario p : f.getLista()) {
            usuarios.add((Cliente) p);
        }

        Ofertadores ff = new Ofertadores("Ofertador", "juana", "123", "Marcela Rivera", "Honduras", "marci.eunicer@gmail.com", "ubicacion", "14/1/2020");
        Cliente fff = new Cliente("Cliente", "carlos", "123", "Marcela Rivera", "Honduras", "marci.eunicer@gmail.com", "ubicacion", "14/1/2020");
        Administrador a = new Administrador("Administrador", "marce", "123", "Marcela Rivera", "Honduras", "marci.eunicer@gmail.com", "ubicacion", "14/1/2020");
        usuarios.add(a);
        usuarios.add(fff);
        usuarios.add(ff);*/
    }

    public void llenarTabla() {
        DefaultTableModel m = (DefaultTableModel) jT_C_ofertador2.getModel();
        DefaultTableModel k = (DefaultTableModel) jT_membrecias1.getModel();

        for (int i = m.getRowCount() - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        for (int i = k.getRowCount() - 1; i >= 0; i--) {
            k.removeRow(i);
        }
        //Tabla membrecias
       for (Membrecias i : ((Ofertadores2) usuarios.get(posi)).getMembrecias()) {
            Object[] membrecia = {i.getTipo(), i.getDescripcion()};
            k.addRow(membrecia);
        }
        //Tabla autos
     for (Autos i : ((Ofertadores2) usuarios.get(posi)).getAutos()) {
            Object[] auto = {i.getMarca(), i.getModelo(), i.getAño(), i.getCilindraje(), i.getTipo(), i.getTransmision()};
            m.addRow(auto);
        }

        jT_C_ofertador2.setModel(m);
        jT_C_ofertador3.setModel(m);
        jT_membrecias1.setModel(k);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JFrame();
        no_R = new javax.swing.JTextField();
        ni_R = new javax.swing.JTextField();
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
        pa_R = new javax.swing.JComboBox<>();
        PaginaPrincipalOfertador = new javax.swing.JFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        UsuariosName = new javax.swing.JMenu();
        menufoto = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
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
        jLabel11 = new javax.swing.JLabel();
        lb_foto = new javax.swing.JLabel();
        AQUI = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
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
        jButton25 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        admin_paiss = new javax.swing.JComboBox<>();
        PaginaPrincipalAdministrador = new javax.swing.JFrame();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        TablaMembrecias = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jT_membrecias1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jCheckBox_Directo1 = new javax.swing.JCheckBox();
        jCheckBox_Subastador1 = new javax.swing.JCheckBox();
        jCheckBox_Rentador1 = new javax.swing.JCheckBox();
        jCheckBox_Carwash1 = new javax.swing.JCheckBox();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        VentaDirecta = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        CitasCarwash = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        PerfilEmpresa = new javax.swing.JFrame();
        jButton27 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        ImagenEmpresa = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel69 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        PaginaPrincipalCliente = new javax.swing.JFrame();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        Subasta = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        fe_R.setLocale(new java.util.Locale("es", "ES", ""));

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Cliente", "Ofertador" }));
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de usuario:");

        pa_R.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        pa_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pa_RActionPerformed(evt);
            }
        });

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
                            .addComponent(cor_R)
                            .addComponent(tipo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fe_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pa_R, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pa_R, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
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

        UsuariosName.setBackground(new java.awt.Color(255, 255, 255));
        UsuariosName.setForeground(new java.awt.Color(0, 0, 0));
        UsuariosName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar2.add(UsuariosName);

        menufoto.setText("Perfil");
        menufoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menufotoMouseClicked(evt);
            }
        });

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Ver Perfil");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseClicked(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menufoto.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Log Out");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem7MousePressed(evt);
            }
        });
        menufoto.add(jMenuItem7);

        jMenuBar2.add(menufoto);

        jMenu12.setText("Membrecias");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu12MousePressed(evt);
            }
        });
        jMenuBar2.add(jMenu12);

        jMenu8.setText("Vendedor Directo");

        jMenuItem4.setText("Agregar Publicidad");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuItem5.setText("Agregar Carros");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem5MousePressed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuItem18.setText("Venta Directa");
        jMenu8.add(jMenuItem18);

        jMenuBar2.add(jMenu8);

        jMenu13.setText("Subasta");

        jMenuItem21.setText("Agregar Publicidad");
        jMenu13.add(jMenuItem21);

        jMenuItem20.setText("Subir Vehiculo");
        jMenu13.add(jMenuItem20);

        jMenuBar2.add(jMenu13);

        jMenu14.setText("Carwash");

        jMenuItem22.setText("Ver Citas");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem22);

        jMenuBar2.add(jMenu14);

        jMenu15.setText("Renta");

        jMenuItem24.setText("Agregar Vehiculos");
        jMenu15.add(jMenuItem24);

        jMenuItem25.setText("Reservas");
        jMenu15.add(jMenuItem25);

        jMenuBar2.add(jMenu15);

        PaginaPrincipalOfertador.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout PaginaPrincipalOfertadorLayout = new javax.swing.GroupLayout(PaginaPrincipalOfertador.getContentPane());
        PaginaPrincipalOfertador.getContentPane().setLayout(PaginaPrincipalOfertadorLayout);
        PaginaPrincipalOfertadorLayout.setHorizontalGroup(
            PaginaPrincipalOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1478, Short.MAX_VALUE)
        );
        PaginaPrincipalOfertadorLayout.setVerticalGroup(
            PaginaPrincipalOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
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

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("PERFIL");

        AQUI.setText("Seleccionar");
        AQUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AQUIMouseClicked(evt);
            }
        });
        AQUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AQUIActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("ICONO");

        jMenu6.setText("  X ");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Volver");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu7MousePressed(evt);
            }
        });
        jMenuBar3.add(jMenu7);

        jMenu10.setText("Modificar");

        jMenuItem10.setText("Nombre");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem10MousePressed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenuItem11.setText("Usuario");
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem11MousePressed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenuItem12.setText("Pais");
        jMenuItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem12MousePressed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenuItem14.setText("Cumpleaños");
        jMenuItem14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem14MousePressed(evt);
            }
        });
        jMenu10.add(jMenuItem14);

        jMenuItem13.setText("Ubicacion");
        jMenu10.add(jMenuItem13);

        jMenuBar3.add(jMenu10);

        Perfil_U.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout Perfil_ULayout = new javax.swing.GroupLayout(Perfil_U.getContentPane());
        Perfil_U.getContentPane().setLayout(Perfil_ULayout);
        Perfil_ULayout.setHorizontalGroup(
            Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Perfil_ULayout.createSequentialGroup()
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel12))
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(AQUI)))
                .addGap(63, 63, 63)
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel11))
                    .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Co_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(U_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(N_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cu_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addComponent(T_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        Perfil_ULayout.setVerticalGroup(
            Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Perfil_ULayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addComponent(N_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(U_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cu_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Co_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel23))
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AQUI)))
                .addContainerGap(248, Short.MAX_VALUE))
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

        jButton25.setText("Eliminar");

        jButton31.setText("Modificar");

        admin_paiss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        javax.swing.GroupLayout Agregar_AdminsLayout = new javax.swing.GroupLayout(Agregar_Admins.getContentPane());
        Agregar_Admins.getContentPane().setLayout(Agregar_AdminsLayout);
        Agregar_AdminsLayout.setHorizontalGroup(
            Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton31))
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton26)
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
                                .addComponent(admin_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(admin_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(admin_paiss, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Agregar_AdminsLayout.setVerticalGroup(
            Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_AdminsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(36, 36, 36)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(admin_paiss, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(admin_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(admin_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton26)))
                .addGap(18, 18, 18)
                .addGroup(Agregar_AdminsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25)
                    .addComponent(jButton31))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Usuario", "Contraseña", "Pais", "Cumpleaños", "Correo", "Tipo Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTable5);

        jButton29.setText("Mostrar Usuarios Ofertadores");

        jButton30.setText("Mostrar Usuarios Clientes");

        jButton32.setText("Mostrar Usuarios Administradores");

        jLabel82.setText("USUARIOS ");

        jMenu1.setText("Perfil");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Ver Perfil");
        jMenu1.add(jMenuItem9);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Log Out");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Perfil de la empresa");

        jMenuItem16.setText("Ver Perfil");
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Administrar usuarios");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Crear Administrador");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem27.setText("Crear Ofertador");
        jMenu2.add(jMenuItem27);

        jMenuItem26.setText("Crear Cliente");
        jMenu2.add(jMenuItem26);

        jMenuItem15.setText("Administrar Usuarios Administradores");
        jMenu2.add(jMenuItem15);

        jMenuItem2.setText("Administrar Usuarios  Clientes");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Administrar Usuarios Ofertadores");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Subasta");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reporteria");
        jMenuBar1.add(jMenu5);

        jMenu21.setText("Reportes");
        jMenuBar1.add(jMenu21);

        PaginaPrincipalAdministrador.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout PaginaPrincipalAdministradorLayout = new javax.swing.GroupLayout(PaginaPrincipalAdministrador.getContentPane());
        PaginaPrincipalAdministrador.getContentPane().setLayout(PaginaPrincipalAdministradorLayout);
        PaginaPrincipalAdministradorLayout.setHorizontalGroup(
            PaginaPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaPrincipalAdministradorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PaginaPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaginaPrincipalAdministradorLayout.createSequentialGroup()
                        .addComponent(jButton32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PaginaPrincipalAdministradorLayout.createSequentialGroup()
                        .addGroup(PaginaPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PaginaPrincipalAdministradorLayout.setVerticalGroup(
            PaginaPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaPrincipalAdministradorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PaginaPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jT_membrecias1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jT_membrecias1);

        jButton7.setText("Comprar Una Membrecia Adicional");

        jCheckBox_Directo1.setText("Vendedor Directo  ($9.99)");

        jCheckBox_Subastador1.setText("Subastador  ($9.99)");

        jCheckBox_Rentador1.setText("Rentador  ($9.99)");

        jCheckBox_Carwash1.setText("Carwash  ($9.99)");

        jLabel54.setText("Esto le permitirá administrar sus vehículos, publicidad, negociaciones y venta directa con los clientes.");

        jLabel55.setText("Significa que subirá sus vehículos a vender y su publicidad.");

        jLabel56.setText("Significa que podrá administrar sus servicios de renta(UBER, BUSITO o MUDANZA), incluyéndola ");

        jLabel57.setText("programación y reservas disponibles para sus clientes.");

        jLabel58.setText("Significa que podrá administrar un calendario con las citas de sus clientes y la facturación correspondiente");

        jMenu11.setText("X");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenuBar4.add(jMenu11);

        TablaMembrecias.setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout TablaMembreciasLayout = new javax.swing.GroupLayout(TablaMembrecias.getContentPane());
        TablaMembrecias.getContentPane().setLayout(TablaMembreciasLayout);
        TablaMembreciasLayout.setHorizontalGroup(
            TablaMembreciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaMembreciasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(TablaMembreciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jCheckBox_Rentador1)
                    .addComponent(jCheckBox_Carwash1)
                    .addComponent(jCheckBox_Subastador1)
                    .addComponent(jCheckBox_Directo1)
                    .addGroup(TablaMembreciasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(TablaMembreciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(TablaMembreciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        TablaMembreciasLayout.setVerticalGroup(
            TablaMembreciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaMembreciasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Directo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Subastador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Rentador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Carwash1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Auto Solicitado", "Precio", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Solicitudes De Venta De Carros");

        jButton13.setText("Aceptar Propuesta");

        jButton17.setText("Rechazar Propuesta");

        jMenu9.setText("Volver");
        jMenuBar5.add(jMenu9);

        jMenu16.setText("VENTA DIRECTA CON CLIENTES");
        jMenuBar5.add(jMenu16);

        VentaDirecta.setJMenuBar(jMenuBar5);

        javax.swing.GroupLayout VentaDirectaLayout = new javax.swing.GroupLayout(VentaDirecta.getContentPane());
        VentaDirecta.getContentPane().setLayout(VentaDirectaLayout);
        VentaDirectaLayout.setHorizontalGroup(
            VentaDirectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaDirectaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(VentaDirectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentaDirectaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(VentaDirectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        VentaDirectaLayout.setVerticalGroup(
            VentaDirectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaDirectaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(VentaDirectaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VentaDirectaLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Auto", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(jTable2);

        jButton18.setText("Aceptar Cita");

        jMenu17.setText("Volver");
        jMenuBar6.add(jMenu17);

        jMenu18.setText("CITAS DE CLIENTES AL CARWASH");
        jMenuBar6.add(jMenu18);

        CitasCarwash.setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout CitasCarwashLayout = new javax.swing.GroupLayout(CitasCarwash.getContentPane());
        CitasCarwash.getContentPane().setLayout(CitasCarwashLayout);
        CitasCarwashLayout.setHorizontalGroup(
            CitasCarwashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CitasCarwashLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        CitasCarwashLayout.setVerticalGroup(
            CitasCarwashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CitasCarwashLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CitasCarwashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CitasCarwashLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton18))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        PerfilEmpresa.getContentPane().setLayout(null);

        jButton27.setText("Logo de cambio");
        PerfilEmpresa.getContentPane().add(jButton27);
        jButton27.setBounds(470, 170, 50, 40);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel25.setText("AUTOBOWLEE");
        PerfilEmpresa.getContentPane().add(jLabel25);
        jLabel25.setBounds(20, 150, 490, 60);

        ImagenEmpresa.setText("IMAGEN");
        PerfilEmpresa.getContentPane().add(ImagenEmpresa);
        ImagenEmpresa.setBounds(0, 0, 1500, 210);

        jLabel24.setText("Mision:");
        PerfilEmpresa.getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 220, 40, 16);

        jLabel59.setText("Vision:");
        PerfilEmpresa.getContentPane().add(jLabel59);
        jLabel59.setBounds(30, 350, 38, 16);

        jLabel60.setText("Objetivos");
        PerfilEmpresa.getContentPane().add(jLabel60);
        jLabel60.setBounds(30, 490, 70, 16);

        jLabel62.setText("Politicas");
        PerfilEmpresa.getContentPane().add(jLabel62);
        jLabel62.setBounds(30, 630, 60, 16);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane17.setViewportView(jTextArea5);

        PerfilEmpresa.getContentPane().add(jScrollPane17);
        jScrollPane17.setBounds(30, 650, 680, 90);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane18.setViewportView(jTextArea6);

        PerfilEmpresa.getContentPane().add(jScrollPane18);
        jScrollPane18.setBounds(30, 240, 680, 90);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane19.setViewportView(jTextArea7);

        PerfilEmpresa.getContentPane().add(jScrollPane19);
        jScrollPane19.setBounds(30, 370, 680, 90);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane20.setViewportView(jTextArea8);

        PerfilEmpresa.getContentPane().add(jScrollPane20);
        jScrollPane20.setBounds(30, 510, 680, 90);

        jLabel69.setText("Ubicacion:");
        PerfilEmpresa.getContentPane().add(jLabel69);
        jLabel69.setBounds(1000, 240, 100, 16);
        PerfilEmpresa.getContentPane().add(jTextField8);
        jTextField8.setBounds(1140, 540, 290, 40);

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel70.setText("CONTACTANOS");
        PerfilEmpresa.getContentPane().add(jLabel70);
        jLabel70.setBounds(1070, 380, 150, 24);

        jLabel71.setText(" (imagen tel)");
        PerfilEmpresa.getContentPane().add(jLabel71);
        jLabel71.setBounds(1060, 420, 70, 40);
        PerfilEmpresa.getContentPane().add(jTextField9);
        jTextField9.setBounds(1140, 420, 290, 40);
        PerfilEmpresa.getContentPane().add(jTextField10);
        jTextField10.setBounds(1140, 480, 290, 40);

        jLabel72.setText("(imagen Correo)");
        PerfilEmpresa.getContentPane().add(jLabel72);
        jLabel72.setBounds(1030, 480, 100, 40);

        jLabel73.setText("(Imagen Dirreccion)");
        PerfilEmpresa.getContentPane().add(jLabel73);
        jLabel73.setBounds(1010, 540, 110, 40);

        jMenu22.setText("Perfil");
        jMenu22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu22MouseClicked(evt);
            }
        });

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setText("Ver Perfil");
        jMenu22.add(jMenuItem17);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setText("Log Out");
        jMenu22.add(jMenuItem19);

        jMenuBar8.add(jMenu22);

        jMenu23.setText("Perfil de la empresa");

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setText("Guardar Cambios");
        jMenu23.add(jMenuItem34);

        jMenuItem35.setText("Ver Como Cliente");
        jMenu23.add(jMenuItem35);

        jMenuBar8.add(jMenu23);

        jMenu24.setText("Administrar usuarios");
        jMenu24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu24MouseClicked(evt);
            }
        });

        jMenuItem28.setText("Crear Administrador");
        jMenuItem28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem28MouseClicked(evt);
            }
        });
        jMenu24.add(jMenuItem28);

        jMenuItem29.setText("Crear Ofertador");
        jMenu24.add(jMenuItem29);

        jMenuItem30.setText("Crear Cliente");
        jMenu24.add(jMenuItem30);

        jMenuItem31.setText("Administrar Usuarios Administradores");
        jMenu24.add(jMenuItem31);

        jMenuItem32.setText("Administrar Usuarios  Clientes");
        jMenu24.add(jMenuItem32);

        jMenuItem33.setText("Administrar Usuarios Ofertadores");
        jMenu24.add(jMenuItem33);

        jMenuBar8.add(jMenu24);

        jMenu25.setText("Subasta");
        jMenuBar8.add(jMenu25);

        jMenu26.setText("Reporteria");
        jMenuBar8.add(jMenu26);

        jMenu27.setText("Reportes");
        jMenuBar8.add(jMenu27);

        PerfilEmpresa.setJMenuBar(jMenuBar8);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem23.setText("Ver Perfil");
        jMenuItem23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem23MouseClicked(evt);
            }
        });
        jMenu19.add(jMenuItem23);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setText("Log Out");
        jMenuItem36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem36MousePressed(evt);
            }
        });
        jMenu19.add(jMenuItem36);

        jMenuBar7.add(jMenu19);

        jMenu20.setText("Perfil");
        jMenuBar7.add(jMenu20);

        jMenu29.setText("Mis Facturas");
        jMenuBar7.add(jMenu29);

        jMenu28.setText("Busqueda");
        jMenuBar7.add(jMenu28);

        Subasta.setText("Navegar");

        jMenuItem37.setText("Comprar AutoMovil");
        Subasta.add(jMenuItem37);

        jMenuItem38.setText("Subasta Online");
        Subasta.add(jMenuItem38);

        jMenuItem39.setText("Renta autos");
        Subasta.add(jMenuItem39);

        jMenuItem40.setText("Carwash");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        Subasta.add(jMenuItem40);

        jMenuBar7.add(Subasta);

        PaginaPrincipalCliente.setJMenuBar(jMenuBar7);

        javax.swing.GroupLayout PaginaPrincipalClienteLayout = new javax.swing.GroupLayout(PaginaPrincipalCliente.getContentPane());
        PaginaPrincipalCliente.getContentPane().setLayout(PaginaPrincipalClienteLayout);
        PaginaPrincipalClienteLayout.setHorizontalGroup(
            PaginaPrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
        );
        PaginaPrincipalClienteLayout.setVerticalGroup(
            PaginaPrincipalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagen", "Marca", "Modelo", "Cilindraje", "Tipo", "Transmision", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable3);

        jLabel74.setText("Marca:");

        jLabel75.setText("Modelo:");

        jLabel76.setText("Cilindraje:");

        jLabel77.setText("Tipo:");

        jLabel78.setText("Transmision:");

        jLabel79.setText("Año:");

        jButton28.setText("Buscar");

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel80.setText("BUSQUEDA DE AUTOMOVILES");

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("VENTA");

        jRadioButton2.setText("RENTA");

        jLabel81.setText("Seleccione el tipo de servicio deseado");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDialog1Layout.createSequentialGroup()
                                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel74))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel79))
                                .addGap(16, 16, 16)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDialog1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton2))
                                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel81)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74))
                        .addGap(44, 44, 44)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75))
                        .addGap(40, 40, 40)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel78)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario_L, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(contra_L))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario_L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuario = usuario_L.getText();
        contra = contra_L.getText();
        int cont = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i).getUsuario()).equals(usuario) && (usuarios.get(i).getContra()).equals(contra)) {
                posi = i;
                cont++;
                UsuariosName.setText(usuarios.get(posi).getNombre());
                if (usuarios.get(i) instanceof Ofertadores2) {

                    llenarTabla();
                    this.PaginaPrincipalOfertador.pack();
                    this.PaginaPrincipalOfertador.setLocationRelativeTo(this);
                    this.PaginaPrincipalOfertador.setExtendedState(MAXIMIZED_BOTH);
                    System.out.println(PaginaPrincipalOfertador.getWidth() + " " + PaginaPrincipalOfertador.getHeight());
                    this.setVisible(false);
                    this.PaginaPrincipalOfertador.setVisible(true);
                } else if (usuarios.get(i) instanceof Administrador) {
                    this.PaginaPrincipalAdministrador.pack();
                    this.PaginaPrincipalAdministrador.setLocationRelativeTo(this);
                    this.PaginaPrincipalAdministrador.setExtendedState(MAXIMIZED_BOTH);
                    this.setVisible(false);
                    this.PaginaPrincipalAdministrador.setVisible(true);
                } else if (usuarios.get(i) instanceof Cliente) {
                    this.PaginaPrincipalCliente.pack();
                    this.PaginaPrincipalCliente.setLocationRelativeTo(this);
                    this.PaginaPrincipalCliente.setExtendedState(MAXIMIZED_BOTH);
                    this.setVisible(false);
                    this.PaginaPrincipalCliente.setVisible(true);

                }
                break;
            }
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrecta");
            usuario_L.setText("");
            contra_L.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    int n_empresa;


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.Registro.pack();
        this.Registro.setLocationRelativeTo(this);
        this.setVisible(false);
        this.Registro.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tipo = (String) tipo_usuario.getSelectedItem();
        if (tipo.equals("  --------------------  ") || ni_R.getText().equals("") || co_R.getText().equals("") || no_R.getText().equals("") || pa_R.getSelectedItem().equals("  --------------------  ") || fe_R.getText().equals("") || cor_R.getText().equals("")) {
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
                } else {
                    try {
                        Cliente e = new Cliente(tipo, ni_R.getText(), co_R.getText(), no_R.getText(), (String) pa_R.getSelectedItem(), cor_R.getText(), " ", fe_R.getText());
                        usuarios.add(e);
                        this.pack();
                        this.setLocationRelativeTo(this);
                        this.Registro.setVisible(false);
                        this.setVisible(true);
                        f.Leer();
                        f.setCliente(e);
                        f.Escribir();

                    } catch (Exception ex) {
                        System.out.println("kpedo");
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya esta ocupado");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed

    }//GEN-LAST:event_tipo_usuarioActionPerformed


    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.Restablecer.pack();
        this.Restablecer.setLocationRelativeTo(this);
        this.setVisible(false);
        this.Restablecer.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

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
        this.Publicidad.pack();
        this.Publicidad.setVisible(false);
        Ti_Publicidad.setText("");
        Des_Publicidad.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int cont = 0;
        Ofertadores2 p = new Ofertadores2(tipo, ni_R.getText(), co_R.getText(), no_R.getText(), (String) pa_R.getSelectedItem(), cor_R.getText(), " ", Cu_Perfil.getText());
        usuarios.add(p);
        try {
            if (jCheckBox_Carwash.isSelected()) {
                cont++;
                ((Ofertadores2) usuarios.get(usuarios.size() - 1)).getMembrecias().add((new Carwash("Carwash", "Calendario con las citas y facturación correspondiente")));
            }
            if (jCheckBox_Directo.isSelected()) {
                cont++;
                ((Ofertadores2) usuarios.get(usuarios.size() - 1)).getMembrecias().add((new Vendedor_Directo(" ", 0, "Vendedor directo", "Administrar sus vehículos,publicidad,negociaciones y venta directa")));
            }
            if (jCheckBox_Rentador.isSelected()) {
                cont++;
               ((Ofertadores2) usuarios.get(usuarios.size() - 1)).getMembrecias().add((new Renta("Rentador", "Administra sus servicios de renta incluyéndo programación y reservas")));

            }
            if (jCheckBox_Subastador.isSelected()) {
                cont++;
               ((Ofertadores2) usuarios.get(usuarios.size() - 1)).getMembrecias().add((new Subastador("Subastador", "Sube sus vehículos a vender y su publicidad")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione alguna membrecia");
        } else {
            b.cargarArchivo();
            b.setAlumno(p);
            b.escribirArchivo();
            ni_R.setText("");
            co_R.setText("");
            no_R.setText("");
            cor_R.setText("");
            fe_R.setText("");

            this.setLocationRelativeTo(this);
            this.Membrecias_Ofertadores.setVisible(false);
            this.setVisible(true);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        marca = Ag_marca.getText();
        modelo = Ag_modelo.getText();
        Cilindraje = Ag_Cilindraje.getText();
        tipo = Ag_tipo.getText();
        trans = Ag_Tranmision.getText();
        ano = Integer.parseInt(Ag_ano.getText());
        ((Ofertadores2) usuarios.get(posi)).getAutos().add(new Autos(marca, modelo, Cilindraje, tipo, trans, ano));
        llenarTabla();
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        this.Agregar_Carro_OF.pack();
        this.PaginaPrincipalOfertador.setLocationRelativeTo(this);
        this.Agregar_Carro_OF.setVisible(false);
        this.PaginaPrincipalOfertador.setVisible(true);
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
                ((Ofertadores2) usuarios.get(posi)).getAutos().get(o).setMarca(marca);

            } else if (op.equals("Modelo")) {
                modelo = JOptionPane.showInputDialog("Nombre de el nuevo modelo: ");
                ((Ofertadores2) usuarios.get(posi)).getAutos().get(o).setModelo(modelo);
            } else if (op.equals("Año")) {
                ano = Integer.parseInt(JOptionPane.showInputDialog("Nombre de la nueva marca: "));
                ((Ofertadores2) usuarios.get(posi)).getAutos().get(o).setAño(ano);
            } else if (op.equals("Tipo")) {
                int cont2 = 0;
                for (Membrecias membrecias : (((Ofertadores2) usuarios.get(posi)).getMembrecias())) {
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
                    ((Ofertadores2) usuarios.get(posi)).getAutos().get(o).setTipo(kkk);
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
            ((Ofertadores2) usuarios.get(posi)).getAutos().remove(filaEliminar);
        }


    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        usuarios.add(new Administrador("Administrador", admin_usuario.getText(), admin_contra.getText(), admin_nombre.getText(),
                (String) admin_paiss.getSelectedItem(), admin_correo.getText(), " ", admin_cumple.getText()));
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
    }//GEN-LAST:event_jButton26ActionPerformed

    private void pa_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pa_RActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pa_RActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.PaginaPrincipalAdministrador.setVisible(false);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseClicked
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem6MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menufotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menufotoMouseClicked
    }//GEN-LAST:event_menufotoMouseClicked

    private void jMenuItem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MousePressed
        llenarTabla();
        this.Agregar_Carro_OF.pack();
        this.Agregar_Carro_OF.setLocationRelativeTo(this);
        this.Agregar_Carro_OF.setVisible(true);
    }//GEN-LAST:event_jMenuItem5MousePressed

    private void jMenu12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MousePressed

        llenarTabla();
        this.TablaMembrecias.pack();
        this.TablaMembrecias.setLocationRelativeTo(this);
        this.TablaMembrecias.setVisible(true);

    }//GEN-LAST:event_jMenu12MousePressed

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked

    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        this.Publicidad.pack();
        this.Publicidad.setLocationRelativeTo(this);
        this.Publicidad.setVisible(true);
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void AQUIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AQUIMouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes",
                "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(100, 100, 0);
            this.lb_foto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_AQUIMouseClicked

    private void AQUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AQUIActionPerformed
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes",
                "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(100, 100, 0);
            Image img2 = Toolkit.getDefaultToolkit().createImage(
                    archivo.getPath()).getScaledInstance(30, 30, 0);
            this.lb_foto.setIcon(new ImageIcon(img));
            usuarios.get(posi).setFotografia(lb_foto.getIcon());
            menufoto.setIcon(new ImageIcon(img2));
            menufoto.setText("");
        }
    }//GEN-LAST:event_AQUIActionPerformed

    private void jMenu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MousePressed
        this.Perfil_U.pack();
        this.Perfil_U.setVisible(false);
    }//GEN-LAST:event_jMenu7MousePressed

    private void jMenuItem10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MousePressed
        String nombre = JOptionPane.showInputDialog("Modificar Nombre: ");
        usuarios.get(posi).setNombre(nombre);
        N_Perfil.setText(nombre);
    }//GEN-LAST:event_jMenuItem10MousePressed

    private void jMenuItem11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MousePressed
        String Usuario = JOptionPane.showInputDialog("Modificar Usuario: ");
        usuarios.get(posi).setUsuario(Usuario);
        U_Perfil.setText(Usuario);
    }//GEN-LAST:event_jMenuItem11MousePressed

    private void jMenuItem12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MousePressed
        String Pais = JOptionPane.showInputDialog("Modificar Pais: ");
        usuarios.get(posi).setUsuario(Pais);
        U_Perfil.setText(Pais);
    }//GEN-LAST:event_jMenuItem12MousePressed

    private void jMenuItem14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MousePressed


    }//GEN-LAST:event_jMenuItem14MousePressed

    private void jMenuItem7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MousePressed
        PaginaPrincipalOfertador.pack();
        PaginaPrincipalOfertador.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        usuario_L.setText("");
        contra_L.setText("");
    }//GEN-LAST:event_jMenuItem7MousePressed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenu22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu22MouseClicked

    private void jMenuItem28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28MouseClicked

    private void jMenu24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu24MouseClicked

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem23MouseClicked
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem23MouseClicked

    private void jMenuItem36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem36MousePressed
        PaginaPrincipalCliente.pack();
        PaginaPrincipalCliente.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);

    }//GEN-LAST:event_jMenuItem36MousePressed

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
    private javax.swing.JButton AQUI;
    private javax.swing.JTextField Ag_Cilindraje;
    private javax.swing.JTextField Ag_Tranmision;
    private javax.swing.JTextField Ag_ano;
    private javax.swing.JTextField Ag_marca;
    private javax.swing.JTextField Ag_modelo;
    private javax.swing.JTextField Ag_tipo;
    private javax.swing.JFrame Agregar_Admins;
    private javax.swing.JFrame Agregar_Carro_OF;
    private javax.swing.JFrame Busqueda;
    private javax.swing.JDialog CitasCarwash;
    private javax.swing.JFrame Cliente;
    private javax.swing.JLabel Co_Perfil;
    private javax.swing.JLabel Cu_Perfil;
    private javax.swing.JTextArea Des_Publicidad;
    private javax.swing.JLabel ImagenEmpresa;
    private javax.swing.JFrame Membrecias_Ofertadores;
    private javax.swing.JLabel N_Perfil;
    private javax.swing.JLabel P_Perfil;
    private javax.swing.JFrame PaginaPrincipalAdministrador;
    private javax.swing.JFrame PaginaPrincipalCliente;
    private javax.swing.JFrame PaginaPrincipalOfertador;
    private javax.swing.JFrame PerfilEmpresa;
    private javax.swing.JFrame Perfil_U;
    private javax.swing.JFrame Publicidad;
    private javax.swing.JFrame Registro;
    private javax.swing.JFrame Restablecer;
    private javax.swing.JMenu Subasta;
    private javax.swing.JFrame Subastador;
    private javax.swing.JLabel T_Perfil;
    private javax.swing.JDialog TablaMembrecias;
    private javax.swing.JTextField Ti_Publicidad;
    private javax.swing.JLabel U_Perfil;
    private javax.swing.JTable UsuariosAdmin_jt;
    private javax.swing.JMenu UsuariosName;
    private javax.swing.JFrame VendedorDirecto;
    private javax.swing.JDialog VentaDirecta;
    private javax.swing.JPasswordField admin_contra;
    private javax.swing.JTextField admin_correo;
    private datechooser.beans.DateChooserCombo admin_cumple;
    private javax.swing.JTextField admin_nombre;
    private javax.swing.JComboBox<String> admin_paiss;
    private javax.swing.JTextField admin_usuario;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox_Carwash;
    private javax.swing.JCheckBox jCheckBox_Carwash1;
    private javax.swing.JCheckBox jCheckBox_Directo;
    private javax.swing.JCheckBox jCheckBox_Directo1;
    private javax.swing.JCheckBox jCheckBox_Rentador;
    private javax.swing.JCheckBox jCheckBox_Rentador1;
    private javax.swing.JCheckBox jCheckBox_Subastador;
    private javax.swing.JCheckBox jCheckBox_Subastador1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jT_C_ofertador1;
    private javax.swing.JTable jT_C_ofertador2;
    private javax.swing.JTable jT_C_ofertador3;
    private javax.swing.JTable jT_Publicidad;
    private javax.swing.JTable jT_membrecias1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
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
    private javax.swing.JLabel lb_foto;
    private javax.swing.JMenu menufoto;
    private javax.swing.JTextField ni_R;
    private javax.swing.JTextField no_R;
    private javax.swing.JComboBox<String> pa_R;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JTextField usuario_L;
    // End of variables declaration//GEN-END:variables
}
