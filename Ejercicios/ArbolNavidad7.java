/*
 Hecho por:  Jesus Silvestre Santiago Cruz
Fecha: 18/11/22
Practica: Arbol Navideño
 */
public class ArbolNavidad7 {
    public static void main (String [] args){
        System.out.println("Elegiste el programa ArbolNavidad7 ");
        System.out.println("Arbol Navideño");
        byte k=8, m=11;
        
        for (byte i=1; i<8 ; i++){
            for(byte j=1; j<k ;j++){
                System.out.print(" ");
            }
            
            for(byte n=11 ; n>m+1 ; n--){
                System.out.print("*");
                
            }
            for(byte n=11 ; n>m ; n--){
                System.out.print("*");
                
            }
            System.out.println("");
            k--;
            m--;
        }
                 for (byte x=1 ; x<=2 ; x++){
            
            System.out.println("     |||");
         }
    }
}
