/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadillacs.racing;

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
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import usuarios.Usuarios;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Logo extends JFrame{
    public Image imagenFondo;
    public URL fondoA;
    JButton Boton_Inicio;

    public Logo() {
        this.setSize(600, 500);//Estableciendo tamaño de la venta A3.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("LOGO"); //Estableciendo titulo de la Venta A3.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la ventana A2 automaticamente se terminara el programa.
        
        //COLOCANDO IMAGEN DE FONDO EN VENTA A3.
        fondoA = this.getClass().getResource("Fondo juego 2.png");
        imagenFondo = new ImageIcon(fondoA).getImage();
        Container contenedor = getContentPane();
        contenedor.add(panelLogo);
        panelLogo.setLayout(null);//Estamos desactivando el diseño del panel.
        
        //JBUTTON
        Boton_Inicio = new JButton ("Siguiente");
        Boton_Inicio.setBounds(225, 400, 150, 50);//Colocando el boton en las cordenadas que yo deseo y el tamaño que lo deseo.
        Boton_Inicio.setBackground(Color.GREEN);
        Boton_Inicio.setForeground(Color.BLACK);
        Boton_Inicio.setFont(new Font("Cooper black",0,16));  
        Boton_Inicio.setBorder(createRaisedBevelBorder());
        panelLogo.add(Boton_Inicio);
        
        //CREANDO EVENTOS DE BOTONES...........
        Boton_Inicio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuarios nextUsu = new Usuarios();
                nextUsu.setVisible(true);
                Logo.this.dispose();
            }
            
        });
    }
    
    public JPanel panelLogo = new JPanel(){
        
        public void paintComponent(Graphics g){
            g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        }
    };
    
}
