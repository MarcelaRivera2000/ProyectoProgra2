package proyectoprogra.pkg2;

import datechooser.beans.DateChooserDialog;
import datechooser.beans.DateChooserPanel;
import java.awt.Color;
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
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(420, 540);
        b.cargarArchivo();
        for (Ofertadores2 i : b.getListaPersonas()) {
            usuarios.add((Ofertadores2) i);
        }
        f.Leer();
        for (Usuario p : f.getLista()) {
            usuarios.add((Cliente) p);
        }
        usuarios.add(new Administrador("Administrador", "marcel", "123", "Marcela Rivera", "Honduras", "Marci.eunicer@gmail.com", "Ubicacion", "14/1/2020"));
        u = f2.Leer();
    }

    public void llenarTabla() {
        if (usuarios.get(posi) instanceof Administrador) {
            DefaultTableModel t = (DefaultTableModel) TodosUsuarios.getModel();
            for (int i = t.getRowCount() - 1; i >= 0; i--) {
                t.removeRow(i);
            }
            for (Usuario i : usuarios) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), i.getContra(), i.getPais(), i.getFecha(), i.getCorreo(), i.getTipo()};
                t.addRow(usuarios);

            }
            TodosUsuarios.setModel(t);
        } else if (usuarios.get(posi) instanceof Ofertadores2) {

            DefaultTableModel membrecias = (DefaultTableModel) jT_membrecias1.getModel();

            for (int i = membrecias.getRowCount() - 1; i >= 0; i--) {
                membrecias.removeRow(i);
            }

            //Tabla membrecias
            for (Membrecias i : ((Ofertadores2) usuarios.get(posi)).getMembrecias()) {
                Object[] membrecia = {i.getTipo(), i.getDescripcion()};
                membrecias.addRow(membrecia);
            }
            jT_membrecias1.setModel(membrecias);

        } else if (usuarios.get(posi) instanceof Cliente) {

        }

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
        jMenuItem2 = new javax.swing.JMenuItem();
        botonVendedor = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        botonSubasta = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        botonCarwash = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        botonRenta = new javax.swing.JMenu();
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
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TodosUsuarios = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel132 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu32 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu31 = new javax.swing.JMenu();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
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
        jLabel59 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        politica = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        mision = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        vision = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        objetivos = new javax.swing.JTextArea();
        jLabel69 = new javax.swing.JLabel();
        dirrecciom = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        gmail = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jMenuBar10 = new javax.swing.JMenuBar();
        jMenu33 = new javax.swing.JMenu();
        jMenu34 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenu35 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu36 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenu37 = new javax.swing.JMenu();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenu38 = new javax.swing.JMenu();
        jMenu39 = new javax.swing.JMenu();
        jMenu40 = new javax.swing.JMenu();
        PaginaPrincipalCliente = new javax.swing.JFrame();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu29 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        Subasta = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        BusquedaSitio = new javax.swing.JDialog();
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
        CrearAdmin = new javax.swing.JDialog();
        ad_name = new javax.swing.JTextField();
        ad_usuario = new javax.swing.JTextField();
        ad_correo = new javax.swing.JTextField();
        ad_contra = new javax.swing.JPasswordField();
        ad_confirmarcontra = new javax.swing.JPasswordField();
        ad_pais = new javax.swing.JComboBox<>();
        ad_cumple = new datechooser.beans.DateChooserCombo();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu30 = new javax.swing.JMenu();
        ModificarAdmin = new javax.swing.JDialog();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        modiadmin_nombre = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        modiadmin_usuario = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        modiadmin_correo = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        modiadmin_pais = new javax.swing.JComboBox<>();
        modiadmin_fecha = new datechooser.beans.DateChooserCombo();
        jLabel99 = new javax.swing.JLabel();
        modiadmin_contra = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TodosUsuarios1 = new javax.swing.JTable();
        ModificarOfertador = new javax.swing.JDialog();
        modiofer_pais1 = new javax.swing.JComboBox<>();
        modiofer_fecha1 = new datechooser.beans.DateChooserCombo();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        modiofer_contra1 = new javax.swing.JTextField();
        modiofer_nombre1 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        modiofer_usuario1 = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        TodosUsuarios2 = new javax.swing.JTable();
        jLabel105 = new javax.swing.JLabel();
        modiaofer_correo1 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        ListaMembrecias = new javax.swing.JList<>();
        jLabel108 = new javax.swing.JLabel();
        PopMenuOfertadoresModificar = new javax.swing.JPopupMenu();
        EliminarMem = new javax.swing.JMenu();
        AgregarSubasta = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAutosSubasta = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        DescripSubasta = new javax.swing.JTextArea();
        precioSubasta = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tablaPendientesSubasta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tablaAprovadaSubasta = new javax.swing.JTable();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jLabel109 = new javax.swing.JLabel();
        contra_L = new javax.swing.JPasswordField();
        usuario_L = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();

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

        menufoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aee7db610a2bb8e316f5db1026cf650a.png"))); // NOI18N
        menufoto.setText("Perfil");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7d897245e2fea397b79269556430c993.png"))); // NOI18N
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
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6fb9dc3457f68037b47b34c93eee1887.png"))); // NOI18N
        jMenuItem7.setText("Log Out");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menufoto.add(jMenuItem7);

        jMenuBar2.add(menufoto);

        jMenu12.setText("Membrecias");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8ec53d6d798ad4d84737f8d1f431ce92.png"))); // NOI18N
        jMenuItem2.setText("Ver Membrecias");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu12.add(jMenuItem2);

        jMenuBar2.add(jMenu12);

        botonVendedor.setText("Vendedor Directo");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5b2a0e73d5fe2accd65c7a0b60720754.png"))); // NOI18N
        jMenuItem4.setText("Agregar Publicidad");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        botonVendedor.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5e9e53330d45406d5d0f669acd41a10e.png"))); // NOI18N
        jMenuItem5.setText("Agregar Carros");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem5MousePressed(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        botonVendedor.add(jMenuItem5);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/f5ff4d95816031828833330132f0080a.png"))); // NOI18N
        jMenuItem18.setText("Venta Directa");
        botonVendedor.add(jMenuItem18);

        jMenuBar2.add(botonVendedor);

        botonSubasta.setText("Subasta");
        botonSubasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSubastaMousePressed(evt);
            }
        });

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5b2a0e73d5fe2accd65c7a0b60720754.png"))); // NOI18N
        jMenuItem21.setText("Agregar Publicidad");
        botonSubasta.add(jMenuItem21);

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5e9e53330d45406d5d0f669acd41a10e.png"))); // NOI18N
        jMenuItem28.setText("Agregar Carros ");
        jMenuItem28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem28MousePressed(evt);
            }
        });
        botonSubasta.add(jMenuItem28);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/228d3ff7d068c048deaf6e945dd18912.png"))); // NOI18N
        jMenuItem20.setText("Subir Vehiculo");
        botonSubasta.add(jMenuItem20);

        jMenuBar2.add(botonSubasta);

        botonCarwash.setText("Carwash");

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9ed863633135146d2a14903160a0e10f.png"))); // NOI18N
        jMenuItem22.setText("Ver Citas");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        botonCarwash.add(jMenuItem22);

        jMenuBar2.add(botonCarwash);

        botonRenta.setText("Renta");

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5e9e53330d45406d5d0f669acd41a10e.png"))); // NOI18N
        jMenuItem24.setText("Agregar Vehiculos");
        botonRenta.add(jMenuItem24);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ecac78f6ba2764062060dd4797ea18ce.png"))); // NOI18N
        jMenuItem25.setText("Reservas");
        botonRenta.add(jMenuItem25);

        jMenuBar2.add(botonRenta);

        PaginaPrincipalOfertador.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout PaginaPrincipalOfertadorLayout = new javax.swing.GroupLayout(PaginaPrincipalOfertador.getContentPane());
        PaginaPrincipalOfertador.getContentPane().setLayout(PaginaPrincipalOfertadorLayout);
        PaginaPrincipalOfertadorLayout.setHorizontalGroup(
            PaginaPrincipalOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1478, Short.MAX_VALUE)
        );
        PaginaPrincipalOfertadorLayout.setVerticalGroup(
            PaginaPrincipalOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
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
                        .addGap(75, 75, 75)
                        .addComponent(jLabel12))
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AQUI)
                            .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
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
                .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Perfil_ULayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Perfil_ULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Perfil_ULayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(U_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cu_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Perfil_ULayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AQUI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Co_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel23)
                .addContainerGap(234, Short.MAX_VALUE))
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
        jT_C_ofertador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_C_ofertador2MouseClicked(evt);
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
                .addGroup(Agregar_Carro_OFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ag_Cilindraje, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(Ag_Tranmision, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(Ag_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(Ag_marca, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(Ag_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(Ag_ano, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282)
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

        PaginaPrincipalAdministrador.getContentPane().setLayout(null);

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6b71c00f79df13d1844ab9ef9eee83ed.png"))); // NOI18N
        jLabel115.setToolTipText("");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel115);
        jLabel115.setBounds(1270, 110, 40, 40);

        jLabel114.setBackground(new java.awt.Color(204, 204, 204));
        jLabel114.setFont(new java.awt.Font("Bookman Old Style", 1, 45)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(204, 204, 204));
        jLabel114.setText("VEHICULOS.COM");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel114);
        jLabel114.setBounds(760, 20, 410, 40);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/franjaGris.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel113);
        jLabel113.setBounds(0, 0, 1920, 60);

        TodosUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        TodosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(TodosUsuarios);

        PaginaPrincipalAdministrador.getContentPane().add(jScrollPane13);
        jScrollPane13.setBounds(170, 140, 990, 270);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67f6f2a394be3b4aadc02526610c71f4.png"))); // NOI18N
        jButton29.setText("Ofertadores");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        PaginaPrincipalAdministrador.getContentPane().add(jButton29);
        jButton29.setBounds(10, 210, 149, 59);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jButton30.setText("Clientes");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        PaginaPrincipalAdministrador.getContentPane().add(jButton30);
        jButton30.setBounds(10, 280, 149, 59);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b6e39168db988b74ac477669d89c87aa.png"))); // NOI18N
        jButton32.setText("Administradores");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        PaginaPrincipalAdministrador.getContentPane().add(jButton32);
        jButton32.setBounds(10, 140, 149, 59);

        jLabel82.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel82.setText("SOLICITUDES DE SUBASTA");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel82);
        jLabel82.setBounds(1320, 120, 260, 20);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/100a56994eff619c52cafe8907699880.png"))); // NOI18N
        jButton27.setText("Aprobar Solicitud");
        PaginaPrincipalAdministrador.getContentPane().add(jButton27);
        jButton27.setBounds(1260, 820, 180, 60);

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/43e6e6c55c64b5d8863167a6bff26810.png"))); // NOI18N
        jButton37.setText("Denegar Solicitud");
        PaginaPrincipalAdministrador.getContentPane().add(jButton37);
        jButton37.setBounds(1450, 820, 190, 60);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4f34d96185ac6ec90d3746cf2a60a15b.png"))); // NOI18N
        jButton33.setText("Todos");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        PaginaPrincipalAdministrador.getContentPane().add(jButton33);
        jButton33.setBounds(10, 350, 149, 59);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ofertador", "Auto", "Descripcion", "Precio Inicial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
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
        jScrollPane22.setViewportView(jTable5);

        PaginaPrincipalAdministrador.getContentPane().add(jScrollPane22);
        jScrollPane22.setBounds(1260, 150, 570, 660);

        jLabel132.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel132.setText("USUARIOS ACTIVOS");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel132);
        jLabel132.setBounds(230, 110, 190, 20);

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6b71c00f79df13d1844ab9ef9eee83ed.png"))); // NOI18N
        jLabel131.setToolTipText("");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel131);
        jLabel131.setBounds(180, 100, 40, 40);

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel125);
        jLabel125.setBounds(1520, 100, 350, 70);

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel123);
        jLabel123.setBounds(1210, 100, 440, 190);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel116.setText("jLabel116");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel116);
        jLabel116.setBounds(50, 120, 500, 100);

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel119);
        jLabel119.setBounds(340, 450, 500, 70);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel118.setText("jLabel118");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel118);
        jLabel118.setBounds(1210, 280, 440, 450);

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel117.setText("jLabel117");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel117);
        jLabel117.setBounds(1210, 550, 490, 390);

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranja.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel120);
        jLabel120.setBounds(1590, 170, 280, 430);

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel121);
        jLabel121.setBounds(820, 210, 370, 310);

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel122.setText("jLabel116");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel122);
        jLabel122.setBounds(10, 100, 55, 420);

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel124);
        jLabel124.setBounds(340, 450, 500, 70);

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranja.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel126);
        jLabel126.setBounds(970, 100, 220, 110);

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel127.setText("jLabel118");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel127);
        jLabel127.setBounds(500, 100, 470, 350);

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel128.setText("jLabel116");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel128);
        jLabel128.setBounds(60, 120, 480, 100);

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel129.setText("jLabel116");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel129);
        jLabel129.setBounds(1390, 600, 480, 340);

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel130.setText("jLabel117");
        PaginaPrincipalAdministrador.getContentPane().add(jLabel130);
        jLabel130.setBounds(60, 100, 490, 420);

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/franjaGris_2.jpg"))); // NOI18N
        PaginaPrincipalAdministrador.getContentPane().add(jLabel112);
        jLabel112.setBounds(0, 30, 1930, 1030);

        jMenu32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu32);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aee7db610a2bb8e316f5db1026cf650a.png"))); // NOI18N
        jMenu1.setText("Perfil");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7d897245e2fea397b79269556430c993.png"))); // NOI18N
        jMenuItem9.setText("Ver Perfil");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem9MousePressed(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6fb9dc3457f68037b47b34c93eee1887.png"))); // NOI18N
        jMenuItem8.setText("Log Out");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Perfil de la empresa");

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/54e1030f30532a37ebeaa25e56fd7983.png"))); // NOI18N
        jMenuItem16.setText("Ver Perfil");
        jMenuItem16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem16MousePressed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Administrar usuarios");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b6e39168db988b74ac477669d89c87aa.png"))); // NOI18N
        jMenuItem1.setText("Crear Administrador");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67f6f2a394be3b4aadc02526610c71f4.png"))); // NOI18N
        jMenuItem27.setText("Crear Ofertador");
        jMenu2.add(jMenuItem27);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jMenuItem26.setText("Crear Cliente");
        jMenu2.add(jMenuItem26);

        jMenu31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7a1d683a9608e02a004fdb6b17f45556.png"))); // NOI18N
        jMenu31.setText("Modificar o Eliminar Usuarios");

        jMenuItem41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b6e39168db988b74ac477669d89c87aa.png"))); // NOI18N
        jMenuItem41.setText("Administradores");
        jMenuItem41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem41MousePressed(evt);
            }
        });
        jMenu31.add(jMenuItem41);

        jMenuItem42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67f6f2a394be3b4aadc02526610c71f4.png"))); // NOI18N
        jMenuItem42.setText("Ofertadores");
        jMenuItem42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem42MousePressed(evt);
            }
        });
        jMenu31.add(jMenuItem42);

        jMenuItem43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jMenuItem43.setText("Clientes");
        jMenu31.add(jMenuItem43);

        jMenu2.add(jMenu31);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Subasta");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reporteria");
        jMenuBar1.add(jMenu5);

        jMenu21.setText("Reportes");
        jMenuBar1.add(jMenu21);

        PaginaPrincipalAdministrador.setJMenuBar(jMenuBar1);

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

        PerfilEmpresa.setSize(new java.awt.Dimension(1496, 835));
        PerfilEmpresa.getContentPane().setLayout(null);

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel59.setText("Vision:");
        PerfilEmpresa.getContentPane().add(jLabel59);
        jLabel59.setBounds(30, 390, 80, 30);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setText("Mision:");
        PerfilEmpresa.getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 220, 130, 24);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel25.setText("Vehiculos.com");
        PerfilEmpresa.getContentPane().add(jLabel25);
        jLabel25.setBounds(780, 200, 340, 60);

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel60.setText("Objetivos:");
        PerfilEmpresa.getContentPane().add(jLabel60);
        jLabel60.setBounds(30, 580, 130, 24);

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel62.setText("Politicas:");
        PerfilEmpresa.getContentPane().add(jLabel62);
        jLabel62.setBounds(30, 760, 110, 24);

        politica.setColumns(20);
        politica.setRows(5);
        jScrollPane17.setViewportView(politica);

        PerfilEmpresa.getContentPane().add(jScrollPane17);
        jScrollPane17.setBounds(30, 790, 680, 120);

        mision.setColumns(20);
        mision.setRows(5);
        jScrollPane18.setViewportView(mision);

        PerfilEmpresa.getContentPane().add(jScrollPane18);
        jScrollPane18.setBounds(30, 250, 680, 130);

        vision.setColumns(20);
        vision.setRows(5);
        jScrollPane19.setViewportView(vision);

        PerfilEmpresa.getContentPane().add(jScrollPane19);
        jScrollPane19.setBounds(30, 420, 680, 140);

        objetivos.setColumns(20);
        objetivos.setRows(5);
        jScrollPane20.setViewportView(objetivos);

        PerfilEmpresa.getContentPane().add(jScrollPane20);
        jScrollPane20.setBounds(30, 610, 680, 130);

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 100)); // NOI18N
        jLabel69.setText("Ubicacion:");
        PerfilEmpresa.getContentPane().add(jLabel69);
        jLabel69.setBounds(1330, 240, 550, 170);
        PerfilEmpresa.getContentPane().add(dirrecciom);
        dirrecciom.setBounds(1460, 600, 390, 40);

        jLabel70.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel70.setText("CONTACTANOS");
        PerfilEmpresa.getContentPane().add(jLabel70);
        jLabel70.setBounds(1390, 440, 250, 24);

        jLabel71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cfe4882a281dea2fd5e5ac91dbfb9f37.png"))); // NOI18N
        jLabel71.setText(":");
        PerfilEmpresa.getContentPane().add(jLabel71);
        jLabel71.setBounds(1410, 480, 140, 40);
        PerfilEmpresa.getContentPane().add(telefono);
        telefono.setBounds(1460, 480, 390, 40);
        PerfilEmpresa.getContentPane().add(gmail);
        gmail.setBounds(1460, 540, 390, 40);

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b38964bf7e17acd41b8fbefebe5f467c.png"))); // NOI18N
        jLabel72.setText(":");
        PerfilEmpresa.getContentPane().add(jLabel72);
        jLabel72.setBounds(1410, 540, 140, 40);

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/067d6aeda2fca6d3c43eaafaf977eb34.png"))); // NOI18N
        jLabel73.setText(":");
        PerfilEmpresa.getContentPane().add(jLabel73);
        jLabel73.setBounds(1410, 600, 140, 40);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/thumb-1920-271900.jpg"))); // NOI18N
        PerfilEmpresa.getContentPane().add(jLabel110);
        jLabel110.setBounds(0, -250, 1950, 460);

        jLabel111.setText("jLabel111");
        PerfilEmpresa.getContentPane().add(jLabel111);
        jLabel111.setBounds(0, 160, 420, 50);

        jMenu33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar10.add(jMenu33);

        jMenu34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aee7db610a2bb8e316f5db1026cf650a.png"))); // NOI18N
        jMenu34.setText("Perfil");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7d897245e2fea397b79269556430c993.png"))); // NOI18N
        jMenuItem15.setText("Ver Perfil");
        jMenuItem15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem15MousePressed(evt);
            }
        });
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu34.add(jMenuItem15);

        jMenuItem44.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6fb9dc3457f68037b47b34c93eee1887.png"))); // NOI18N
        jMenuItem44.setText("Log Out");
        jMenuItem44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem44MousePressed(evt);
            }
        });
        jMenu34.add(jMenuItem44);

        jMenuBar10.add(jMenu34);

        jMenu35.setText("Perfil de la empresa");

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/54a4796fdb685e1075fa6808aa5e397d.png"))); // NOI18N
        jMenuItem19.setText("Volver A La Pagina Principal");
        jMenuItem19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem19MousePressed(evt);
            }
        });
        jMenu35.add(jMenuItem19);

        jMenuItem45.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/54e1030f30532a37ebeaa25e56fd7983.png"))); // NOI18N
        jMenuItem45.setText("Guardar Cambios");
        jMenu35.add(jMenuItem45);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jMenuItem17.setText("Ver Como Cliente");
        jMenu35.add(jMenuItem17);

        jMenuBar10.add(jMenu35);

        jMenu36.setText("Administrar usuarios");
        jMenu36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu36MouseClicked(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b6e39168db988b74ac477669d89c87aa.png"))); // NOI18N
        jMenuItem3.setText("Crear Administrador");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu36.add(jMenuItem3);

        jMenuItem46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67f6f2a394be3b4aadc02526610c71f4.png"))); // NOI18N
        jMenuItem46.setText("Crear Ofertador");
        jMenu36.add(jMenuItem46);

        jMenuItem47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jMenuItem47.setText("Crear Cliente");
        jMenu36.add(jMenuItem47);

        jMenu37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7a1d683a9608e02a004fdb6b17f45556.png"))); // NOI18N
        jMenu37.setText("Modificar o Eliminar Usuarios");

        jMenuItem48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b6e39168db988b74ac477669d89c87aa.png"))); // NOI18N
        jMenuItem48.setText("Administradores");
        jMenuItem48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem48MousePressed(evt);
            }
        });
        jMenu37.add(jMenuItem48);

        jMenuItem49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/67f6f2a394be3b4aadc02526610c71f4.png"))); // NOI18N
        jMenuItem49.setText("Ofertadores");
        jMenuItem49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem49MousePressed(evt);
            }
        });
        jMenu37.add(jMenuItem49);

        jMenuItem50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/605bd5097ea3d01231968e534da41df1.png"))); // NOI18N
        jMenuItem50.setText("Clientes");
        jMenu37.add(jMenuItem50);

        jMenu36.add(jMenu37);

        jMenuBar10.add(jMenu36);

        jMenu38.setText("Subasta");
        jMenuBar10.add(jMenu38);

        jMenu39.setText("Reporteria");
        jMenuBar10.add(jMenu39);

        jMenu40.setText("Reportes");
        jMenuBar10.add(jMenu40);

        PerfilEmpresa.setJMenuBar(jMenuBar10);

        jMenu19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuBar7.add(jMenu19);

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aee7db610a2bb8e316f5db1026cf650a.png"))); // NOI18N
        jMenu20.setText("Perfil");

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7d897245e2fea397b79269556430c993.png"))); // NOI18N
        jMenuItem23.setText("Ver Perfil");
        jMenuItem23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem23MouseClicked(evt);
            }
        });
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem23);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6fb9dc3457f68037b47b34c93eee1887.png"))); // NOI18N
        jMenuItem36.setText("Log Out");
        jMenuItem36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem36MousePressed(evt);
            }
        });
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem36);

        jMenuBar7.add(jMenu20);

        jMenu29.setText("Mis Facturas");
        jMenuBar7.add(jMenu29);

        jMenu28.setText("Busqueda");
        jMenu28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu28MouseClicked(evt);
            }
        });
        jMenuBar7.add(jMenu28);

        Subasta.setText("Navegar");

        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5e9e53330d45406d5d0f669acd41a10e.png"))); // NOI18N
        jMenuItem37.setText("Comprar AutoMovil");
        Subasta.add(jMenuItem37);

        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/228d3ff7d068c048deaf6e945dd18912.png"))); // NOI18N
        jMenuItem38.setText("Subasta Online");
        Subasta.add(jMenuItem38);

        jMenuItem39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9ed863633135146d2a14903160a0e10f.png"))); // NOI18N
        jMenuItem39.setText("Renta autos");
        Subasta.add(jMenuItem39);

        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9357ee337f4a2b4100277f59bb9ceb4a.png"))); // NOI18N
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
            .addGap(0, 792, Short.MAX_VALUE)
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

        javax.swing.GroupLayout BusquedaSitioLayout = new javax.swing.GroupLayout(BusquedaSitio.getContentPane());
        BusquedaSitio.getContentPane().setLayout(BusquedaSitioLayout);
        BusquedaSitioLayout.setHorizontalGroup(
            BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaSitioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BusquedaSitioLayout.createSequentialGroup()
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BusquedaSitioLayout.createSequentialGroup()
                                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BusquedaSitioLayout.createSequentialGroup()
                                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel74))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel79))
                                .addGap(16, 16, 16)
                                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BusquedaSitioLayout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton2))
                                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        BusquedaSitioLayout.setVerticalGroup(
            BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BusquedaSitioLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel81)
                .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BusquedaSitioLayout.createSequentialGroup()
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74))
                        .addGap(44, 44, 44)
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75))
                        .addGap(40, 40, 40)
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76)))
                    .addGroup(BusquedaSitioLayout.createSequentialGroup()
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(BusquedaSitioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)))
                    .addGroup(BusquedaSitioLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel78)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        ad_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        ad_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_paisActionPerformed(evt);
            }
        });

        ad_cumple.setCalendarPreferredSize(new java.awt.Dimension(510, 360));
        ad_cumple.setLocale(new java.util.Locale("es", "ES", ""));

        jLabel83.setText("Nombre Completo:");

        jLabel84.setText("Usuario:");

        jLabel85.setText("Contraseña:");

        jLabel86.setText("Confirmar Contraseña:");

        jLabel87.setText("Pais de Origen:");

        jLabel88.setText("Correo Electronico:");

        jLabel89.setText("Cumpleaños:");

        jLabel90.setText("Ubicacion:");

        jLabel91.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel91.setText("CREAR USUARIO ADMINISTRADOR");

        jButton34.setText("AGREGAR ADMINISTRADOR");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jMenu30.setText("Volver");
        jMenu30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu30MouseClicked(evt);
            }
        });
        jMenuBar9.add(jMenu30);

        CrearAdmin.setJMenuBar(jMenuBar9);

        javax.swing.GroupLayout CrearAdminLayout = new javax.swing.GroupLayout(CrearAdmin.getContentPane());
        CrearAdmin.getContentPane().setLayout(CrearAdminLayout);
        CrearAdminLayout.setHorizontalGroup(
            CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearAdminLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(jLabel90)
                    .addGroup(CrearAdminLayout.createSequentialGroup()
                        .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(jLabel84)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89))
                        .addGap(41, 41, 41)
                        .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(ad_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad_confirmarcontra)
                            .addComponent(ad_contra)
                            .addComponent(ad_correo)
                            .addComponent(ad_usuario)
                            .addComponent(ad_name)
                            .addComponent(ad_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        CrearAdminLayout.setVerticalGroup(
            CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearAdminLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CrearAdminLayout.createSequentialGroup()
                        .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CrearAdminLayout.createSequentialGroup()
                                .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CrearAdminLayout.createSequentialGroup()
                                        .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(CrearAdminLayout.createSequentialGroup()
                                                .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(CrearAdminLayout.createSequentialGroup()
                                                        .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(ad_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel83))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(ad_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel84))
                                                .addGap(18, 18, 18)
                                                .addComponent(ad_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel85))
                                        .addGap(18, 18, 18)
                                        .addComponent(ad_confirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel86))
                                .addGap(25, 25, 25)
                                .addComponent(ad_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel87))
                        .addGap(18, 18, 18)
                        .addComponent(ad_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel88))
                .addGap(18, 18, 18)
                .addGroup(CrearAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ad_cumple, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89))
                .addGap(37, 37, 37)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addGap(50, 50, 50))
        );

        jLabel92.setText("Usuario:");

        jLabel93.setText("Contraseña:");

        jLabel95.setText("Pais de Origen:");

        jLabel96.setText("Correo Electronico:");

        jLabel97.setText("Cumpleaños:");

        jLabel98.setText("Ubicacion:");

        modiadmin_pais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        modiadmin_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiadmin_paisActionPerformed(evt);
            }
        });

        modiadmin_fecha.setCalendarPreferredSize(new java.awt.Dimension(510, 360));
        modiadmin_fecha.setLocale(new java.util.Locale("es", "ES", ""));

        jLabel99.setText("Nombre Completo:");

        jButton35.setText("Modificar");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel94.setText("ADMINISTRADORES");

        TodosUsuarios1.setModel(new javax.swing.table.DefaultTableModel(
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
        TodosUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodosUsuarios1MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(TodosUsuarios1);

        javax.swing.GroupLayout ModificarAdminLayout = new javax.swing.GroupLayout(ModificarAdmin.getContentPane());
        ModificarAdmin.getContentPane().setLayout(ModificarAdminLayout);
        ModificarAdminLayout.setHorizontalGroup(
            ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarAdminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ModificarAdminLayout.createSequentialGroup()
                            .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel99)
                                .addComponent(jLabel92)
                                .addComponent(jLabel93))
                            .addGap(65, 65, 65)
                            .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(modiadmin_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addComponent(modiadmin_usuario)
                                .addComponent(modiadmin_contra)))
                        .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton35)
                        .addGroup(ModificarAdminLayout.createSequentialGroup()
                            .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel95)
                                .addComponent(jLabel96)
                                .addComponent(jLabel97))
                            .addGap(61, 61, 61)
                            .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(modiadmin_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modiadmin_pais, 0, 288, Short.MAX_VALUE)
                                .addComponent(modiadmin_correo)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        ModificarAdminLayout.setVerticalGroup(
            ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarAdminLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModificarAdminLayout.createSequentialGroup()
                        .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ModificarAdminLayout.createSequentialGroup()
                                .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modiadmin_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99))
                                .addGap(18, 18, 18)
                                .addComponent(modiadmin_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel92))
                        .addGap(56, 56, 56))
                    .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel93)
                        .addComponent(modiadmin_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModificarAdminLayout.createSequentialGroup()
                        .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modiadmin_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95))
                        .addGap(18, 18, 18)
                        .addComponent(modiadmin_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel96))
                .addGap(18, 18, 18)
                .addGroup(ModificarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modiadmin_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addGap(37, 37, 37)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton35)
                .addGap(147, 147, 147))
            .addGroup(ModificarAdminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        modiofer_pais1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  --------------------  ", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        modiofer_pais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiofer_pais1ActionPerformed(evt);
            }
        });

        modiofer_fecha1.setCalendarPreferredSize(new java.awt.Dimension(510, 360));
        modiofer_fecha1.setLocale(new java.util.Locale("es", "ES", ""));

        jLabel100.setText("Usuario:");

        jLabel101.setText("Nombre Completo:");

        jLabel102.setText("Contraseña:");

        jButton36.setText("Modificar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jLabel103.setText("Pais de Origen:");

        jLabel104.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel104.setText("OFERTADORES");

        TodosUsuarios2.setModel(new javax.swing.table.DefaultTableModel(
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
        TodosUsuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodosUsuarios2MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(TodosUsuarios2);

        jLabel105.setText("Correo Electronico:");

        jLabel106.setText("Cumpleaños:");

        jLabel107.setText("Ubicacion:");

        ListaMembrecias.setModel(new DefaultListModel());
        ListaMembrecias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMembreciasMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(ListaMembrecias);

        jLabel108.setText("Membrecias");

        javax.swing.GroupLayout ModificarOfertadorLayout = new javax.swing.GroupLayout(ModificarOfertador.getContentPane());
        ModificarOfertador.getContentPane().setLayout(ModificarOfertadorLayout);
        ModificarOfertadorLayout.setHorizontalGroup(
            ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(jLabel108)
                    .addComponent(jScrollPane14))
                .addGap(18, 18, 18)
                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                            .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel101)
                                .addComponent(jLabel100)
                                .addComponent(jLabel102))
                            .addGap(65, 65, 65)
                            .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(modiofer_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addComponent(modiofer_usuario1)
                                .addComponent(modiofer_contra1)))
                        .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton36)
                        .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                            .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel103)
                                .addComponent(jLabel105)
                                .addComponent(jLabel106))
                            .addGap(61, 61, 61)
                            .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(modiofer_fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modiofer_pais1, 0, 288, Short.MAX_VALUE)
                                .addComponent(modiaofer_correo1)))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        ModificarOfertadorLayout.setVerticalGroup(
            ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                                        .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(modiofer_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel101))
                                        .addGap(18, 18, 18)
                                        .addComponent(modiofer_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel100))
                                .addGap(56, 56, 56))
                            .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel102)
                                .addComponent(modiofer_contra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modiofer_pais1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel103))
                                .addGap(18, 18, 18)
                                .addComponent(modiaofer_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel105))
                        .addGap(18, 18, 18)
                        .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modiofer_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel107))
                    .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel108)
                .addGap(18, 18, 18)
                .addGroup(ModificarOfertadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                        .addComponent(jButton36)
                        .addGap(147, 147, 147))
                    .addGroup(ModificarOfertadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        EliminarMem.setText("Eliminar Membrecia");
        EliminarMem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMemMouseClicked(evt);
            }
        });
        PopMenuOfertadoresModificar.add(EliminarMem);

        tablaAutosSubasta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaAutosSubasta);

        jButton5.setText("Agregar Carro");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setText("SUBASTA");

        jLabel29.setText("Carro:");

        jLabel133.setText("Descripcion: ");

        jLabel140.setText("Precio Inicial:");

        DescripSubasta.setColumns(20);
        DescripSubasta.setRows(5);
        jScrollPane23.setViewportView(DescripSubasta);

        jButton10.setText("Mandar Solicitud De Subasta");

        tablaPendientesSubasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auto", "Descripcion", "Precio inicial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane24.setViewportView(tablaPendientesSubasta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Solicitudes Pendientes", jPanel1);

        tablaAprovadaSubasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Auto", "Descripcion", "Precio inicial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane25.setViewportView(tablaAprovadaSubasta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Solicitudes Aprovadas", jPanel2);

        jMenu8.setText("Volver");
        jMenuBar8.add(jMenu8);

        AgregarSubasta.setJMenuBar(jMenuBar8);

        javax.swing.GroupLayout AgregarSubastaLayout = new javax.swing.GroupLayout(AgregarSubasta.getContentPane());
        AgregarSubasta.getContentPane().setLayout(AgregarSubastaLayout);
        AgregarSubastaLayout.setHorizontalGroup(
            AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarSubastaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(AgregarSubastaLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgregarSubastaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgregarSubastaLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AgregarSubastaLayout.createSequentialGroup()
                                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel133)
                                            .addComponent(jLabel29))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(AgregarSubastaLayout.createSequentialGroup()
                                        .addComponent(jLabel140)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(precioSubasta))))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        AgregarSubastaLayout.setVerticalGroup(
            AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarSubastaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(AgregarSubastaLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel133)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(AgregarSubastaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel140))
                        .addGap(54, 54, 54)
                        .addComponent(jButton10)))
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2a6535b5c1f4117db4872e2459ad1525.png"))); // NOI18N
        getContentPane().add(jLabel109);
        jLabel109.setBounds(90, 40, 200, 210);
        getContentPane().add(contra_L);
        contra_L.setBounds(70, 350, 278, 34);
        getContentPane().add(usuario_L);
        usuario_L.setBounds(70, 270, 278, 32);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 240, 110, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 320, 130, 20);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 410, 278, 32);

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(6, 6, 83, 32);

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Restablecer Contraseña/Usuario");
        jLabel13.setAlignmentX(0.5F);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 450, 220, 30);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranja.jpg"))); // NOI18N
        getContentPane().add(jLabel137);
        jLabel137.setBounds(360, 350, 60, 180);

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.jpg"))); // NOI18N
        getContentPane().add(jLabel138);
        jLabel138.setBounds(190, -20, 230, 150);

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/naranjaamarilloso.jpg"))); // NOI18N
        getContentPane().add(jLabel139);
        jLabel139.setBounds(-130, 410, 500, 120);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azuloscuro.jpg"))); // NOI18N
        jLabel134.setText("jLabel116");
        getContentPane().add(jLabel134);
        jLabel134.setBounds(0, -110, 70, 420);

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azulclaro.jpg"))); // NOI18N
        jLabel135.setText("jLabel117");
        getContentPane().add(jLabel135);
        jLabel135.setBounds(0, 0, 360, 420);

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarilloclaro.jpg"))); // NOI18N
        jLabel136.setText("jLabel118");
        getContentPane().add(jLabel136);
        jLabel136.setBounds(200, 0, 220, 350);

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
                    this.PaginaPrincipalOfertador.setVisible(true);
                    UsuariosName.setText(usuarios.get(posi).getNombre());
                    int m1 = 0, m2 = 0, m3 = 0, m4 = 0;
                    for (Membrecias u : ((Ofertadores2) usuarios.get(i)).getMembrecias()) {
                        if (u.getTipo().equals("Carwash")) {
                            m1++;
                        }
                        if (u.getTipo().equals("Vendedor directo")) {
                            m2++;
                        }
                        if (u.getTipo().equals("Rentador")) {
                            m3++;
                        }
                        if (u.getTipo().equals("Subastador")) {
                            m4++;
                        }
                    }
                    if (m1 == 0) {
                        botonCarwash.setEnabled(false);
                    }
                    if (m2 == 0) {
                        botonVendedor.setEnabled(false);
                    }
                    if (m3 == 0) {
                        botonRenta.setEnabled(false);
                    }
                    if (m4 == 0) {
                        botonSubasta.setEnabled(false);
                    }

                } else if (usuarios.get(i) instanceof Administrador) {
                    this.PaginaPrincipalAdministrador.pack();
                    this.PaginaPrincipalAdministrador.setLocationRelativeTo(this);
                    this.PaginaPrincipalAdministrador.setExtendedState(MAXIMIZED_BOTH);
                    this.PaginaPrincipalAdministrador.setVisible(true);
                    llenarTabla();
                    jMenu32.setText(usuarios.get(posi).getNombre());
                    jMenu33.setText(usuarios.get(posi).getNombre());
                } else if (usuarios.get(i) instanceof Cliente) {
                    this.PaginaPrincipalCliente.pack();
                    this.PaginaPrincipalCliente.setLocationRelativeTo(this);
                    this.PaginaPrincipalCliente.setExtendedState(MAXIMIZED_BOTH);
                    this.setVisible(false);
                    this.PaginaPrincipalCliente.setVisible(true);
                    jMenu19.setText(usuarios.get(posi).getNombre());
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
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");
        marca = Ag_marca.getText();
        modelo = Ag_modelo.getText();
        Cilindraje = Ag_Cilindraje.getText();
        tipo = Ag_tipo.getText();
        trans = Ag_Tranmision.getText();
        ano = Integer.parseInt(Ag_ano.getText());
        Autos auto = new Autos(marca, modelo, Cilindraje, tipo, trans, ano);

        if (globalventacarros == 1) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                    y = i;
                    break;
                }
            }
            ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().add(auto);
            tablaautossubasta();
        } else if (globalventacarros == 2) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Vendedor_Directo) {
                    y = i;
                    break;
                }
            }
            ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().add(auto);
            tablaautosDirecta();
        }

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
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");
        if (globalventacarros == 1) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                    y = i;
                    break;
                }
            }
            if (Ag_marca.getText() != (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getMarca())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setMarca(Ag_marca.getText());
                Ag_marca.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getMarca());
            }
            if (Ag_modelo.getText() != (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getModelo())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setModelo(Ag_modelo.getText());
                Ag_modelo.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getModelo());
            }
            if (Ag_ano.getText() != "" + (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getAño())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setAño(Integer.parseInt(Ag_ano.getText()));
                Ag_ano.setText("" + ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getAño());
            }
            if (Ag_tipo.getText() != (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTipo())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setTipo(Ag_tipo.getText());
                Ag_tipo.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTipo());
            }
            if (Ag_Tranmision.getText() != (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTransmision())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setTransmision(Ag_Tranmision.getText());
                Ag_Tranmision.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTransmision());
            }
            if (Ag_Cilindraje.getText() != (((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getCilindraje())) {
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setCilindraje(Ag_Cilindraje.getText());
                Ag_Cilindraje.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getCilindraje());
            }
            tablaautossubasta();
        } else if (globalventacarros == 2) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Vendedor_Directo) {
                    y = i;
                    break;
                }
            }
            if (Ag_marca.getText() != (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getMarca())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setMarca(Ag_marca.getText());
                Ag_marca.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getMarca());
            }
            if (Ag_modelo.getText() != (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getModelo())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setModelo(Ag_modelo.getText());
                Ag_modelo.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getModelo());
            }
            if (Ag_ano.getText() != "" + (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getAño())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setAño(Integer.parseInt(Ag_ano.getText()));
                Ag_ano.setText("" + ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getAño());
            }
            if (Ag_tipo.getText() != (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTipo())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setTipo(Ag_tipo.getText());
                Ag_tipo.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTipo());
            }
            if (Ag_Tranmision.getText() != (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTransmision())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setTransmision(Ag_Tranmision.getText());
                Ag_Tranmision.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getTransmision());
            }
            if (Ag_Cilindraje.getText() != (((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getCilindraje())) {
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).setCilindraje(Ag_Cilindraje.getText());
                Ag_Cilindraje.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(filaaux).getCilindraje());
            }
            tablaautosDirecta();
        }
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");
        int filaEliminar = jT_C_ofertador2.getSelectedRow();
        DefaultTableModel tm = (DefaultTableModel) jT_C_ofertador2.getModel();
        if (filaEliminar >= 0) {

            if (globalventacarros == 1) {
                int y = 0;
                for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                    if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                        y = i;
                        break;
                    }
                }
                ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().remove(filaEliminar);

            }
            if (globalventacarros == 2) {
                int y = 0;
                for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                    if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Vendedor_Directo) {
                        y = i;
                        break;
                    }
                }
                ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().remove(filaEliminar);

            }
            tm.removeRow(filaEliminar);
        }
        Ag_Cilindraje.setText("");
        Ag_Tranmision.setText("");
        Ag_ano.setText("");
        Ag_marca.setText("");
        Ag_modelo.setText("");
        Ag_tipo.setText("");

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

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    }//GEN-LAST:event_jMenu2MouseClicked

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

    private void jMenuItem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MousePressed

        globalventacarros = 2;
        tablaautosDirecta();
        this.Agregar_Carro_OF.pack();
        this.Agregar_Carro_OF.setLocationRelativeTo(this);
        this.Agregar_Carro_OF.setVisible(true);
    }//GEN-LAST:event_jMenuItem5MousePressed

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked

    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        this.Publicidad.pack();
        this.Publicidad.setLocationRelativeTo(this);
        this.Publicidad.setVisible(true);
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void AQUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AQUIActionPerformed
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes",
                "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(200, 200, 0);
            Image img2 = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(30, 30, 0);
            this.lb_foto.setIcon(new ImageIcon(img));
            usuarios.get(posi).setFotografia(lb_foto.getIcon());
            menufoto.setIcon(new ImageIcon(img2));
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

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem36MousePressed
        PaginaPrincipalCliente.pack();
        PaginaPrincipalCliente.setVisible(false);
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem36MousePressed

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

    private void jMenu28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu28MouseClicked
        BusquedaSitio.pack();
        BusquedaSitio.setVisible(true);
        this.BusquedaSitio.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenu28MouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        tablaadmins();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        tablaOfertador();
    }//GEN-LAST:event_jButton29ActionPerformed

    public void tablaOfertador() {
        DefaultTableModel t = (DefaultTableModel) TodosUsuarios.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }

        for (Usuario i : usuarios) {
            if (i instanceof Ofertadores2) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), i.getContra(), i.getPais(), i.getFecha(), i.getCorreo(), i.getTipo()};
                t.addRow(usuarios);
            }

        }
        TodosUsuarios.setModel(t);
        TodosUsuarios2.setModel(t);
    }

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        DefaultTableModel t = (DefaultTableModel) TodosUsuarios.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }

        for (Usuario i : usuarios) {
            if (i instanceof Cliente) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), i.getContra(), i.getPais(), i.getFecha(), i.getCorreo(), i.getTipo()};
                t.addRow(usuarios);
            }

        }
        TodosUsuarios.setModel(t);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        llenarTabla();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void ad_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_paisActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String pais = (String) ad_pais.getSelectedItem();
        if (ad_usuario.getText().equals("") || ad_contra.getText().equals("") || ad_confirmarcontra.getText().equals("") || ad_name.getText().equals("") || pais.equals(" ---------------------- ") || ad_correo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos pedidos");
        } else {
            if (ad_contra.getText().equals(ad_confirmarcontra.getText())) {
                usuarios.add(new Administrador("Administrador", ad_usuario.getText(), ad_contra.getText(), ad_name.getText(), pais, ad_correo.getText(), "ubicacion", ad_cumple.getText()));
                ad_usuario.setText("");
                ad_confirmarcontra.setText("");
                ad_contra.setText("");
                ad_correo.setText("");
                ad_name.setText("");
                ad_pais.setSelectedIndex(0);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
                ad_contra.setText("");
                ad_confirmarcontra.setText("");
            }

        }


    }//GEN-LAST:event_jButton34ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        CrearAdmin.pack();
        CrearAdmin.setVisible(true);
        CrearAdmin.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu30MouseClicked
        CrearAdmin.pack();
        CrearAdmin.setVisible(false);
    }//GEN-LAST:event_jMenu30MouseClicked

    private void modiadmin_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiadmin_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modiadmin_paisActionPerformed

    private void TodosUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodosUsuarios1MouseClicked
        int fila = TodosUsuarios1.getSelectedRow();
        int aux = 0;
        if (fila >= 0) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i) instanceof Administrador) {
                    if (aux == fila) {
                        aux2 = i;
                        modiadmin_contra.setText(usuarios.get(i).getContra());
                        modiadmin_correo.setText(usuarios.get(i).getCorreo());
                        modiadmin_fecha.setText(usuarios.get(i).getFecha());
                        modiadmin_nombre.setText(usuarios.get(i).getNombre());
                        modiadmin_usuario.setText(usuarios.get(i).getUsuario());
                        modiadmin_pais.setSelectedItem(usuarios.get(i).getPais());
                        break;
                    }
                    aux++;
                }

            }
        }
    }//GEN-LAST:event_TodosUsuarios1MouseClicked

    private void jMenuItem41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem41MousePressed
        ModificarAdmin.pack();
        ModificarAdmin.setVisible(true);
        ModificarAdmin.setLocationRelativeTo(this);
        tablaadmins();
    }//GEN-LAST:event_jMenuItem41MousePressed
    int aux2;
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if (aux2 >= 0) {
            if (modiadmin_nombre.getText() != (usuarios.get(aux2).getNombre())) {
                usuarios.get(aux2).setNombre(modiadmin_nombre.getText());
                modiadmin_nombre.setText(usuarios.get(aux2).getNombre());
            }
            if (modiadmin_contra.getText() != (usuarios.get(aux2).getContra())) {
                usuarios.get(aux2).setContra(modiadmin_contra.getText());
                modiadmin_contra.setText(usuarios.get(aux2).getContra());
            }
            if (modiadmin_correo.getText() != (usuarios.get(aux2).getCorreo())) {
                usuarios.get(aux2).setCorreo(modiadmin_correo.getText());
                modiadmin_correo.setText(usuarios.get(aux2).getCorreo());
            }
            if (modiadmin_fecha.getText() != (usuarios.get(aux2).getFecha())) {
                usuarios.get(aux2).setFecha(modiadmin_fecha.getText());
                modiadmin_fecha.setText(usuarios.get(aux2).getFecha());
            }
            if (modiadmin_usuario.getText() != (usuarios.get(aux2).getUsuario())) {
                usuarios.get(aux2).setUsuario(modiadmin_usuario.getText());
                modiadmin_usuario.setText(usuarios.get(aux2).getUsuario());
            }
            if ((String) modiadmin_pais.getSelectedItem() != (usuarios.get(aux2).getPais())) {
                usuarios.get(aux2).setPais((String) modiadmin_pais.getSelectedItem());
                modiadmin_pais.setSelectedItem(usuarios.get(aux2).getPais());
            }
            tablaadmins();
        }

    }//GEN-LAST:event_jButton35ActionPerformed

    private void modiofer_pais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiofer_pais1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modiofer_pais1ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        if (aux2 >= 0) {
            if (modiofer_nombre1.getText() != (usuarios.get(aux2).getNombre())) {
                usuarios.get(aux2).setNombre(modiofer_nombre1.getText());
                modiofer_nombre1.setText(usuarios.get(aux2).getNombre());
            }
            if (modiofer_contra1.getText() != (usuarios.get(aux2).getContra())) {
                usuarios.get(aux2).setContra(modiofer_contra1.getText());
                modiofer_contra1.setText(usuarios.get(aux2).getContra());
            }
            if (modiaofer_correo1.getText() != (usuarios.get(aux2).getCorreo())) {
                usuarios.get(aux2).setCorreo(modiaofer_correo1.getText());
                modiaofer_correo1.setText(usuarios.get(aux2).getCorreo());
            }
            if (modiofer_fecha1.getText() != (usuarios.get(aux2).getFecha())) {
                usuarios.get(aux2).setFecha(modiofer_fecha1.getText());
                modiofer_fecha1.setText(usuarios.get(aux2).getFecha());
            }
            if (modiofer_usuario1.getText() != (usuarios.get(aux2).getUsuario())) {
                usuarios.get(aux2).setUsuario(modiofer_usuario1.getText());
                modiofer_usuario1.setText(usuarios.get(aux2).getUsuario());
            }
            if ((String) modiofer_pais1.getSelectedItem() != (usuarios.get(aux2).getPais())) {
                usuarios.get(aux2).setPais((String) modiofer_pais1.getSelectedItem());
                modiofer_pais1.setSelectedItem(usuarios.get(aux2).getPais());
            }
            tablaOfertador();
            b.cargarArchivo();
            b.escribirArchivo();
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void TodosUsuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodosUsuarios2MouseClicked
        int fila = TodosUsuarios2.getSelectedRow();
        int aux = 0;
        if (fila >= 0) {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i) instanceof Ofertadores2) {
                    if (aux == fila) {
                        aux2 = i;
                        modiofer_contra1.setText(usuarios.get(i).getContra());
                        modiaofer_correo1.setText(usuarios.get(i).getCorreo());
                        modiofer_fecha1.setText(usuarios.get(i).getFecha());
                        modiofer_nombre1.setText(usuarios.get(i).getNombre());
                        modiofer_usuario1.setText(usuarios.get(i).getUsuario());
                        modiofer_pais1.setSelectedItem(usuarios.get(i).getPais());
                        DefaultListModel modeloListaMembrecias = (DefaultListModel) ListaMembrecias.getModel();
                        for (Membrecias o : ((Ofertadores2) usuarios.get(i)).getMembrecias()) {
                            modeloListaMembrecias.addElement(o.getTipo());
                        }

                        break;
                    }
                    aux++;
                }

            }
        }
    }//GEN-LAST:event_TodosUsuarios2MouseClicked

    private void jMenuItem42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem42MousePressed

        ModificarOfertador.pack();
        ModificarOfertador.setVisible(true);
        ModificarOfertador.setLocationRelativeTo(this);
        tablaOfertador();

    }//GEN-LAST:event_jMenuItem42MousePressed

    private void ListaMembreciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMembreciasMouseClicked
        if (ListaMembrecias.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                PopMenuOfertadoresModificar.show(evt.getComponent(),
                        evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_ListaMembreciasMouseClicked

    private void EliminarMemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMemMouseClicked
        if (ListaMembrecias.getSelectedIndex() >= 0) {
            DefaultListModel modeloLISTA = (DefaultListModel) ListaMembrecias.getModel();
            ((Ofertadores2) usuarios.get(aux2)).getMembrecias().remove(ListaMembrecias.getSelectedIndex());
            modeloLISTA.remove(ListaMembrecias.getSelectedIndex());
            ListaMembrecias.setModel(modeloLISTA);
            b.cargarArchivo();
            b.escribirArchivo();
        }
    }//GEN-LAST:event_EliminarMemMouseClicked

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed

        llenarTabla();
        this.TablaMembrecias.pack();
        this.TablaMembrecias.setLocationRelativeTo(this);
        this.TablaMembrecias.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MousePressed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem9MousePressed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        PaginaPrincipalOfertador.pack();
        PaginaPrincipalOfertador.setVisible(false);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

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

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        PaginaPrincipalAdministrador.pack();
        PaginaPrincipalAdministrador.setVisible(false);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        PaginaPrincipalCliente.pack();
        PaginaPrincipalCliente.setVisible(false);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15MousePressed
        this.Perfil_U.pack();
        this.Perfil_U.setLocationRelativeTo(this);
        this.Perfil_U.setVisible(true);
        N_Perfil.setText(usuarios.get(posi).getNombre());
        U_Perfil.setText(usuarios.get(posi).getUsuario());
        P_Perfil.setText(usuarios.get(posi).getPais());
        Co_Perfil.setText(usuarios.get(posi).getCorreo());
        Cu_Perfil.setText(usuarios.get(posi).getFecha());
        T_Perfil.setText(usuarios.get(posi).getTipo());
    }//GEN-LAST:event_jMenuItem15MousePressed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        CrearAdmin.pack();
        CrearAdmin.setVisible(true);
        CrearAdmin.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jMenuItem48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem48MousePressed
        ModificarAdmin.pack();
        ModificarAdmin.setVisible(true);
        ModificarAdmin.setLocationRelativeTo(this);
        tablaadmins();
    }//GEN-LAST:event_jMenuItem48MousePressed

    private void jMenuItem49MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem49MousePressed
        ModificarOfertador.pack();
        ModificarOfertador.setVisible(true);
        ModificarOfertador.setLocationRelativeTo(this);
        tablaOfertador();
    }//GEN-LAST:event_jMenuItem49MousePressed

    private void jMenu36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu36MouseClicked

    private void jMenuItem16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem16MousePressed
        PerfilEmpresa.pack();
        PerfilEmpresa.setExtendedState(MAXIMIZED_BOTH);
        PerfilEmpresa.setLocationRelativeTo(this);
        PerfilEmpresa.setVisible(true);
        PaginaPrincipalAdministrador.setVisible(false);
        mision.setText(u.getMision());
        vision.setText(u.getVision());
        objetivos.setText(u.getObjetivos());
        politica.setText(u.getPoliticas());
        telefono.setText(u.getTelefono());
        gmail.setText(u.getCorreo());
        dirrecciom.setText(u.getDirreccion());
    }//GEN-LAST:event_jMenuItem16MousePressed

    private void jMenuItem44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem44MousePressed
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        PaginaPrincipalAdministrador.pack();
        PaginaPrincipalAdministrador.setVisible(false);
    }//GEN-LAST:event_jMenuItem44MousePressed

    private void jMenuItem19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem19MousePressed
        PaginaPrincipalAdministrador.pack();
        PaginaPrincipalAdministrador.setLocationRelativeTo(this);
        PaginaPrincipalAdministrador.setExtendedState(MAXIMIZED_BOTH);
        PerfilEmpresa.setVisible(false);
        PaginaPrincipalAdministrador.setVisible(true);
    }//GEN-LAST:event_jMenuItem19MousePressed

    private void botonSubastaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubastaMousePressed
        int y = 0;
        for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
            if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                y = i;
                break;
            }
        }
        DefaultTableModel autosSubasta = (DefaultTableModel) tablaAutosSubasta.getModel();
        for (int i = autosSubasta.getRowCount() - 1; i >= 0; i--) {
            autosSubasta.removeRow(i);
        }

        for (Autos i : ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos()) {
            Object[] auto = {i.getMarca(), i.getModelo(), i.getAño(), i.getCilindraje(), i.getTipo(), i.getTransmision()};
            autosSubasta.addRow(auto);
        }

        tablaAutosSubasta.setModel(autosSubasta);


    }//GEN-LAST:event_botonSubastaMousePressed
    int globalventacarros;
    private void jMenuItem28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem28MousePressed

        globalventacarros = 1;

        tablaautossubasta();
        Agregar_Carro_OF.pack();
        Agregar_Carro_OF.setLocationRelativeTo(this);
        Agregar_Carro_OF.setVisible(true);

    }//GEN-LAST:event_jMenuItem28MousePressed
    int filaaux;
    private void jT_C_ofertador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_C_ofertador2MouseClicked
        int fila = jT_C_ofertador2.getSelectedRow();
        filaaux = fila;
        if (globalventacarros == 1) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                    y = i;
                    break;
                }
            }
            Ag_marca.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getMarca());
            Ag_modelo.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getModelo());
            Ag_ano.setText("" + ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getAño());
            Ag_tipo.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getTipo());
            Ag_Tranmision.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getTransmision());
            Ag_Cilindraje.setText(((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getCilindraje());
        } else if (globalventacarros == 2) {
            int y = 0;
            for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
                if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Vendedor_Directo) {
                    y = i;
                    break;
                }
            }
            Ag_marca.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getMarca());
            Ag_modelo.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getModelo());
            Ag_ano.setText("" + ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getAño());
            Ag_tipo.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getTipo());
            Ag_Tranmision.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getTransmision());
            Ag_Cilindraje.setText(((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos().get(fila).getCilindraje());
        }
    }//GEN-LAST:event_jT_C_ofertador2MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    public void tablaautosDirecta() {
        int y = 0;
        for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
            if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Vendedor_Directo) {
                y = i;
                break;
            }
        }
        DefaultTableModel ofertadores = (DefaultTableModel) jT_C_ofertador2.getModel();
        for (int i = ofertadores.getRowCount() - 1; i >= 0; i--) {
            ofertadores.removeRow(i);
        }
        //Tabla autos
        for (Autos i : ((Vendedor_Directo) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos()) {
            Object[] auto = {i.getMarca(), i.getModelo(), i.getAño(), i.getCilindraje(), i.getTipo(), i.getTransmision()};
            ofertadores.addRow(auto);
        }
        jT_C_ofertador2.setModel(ofertadores);
    }

    public void tablaautossubasta() {
        int y = 0;
        for (int i = 0; i < ((Ofertadores2) usuarios.get(posi)).getMembrecias().size(); i++) {
            if (((Ofertadores2) usuarios.get(posi)).getMembrecias().get(i) instanceof Subastador) {
                y = i;
                break;
            }
        }
        DefaultTableModel autosSubasta = (DefaultTableModel) jT_C_ofertador2.getModel();
        for (int i = autosSubasta.getRowCount() - 1; i >= 0; i--) {
            autosSubasta.removeRow(i);
        }

        for (Autos i : ((Subastador) ((Ofertadores2) usuarios.get(posi)).getMembrecias().get(y)).getAutos()) {
            Object[] auto = {i.getMarca(), i.getModelo(), i.getAño(), i.getCilindraje(), i.getTipo(), i.getTransmision()};
            autosSubasta.addRow(auto);
        }
        jT_C_ofertador2.setModel(autosSubasta);
    }

    public void tablaadmins() {
        DefaultTableModel t = (DefaultTableModel) TodosUsuarios.getModel();
        for (int i = t.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }

        for (Usuario i : usuarios) {
            if (i instanceof Administrador) {
                Object[] usuarios = {i.getNombre(), i.getUsuario(), i.getContra(), i.getPais(), i.getFecha(), i.getCorreo(), i.getTipo()};
                t.addRow(usuarios);
            }

        }
        TodosUsuarios1.setModel(t);
    }

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
    private javax.swing.JDialog AgregarSubasta;
    private javax.swing.JFrame Agregar_Admins;
    private javax.swing.JFrame Agregar_Carro_OF;
    private javax.swing.JFrame Busqueda;
    private javax.swing.JDialog BusquedaSitio;
    private javax.swing.JDialog CitasCarwash;
    private javax.swing.JFrame Cliente;
    private javax.swing.JLabel Co_Perfil;
    private javax.swing.JDialog CrearAdmin;
    private javax.swing.JLabel Cu_Perfil;
    private javax.swing.JTextArea Des_Publicidad;
    private javax.swing.JTextArea DescripSubasta;
    private javax.swing.JMenu EliminarMem;
    private javax.swing.JList<String> ListaMembrecias;
    private javax.swing.JFrame Membrecias_Ofertadores;
    private javax.swing.JDialog ModificarAdmin;
    private javax.swing.JDialog ModificarOfertador;
    private javax.swing.JLabel N_Perfil;
    private javax.swing.JLabel P_Perfil;
    private javax.swing.JFrame PaginaPrincipalAdministrador;
    private javax.swing.JFrame PaginaPrincipalCliente;
    private javax.swing.JFrame PaginaPrincipalOfertador;
    private javax.swing.JFrame PerfilEmpresa;
    private javax.swing.JFrame Perfil_U;
    private javax.swing.JPopupMenu PopMenuOfertadoresModificar;
    private javax.swing.JFrame Publicidad;
    private javax.swing.JFrame Registro;
    private javax.swing.JFrame Restablecer;
    private javax.swing.JMenu Subasta;
    private javax.swing.JLabel T_Perfil;
    private javax.swing.JDialog TablaMembrecias;
    private javax.swing.JTextField Ti_Publicidad;
    private javax.swing.JTable TodosUsuarios;
    private javax.swing.JTable TodosUsuarios1;
    private javax.swing.JTable TodosUsuarios2;
    private javax.swing.JLabel U_Perfil;
    private javax.swing.JTable UsuariosAdmin_jt;
    private javax.swing.JMenu UsuariosName;
    private javax.swing.JFrame VendedorDirecto;
    private javax.swing.JDialog VentaDirecta;
    private javax.swing.JPasswordField ad_confirmarcontra;
    private javax.swing.JPasswordField ad_contra;
    private javax.swing.JTextField ad_correo;
    private datechooser.beans.DateChooserCombo ad_cumple;
    private javax.swing.JTextField ad_name;
    private javax.swing.JComboBox<String> ad_pais;
    private javax.swing.JTextField ad_usuario;
    private javax.swing.JPasswordField admin_contra;
    private javax.swing.JTextField admin_correo;
    private datechooser.beans.DateChooserCombo admin_cumple;
    private javax.swing.JTextField admin_nombre;
    private javax.swing.JComboBox<String> admin_paiss;
    private javax.swing.JTextField admin_usuario;
    private javax.swing.JMenu botonCarwash;
    private javax.swing.JMenu botonRenta;
    private javax.swing.JMenu botonSubasta;
    private javax.swing.JMenu botonVendedor;
    private javax.swing.JPasswordField co_R;
    private javax.swing.JPasswordField contra_L;
    private javax.swing.JTextField cor_R;
    private javax.swing.JTextField dirrecciom;
    private datechooser.beans.DateChooserCombo fe_R;
    private javax.swing.JTextField gmail;
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
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
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
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu37;
    private javax.swing.JMenu jMenu38;
    private javax.swing.JMenu jMenu39;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu40;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
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
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lb_foto;
    private javax.swing.JMenu menufoto;
    private javax.swing.JTextArea mision;
    private javax.swing.JTextField modiadmin_contra;
    private javax.swing.JTextField modiadmin_correo;
    private datechooser.beans.DateChooserCombo modiadmin_fecha;
    private javax.swing.JTextField modiadmin_nombre;
    private javax.swing.JComboBox<String> modiadmin_pais;
    private javax.swing.JTextField modiadmin_usuario;
    private javax.swing.JTextField modiaofer_correo1;
    private javax.swing.JTextField modiofer_contra1;
    private datechooser.beans.DateChooserCombo modiofer_fecha1;
    private javax.swing.JTextField modiofer_nombre1;
    private javax.swing.JComboBox<String> modiofer_pais1;
    private javax.swing.JTextField modiofer_usuario1;
    private javax.swing.JTextField ni_R;
    private javax.swing.JTextField no_R;
    private javax.swing.JTextArea objetivos;
    private javax.swing.JComboBox<String> pa_R;
    private javax.swing.JTextArea politica;
    private javax.swing.JTextField precioSubasta;
    private javax.swing.JTable tablaAprovadaSubasta;
    private javax.swing.JTable tablaAutosSubasta;
    private javax.swing.JTable tablaPendientesSubasta;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipo_usuario;
    private javax.swing.JTextField usuario_L;
    private javax.swing.JTextArea vision;
    // End of variables declaration//GEN-END:variables
    String usuario;
    String tipo;
    String contra;
    ArrayList<Usuario> usuarios = new ArrayList();
    String marca, modelo, Cilindraje, tipoo, trans;
    int ano, posi;
    Ficheros_Binarios b = new Ficheros_Binarios("./FicherosB.bin");
    Archivos_Texto f = new Archivos_Texto("Clientes.txt", usuarios);
    ArchivoTexto2 f2 = new ArchivoTexto2("Empresa.txt");
    Empresas u;
}
//        String prueba = p.getNombre()+ "," + p.getMision()+ "," + p.getVision()+ "," + p.getObjetivos()+ ","
//+ p.getPoliticas()+ "," + p.getUbicacion()+ "," + p.getCorreo() + "," + p.getDirreccion()+","+p.getTelefono()+ ";\n";

/*Empresas u=new Empresas("Vehiculos.com","Inspirar momentos de optimismo y felicidad. Crear valor y hacer la diferencia.",
                 "Hacer excelentes productos y poner el foco en la innovación." ,"Excelencia & enfoque & desarrollo e innovación.",
                 "La empresa cumplirá los requisitos acordados con los clientes y Brindar trato justo.",
                 "UBICACION",
                 "VehiculosBowlee@gmail.com",
                 "Tu corrazon",
                 "97049130");
        f2.Leer();
        f2.setEmpresa(u);
  // f2.Escribir();*/
