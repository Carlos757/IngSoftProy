package ciber;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Carlos Rios
 */
public class cyber extends javax.swing.JFrame {

    DefaultTableModel modeloTabla, modeloTabla2, modelotabla3, modelotabla4, modelo_empl, modelotabla5;
    public static boolean c = false;
    conexion con = new conexion();
    Metodos S = new Metodos();
    String empleado = "";
    String sql, idCliente, sql2;
    String Admin = "root";
    int num;
    int precioHr = 10;
    int contProd = 0,contTotal = 0;
    static int tiempo = 0;
    public static int ganancias = 0;

    

    public cyber() {
        initComponents();
        this.setSize(500, 480);
        this.setLocationRelativeTo(null);
        ACCIONES.setSize(500, 480);
        ACCIONES.setLocationRelativeTo(null);
        RENTA.setSize(630, 530);
        RENTA.setLocationRelativeTo(null);
        VENTA.setSize(470, 620);
        VENTA.setLocationRelativeTo(null);
        REPORTE_CLIENTE.setSize(730, 570);
        REPORTE_CLIENTE.setLocationRelativeTo(null);
        AGREGA_E.setSize(435, 550);
        AGREGA_E.setLocationRelativeTo(null);
        EMPLEADOS.setSize(398, 490);
        EMPLEADOS.setLocationRelativeTo(null);
        nomcliente.setVisible(false);
        elige_nomcliente.setVisible(false);
        OK.setVisible(false);
        modeloTabla = (DefaultTableModel) tabla_equipos.getModel();
        modeloTabla2 = (DefaultTableModel) tabla_equipos2.getModel();
        modelotabla3 = (DefaultTableModel) tabla_join.getModel();
        modelotabla4 = (DefaultTableModel) tabla_prod.getModel();
        modelo_empl = (DefaultTableModel) tabla_empleado.getModel();
        modelotabla5 = (DefaultTableModel) tabla_join2.getModel();
        AWTUtilities.setWindowOpaque(this, false);
        AWTUtilities.setWindowOpaque(ACCIONES, false);
        AWTUtilities.setWindowOpaque(AGREGA_E, false);
        AWTUtilities.setWindowOpaque(RENTA, false);
        AWTUtilities.setWindowOpaque(VENTA, false);
        AWTUtilities.setWindowOpaque(REPORTE_CLIENTE, false);
        existentes.setBackground(oro());
        tipo_e.setBackground(oro());
        hora1.setBackground(oro());
        hora2.setBackground(oro());
        min1.setBackground(oro());
        min2.setBackground(oro());
        seg1.setBackground(oro());
        seg2.setBackground(oro());
        Turno.setBackground(oro());
        agrega_prod.setBackground(oro());
        select_equi.setBackground(oro());
        elige_nomcliente.setBackground(oro());
        elige_nomcliente1.setBackground(oro());
        elige_prod.setBackground(oro());
        CellRenderer ft = new CellRenderer(0);
        tabla_equipos.setDefaultRenderer(Object.class, ft);
        tabla_equipos2.setDefaultRenderer(Object.class, ft);
        tabla_prod.setDefaultRenderer(Object.class, ft);
        tabla_empleado.setDefaultRenderer(Object.class, ft);
        tabla_join.setDefaultRenderer(Object.class, ft);
        tabla_join2.setDefaultRenderer(Object.class, ft);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ACCIONES = new javax.swing.JFrame();
        usuario1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        exit3 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        rentar = new javax.swing.JRadioButton();
        venta = new javax.swing.JRadioButton();
        agregar = new javax.swing.JRadioButton();
        reporte = new javax.swing.JRadioButton();
        A_Empleado = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        fondo_accion = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        RENTA = new javax.swing.JFrame();
        exit5 = new javax.swing.JButton();
        titulo_renta = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        exit7 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nomcliente = new javax.swing.JTextField();
        clientenuevo = new javax.swing.JRadioButton();
        clienteexistente = new javax.swing.JRadioButton();
        elige_nomcliente = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        select_equi = new javax.swing.JComboBox<>();
        eq_selec = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_equipos = new javax.swing.JTable();
        OK1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        ideq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        hora1 = new javax.swing.JComboBox<>();
        min1 = new javax.swing.JComboBox<>();
        seg1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fecha_renta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        seg2 = new javax.swing.JComboBox<>();
        min2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        hora2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnHora = new javax.swing.JButton();
        btnHora1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        VENTA = new javax.swing.JFrame();
        exit6 = new javax.swing.JButton();
        exit8 = new javax.swing.JButton();
        titulo_venta = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        elige_prod = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cantidad_prod = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        precio_prod1 = new javax.swing.JLabel();
        agrega_prod = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_prod = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        cant_final = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        precio_final = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        elige_nomcliente1 = new javax.swing.JComboBox<>();
        num_venta1 = new javax.swing.JLabel();
        Fecha_v = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        fondo_venta = new javax.swing.JLabel();
        REPORTE_CLIENTE = new javax.swing.JFrame();
        exit10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_join = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_join2 = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtGanancias1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtGanancias2 = new javax.swing.JTextField();
        titulo_reporte = new javax.swing.JLabel();
        comboMostrar = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        EMPLEADOS = new javax.swing.JFrame();
        titulo_empl = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        exit11 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_empleado = new javax.swing.JTable();
        msj_elimm = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Usuario = new javax.swing.JTextField();
        Turno = new javax.swing.JComboBox();
        Pass = new javax.swing.JPasswordField();
        Agregar = new javax.swing.JButton();
        msj_empl = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        fondo_emple = new javax.swing.JLabel();
        elimina_empl = new javax.swing.JPopupMenu();
        Elim_emp = new javax.swing.JMenuItem();
        AGREGA_E = new javax.swing.JFrame();
        exit4 = new javax.swing.JButton();
        hecho1 = new javax.swing.JButton();
        exit12 = new javax.swing.JButton();
        titulo_agregae = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        alta = new javax.swing.JRadioButton();
        baja = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tipo_e = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        nom_e = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id_e = new javax.swing.JTextField();
        mensaje_e = new javax.swing.JLabel();
        agrega_e = new javax.swing.JButton();
        existentes = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_equipos2 = new javax.swing.JTable();
        mensaje_equipo = new javax.swing.JLabel();
        fondo_agregae = new javax.swing.JLabel();
        Eliminar = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel42 = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        in = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        exit2 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        nom_usuario = new javax.swing.JTextField();
        txtConexion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        ACCIONES.setTitle("ELEGIR UNA ACCIÓN");
        ACCIONES.setUndecorated(true);
        ACCIONES.setResizable(false);
        ACCIONES.setSize(new java.awt.Dimension(500, 500));
        ACCIONES.getContentPane().setLayout(null);

        usuario1.setFont(new java.awt.Font("Rondalo", 0, 18)); // NOI18N
        usuario1.setText("ACCIÓN A REALIZAR:");
        ACCIONES.getContentPane().add(usuario1);
        usuario1.setBounds(130, 70, 190, 30);

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("OPCIONES");
        ACCIONES.getContentPane().add(usuario);
        usuario.setBounds(10, 0, 117, 20);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta2.png"))); // NOI18N
        ACCIONES.getContentPane().add(jLabel44);
        jLabel44.setBounds(120, 60, 190, 50);

        exit3.setBackground(new java.awt.Color(255, 255, 255));
        exit3.setForeground(new java.awt.Color(255, 255, 255));
        exit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit3.setBorder(null);
        exit3.setBorderPainted(false);
        exit3.setContentAreaFilled(false);
        exit3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(exit3);
        exit3.setBounds(390, 0, 50, 30);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel43.setText("jLabel33");
        ACCIONES.getContentPane().add(jLabel43);
        jLabel43.setBounds(-10, 0, 400, 30);

        exit1.setBackground(new java.awt.Color(0, 0, 0));
        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit1.setBorder(null);
        exit1.setBorderPainted(false);
        exit1.setContentAreaFilled(false);
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1.png"))); // NOI18N
        exit1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(exit1);
        exit1.setBounds(10, 360, 60, 50);

        accept.setBackground(new java.awt.Color(255, 255, 255));
        accept.setForeground(new java.awt.Color(255, 255, 255));
        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        accept.setBorder(null);
        accept.setBorderPainted(false);
        accept.setContentAreaFilled(false);
        accept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        accept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar1.png"))); // NOI18N
        accept.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar2.png"))); // NOI18N
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(accept);
        accept.setBounds(170, 360, 80, 60);

        buttonGroup1.add(rentar);
        rentar.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        rentar.setText("RENTAR EQUIPO");
        rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentarActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(rentar);
        rentar.setBounds(80, 160, 170, 31);

        buttonGroup1.add(venta);
        venta.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        venta.setText("REALIZAR VENTA");
        ACCIONES.getContentPane().add(venta);
        venta.setBounds(80, 190, 149, 31);

        buttonGroup1.add(agregar);
        agregar.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        agregar.setText("AGREGAR/DAR DE BAJA EQUIPO");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(agregar);
        agregar.setBounds(80, 250, 270, 31);

        buttonGroup1.add(reporte);
        reporte.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        reporte.setText("REPORTE DE VENTAS");
        ACCIONES.getContentPane().add(reporte);
        reporte.setBounds(80, 220, 200, 31);

        buttonGroup1.add(A_Empleado);
        A_Empleado.setFont(new java.awt.Font("Segoe UI Historic", 0, 16)); // NOI18N
        A_Empleado.setText("AGREGA/ELIMINA EMPLEADO");
        A_Empleado.setEnabled(false);
        A_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_EmpleadoActionPerformed(evt);
            }
        });
        ACCIONES.getContentPane().add(A_Empleado);
        A_Empleado.setBounds(80, 280, 250, 31);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta3.png"))); // NOI18N
        ACCIONES.getContentPane().add(jLabel45);
        jLabel45.setBounds(60, 150, 310, 170);

        fondo_accion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo_accion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        fondo_accion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondo_accionMouseDragged(evt);
            }
        });
        ACCIONES.getContentPane().add(fondo_accion);
        fondo_accion.setBounds(0, 0, 440, 430);

        RENTA.setTitle("RENTA DE EQUIPO");
        RENTA.setUndecorated(true);
        RENTA.setResizable(false);
        RENTA.getContentPane().setLayout(null);

        exit5.setBackground(new java.awt.Color(255, 255, 255));
        exit5.setForeground(new java.awt.Color(255, 255, 255));
        exit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit5.setBorder(null);
        exit5.setBorderPainted(false);
        exit5.setContentAreaFilled(false);
        exit5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit5ActionPerformed(evt);
            }
        });
        RENTA.getContentPane().add(exit5);
        exit5.setBounds(570, 0, 70, 30);

        titulo_renta.setBackground(new java.awt.Color(255, 255, 255));
        titulo_renta.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        titulo_renta.setForeground(new java.awt.Color(255, 255, 255));
        titulo_renta.setText("Renta de Equipo");
        RENTA.getContentPane().add(titulo_renta);
        titulo_renta.setBounds(0, 0, 420, 24);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        RENTA.getContentPane().add(jLabel48);
        jLabel48.setBounds(0, 0, 580, 30);

        exit7.setBackground(new java.awt.Color(255, 255, 255));
        exit7.setForeground(new java.awt.Color(255, 255, 255));
        exit7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit7.setBorder(null);
        exit7.setBorderPainted(false);
        exit7.setContentAreaFilled(false);
        exit7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1.png"))); // NOI18N
        exit7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        exit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit7ActionPerformed(evt);
            }
        });
        RENTA.getContentPane().add(exit7);
        exit7.setBounds(510, 430, 60, 50);

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save1.png"))); // NOI18N
        guardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save2.png"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        RENTA.getContentPane().add(guardar);
        guardar.setBounds(430, 440, 50, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreesiaUPC", 0, 24))); // NOI18N
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel6.setText("Nombre del cliente:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 40, 107, 16);

        nomcliente.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        jPanel1.add(nomcliente);
        nomcliente.setBounds(230, 30, 90, 25);

        buttonGroup2.add(clientenuevo);
        clientenuevo.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        clientenuevo.setText("Nuevo");
        clientenuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientenuevoMouseClicked(evt);
            }
        });
        jPanel1.add(clientenuevo);
        clientenuevo.setBounds(10, 70, 63, 25);

        buttonGroup2.add(clienteexistente);
        clienteexistente.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        clienteexistente.setText("Existente");
        clienteexistente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteexistenteMouseClicked(evt);
            }
        });
        clienteexistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteexistenteActionPerformed(evt);
            }
        });
        jPanel1.add(clienteexistente);
        clienteexistente.setBounds(10, 40, 79, 25);

        elige_nomcliente.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        elige_nomcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes existentes" }));
        elige_nomcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elige_nomclienteActionPerformed(evt);
            }
        });
        jPanel1.add(elige_nomcliente);
        elige_nomcliente.setBounds(100, 70, 130, 25);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/user-silhouette.png"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(240, 60, 60, 70);

        OK.setBackground(new java.awt.Color(255, 255, 255));
        OK.setForeground(new java.awt.Color(255, 255, 255));
        OK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo.png"))); // NOI18N
        OK.setBorder(null);
        OK.setBorderPainted(false);
        OK.setContentAreaFilled(false);
        OK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OK.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo1.png"))); // NOI18N
        OK.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo2}.png"))); // NOI18N
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        jPanel1.add(OK);
        OK.setBounds(120, 90, 70, 40);

        RENTA.getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 330, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EQUIPOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreesiaUPC", 0, 24))); // NOI18N

        select_equi.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        select_equi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipos disponibles", "Equipos Activos", "Equipos en Espera" }));
        select_equi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_equiActionPerformed(evt);
            }
        });

        eq_selec.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        eq_selec.setText("-");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/raton.png"))); // NOI18N

        tabla_equipos.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tabla_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Estatus", "No. Equipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_equipos);

        OK1.setBackground(new java.awt.Color(255, 255, 255));
        OK1.setForeground(new java.awt.Color(255, 255, 255));
        OK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo.png"))); // NOI18N
        OK1.setBorder(null);
        OK1.setBorderPainted(false);
        OK1.setContentAreaFilled(false);
        OK1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        OK1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OK1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo1.png"))); // NOI18N
        OK1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho_rojo2}.png"))); // NOI18N
        OK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel25.setText("Cambiar estado de un equipo:");

        ideq.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(select_equi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(17, 17, 17)
                                .addComponent(ideq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OK1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eq_selec, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(select_equi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eq_selec, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(ideq, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OK1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        RENTA.getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 330, 300);
        RENTA.getContentPane().add(jLabel12);
        jLabel12.setBounds(584, 262, 0, 0);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLES DE RENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreesiaUPC", 0, 24))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText(":");

        jLabel13.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel13.setText("hh");

        jLabel14.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel14.setText("mm");

        jLabel15.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel15.setText("ss");

        hora1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        hora1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        min1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        min1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        seg1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        seg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel7.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel7.setText("PRECIO/HORA:");

        jLabel8.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel8.setText("FECHA: (aaaa/mm/dd)");

        fecha_renta.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        fecha_renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_rentaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel9.setText("HORA DE INICIO:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(":");

        jLabel17.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel17.setText("HORA DE FIN:");

        jLabel18.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel18.setText("hh");

        jLabel19.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel19.setText("mm");

        jLabel20.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel20.setText("ss");

        seg2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        seg2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        min2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        min2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText(":");

        hora2.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        hora2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText(":");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        btnHora.setText("jButton1");
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });

        btnHora1.setText("jButton1");
        btnHora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21))
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(seg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fecha_renta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addComponent(fecha_renta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHora)))
                    .addComponent(jLabel15))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHora1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel20)))
                .addGap(35, 35, 35))
        );

        RENTA.getContentPane().add(jPanel3);
        jPanel3.setBounds(350, 40, 270, 380);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        jLabel47.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel47MouseDragged(evt);
            }
        });
        RENTA.getContentPane().add(jLabel47);
        jLabel47.setBounds(0, 0, 640, 530);

        jLabel16.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        jLabel16.setText("$8.00");
        RENTA.getContentPane().add(jLabel16);
        jLabel16.setBounds(350, 0, 50, 23);

        VENTA.setUndecorated(true);
        VENTA.setResizable(false);
        VENTA.getContentPane().setLayout(null);

        exit6.setBackground(new java.awt.Color(255, 255, 255));
        exit6.setForeground(new java.awt.Color(255, 255, 255));
        exit6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit6.setBorder(null);
        exit6.setBorderPainted(false);
        exit6.setContentAreaFilled(false);
        exit6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1.png"))); // NOI18N
        exit6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        exit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit6ActionPerformed(evt);
            }
        });
        VENTA.getContentPane().add(exit6);
        exit6.setBounds(340, 520, 60, 50);

        exit8.setBackground(new java.awt.Color(255, 255, 255));
        exit8.setForeground(new java.awt.Color(255, 255, 255));
        exit8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit8.setBorder(null);
        exit8.setBorderPainted(false);
        exit8.setContentAreaFilled(false);
        exit8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit8ActionPerformed(evt);
            }
        });
        VENTA.getContentPane().add(exit8);
        exit8.setBounds(420, 0, 50, 30);

        titulo_venta.setBackground(new java.awt.Color(255, 0, 0));
        titulo_venta.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        titulo_venta.setForeground(new java.awt.Color(255, 255, 255));
        titulo_venta.setText("Venta de productos");
        VENTA.getContentPane().add(titulo_venta);
        titulo_venta.setBounds(0, 0, 310, 24);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel49.setText("jLabel33");
        VENTA.getContentPane().add(jLabel49);
        jLabel49.setBounds(-10, 0, 430, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreesiaUPC", 0, 24))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 204));

        elige_prod.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        elige_prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir producto", "Item 1", "Item 2", "Item 3", "Item 4" }));
        elige_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elige_prodActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel29.setText("Precio:");

        jLabel31.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel31.setText("Cantidad:");

        cantidad_prod.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel28.setText("Producto: ");

        precio_prod1.setFont(new java.awt.Font("Kalinga", 0, 18)); // NOI18N
        precio_prod1.setText("$ ");

        agrega_prod.setFont(new java.awt.Font("Kalinga", 0, 10)); // NOI18N
        agrega_prod.setText("AGREGAR");
        agrega_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elige_prod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precio_prod1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cantidad_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agrega_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elige_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio_prod1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidad_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agrega_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VENTA.getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 80, 300, 174);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/cafe1.png"))); // NOI18N
        VENTA.getContentPane().add(jLabel32);
        jLabel32.setBounds(320, 110, 130, 120);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "DESCRIPCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("FreesiaUPC", 0, 24))); // NOI18N

        tabla_prod.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        tabla_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CANTIDAD", "PRODUCTO", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_prod);
        if (tabla_prod.getColumnModel().getColumnCount() > 0) {
            tabla_prod.getColumnModel().getColumn(0).setMinWidth(80);
            tabla_prod.getColumnModel().getColumn(0).setMaxWidth(105);
            tabla_prod.getColumnModel().getColumn(1).setMinWidth(150);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        VENTA.getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 250, 450, 160);

        jLabel30.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cant. productos:");
        VENTA.getContentPane().add(jLabel30);
        jLabel30.setBounds(60, 430, 130, 25);

        cant_final.setFont(new java.awt.Font("Euphemia", 1, 18)); // NOI18N
        cant_final.setForeground(new java.awt.Color(255, 255, 255));
        cant_final.setText("0");
        VENTA.getContentPane().add(cant_final);
        cant_final.setBounds(190, 430, 60, 25);

        jLabel34.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Total a pagar:");
        VENTA.getContentPane().add(jLabel34);
        jLabel34.setBounds(60, 470, 100, 19);

        precio_final.setFont(new java.awt.Font("Euphemia", 1, 18)); // NOI18N
        precio_final.setForeground(new java.awt.Color(255, 255, 255));
        precio_final.setText("$ ");
        VENTA.getContentPane().add(precio_final);
        precio_final.setBounds(190, 470, 100, 25);

        jLabel35.setFont(new java.awt.Font("Euphemia", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Cliente:");
        VENTA.getContentPane().add(jLabel35);
        jLabel35.setBounds(20, 40, 68, 29);

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        VENTA.getContentPane().add(btnPagar);
        btnPagar.setBounds(330, 450, 70, 30);

        elige_nomcliente1.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        elige_nomcliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre cliente" }));
        elige_nomcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elige_nomcliente1ActionPerformed(evt);
            }
        });
        VENTA.getContentPane().add(elige_nomcliente1);
        elige_nomcliente1.setBounds(110, 40, 130, 29);

        num_venta1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        num_venta1.setForeground(new java.awt.Color(255, 255, 255));
        num_venta1.setText("Fecha: ");
        VENTA.getContentPane().add(num_venta1);
        num_venta1.setBounds(60, 510, 80, 19);

        Fecha_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_vActionPerformed(evt);
            }
        });
        VENTA.getContentPane().add(Fecha_v);
        Fecha_v.setBounds(130, 510, 130, 25);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("AAAA/MM/DD");
        VENTA.getContentPane().add(jLabel27);
        jLabel27.setBounds(150, 540, 90, 20);

        fondo_venta.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        fondo_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        fondo_venta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondo_ventaMouseDragged(evt);
            }
        });
        VENTA.getContentPane().add(fondo_venta);
        fondo_venta.setBounds(0, 0, 470, 620);

        REPORTE_CLIENTE.setTitle("REPORTE DE RENTA");
        REPORTE_CLIENTE.setUndecorated(true);
        REPORTE_CLIENTE.getContentPane().setLayout(null);

        exit10.setBackground(new java.awt.Color(255, 255, 255));
        exit10.setForeground(new java.awt.Color(255, 255, 255));
        exit10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit10.setBorder(null);
        exit10.setBorderPainted(false);
        exit10.setContentAreaFilled(false);
        exit10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit10ActionPerformed(evt);
            }
        });
        REPORTE_CLIENTE.getContentPane().add(exit10);
        exit10.setBounds(680, 0, 50, 30);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tabla_join.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla_join.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Hora Inicio", "Hora Fin", "PC", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_join);
        if (tabla_join.getColumnModel().getColumnCount() > 0) {
            tabla_join.getColumnModel().getColumn(2).setMinWidth(100);
            tabla_join.getColumnModel().getColumn(2).setMaxWidth(150);
            tabla_join.getColumnModel().getColumn(4).setMinWidth(100);
            tabla_join.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        tabla_join2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabla_join2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Producto", "Producto", "Fecha", "Cantidad", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabla_join2);
        if (tabla_join2.getColumnModel().getColumnCount() > 0) {
            tabla_join2.getColumnModel().getColumn(2).setMinWidth(100);
            tabla_join2.getColumnModel().getColumn(2).setMaxWidth(150);
            tabla_join2.getColumnModel().getColumn(4).setMinWidth(100);
            tabla_join2.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jLabel55.setText("Productos");

        jLabel56.setText("Rentas de equipo");

        jLabel58.setText("Ganancias :");

        txtGanancias1.setText("jTextField1");
        txtGanancias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGanancias1ActionPerformed(evt);
            }
        });

        jLabel59.setText("Ganancias :");

        txtGanancias2.setText("jTextField2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGanancias1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGanancias2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txtGanancias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGanancias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        REPORTE_CLIENTE.getContentPane().add(jPanel6);
        jPanel6.setBounds(20, 160, 680, 380);

        titulo_reporte.setBackground(new java.awt.Color(255, 0, 0));
        titulo_reporte.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        titulo_reporte.setForeground(new java.awt.Color(255, 255, 255));
        titulo_reporte.setText("ACCIÓN A REALIZAR:");
        REPORTE_CLIENTE.getContentPane().add(titulo_reporte);
        titulo_reporte.setBounds(0, 0, 330, 24);

        comboMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Ultima Semana", "Ultimo Mes", "Ultimo Año" }));
        comboMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMostrarActionPerformed(evt);
            }
        });
        REPORTE_CLIENTE.getContentPane().add(comboMostrar);
        comboMostrar.setBounds(110, 130, 150, 22);

        jLabel54.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Reporte de ventas");
        REPORTE_CLIENTE.getContentPane().add(jLabel54);
        jLabel54.setBounds(20, 30, 330, 100);

        jLabel57.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Mostrar :");
        REPORTE_CLIENTE.getContentPane().add(jLabel57);
        jLabel57.setBounds(20, 130, 110, 25);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel51.setText("jLabel33");
        REPORTE_CLIENTE.getContentPane().add(jLabel51);
        jLabel51.setBounds(-10, 0, 690, 30);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/document.png"))); // NOI18N
        REPORTE_CLIENTE.getContentPane().add(jLabel26);
        jLabel26.setBounds(570, 50, 100, 105);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        jLabel50.setText("}");
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel50MouseDragged(evt);
            }
        });
        REPORTE_CLIENTE.getContentPane().add(jLabel50);
        jLabel50.setBounds(0, 0, 730, 570);

        EMPLEADOS.setTitle("EMPLEADOS");
        EMPLEADOS.setUndecorated(true);
        EMPLEADOS.getContentPane().setLayout(null);

        titulo_empl.setBackground(new java.awt.Color(255, 0, 0));
        titulo_empl.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        titulo_empl.setForeground(new java.awt.Color(255, 0, 51));
        titulo_empl.setText("ACCIÓN A REALIZAR:");
        EMPLEADOS.getContentPane().add(titulo_empl);
        titulo_empl.setBounds(0, 0, 220, 24);

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Actualizar");
        EMPLEADOS.getContentPane().add(jLabel53);
        jLabel53.setBounds(180, 70, 60, 16);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel52.setText("jLabel33");
        EMPLEADOS.getContentPane().add(jLabel52);
        jLabel52.setBounds(-10, 0, 360, 30);

        exit11.setBackground(new java.awt.Color(255, 255, 255));
        exit11.setForeground(new java.awt.Color(255, 255, 255));
        exit11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit11.setBorder(null);
        exit11.setBorderPainted(false);
        exit11.setContentAreaFilled(false);
        exit11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit11ActionPerformed(evt);
            }
        });
        EMPLEADOS.getContentPane().add(exit11);
        exit11.setBounds(350, 0, 50, 30);

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Empleado"));

        tabla_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Turno", "Contraseña"
            }
        ));
        tabla_empleado.setComponentPopupMenu(elimina_empl);
        tabla_empleado.setInheritsPopupMenu(true);
        jScrollPane5.setViewportView(tabla_empleado);

        msj_elimm.setForeground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msj_elimm, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(msj_elimm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EMPLEADOS.getContentPane().add(jPanel9);
        jPanel9.setBounds(10, 90, 380, 180);

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Empleado"));
        jPanel10.setLayout(null);

        jLabel36.setText("ID:");
        jPanel10.add(jLabel36);
        jLabel36.setBounds(5, 26, 76, 16);

        jLabel37.setText("Usuario:");
        jPanel10.add(jLabel37);
        jLabel37.setBounds(180, 30, 76, 16);

        jLabel39.setText("Turno:");
        jPanel10.add(jLabel39);
        jLabel39.setBounds(10, 60, 39, 16);

        jLabel40.setText("Contraseña:");
        jPanel10.add(jLabel40);
        jLabel40.setBounds(170, 60, 70, 16);
        jPanel10.add(ID);
        ID.setBounds(30, 20, 130, 22);
        jPanel10.add(Usuario);
        Usuario.setBounds(230, 20, 130, 30);

        Turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino" }));
        jPanel10.add(Turno);
        Turno.setBounds(50, 60, 110, 22);
        jPanel10.add(Pass);
        Pass.setBounds(250, 50, 110, 30);

        Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho.png"))); // NOI18N
        Agregar.setBorder(null);
        Agregar.setBorderPainted(false);
        Agregar.setContentAreaFilled(false);
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho1.png"))); // NOI18N
        Agregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho2.png"))); // NOI18N
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel10.add(Agregar);
        Agregar.setBounds(300, 90, 70, 40);

        msj_empl.setForeground(new java.awt.Color(255, 153, 102));
        jPanel10.add(msj_empl);
        msj_empl.setBounds(10, 100, 280, 20);

        EMPLEADOS.getContentPane().add(jPanel10);
        jPanel10.setBounds(10, 280, 380, 140);

        Actualizar.setBackground(new java.awt.Color(255, 255, 255));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho.png"))); // NOI18N
        Actualizar.setBorder(null);
        Actualizar.setBorderPainted(false);
        Actualizar.setContentAreaFilled(false);
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho1.png"))); // NOI18N
        Actualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho2.png"))); // NOI18N
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        EMPLEADOS.getContentPane().add(Actualizar);
        Actualizar.setBounds(170, 30, 70, 40);

        fondo_emple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_emple.png"))); // NOI18N
        fondo_emple.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondo_empleMouseDragged(evt);
            }
        });
        EMPLEADOS.getContentPane().add(fondo_emple);
        fondo_emple.setBounds(0, 0, 400, 490);

        Elim_emp.setText("Eliminar");
        Elim_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elim_empActionPerformed(evt);
            }
        });
        elimina_empl.add(Elim_emp);

        AGREGA_E.setTitle("AGREGAR/DAR DE BAJA UN EQUIPO");
        AGREGA_E.setUndecorated(true);
        AGREGA_E.getContentPane().setLayout(null);

        exit4.setBackground(new java.awt.Color(255, 255, 255));
        exit4.setForeground(new java.awt.Color(255, 255, 255));
        exit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit4.setBorder(null);
        exit4.setBorderPainted(false);
        exit4.setContentAreaFilled(false);
        exit4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit4ActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(exit4);
        exit4.setBounds(350, 0, 50, 30);

        hecho1.setBackground(new java.awt.Color(255, 255, 255));
        hecho1.setForeground(new java.awt.Color(255, 255, 255));
        hecho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho.png"))); // NOI18N
        hecho1.setBorder(null);
        hecho1.setBorderPainted(false);
        hecho1.setContentAreaFilled(false);
        hecho1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hecho1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hecho1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho1.png"))); // NOI18N
        hecho1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hecho2.png"))); // NOI18N
        hecho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hecho1ActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(hecho1);
        hecho1.setBounds(330, 50, 60, 40);

        exit12.setBackground(new java.awt.Color(255, 255, 255));
        exit12.setForeground(new java.awt.Color(255, 255, 255));
        exit12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        exit12.setBorder(null);
        exit12.setBorderPainted(false);
        exit12.setContentAreaFilled(false);
        exit12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1.png"))); // NOI18N
        exit12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        exit12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit12ActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(exit12);
        exit12.setBounds(20, 490, 60, 50);

        titulo_agregae.setBackground(new java.awt.Color(255, 255, 255));
        titulo_agregae.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        titulo_agregae.setForeground(new java.awt.Color(255, 255, 255));
        titulo_agregae.setText("ALTA Y BAJA DE EQUIPOS");
        AGREGA_E.getContentPane().add(titulo_agregae);
        titulo_agregae.setBounds(110, 0, 170, 24);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel46.setText("jLabel33");
        AGREGA_E.getContentPane().add(jLabel46);
        jLabel46.setBounds(-10, 0, 360, 30);

        alta.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup4.add(alta);
        alta.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        alta.setForeground(new java.awt.Color(255, 255, 255));
        alta.setText("AGREGAR");
        alta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(alta);
        alta.setBounds(20, 40, 100, 23);

        baja.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup4.add(baja);
        baja.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        baja.setForeground(new java.awt.Color(255, 255, 255));
        baja.setText("DAR DE BAJA");
        baja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(baja);
        baja.setBounds(20, 70, 120, 23);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Equipo"));
        jPanel7.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        jLabel5.setText("Tipo de Equipo:");

        tipo_e.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        tipo_e.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escritorio", "Laptop" }));
        tipo_e.setEnabled(false);

        jLabel41.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        jLabel41.setText("Nombre del equipo:");

        nom_e.setFont(new java.awt.Font("Euphemia", 0, 12)); // NOI18N
        nom_e.setEnabled(false);

        jLabel4.setText("ID:");

        id_e.setEnabled(false);

        mensaje_e.setForeground(new java.awt.Color(255, 153, 51));

        agrega_e.setBackground(new java.awt.Color(255, 255, 255));
        agrega_e.setForeground(new java.awt.Color(255, 255, 255));
        agrega_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        agrega_e.setBorder(null);
        agrega_e.setBorderPainted(false);
        agrega_e.setContentAreaFilled(false);
        agrega_e.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agrega_e.setEnabled(false);
        agrega_e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agrega_e.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas1.png"))); // NOI18N
        agrega_e.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas2.png"))); // NOI18N
        agrega_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_eActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(mensaje_e, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agrega_e))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipo_e, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(42, 42, 42)
                                .addComponent(nom_e)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(id_e, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_e, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_e, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(mensaje_e, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agrega_e)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        AGREGA_E.getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 300, 380, 190);

        existentes.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        existentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipos Existentes", "Equipos en Espera", "Equipos Activos" }));
        existentes.setEnabled(false);
        existentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existentesActionPerformed(evt);
            }
        });
        AGREGA_E.getContentPane().add(existentes);
        existentes.setBounds(140, 50, 180, 25);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Equipo"));
        jPanel8.setToolTipText("");

        tabla_equipos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Equipo", "Tipo", "Estatus", "No. Equipo"
            }
        ));
        tabla_equipos2.setComponentPopupMenu(Eliminar);
        tabla_equipos2.setDoubleBuffered(true);
        tabla_equipos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_equipos2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_equipos2);

        mensaje_equipo.setForeground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(mensaje_equipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        AGREGA_E.getContentPane().add(jPanel8);
        jPanel8.setBounds(10, 100, 380, 190);

        fondo_agregae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAzul.jpg"))); // NOI18N
        fondo_agregae.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondo_agregaeMouseDragged(evt);
            }
        });
        AGREGA_E.getContentPane().add(fondo_agregae);
        fondo_agregae.setBounds(0, 0, 400, 590);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        Eliminar.add(eliminar);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/mouse_pointer.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        usuario2.setBackground(new java.awt.Color(255, 255, 255));
        usuario2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        usuario2.setForeground(new java.awt.Color(255, 255, 255));
        usuario2.setText("Bienvenido");
        getContentPane().add(usuario2);
        usuario2.setBounds(210, 0, 90, 24);

        in.setBackground(new java.awt.Color(153, 153, 153));
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/in.png"))); // NOI18N
        in.setBorder(null);
        in.setBorderPainted(false);
        in.setContentAreaFilled(false);
        in.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        in.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/in3.png"))); // NOI18N
        in.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/in2.png"))); // NOI18N
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        getContentPane().add(in);
        in.setBounds(180, 410, 50, 40);

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cinta.png"))); // NOI18N
        jLabel33.setText("jLabel33");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(0, 0, 460, 30);

        exit2.setBackground(new java.awt.Color(255, 255, 255));
        exit2.setForeground(new java.awt.Color(255, 255, 255));
        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        exit2.setBorder(null);
        exit2.setBorderPainted(false);
        exit2.setContentAreaFilled(false);
        exit2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit2.png"))); // NOI18N
        exit2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit3.png"))); // NOI18N
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(exit2);
        exit2.setBounds(460, 0, 40, 30);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close1.png"))); // NOI18N
        exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(260, 410, 50, 41);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rondalo", 0, 20)); // NOI18N
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 230, 150, 40);

        jLabel2.setFont(new java.awt.Font("Rondalo", 0, 20)); // NOI18N
        jLabel2.setText("CONTRASEÑA: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 280, 150, 50);

        contrasena.setBackground(new java.awt.Color(204, 204, 204));
        contrasena.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        contrasena.setCaretColor(new java.awt.Color(255, 0, 0));
        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(contrasena);
        contrasena.setBounds(190, 290, 180, 25);

        nom_usuario.setBackground(new java.awt.Color(204, 204, 204));
        nom_usuario.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        nom_usuario.setCaretColor(new java.awt.Color(255, 0, 0));
        nom_usuario.setSelectedTextColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(nom_usuario);
        nom_usuario.setBounds(190, 240, 180, 25);
        getContentPane().add(txtConexion);
        txtConexion.setBounds(160, 350, 230, 20);

        jLabel3.setFont(new java.awt.Font("Rondalo", 0, 36)); // NOI18N
        jLabel3.setText("Control de ciber");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 60, 260, 50);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciber/key-circle.png"))); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(200, 120, 80, 80);

        Error.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(Error);
        Error.setBounds(130, 330, 220, 20);

        fondo.setBackground(new java.awt.Color(255, 0, 0));
        fondo.setForeground(new java.awt.Color(255, 51, 51));
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 500, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Color oro() {
        Color oro = new Color(172, 150, 0);
        return oro;
    }

    private void clientenuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientenuevoMouseClicked
        nomcliente.setVisible(true);
        OK.setVisible(true);
        elige_nomcliente.setVisible(false);
        nomcliente.setEditable(true);
    }//GEN-LAST:event_clientenuevoMouseClicked

    private void clienteexistenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteexistenteMouseClicked
        elige_nomcliente.removeAllItems();
        elige_nomcliente.setVisible(true);
        OK.setVisible(false);
        nomcliente.setVisible(false);
        S.llena_combobox(elige_nomcliente);
    }//GEN-LAST:event_clienteexistenteMouseClicked

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        Error.setText("");
        if (nom_usuario.getText().isEmpty() || contrasena.getText().isEmpty()) {
            Error.setText("Campo vacío. Llene todos los campos");
        } else {
            try {
                in();
            } catch (SQLException ex) {
                Logger.getLogger(cyber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_inActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public void indice(int numm) {
        num = numm;
    }

    public int r_indice() {
        return num;
    }

    private void select_equiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_equiActionPerformed
        S.limpiartabla(modeloTabla);
        String sql = "";
        
        if (select_equi.getSelectedItem() == "Equipos disponibles") {
            sql = "SELECT * FROM equipos";
            S.Mostrarconsultas(modeloTabla, sql);
        }
        if (select_equi.getSelectedItem() == "Equipos Activos") {
            sql = "SELECT idEquipos, Tipo,"
                    + " Estatus, Nequipo FROM equipos WHERE Estatus='Activa'";
            S.Mostrarconsultas(modeloTabla, sql);
        }
        if (select_equi.getSelectedItem() == "Equipos en Espera") {
            sql = "SELECT idEquipos, Tipo, Estatus, Nequipo FROM equipos WHERE Estatus='Espera'";
            S.Mostrarconsultas(modeloTabla, sql);
        }
    }//GEN-LAST:event_select_equiActionPerformed

    public void llenar_tablaex(int n) {
        String sql = "";
        sql = "SELECT idEquipos, Tipo, Estatus, Nequipo FROM equipos";
        tabla_equipos2.setEnabled(true);
        
        if (n == 1) {
            if (existentes.getSelectedItem() == "Equipos Existentes") {
                S.Mostrarconsultas(modeloTabla2, sql);

            }
            if (existentes.getSelectedItem() == "Equipos Activos") {

                sql = "SELECT * FROM equipos WHERE Estatus='Activa'";
                S.Mostrarconsultas(modeloTabla2, sql);
                tabla_equipos2.setEnabled(false);

            }
            if (existentes.getSelectedItem() == "Equipos en Espera") {
                sql = "SELECT * FROM equipos WHERE Estatus='Espera'";
                S.Mostrarconsultas(modeloTabla2, sql);
            }
        } else {
            sql = "SELECT * FROM equipos";
            S.Mostrarconsultas(modeloTabla2, sql);
        }
    }

    private void fondo_accionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_accionMouseDragged
        ACCIONES.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_fondo_accionMouseDragged

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        if (rentar.isSelected()) {
            ACCIONES.setVisible(false);
            RENTA.setVisible(true);
            String fecha = fechaActual();
            fecha_renta.setText(fecha);
            txtPrecio.setText(Integer.toString(precioHr));
            

        } else if (reporte.isSelected()) {
            S.limpiartabla(modelotabla3);
            S.limpiartabla(modelotabla5);
            comboMostrar.setSelectedIndex(0);
            //idCliente = JOptionPane.showInputDialog(null, "INGRESE EL ID DEL CLIENTE:", "REPORTE DE CLIENTES. ID CLIENTE", 1);
            //try {
                //if ((JOptionPane.CANCEL_OPTION == -1) || (idCliente.isEmpty())) {
                  //  JOptionPane.showMessageDialog(null, "¡AGREGUE EL ID DEL CLIENTE!");
                //} else {
                    //idrenta se utiliza para buscar los datos de un cliente ya registrado
                    sql = "SELECT idRentas,Fecha_R,HoraInicio,HoraFin,idEquipos,`Monto a pagar` FROM rentas;";
                    sql2 = "SELECT idVentas,v.idProducto,NombreP,Fecha_V,Cantidad,Precio_final FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto;";
                    S.mostrarreporte(modelotabla3, sql);
                    S.mostrarreporte(modelotabla5, sql2);
                    S.ganancias(0);
                    ACCIONES.setVisible(false);
                    REPORTE_CLIENTE.setVisible(true);
                //}
            //} catch (Exception e) {
              //  System.out.println("Dio cancelar");
            //}

        } else if (venta.isSelected()) {
            elige_nomcliente1.removeAllItems();
            elige_nomcliente1.addItem("selecciona");
            ACCIONES.setVisible(false);
            VENTA.setVisible(true);
            S.llena_combobox(elige_nomcliente1);
            S.nombreproductos(elige_prod);
            S.limpiartabla(modelotabla4);
            elige_nomcliente1.setSelectedIndex(1);
            elige_prod.setSelectedIndex(0);
            String date = fechaActual();
            Fecha_v.setText(date);
            

        } else if (agregar.isSelected()) {
            ACCIONES.setVisible(false);
            AGREGA_E.setVisible(true);
        } else if (A_Empleado.isSelected()) {
            ACCIONES.setVisible(false);
            EMPLEADOS.setVisible(true);
        }
    }//GEN-LAST:event_acceptActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.setVisible(true);
        ACCIONES.setVisible(false);
    }//GEN-LAST:event_exit1ActionPerformed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        this.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_fondoMouseDragged

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit2ActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        this.setVisible(true);
        ACCIONES.setVisible(false);
    }//GEN-LAST:event_exit3ActionPerformed

    private void exit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit5ActionPerformed
        RENTA.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit5ActionPerformed

    private void jLabel47MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseDragged
        RENTA.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_jLabel47MouseDragged

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int filaselec, idEq;
        String nombre_eq = null;
        String fecha = "";
        fecha = fecha_renta.getText();
        System.out.println(fecha);
        
        if (fecha_renta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO SE HA AGREGADO LA FECHA");
        } else {
            filaselec = tabla_equipos.getSelectedRow();
            if (filaselec == -1) {
                JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO NINGÚN EQUIPO");
            }else if(((String) modeloTabla.getValueAt(filaselec, 2)).equals("Activa")){
                JOptionPane.showMessageDialog(null, "EQUIPO EN USO");
            }else {
                nombre_eq = (String) modeloTabla.getValueAt(filaselec, 3);
                idEq = (int) modeloTabla.getValueAt(filaselec, 0);
                int ID = Integer.parseInt(Metodos.ultimoID2());
                ID++;
                S.generarrenta(ID,H_inicio(), H_fin(), idEq, idcliente(), monto(), fecha, S.idadmin());
                visitas();
            }
        }
        eq_selec.setText("Equipo seleccionado: " + nombre_eq);
        S.limpiartabla(modeloTabla);
       String sql = "SELECT * FROM equipos";
       S.Mostrarconsultas(modeloTabla, sql);
       cliente cli = new cliente();
    }//GEN-LAST:event_guardarActionPerformed

    public String H_inicio() {
        String inicio, h, m, s;

        h = hora1.getSelectedItem().toString();
        m = min1.getSelectedItem().toString();
        s = seg1.getSelectedItem().toString();

        inicio = h + ":" + m + ":" + s;
        return inicio;
    }

    public String H_fin() {
        String fin, h, m, s;

        h = hora2.getSelectedItem().toString();
        m = min2.getSelectedItem().toString();
        s = seg2.getSelectedItem().toString();

        fin = h + ":" + m + ":" + s;
        return fin;
    }

    public Integer idcliente() {
        int id = 0;
        String sql;
        sql = "SELECT idClientes FROM Clientes WHERE NombreC='" + nomcliente.getText() + "'";
        //checa el ultimo id de la tabla clientes 
        try {
            id = S.idcliente(sql);
            System.out.println(" id cliente nvo.: " + id);

        } catch (Exception e) {
            System.out.println("Error con el idCliente: " + e);
        }
        return id;
    }

    public Integer visitas() {
        int visitas = 0;
        if (clientenuevo.isSelected()) {
            visitas = 1;
        }
        if (clienteexistente.isSelected()) {
            visitas = S.vistas(idcliente());
            System.out.println("visitas del cliente: " + visitas);
        }
        return visitas;
    }

    public String tipo() {
        String tipo;
        if (visitas() > 1) {
            tipo = "F";
        } else {
            tipo = "C";
        }

        return tipo;
    }

    public float monto() {
        float monto = 0,med = 0;
        int h, m, s, h2, m2, s2, hh, mm, ss, hf, mf, sf;
        h = Integer.parseInt(hora1.getSelectedItem().toString());
        m = Integer.parseInt(min1.getSelectedItem().toString());
        s = Integer.parseInt(seg1.getSelectedItem().toString());
        h2 = Integer.parseInt(hora2.getSelectedItem().toString());
        m2 = Integer.parseInt(min2.getSelectedItem().toString());
        s2 = Integer.parseInt(seg2.getSelectedItem().toString());

        hh = h2 - h;
        mm = m2 - m;
        ss = s2 - s;
        if (hh < 0) {
            System.out.println("La hora es menor que 0");
            JOptionPane.showMessageDialog(null, "¡La hora de Salida es mayor que la hora de entrada!\n" + "Cambiar la hora de salida");
        }
        if (mm < 0) //checa si la resta es negativa
        {
            mm = mm * (-1);
        }

        if (ss < 0) //checa si la resta es negativa
        {
            ss = ss * (-1);
        }

        hf = hh;
        mf = mm / 60;
        sf = ss / 3600;
        
        double media = 0;
        if(mm>2 && m<31){
            med = (float) (hh + 0.5);
            monto = med * precioHr;
        System.out.println(hf+" "+mf+" "+sf);
        }
        if(mm>30 && mm<59){
            monto = (hh+1) * precioHr;
        }

        if(mm==0 || mm==1 || mm == 2){
            monto = (hf + mf + sf) * precioHr;
            System.out.println(hf+" "+mf+" "+sf);
        } 
        
        

        System.out.println("Horas de renta= " + hh + ":" + mm + ":" + ss);
        tiempo = segundos(hh,mm,ss);
        //System.out.println("Monto a pagar: $" + monto);
        return monto;
    }
    public int segundos(int h,int m,int s){
        int t,hh,mm;  
        hh=h*3600;
        mm=m*60;
        t=hh+mm+s;
     return t;  
    }

    private void exit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit7ActionPerformed
        RENTA.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit7ActionPerformed

    private void exit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit8ActionPerformed
        VENTA.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit8ActionPerformed

    private void fondo_ventaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_ventaMouseDragged
        VENTA.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_fondo_ventaMouseDragged

    private void exit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit6ActionPerformed
        VENTA.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit6ActionPerformed

    private void exit10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit10ActionPerformed
        REPORTE_CLIENTE.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit10ActionPerformed

    private void jLabel50MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseDragged
        REPORTE_CLIENTE.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_jLabel50MouseDragged

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        String nombre;
        nombre = nomcliente.getText();
        if (nomcliente.getText().isEmpty()) {
            System.out.println("agregar nombre de cliente");
            JOptionPane.showMessageDialog(null, "!AGREGAR NOMBRE DE CLIENTE¡");
        } else {
            S.clientenuevo(nombre, tipo(), visitas());
        }
    }//GEN-LAST:event_OKActionPerformed

    private void elige_nomclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elige_nomclienteActionPerformed
        nomcliente.setVisible(true);
        nomcliente.setEditable(false);
        jLabel6.setVisible(true);
        PreparedStatement us;
        try {
            sql = "SELECT * FROM clientes where NombreC='" + elige_nomcliente.getSelectedItem() + "'";
            us = con.conex().prepareStatement(sql);
            ResultSet res = us.executeQuery();
            res.next();
            nomcliente.setText(res.getString("NombreC"));
            res.close();
        } catch (Exception e) {
            System.out.println("no imprimió cliente seleccionado:  " + e);
        }
    }//GEN-LAST:event_elige_nomclienteActionPerformed

    private void OK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK1ActionPerformed
        String id = ideq.getText();
        if (ideq.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "!AGREGAR ID DEL EQUIPO A MODIFICAR¡");
        } else {
            sql = "UPDATE equipos SET Estatus= 'Espera' WHERE idEquipos=" + id;
            S.cambiaestado(sql);
            S.limpiartabla(modeloTabla);
            String sql = "SELECT * FROM equipos";
            S.Mostrarconsultas(modeloTabla, sql);
            cliente cli = new cliente();
        }
    }//GEN-LAST:event_OK1ActionPerformed

    private void agrega_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_prodActionPerformed
        tabla_prod.setEnabled(true);
        //S.limpiartabla(modelotabla4);
        String user = nom_usuario.getText();
        int idadmin, idcliente, pi, pfinal, cantidad = Integer.parseInt(cantidad_prod.getText());
        

        String fecha, sql3, sql6, sql5, sql4;
        fecha = Fecha_v.getText();
        if (Fecha_v.getText().isEmpty() || cantidad_prod.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "!FALTA AGREGAR DATOS!");
        } else if (elige_nomcliente1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "!NO HA SELECCIONADO EL CLIENTE!");
        } else {
            
            sql5 = "SELECT idAdmins FROM admins WHERE Usuario='" + user + "'";
            sql4 = "SELECT idProducto FROM producto WHERE NombreP='" + elige_prod.getSelectedItem() + "'";
            sql3 = "SELECT idClientes FROM clientes WHERE NombreC='" + elige_nomcliente1.getSelectedItem() + "'";
            int idproducto = S.idcliente(sql4);
            sql6 = "SELECT Precio FROM producto WHERE NombreP='" + elige_prod.getSelectedItem() + "'";
            //sql = "SELECT ventas.Cantidad,producto.NombreP,producto.Precio FROM ventas,producto WHERE "
              //      + "ventas.idProducto = producto.idProducto AND idVentas= " + idproducto;

            pi = S.idcliente(sql6);
            idadmin = S.idcliente(sql5);
            idcliente = S.idcliente(sql3);
            

            System.out.println("si muestra id cliente" + idcliente);
            System.out.println("si muestra id producto" + idproducto);
            System.out.println("si muestra id empleado " + idadmin);
            pfinal = pi * cantidad;
            contProd = contProd + cantidad;
            contTotal = contTotal + pfinal;
            System.out.println("producto " + elige_prod.getSelectedItem());
            //sql = "SELECT ventas.Cantidad, producto.NombreP,ventas.Precio_final FROM ventas,producto where idVentas=3 AND producto.NombreP="
              //      +elige_prod.getSelectedItem();
             
            precio_prod1.setText("$" + pi);
            cant_final.setText(contProd + "");
            precio_final.setText("$ " + contTotal);
            S.Agregarventas(idcliente, S.idcliente(sql4), fecha, idadmin, cantidad, pfinal);
            String a = Metodos.ultimoID();
            System.out.println("cadena===="+a+"\n"+elige_prod.getSelectedItem());
            int b = Integer.parseInt(a);
            sql = "SELECT Cantidad,nombreP,Precio_final FROM ventas v INNER JOIN producto p ON  v.idProducto = p.idProducto WHERE v.idVentas ="+a;
            S.Mostrarconsultas(modelotabla4, sql);
            
            
        }
    }//GEN-LAST:event_agrega_prodActionPerformed

 
    private void exit11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit11ActionPerformed
        EMPLEADOS.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit11ActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        S.Agregar_empleado(Integer.parseInt(ID.getText()), Usuario.getText(), Turno, Pass.getText());
        S.limpiartabla(modelo_empl);
        llenar_tablaempl();
        msj_empl.setText("Se agrego correctamente el empleado");
        ID.setText("");
        Usuario.setText("");
        Pass.setText("");
    }//GEN-LAST:event_AgregarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        llenar_tablaempl();
    }//GEN-LAST:event_ActualizarActionPerformed

    public void llenar_tablaempl() {
        S.limpiartabla(modelo_empl);
        String sql = "SELECT * FROM admins";
        S.Mostrarconsultas(modelo_empl, sql);
    }
    private void fondo_empleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_empleMouseDragged
        EMPLEADOS.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_fondo_empleMouseDragged

    private void Elim_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elim_empActionPerformed
        int index = tabla_empleado.getSelectedRow();
        TableModel modelo = tabla_empleado.getModel();
        int indice = Integer.parseInt(modelo.getValueAt(index, 0).toString());
        S.elimina_empleado(indice);
        S.limpiartabla(modelo_empl);
        llenar_tablaempl();
        msj_elimm.setText("Se elimino correctamente el empleado");
    }//GEN-LAST:event_Elim_empActionPerformed

    private void exit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit4ActionPerformed
        AGREGA_E.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit4ActionPerformed

    private void hecho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hecho1ActionPerformed
        int index = tabla_equipos2.getSelectedRow();
        TableModel modelo = tabla_equipos2.getModel();
        int indice = Integer.parseInt(modelo.getValueAt(index, 0).toString());
        String estado = modelo.getValueAt(index, 2).toString();
        if (estado.equals("Espera")) {
            S.elimina_equipo(indice);
            S.limpiartabla(modeloTabla2);
            llenar_tablaex(1);
            mensaje_equipo.setText("Se elimino correctamente el equipo");
        } else {
            mensaje_equipo.setText("No puede eliminar un equipo en uso");
        }
        JOptionPane.showMessageDialog(null, "EL EQUIPO HA SIDO ELIMINADO DE LA BASE DE DATOS");
    }//GEN-LAST:event_hecho1ActionPerformed

    private void exit12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit12ActionPerformed
        AGREGA_E.setVisible(false);
        ACCIONES.setVisible(true);
    }//GEN-LAST:event_exit12ActionPerformed

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed

        if (alta.isSelected()) {
            S.limpiartabla(modeloTabla2);
            llenar_tablaex(1);
            baja.setSelected(false);
            //buttonGroup4.setSelected((ButtonModel) baja,false); 
            id_e.setEnabled(true);
            tipo_e.setEnabled(true);
            nom_e.setEnabled(true);
            agrega_e.setEnabled(true);
            existentes.setEnabled(false);
            hecho1.setEnabled(false);
        }
    }//GEN-LAST:event_altaActionPerformed

    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        if (baja.isSelected()) {
            S.limpiartabla(modeloTabla2);
            llenar_tablaex(1);
            alta.setSelected(false);
            //buttonGroup4.setSelected((ButtonModel) alta,false); 
            id_e.setEnabled(false);
            tipo_e.setEnabled(false);
            nom_e.setEnabled(false);
            agrega_e.setEnabled(false);
            existentes.setEnabled(true);
            hecho1.setEnabled(true);
        }
    }//GEN-LAST:event_bajaActionPerformed

    private void agrega_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_eActionPerformed
        int Id = Integer.parseInt(id_e.getText());
        S.Agregarequipo(tipo_e, Id, nom_e.getText());
        S.limpiartabla(modeloTabla2);
        llenar_tablaex(2);
        mensaje_e.setText("Se agregó correctamente");
    }//GEN-LAST:event_agrega_eActionPerformed

    private void existentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existentesActionPerformed

        S.limpiartabla(modeloTabla2);
        llenar_tablaex(1);
    }//GEN-LAST:event_existentesActionPerformed

    private void tabla_equipos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_equipos2MouseClicked
        //        if(evt.getButton() == MouseEvent.BUTTON3){
        //            tabla_equipos2.addMouseListener(new PopClickListener());
        //        }
    }//GEN-LAST:event_tabla_equipos2MouseClicked

    private void fondo_agregaeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_agregaeMouseDragged
        AGREGA_E.setLocation(evt.getLocationOnScreen());
    }//GEN-LAST:event_fondo_agregaeMouseDragged

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int index = tabla_equipos2.getSelectedRow();
        TableModel modelo = tabla_equipos2.getModel();
        int indice = Integer.parseInt(modelo.getValueAt(index, 0).toString());
        String estado = modelo.getValueAt(index, 2).toString();
        if (estado.equals("Espera")) {
            S.elimina_equipo(indice);
            S.limpiartabla(modeloTabla2);
            llenar_tablaex(1);
            mensaje_equipo.setText("Se elimino correctamente el equipo");
        } else {
            mensaje_equipo.setText("No puede eliminar un equipo en uso");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void rentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarActionPerformed

    private void elige_nomcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elige_nomcliente1ActionPerformed
        //elige_nomcliente1.setSelectedIndex(1);
    }//GEN-LAST:event_elige_nomcliente1ActionPerformed

    private void Fecha_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_vActionPerformed

    private void fecha_rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_rentaActionPerformed
       
    }//GEN-LAST:event_fecha_rentaActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed

    private void clienteexistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteexistenteActionPerformed
       S.limpiartabla(modeloTabla);
       String sql = "SELECT * FROM equipos";
       S.Mostrarconsultas(modeloTabla, sql);
    }//GEN-LAST:event_clienteexistenteActionPerformed

    private void elige_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elige_prodActionPerformed
        //tabla_prod.setEnabled(true);
        //S.limpiartabla(modelotabla4);
        //String user = nom_usuario.getText();
        
        //int idcliente, pi = Integer.parseInt(cantidad_prod.getText());
        //elige_nomcliente1.getSelectedIndex();
        String sql6 = "SELECT Precio FROM producto WHERE NombreP='" + elige_prod.getSelectedItem() + "'";
       int  pi = S.idcliente(sql6);
        precio_prod1.setText("$" + pi);
        
    }//GEN-LAST:event_elige_prodActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        S.limpiartabla(modelotabla4);
        cant_final.setText("0");
        precio_final.setText("$");
        contTotal = 0;contProd = 0;
        JOptionPane.showMessageDialog(null, "Pagado");
    }//GEN-LAST:event_btnPagarActionPerformed

    private void A_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_EmpleadoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraActionPerformed
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();    
        
        DecimalFormat df = new DecimalFormat("00.#");
 
        hora1.setSelectedItem(df.format(hours));
        min1.setSelectedItem(df.format(minutes));
        seg1.setSelectedItem(df.format(seconds));
        
    }//GEN-LAST:event_btnHoraActionPerformed

    private void btnHora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora1ActionPerformed
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();    
        
        DecimalFormat df = new DecimalFormat("00.#");
 
        hora2.setSelectedItem(df.format(hours));
        min2.setSelectedItem(df.format(minutes));
        seg2.setSelectedItem(df.format(seconds));
    }//GEN-LAST:event_btnHora1ActionPerformed

    private void comboMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMostrarActionPerformed
        if(comboMostrar.getSelectedIndex() == 0){
            S.limpiartabla(modelotabla3);
            S.limpiartabla(modelotabla5);
            S.ganancias(0);
            
                    sql = "SELECT idRentas,Fecha_R,HoraInicio,HoraFin,idEquipos,`Monto a pagar` FROM rentas order by 1;";
                    sql2 = "SELECT idVentas,v.idProducto,NombreP,Fecha_V,Cantidad,Precio_final FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto order by 1;";
                    S.mostrarreporte(modelotabla3, sql);
                    S.mostrarreporte(modelotabla5, sql2);
                    
                    //ACCIONES.setVisible(false);
                    //REPORTE_CLIENTE.setVisible(true);
        }
        if(comboMostrar.getSelectedIndex() == 1){
            S.limpiartabla(modelotabla3);
            S.limpiartabla(modelotabla5);
            
                    sql = "SELECT idRentas,Fecha_R,HoraInicio,HoraFin,idEquipos,`Monto a pagar` FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND WEEKOFYEAR(Fecha_R) = (WEEKOFYEAR(CURDATE())-1) order by 1;";
                    sql2 = "SELECT idVentas,v.idProducto,NombreP,Fecha_V,Cantidad,Precio_final FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND WEEKOFYEAR(Fecha_V) = (WEEKOFYEAR(CURDATE())-1) order by 1";
                    S.mostrarreporte(modelotabla3, sql);
                    S.mostrarreporte(modelotabla5, sql2);
                    S.ganancias(1);
                    //ACCIONES.setVisible(false);
                    //REPORTE_CLIENTE.setVisible(true);
        }
        if(comboMostrar.getSelectedIndex() == 2){
            S.limpiartabla(modelotabla3);
            S.limpiartabla(modelotabla5);
            S.ganancias(2);
            
                    sql = "SELECT idRentas,Fecha_R,HoraInicio,HoraFin,idEquipos,`Monto a pagar` FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND MONTH(Fecha_R) = (MONTH(CURDATE())-1) order by 1";
                    sql2 = "SELECT idVentas,v.idProducto,NombreP,Fecha_V,Cantidad,Precio_final FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND MONTH(Fecha_V) = (MONTH(CURDATE())-1) order by 1";
                    S.mostrarreporte(modelotabla3, sql);
                    S.mostrarreporte(modelotabla5, sql2);
                    //ACCIONES.setVisible(false);
                    //REPORTE_CLIENTE.setVisible(true);
        }
        if(comboMostrar.getSelectedIndex() == 3){
            S.limpiartabla(modelotabla3);
            S.limpiartabla(modelotabla5);
            S.ganancias(3);
            
                    sql = "SELECT idRentas,Fecha_R,HoraInicio,HoraFin,idEquipos,`Monto a pagar` FROM rentas WHERE YEAR(Fecha_R) = YEAR(CURDATE()) AND YEAR(Fecha_R) = (YEAR(CURDATE())) order by 1";
                    sql2 = "SELECT idVentas,v.idProducto,NombreP,Fecha_V,Cantidad,Precio_final FROM ventas v INNER JOIN producto p on p.idProducto = v.idProducto WHERE YEAR(Fecha_V) = YEAR(CURDATE()) AND YEAR(Fecha_V) = (YEAR(CURDATE())) order by 1";
                    S.mostrarreporte(modelotabla3, sql);
                    S.mostrarreporte(modelotabla5, sql2);
                    //ACCIONES.setVisible(false);
                    //REPORTE_CLIENTE.setVisible(true);
        }
    }//GEN-LAST:event_comboMostrarActionPerformed

    private void txtGanancias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGanancias1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGanancias1ActionPerformed

    public void limpiar_tabla2() {
        for (int i = 0; i < tabla_equipos2.getRowCount(); i++) {
            modeloTabla2.removeRow(i);
            i -= 1;
        }
    }

    public void in() throws SQLException {
        String us, cont;
        us = nom_usuario.getText();
        cont = contrasena.getText();
        boolean R = S.iniciar(us, cont);
        empleado = S.empleado();
        if (R) {
            System.out.println("Entrando");
            this.setVisible(false);
            ACCIONES.setVisible(true);
            if (empleado.equals(Admin)) {
                A_Empleado.setEnabled(true);
            }
            usuario.setText("Administrador: " + empleado);
            titulo_agregae.setText("Agrega/Elimina Equipo :" + empleado);
            titulo_renta.setText("Renta de Equipo :" + empleado);
            titulo_venta.setText("Venta Producto :" + empleado);
            titulo_empl.setText("Empleados :" + empleado);
            titulo_reporte.setText("Reporte");
            //usuarioRR.setText("USUARIO:" + empleado);
        } else {
            System.out.println("ya valiste papu");
            Error.setText("Usuario o contraseña invalida");
        }
    }
 
    public String fechaActual(){
        Date fecha = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fecha1 =dateFormat.format(fecha);
        return fecha1;
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
            java.util.logging.Logger.getLogger(cyber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cyber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cyber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cyber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cyber().setVisible(true);
                if(c == true){
                    Color col = new Color(8, 147, 25);
                    txtConexion.setText("Conexion establecida con el servidor");
                    txtConexion.setForeground(col);
                }if(c == false){
                    txtConexion.setText("Conexion fallida con el servidor");
                    txtConexion.setForeground(Color.red);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFrame ACCIONES;
    public javax.swing.JFrame AGREGA_E;
    public javax.swing.JRadioButton A_Empleado;
    public javax.swing.JButton Actualizar;
    public javax.swing.JButton Agregar;
    public javax.swing.JFrame EMPLEADOS;
    public javax.swing.JMenuItem Elim_emp;
    public javax.swing.JPopupMenu Eliminar;
    public javax.swing.JLabel Error;
    public javax.swing.JTextField Fecha_v;
    public javax.swing.JTextField ID;
    public javax.swing.JButton OK;
    public javax.swing.JButton OK1;
    public javax.swing.JPasswordField Pass;
    public javax.swing.JFrame RENTA;
    public javax.swing.JFrame REPORTE_CLIENTE;
    public javax.swing.JComboBox Turno;
    public javax.swing.JTextField Usuario;
    public javax.swing.JFrame VENTA;
    public javax.swing.JButton accept;
    public javax.swing.JButton agrega_e;
    public javax.swing.JButton agrega_prod;
    public javax.swing.JRadioButton agregar;
    public javax.swing.JRadioButton alta;
    public javax.swing.JRadioButton baja;
    public javax.swing.JButton btnHora;
    public javax.swing.JButton btnHora1;
    public javax.swing.JButton btnPagar;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.ButtonGroup buttonGroup4;
    public javax.swing.JLabel cant_final;
    public javax.swing.JTextField cantidad_prod;
    public javax.swing.JRadioButton clienteexistente;
    public javax.swing.JRadioButton clientenuevo;
    public javax.swing.JComboBox<String> comboMostrar;
    public javax.swing.JPasswordField contrasena;
    public javax.swing.JComboBox<String> elige_nomcliente;
    public javax.swing.JComboBox<String> elige_nomcliente1;
    public javax.swing.JComboBox<String> elige_prod;
    public javax.swing.JPopupMenu elimina_empl;
    public javax.swing.JMenuItem eliminar;
    public javax.swing.JLabel eq_selec;
    public javax.swing.JComboBox<String> existentes;
    public javax.swing.JButton exit;
    public javax.swing.JButton exit1;
    public javax.swing.JButton exit10;
    public javax.swing.JButton exit11;
    public javax.swing.JButton exit12;
    public javax.swing.JButton exit2;
    public javax.swing.JButton exit3;
    public javax.swing.JButton exit4;
    public javax.swing.JButton exit5;
    public javax.swing.JButton exit6;
    public javax.swing.JButton exit7;
    public javax.swing.JButton exit8;
    public javax.swing.JTextField fecha_renta;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel fondo_accion;
    public javax.swing.JLabel fondo_agregae;
    public javax.swing.JLabel fondo_emple;
    public javax.swing.JLabel fondo_venta;
    public javax.swing.JButton guardar;
    public javax.swing.JButton hecho1;
    public javax.swing.JComboBox<String> hora1;
    public javax.swing.JComboBox<String> hora2;
    public javax.swing.JTextField id_e;
    public javax.swing.JTextField ideq;
    public javax.swing.JButton in;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel52;
    public javax.swing.JLabel jLabel53;
    public javax.swing.JLabel jLabel54;
    public javax.swing.JLabel jLabel55;
    public javax.swing.JLabel jLabel56;
    public javax.swing.JLabel jLabel57;
    public javax.swing.JLabel jLabel58;
    public javax.swing.JLabel jLabel59;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JLabel mensaje_e;
    public javax.swing.JLabel mensaje_equipo;
    public javax.swing.JComboBox<String> min1;
    public javax.swing.JComboBox<String> min2;
    public javax.swing.JLabel msj_elimm;
    public javax.swing.JLabel msj_empl;
    public javax.swing.JTextField nom_e;
    public javax.swing.JTextField nom_usuario;
    public javax.swing.JTextField nomcliente;
    public javax.swing.JLabel num_venta1;
    public javax.swing.JLabel precio_final;
    public javax.swing.JLabel precio_prod1;
    public javax.swing.JRadioButton rentar;
    public javax.swing.JRadioButton reporte;
    public javax.swing.JComboBox<String> seg1;
    public javax.swing.JComboBox<String> seg2;
    public javax.swing.JComboBox<String> select_equi;
    public javax.swing.JTable tabla_empleado;
    public javax.swing.JTable tabla_equipos;
    public javax.swing.JTable tabla_equipos2;
    public javax.swing.JTable tabla_join;
    public javax.swing.JTable tabla_join2;
    public javax.swing.JTable tabla_prod;
    public javax.swing.JComboBox<String> tipo_e;
    public javax.swing.JLabel titulo_agregae;
    public javax.swing.JLabel titulo_empl;
    public javax.swing.JLabel titulo_renta;
    public javax.swing.JLabel titulo_reporte;
    public javax.swing.JLabel titulo_venta;
    public static javax.swing.JLabel txtConexion;
    public static javax.swing.JTextField txtGanancias1;
    public static javax.swing.JTextField txtGanancias2;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JLabel usuario;
    public javax.swing.JLabel usuario1;
    public javax.swing.JLabel usuario2;
    public javax.swing.JRadioButton venta;
    // End of variables declaration//GEN-END:variables
}
