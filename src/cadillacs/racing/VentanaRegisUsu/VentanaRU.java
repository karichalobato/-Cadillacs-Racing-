/*
 *Creacion ventana de registro de usuario.
 */
package cadillacs.racing.VentanaRegisUsu;

import javax.swing.JFrame;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class VentanaRU extends JFrame{
    
    
    
    public VentanaRU (){ //Constructor de VentanaRU
        
        this.setSize(500, 500);//Estableciendo tamaño de la VentanaRU.
        this.setLocationRelativeTo(null);//Centrando ventana en la pantalla.
        this.setTitle("REGISTRO DE USUARIO"); //Estableciendo titulo de la VentanaRU.
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando cierre la VentanaRU automaticamente se terminara el programa.
        
    }
}
