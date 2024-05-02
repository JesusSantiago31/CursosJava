
/*
    Creado por: Jesus Silvstre Santiago Cruz
    Fecha: 10/11/22
    Practica: Seleccion de talla de vestidos SWITCH
 */
import javax.swing.JOptionPane;


public class VestidosSwitch4 {
    public static void main (String [] args){
        
        System.out.println(" Elegiste el programa VestidosSwitch4 ");
        
        String vestido;
        byte cantidad;
        short precio = 0;
        vestido = JOptionPane.showInputDialog ("Que talla de vestido desseas comprar: \n (Escribe la opcion en minúsculas ) \n chico \n mediano \n grande");
        
        switch (vestido){
            case "chico":
                System.out.println("El precio de los vestidos chicos son de $300");
                cantidad = Byte.parseByte (JOptionPane.showInputDialog("Inserte la cantidad de vestidos talla chica que desees adquirir:"));
                precio = (short)(cantidad * 300);
                break;
            case "mediano":
                System.out.println("El precio de los vestidos medianos son de $400");
                cantidad = Byte.parseByte (JOptionPane.showInputDialog("Inserte la cantidad de vestidos talla mediana desees adquirir:"));
                precio = (short) (cantidad * 400);
            break;
            case "grande":
                System.out.println("El precio de los vestidos grandes son de $500");
                cantidad = Byte.parseByte(JOptionPane.showInputDialog("Inserte la cantidad de vestidos talla grande desees adquirir:"));
                precio = (short)( cantidad * 500);
            break;
            default:
                System.out.println("No hay :(");
                 
        }
        System.out.println("El total a pagar por tu compra es de: $"+precio+" ");
    }
    
}
