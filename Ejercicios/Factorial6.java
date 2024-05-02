/*
 Hecho por:  Jesus Silvestre Santiago Cruz
Fecha: 18/11/22
Practica: Factorial de un numero 
 */
import javax.swing.JOptionPane;

public class Factorial6 {
    public static void main (String [] args){
        
        System.out.println(" Elegiste el programa Factorial6");
        byte X; 
        short res, Z=1 ; 
        
        X = Byte.parseByte (JOptionPane.showInputDialog("Inerta un número del que quieras sacar un factorial: "));
        
        for(short y=1 ; y<=X ; y++){
            res = (short) (Z * y);
            System.out.println(Z+"*"+y+"="+res);
            Z = res;
      
        }
        
        System.out.println("El factorial de "+X+" es "+Z);
    }
    
}
