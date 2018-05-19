/*
 * Creando ventana A2 (ventana de TIENDA)
 */
package cadillacs.racing;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Event;
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
public class VentanaA2 extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    
    public VentanaA2 (){ //Constructor ventana A.
        //CREANDO ESPECIFICACIONES DE VENTANA A.
        this.setSize(500, 500);//Estableciendo tamaño de la venta A.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("TIENDA"); //Estableciendo titulo de la Venta A.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA A.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelA2);
        panelA2.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DEL JUEGO.
        //eti_CadillacsRacing= new JLabel("Cadillacs Racing");
        //eti_CadillacsRacing.setBounds(125, 10, 300, 34);
        //eti_CadillacsRacing.setForeground(Color.WHITE);
        //eti_CadillacsRacing.setFont( new Font( "Bookman old style", Font.BOLD, 26 ) );
        //panelA.add(eti_CadillacsRacing);
        
        //CREANDO BOTONES DE VENTANA A.
        //Boton_MiJuego = new JButton ("MI JUEGO");
        //Boton_MiJuego.setBounds(170, 125, 150, 50);//Colocando el boton en las cordenadas que yo deseo y el tamaño que lo deseo.
        //panelA.add(Boton_MiJuego);
        
        //Boton_Instrucciones = new JButton ("INSTRUCCIONES");
        //Boton_Instrucciones.setBounds(170, 195, 150, 50);
        //panelA.add(Boton_Instrucciones);
        
        //Boton_Ranking = new JButton ("RANKING");
        //Boton_Ranking.setBounds(170, 265, 150, 50);
        //panelA.add(Boton_Ranking);
        
        //Boton_Creditos = new JButton ("CREDITOS");
        //Boton_Creditos.setBounds(170, 335, 150, 50);
        //panelA.add(Boton_Creditos);
        
        
    }
    
    public JPanel panelA2 = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
}
