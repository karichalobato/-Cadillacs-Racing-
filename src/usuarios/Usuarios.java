/*
 * Creacion de Registro de usuarios.
 */
package usuarios;

import cadillacs.racing.VentanaA;
//import cadillacs.racing.VentanaC;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 * En esta clase crearemos un registro de usuario para nuestro proyecto, incluyendo con conección con base de datos
 * para ellos estaremos utilizando MySQL administrador.
 */
public class Usuarios extends JFrame {
    Connection con = null;
    Statement stmt = null;
    public Image imagenFondo;
    public URL fondoUsuarios;
    JLabel lbl_fondoUsuarios,lblnombre,lblpassword,lblnickname,lblID;
    JButton btnAceptar,btnInicio;
    JTextField txtnombre,txtnickname,txtID;
    JPasswordField txtpassword;
    
    public Usuarios (){ //Constructor clase Usuarios
        this.setSize(500, 600);//Estableciendo tamaño de la venta Usuarios.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("REGISTRO DE USUARIOS"); //Estableciendo titulo de la ventana Usuarios.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana automaticamente se terminara el programa.
        txtnombre = new JTextField();
        txtnombre.setFocusable(true);
    
        //COLOCANDO IMAGEN DE FONDO.
        fondoUsuarios = this.getClass().getResource("imagenFondoUsuariosf.jpg");
        imagenFondo = new ImageIcon(fondoUsuarios).getImage();
        Container contenedorFondo = getContentPane();
        contenedorFondo.add(panelUsuarios);
        panelUsuarios.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO BOTONES DE VENTANA REGISTRO DE USUARIOS.
        btnAceptar = new JButton ("Aceptar");
        btnAceptar.setBounds(300, 510, 125, 40);
        btnAceptar.setForeground(Color.BLACK);
        btnAceptar.setBackground(Color.LIGHT_GRAY);
        btnAceptar.setFont(new Font("Times New Roman bold",0,16));
        btnAceptar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAceptarActionPerformed(e);
            }

        });
        panelUsuarios.add(btnAceptar);
        
        btnInicio = new JButton ("Inicio");
        btnInicio.setBounds(90, 510, 125, 40);
        btnInicio.setBackground(Color.LIGHT_GRAY);
        btnInicio.setForeground(Color.BLACK);
        btnInicio.setFont(new Font("Times New Roman bold",0,16));
        panelUsuarios.add(btnInicio);
        
        //CON ESTE EVENTO, EL BOTON INICIO NOS CONDUCIRA A LA PANATALLA INICIO O "MENU" DE NUESTRO JUEGO.
        btnInicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                Usuarios.this.dispose();
            }
            
        });
        
        //ETIQUETAS DE LA VENTANA DE REGISTRO DE USUARIO
        lblnombre = new JLabel("Nombre: ");
        lblnombre.setBounds(60, 310, 100, 20);
        lblnombre.setForeground(Color.BLACK);
        lblnombre.setFont(new Font("Times New Roman bold", 0, 20)); 
        panelUsuarios.add(lblnombre);
        
        lblnickname = new JLabel("Nickname: ");
        lblnickname.setBounds(60, 370, 100, 20);
        lblnickname.setForeground(Color.BLACK);
        lblnickname.setFont(new Font("Times New Roman bold", 0, 20)); 
        panelUsuarios.add(lblnickname);
        
        lblpassword = new JLabel("Password: ");
        lblpassword.setBounds(60, 430, 100, 20);
        lblpassword.setForeground(Color.BLACK);
        lblpassword.setFont(new Font("Times New Roman bold", 0, 20)); 
        panelUsuarios.add(lblpassword);
        /*
        lblID = new JLabel("ID: ");
        lblID.setBounds(60, 50, 50, 20);
        lblID.setForeground(Color.BLACK);
        lblID.setFont(new Font("Tahoma", 0, 20)); 
        panelUsuarios.add(lblID);*/
        
        //CAMPOS A LLENAR DEL RESGISTRO DE USUARIO
        txtnombre = new JTextField();
        txtnombre.setBackground(Color.BLACK);
        txtnombre.setFont(new Font("Times New Roman bold", 0, 20)); 
        txtnombre.setForeground(Color.WHITE);
        txtnombre.setBounds(165, 310, 200, 20);      
        /*
        txtnombre.addKeyListener(new KeyListener(){
            @Override
            public void actionPerformed(KeyEvent e) {
                txtnombreKeyTyped(e);
            }
            
        });*/
        panelUsuarios.add(txtnombre);
        
        txtnickname = new JTextField();
        txtnickname.setBackground(Color.BLACK);
        txtnickname.setFont(new Font("Times New Roman bold", 0, 20)); 
        txtnickname.setForeground(Color.WHITE);
        txtnickname.setBounds(165, 370, 200, 20);
        panelUsuarios.add(txtnickname);
        
        txtpassword = new JPasswordField();
        txtpassword.setBackground(Color.BLACK);
        txtpassword.setFont(new Font("Times New Roman bold", 0, 20)); 
        txtpassword.setForeground(Color.WHITE);
        txtpassword.setBounds(165, 430, 200, 20);
        panelUsuarios.add(txtpassword);
        /*
        txtID = new JTextField();
        txtID.setBackground(Color.DARK_GRAY);
        txtID.setFont(new Font("Tahoma", 0, 20)); 
        txtID.setForeground(Color.WHITE);
        txtID.setBounds(100, 50, 50, 20);
        panelUsuarios.add(txtID);*/
        
    }
    
    private void txtnombreKeyTyped(KeyEvent e){
        char c = e.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z'))e.consume();

    }
    
    private void btnAceptarActionPerformed(ActionEvent e){
        String cadena2,cadena3,cadena4;       
        cadena2 = txtnombre.getText();
        cadena3 = txtnickname.getText();
        cadena4 = txtpassword.getText().toString();
        
        if (txtnombre.getText().equals("") || (txtnickname.getText().equals("")) || (txtpassword.getText().equals(""))) {           
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtnombre.requestFocus();
        }
        else {
        try {
           
            String url = "jdbc:mysql://localhost:3306/registrousuarios";
            String usuario = "root";
            String contraseña = "chatamaria";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("INSERT INTO usuario VALUES('" +0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"')");
                

                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException ex) {
           Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( SQLException ex ) { 
                         System.out.println( ex.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txtnombre.setText("");
        this.txtnickname.setText("");
        this.txtpassword.setText("");  


    
    }
   
    public JPanel panelUsuarios = new JPanel(){
        
        @Override
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
}
