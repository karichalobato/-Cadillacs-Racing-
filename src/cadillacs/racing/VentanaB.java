/*
 * Creando ventana de Instrucciones
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
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VentanaB extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    JLabel eti_Instrucciones;
    JButton Boton_Atras, Boton_Siguiente, Boton_Inicio;
    
    public VentanaB (){ //Constructor ventana B.
        //CREANDO ESPECIFICACIONES DE VENTANA B.
        this.setSize(700, 500);//Estableciendo tamaño de la venta B.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("INSTRUCCIONES"); //Estableciendo titulo de la Venta B.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana B automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA B.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelB);
        panelB.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DE PANTALLA.
        eti_Instrucciones= new JLabel("Instrucciones");
        eti_Instrucciones.setBounds(265, 10, 300, 34);
        eti_Instrucciones.setForeground(Color.WHITE);
        eti_Instrucciones.setFont( new Font( "Bookman old style", Font.BOLD, 26 ) );
        panelB.add(eti_Instrucciones);
        
        //CREANDO BOTONES DE VENTANA B.
        Boton_Atras = new JButton ("Atrás");
        Boton_Atras.setBounds(100, 350, 150, 50);//Colocando el boton en las cordenadas que yo deseo y el tamaño que lo deseo.
        panelB.add(Boton_Atras);
        
        Boton_Siguiente = new JButton ("Siguiente");
        Boton_Siguiente.setBounds(400, 350, 150, 50);
        panelB.add(Boton_Siguiente);
        
        Boton_Inicio = new JButton ("INICIO");
        Boton_Inicio.setBounds(575, 425, 100, 25);
        panelB.add(Boton_Inicio);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_Inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                VentanaB.this.dispose();
            }
            
        });
        
        
    }
    
    public JPanel panelB = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
}
