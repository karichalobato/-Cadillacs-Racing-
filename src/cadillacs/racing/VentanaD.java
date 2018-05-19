/*
 * Creando ventana D (ventana de CREDITOS)
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
public class VentanaD extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    
    public VentanaD (){ //Constructor ventana D.
        //CREANDO ESPECIFICACIONES DE VENTANA D.
        this.setSize(500, 500);//Estableciendo tamaño de la venta D.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("CREDITOS"); //Estableciendo titulo de la Venta C.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana C automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA D.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelD);
        panelD.setLayout(null);//Estamos desactivando el diseño del panel.
        
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
    
    public JPanel panelD = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
    
}
