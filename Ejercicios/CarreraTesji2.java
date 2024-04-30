/*
Hecho por:  Jesus Silvestre Santiago Cruz
Fecha: 04/11/22
Practica: Carrera Tesji 
 */
import javax.swing.JOptionPane;

public class CarreraTesji2 {
          
    public static void main(String[]args){
        
        System.out.println("Escogiste el programa CarreraTesji2 ");
        byte cred,d,taller,c,resp;
        
        cred=0;
        
        d=Byte.parseByte(JOptionPane.showInputDialog("Desfilaste, si presiona 1"));
        if (d==1){
            cred = (byte)(cred+1);
            System.out.println("Ganaste un crédito");
            taller=Byte.parseByte (JOptionPane.showInputDialog(" En que taller estas inscrito 1.-Danza,2.-Basquetboll,3.-Futbol,4.-TKD, 5.-Volley"));
            if (taller==1){
                JOptionPane.showMessageDialog(null,"Llevaras uniforme escolar");
                System.out.println("Uniforme escolar");
            }else{
                if (taller==2) {
                    JOptionPane.showMessageDialog(null,"Tu vestuario será de color Blanco");
                }else{
                    if (taller==3) {
                        JOptionPane.showMessageDialog(null,"Tu vestuario será de color Verde");
                    }else{
                        if (taller==4){
                            JOptionPane.showMessageDialog(null, "Tu vestuario será tu Uniforme");
                        }else{ 
                            JOptionPane.showMessageDialog(null, "Tu vestuario será de color Rojo");
                        }
                    }
                }
            }
        }else{ 
            JOptionPane.showMessageDialog(null, "No ganaste ningun crédito");    
        }
        c=Byte.parseByte(JOptionPane.showInputDialog("Fuiste a la carrera, si presiona 1"));
            if (c==1) {
                cred = (byte)(cred+11
                        );
                resp=Byte.parseByte(JOptionPane.showInputDialog("Obtuviste uno de los tre primero lugares, si presiona 1"));
                if (resp==1){
                    cred = (byte)(cred+1);
                }
            }
         JOptionPane.showMessageDialog(null, "Acumulaste "+cred+" créditos");
    }
           
}
