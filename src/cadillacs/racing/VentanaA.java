/*
 * Creando ventana de inicia y la trataremos como ventana A.
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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */



public class VentanaA extends JFrame {
    public Image imagenFondo;
    public URL fondoA;
    JLabel eti_CadillacsRacing;
    JButton Boton_MiJuego;
    
    
    public VentanaA (){ //Constructor ventana A.
        
        this.setSize(500, 500);//Estableciendo tamaño de la venta A.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("INICIO"); //Estableciendo titulo de la Venta A.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A automaticamente se terminara el programa.
        
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panel);
        
        eti_CadillacsRacing= new JLabel("Cadillacs Racing");
        eti_CadillacsRacing.setLocation(12, 30);
        eti_CadillacsRacing.setForeground(Color.WHITE);
        eti_CadillacsRacing.setFont( new Font( "Bookman old style", Font.BOLD, 18 ) );
        panel.add(eti_CadillacsRacing);
        Boton_MiJuego = new JButton ("Mi Juego");
        panel.add(Boton_MiJuego);
        
    }
    
    public JPanel panel = new JPanel(){
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
}
