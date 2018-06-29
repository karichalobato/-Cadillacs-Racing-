/*
 * Creando Ventana C (ventana de Ranking)
 */
package cadillacs.racing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VentanaC extends JFrame{
    
    public JLabel lblRanking;
    public JButton btnInicio;
    public JTable tabla_usuarios;
    public JPanel table;
    
   Connection con = null;
   Statement stmt = null;
   String titulos[] = {"idusuario","nombre","nickname","pass"};
   String fila[] = new String [4];

    
    DefaultTableModel modelo;

    public VentanaC() {
        super("Ranking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(270,125);
        setResizable(false);
        setLayout(null);
        agregarLabels();
        formulario();
        Container container = getContentPane();
        //AGREGANDO TODOS LOS COMPONENTES A LA PANTALLA
        //JLABELS
        container.add(lblRanking);
        //JBUTTONS
        container.add(btnInicio);
        setSize(900, 600);
        Eventos();
        try {
            
            String url = "jdbc:mysql://localhost:3306/registrousuarios";
            String usuario = "root";
            String contraseña = "chatamaria";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null)
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT*FROM usuario");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("idusario");
                   fila[1] = rs.getString("nombre");
                   fila[2] = rs.getString("nickname");
                   fila[3] = rs.getString("pass");
                   
                   modelo.addRow(fila);     
               }
                tabla_usuarios.setModel(modelo);
                TableColumn ci = tabla_usuarios.getColumn("idusuario");
                ci.setMaxWidth(25);
                TableColumn cn = tabla_usuarios.getColumn("nombre");
                cn.setMaxWidth(165);               
                TableColumn cnick = tabla_usuarios.getColumn("nickname");
                cnick.setMaxWidth(72);
                TableColumn cp = tabla_usuarios.getColumn("pass");
                cp.setMaxWidth(72);
                
               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }

       

    }
    
    public final void agregarLabels(){
        lblRanking = new JLabel("Ranking");
        lblRanking.setForeground(Color.BLACK);
        lblRanking.setFont(new Font("Tahoma", 0, 20)); 
        lblRanking.setBounds(375, 20, 100, 20);
    }
    
    public final void formulario(){
        //JBUTTONS
        btnInicio = new JButton("Inicio");
        btnInicio.setBounds(25, 500, 90, 30);
        
        //JTABLE
        table = new JPanel();
        tabla_usuarios = new JTable();
        table.setBounds(100, 250, 600, 200);
        table.add(new JScrollPane(tabla_usuarios));
    }
    
    public void Eventos(){
        //EVENTO DEL BOTON INICIO QUE ME CONDUCIRA AL MENU DEL VIDEO JUEGO
        btnInicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                VentanaC.this.dispose();
            }
            
        });
    }
    
     
}
