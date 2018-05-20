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
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VentanaC extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    JLabel eti_Ranking;
    JButton Boton_Inicio;
    
    public VentanaC (){ //Constructor ventana C.
        //CREANDO ESPECIFICACIONES DE VENTANA C.
        this.setSize(700, 500);//Estableciendo tamaño de la venta C.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("RANKING"); //Estableciendo titulo de la Venta C.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana C automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA C.
        fondoA = this.getClass().getResource("ImagenA.jpg");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelC);
        panelC.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DE PANTALLA.
        eti_Ranking = new JLabel("Ranking");
        eti_Ranking.setBounds(280, 10, 300, 34);
        eti_Ranking.setForeground(Color.WHITE);
        eti_Ranking.setFont( new Font( "Bookman old style", Font.BOLD, 26 ) );
        panelC.add(eti_Ranking);
        
        //CREANDO BOTONES DE VENTANA C.
        Boton_Inicio = new JButton ("INICIO");
        Boton_Inicio.setBounds(575, 425, 100, 25);
        panelC.add(Boton_Inicio);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_Inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA nextVA = new VentanaA();
                nextVA.setVisible(true);
                VentanaC.this.dispose();
            }
            
        });
        
        
    }
    
    public JPanel panelC = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
    
}
