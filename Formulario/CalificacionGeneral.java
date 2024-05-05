
import javax.swing.JOptionPane;

public class CalificacionGeneral{
    public void generalll(){   
        try{
            int [] array=new int[5];
            array[5]=1;
        }catch(ArrayIndexOutOfBoundsException exception){
            JOptionPane.showMessageDialog(null,"No hay espacio sufiente para tu registro general");
        }
        
    }
}
