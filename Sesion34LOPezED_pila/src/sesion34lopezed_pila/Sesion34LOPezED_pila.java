/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34lopezed_pila;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Sesion34LOPezED_pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> pilaLopez =new Stack<>();
        
        pilaLopez.push(100);
        pilaLopez.push(150);
        pilaLopez.push(230);
        pilaLopez.push(10);
        pilaLopez.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n"+pilaLopez);
        
    }
    
}
