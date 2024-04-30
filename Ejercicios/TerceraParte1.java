/*
Creado por: Jesus Silvestre Santiago Cruz
Fecha: 04/11/22
Practica: Hallar la mitad de la mitad de la tercera parte del doble de x

*/


import javax.swing.JOptionPane;

public class TerceraParte1 {
    
    public static void main (String []args){
        
        byte numero; 
        float doble, tercera, mitad;
        
        System.out.println("Escogiste el programa TerceraParte1");
        
        System.out.println("Hallar la mitad de la mitad de la tercera parte del doble de x"); 
        
        numero=Byte.parseByte(JOptionPane.showInputDialog("Inserte un número"));
        
        doble =(short) (numero * 2);
        tercera = (float) (doble / 3);
        mitad = (float) (tercera / 2);
        
        System.out.println("La mitad de la tercera parte del doble de "+numero+" es "+mitad);
         
    }
    
}
