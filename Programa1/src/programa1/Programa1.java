/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do{
            JOptionPane.showMessageDialog(null,"Hola Mundo");
            opcion=JOptionPane.showConfirmDialog(null,"Desea salir de aquí","Mensaje",JOptionPane.YES_NO_OPTION);            
        }while(opcion==JOptionPane.NO_OPTION);
        
    }
    
}
