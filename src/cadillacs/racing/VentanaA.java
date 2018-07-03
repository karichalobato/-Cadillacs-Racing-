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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import static javax.swing.BorderFactory.createRaisedBevelBorder;
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
    JButton Boton_MiJuego, Boton_Instrucciones, Boton_Ranking, Boton_Creditos;
    
    
    public VentanaA (){ //Constructor ventana A.
        //CREANDO ESPECIFICACIONES DE VENTANA A.
        this.setSize(500, 500);//Estableciendo tamaño de la venta A.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("INICIO"); //Estableciendo titulo de la Venta A.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA A.
        fondoA = this.getClass().getResource("Fondo.png");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelA);
        panelA.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //CREANDO ETIQUETA DE NOMBRE DEL JUEGO.
        eti_CadillacsRacing= new JLabel("Cadillacs Racing");
        eti_CadillacsRacing.setBounds(80, 40, 375, 40);
        eti_CadillacsRacing.setForeground(Color.WHITE);
        eti_CadillacsRacing.setFont( new Font( "Cooper Black", Font.BOLD, 40 ) );
        panelA.add(eti_CadillacsRacing);
        
        //CREANDO BOTONES DE VENTANA A.
        Boton_MiJuego = new JButton ("Mi juego");
        Boton_MiJuego.setBounds(170, 125, 150, 50);
        Boton_MiJuego.setBackground(Color.BLUE);
        Boton_MiJuego.setForeground(Color.BLACK);
        Boton_MiJuego.setFont(new Font("Cooper black",0,16));  
        Boton_MiJuego.setBorder(createRaisedBevelBorder());
        panelA.add(Boton_MiJuego);
        
        Boton_Instrucciones = new JButton ("Instrucciones");
        Boton_Instrucciones.setBounds(170, 195, 150, 50);
        Boton_Instrucciones.setBackground(Color.BLUE);
        Boton_Instrucciones.setForeground(Color.BLACK);
        Boton_Instrucciones.setFont(new Font("Cooper black",0,16));  
        Boton_Instrucciones.setBorder(createRaisedBevelBorder());
        panelA.add(Boton_Instrucciones);
        
        Boton_Ranking = new JButton ("Ranking");
        Boton_Ranking.setBounds(170, 265, 150, 50);
        Boton_Ranking.setBackground(Color.BLUE);
        Boton_Ranking.setForeground(Color.BLACK);
        Boton_Ranking.setFont(new Font("Cooper black",0,16)); 
        Boton_Ranking.setBorder(createRaisedBevelBorder());
        panelA.add(Boton_Ranking);
        
        Boton_Creditos = new JButton ("Creditos");
        Boton_Creditos.setBounds(170, 335, 150, 50);
        Boton_Creditos.setBackground(Color.BLUE);
        Boton_Creditos.setForeground(Color.BLACK);
        Boton_Creditos.setFont(new Font("Cooper black",0,16));
        Boton_Creditos.setBorder(createRaisedBevelBorder());
        panelA.add(Boton_Creditos);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_MiJuego.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaA1 nextVA1 = new VentanaA1();//Donde queres que tu boton se dirija.
                nextVA1.setVisible(true);//La haces visible
                VentanaA.this.dispose();//Destruis la ventana en la que estas.
            }
            
        });
        
        Boton_Instrucciones.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaB nextVB = new VentanaB();
                nextVB.setVisible(true);
                VentanaA.this.dispose();
            }
            
        });
        
        Boton_Ranking.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaC nextVC = new VentanaC();
                nextVC.setVisible(true);
                VentanaA.this.dispose();
            }
            
        });
        
        Boton_Creditos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaD nextVD = new VentanaD();
                nextVD.setVisible(true);
                VentanaA.this.dispose();
            }
            
        });
            
    
    
    }
    
    public JPanel panelA = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
}
