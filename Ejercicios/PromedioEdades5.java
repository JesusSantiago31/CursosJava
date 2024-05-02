/*
Hecho por:  Jesus Silvestre Santiago Cruz
Fecha: 18/11/22
Practica: Promedio de edades
 */
import javax.swing.JOptionPane;

public class PromedioEdades5 {
    public static void main (String [] args){
        
        System.out.println("Elegiste el programa PromediarEdades5");
        
        byte suma=0, edad;
        float promedio;
        
        for (byte x=1; x<=3 ; x++){
            edad = Byte.parseByte(JOptionPane.showInputDialog("Captura tu edad: "));
                    suma = (byte) (suma + edad);
        }
        promedio = suma/3;
        JOptionPane.showMessageDialog(null, "El promedio de edades es "+promedio);
    }
    
}

