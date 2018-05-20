/*
 * Creando ventana de juego.
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
public class VentanaA4 extends JFrame {
    public Image imagenFondo;
    public URL fondoA;
    
    public VentanaA4 (){ //Constructor ventana A4.
        //CREANDO ESPECIFICACIONES DE VENTANA A4.
        this.setSize(700, 500);//Estableciendo tamaño de la venta A4.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("Cadillacs Rancing"); //Estableciendo titulo de la Venta A4.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A4 automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA A4.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelA4);
        panelA4.setLayout(null);//Estamos desactivando el diseño del panel.
        
    }
    
    public JPanel panelA4 = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
}
