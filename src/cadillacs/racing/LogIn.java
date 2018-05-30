/*
 Creando LogIn para que el usuario pueda entrar al VideoJuego
 */
package cadillacs.racing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */

public class LogIn extends JFrame {
    private Component confirmacion;
    private String usuario, password;
    JLabel JLabel1,JLabel2,lbl_titulo,lbl_banner,lbl_background;
    JButton Boton_iniciar, Boton_cancelar;
    JTextField txtUsuario,txtPassword;
    
    public LogIn () {
         //CREANDO ESPECIFICACIONES DE VENTANA LogIn.
        initComponents ();
        this.setSize(450, 325);//Estableciendo tamaño de la venta LogIn.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("LOGIN"); //Estableciendo titulo de la Venta LogIn.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana LogIn automaticamente se terminara el programa.
        txtUsuario.setFocusable(true);//Para que me aparezca de una vez seleccionada la txt de usuario.    
    }
    
    public void Datos (String us,String pas){ /*Este metodo nos servira de una sola vez para 
        trasladarla a la base de datos.
        */
        usuario = "Karicha";
        password = "123";
    }
    
    private void initComponents() {
        Boton_iniciar = new JButton();
        Boton_cancelar = new JButton();
        JLabel1 = new JLabel();
        JLabel2 = new JLabel();
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();
        lbl_titulo = new JLabel();
        lbl_banner = new JLabel();
        lbl_background = new JLabel();

        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setUndecorated(true);
        Container contenedor = getContentPane();
        contenedor.setLayout(null);
        
        Boton_iniciar.setBackground(new java.awt.Color(0, 162, 255));
        Boton_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_iniciar.setText("LOGIN");
        Boton_iniciar.setBounds(60, 210, 330, 40);
        Boton_iniciar.setCursor(new java.awt.Cursor(Cursor.DEFAULT_CURSOR));
        Boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boton_iniciarActionPerformed(e);
            }
        });
        Container contenedorBtnIniciar = getContentPane();
        contenedorBtnIniciar.add(Boton_iniciar);
        
        Boton_cancelar.setBackground(new Color(0, 162, 255));
        Boton_cancelar.setForeground(new Color(255, 255, 255));
        Boton_cancelar.setText("CANCELAR");
        Boton_cancelar.setBounds(60, 260, 330, 40);
        Boton_cancelar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Boton_cancelarActionPerformed(e);
            }

        });
        Container contenedorBtnCancelar = getContentPane();
        contenedorBtnCancelar.add(Boton_cancelar);
        
        JLabel1.setIcon(new ImageIcon(getClass().getResource("iconUsuario.jpg")));
        JLabel1.setBounds(60, 90, -1, 40);
        Container contenedorUsu = getContentPane();
        contenedorUsu.add(JLabel1);
        
        JLabel2.setIcon(new ImageIcon(getClass().getResource("iconContraseña.jpg"))); 
        JLabel2.setBounds(60, 140, 40, 40);
        Container contenedorPass = getContentPane();
        contenedorPass.add(JLabel2);
        
        txtUsuario.setBackground(new Color(224, 224, 224));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        txtUsuario.setForeground(new Color(23, 160, 249));
        txtUsuario.setBounds(110, 90, 280, 40);
        Container contenedorTxtUsu = getContentPane();
        contenedorTxtUsu.add(txtUsuario);

        txtPassword.setBackground(new Color(224, 224, 224));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        txtPassword.setForeground(new java.awt.Color(23, 160, 249));
        txtPassword.setBounds(110, 140, 280, 40);
        Container contenedorTxtPass = getContentPane();
        contenedorTxtPass.add(txtPassword);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 18));
        lbl_titulo.setForeground(new Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_titulo.setText("INICIAR SESIÓN");
        lbl_titulo.setBounds(150, 20, -1, -1);
        Container contenedorLblTitu = getContentPane();
        contenedorLblTitu.add(lbl_titulo);

        lbl_banner.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_banner.setIcon(new ImageIcon(getClass().getResource("banner.jpg")));
        lbl_banner.setBounds(0, 0, 450, 60);
        Container contenedorBanner = getContentPane();
        contenedorBanner.add(lbl_banner);
        
        

        lbl_background.setBackground(new Color(0, 204, 204));
        lbl_background.setIcon(new ImageIcon(getClass().getResource("nuevoFondo.jpg")));
        lbl_background.setBounds(0, 0, 450, 340);
        Container contenedorBackg = getContentPane();
        contenedorBackg.add(lbl_background);
        

        pack();
    }
    
    private void Boton_cancelarActionPerformed(ActionEvent e) {
    Object [] opciones ={"Aceptar","Cancelar"};
    int eleccion = JOptionPane.showOptionDialog(confirmacion,"¿Desea salir?","Confirmacion",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }else{

        }
    }
    
    private void Boton_iniciarActionPerformed(ActionEvent e) {
        Datos(usuario, password);
        if(usuario.equals(txtUsuario.getText()) && password.equals(txtPassword.getText())){
            VentanaA VA = new VentanaA();
            VA.setVisible(true);
            LogIn.this.dispose();
        }else if(txtUsuario.getText().equals("") && txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
            txtUsuario.setFocusable(true);
        }else if(txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
            txtUsuario.setFocusable(true);
        }else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
            txtPassword.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(usuario)!=0 && txtPassword.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
            txtUsuario.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(usuario)!=0){
            JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
            txtUsuario.setFocusable(true);
        }else if(txtPassword.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
            txtPassword.setFocusable(true);
        }
    }
    
    
}

