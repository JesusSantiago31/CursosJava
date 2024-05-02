/*
Hecho por:  Jesus Silvestre Santiago Cruz
            Luis Damian Ibañes Contreras
Fecha: 04/11/22
Practica:   Descuento de cafeteria Tesji 
*/
import javax.swing.JOptionPane;

public class CafeteriaTesji3 {
    
 
    public static void main ( String [] args ){
    
        System.out.println("Elegise el programa CarreraTesji3 ");
        byte colorP, alumno;
        float desc, total;
        
        colorP = Byte.parseByte(JOptionPane.showInputDialog("Que color de pelota sacaste:   1 = Pelota verde, 2 = Pelota Amarilla, 3 = Pelota Roja" ));
        total = Float.parseFloat(JOptionPane.showInputDialog("¿Cual es el total a pagar?"));
        if (colorP==1){
            JOptionPane.showMessageDialog (null,"Tienes un 10% dedescuento");
            desc = total * 0.10f;
            total = total - desc;
      
        }else if (colorP==2){
             JOptionPane.showMessageDialog (null,"Tienes un 5% dedescuento");
             desc = total * 0.05f;
            total = total - desc;
         
        }else{
             JOptionPane.showMessageDialog (null,"Tienes un 15% dedescuento");
             desc = total * 0.15f;
            total = total - desc;
            
        }
        
        alumno = Byte.parseByte(JOptionPane.showInputDialog("¿Eres alumno de sistemas? 1 = Sí, 2 = No"));
        
        
        if(alumno==1){
             JOptionPane.showMessageDialog (null,"Te regalamos un juguito :D");
        }else{
             JOptionPane.showMessageDialog (null,"No ganaste nada D:");
        }
        JOptionPane.showMessageDialog (null,"Pagarías $"+total);
        
    }
}
