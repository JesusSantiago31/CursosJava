import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class VentanaTres extends JFrame implements Metabst{
    private JTextField calificacion;
    private JPanel opcion, botoncito;
    private JLabel semestress,calificacioness;
    private JButton guardar,cancelar,general;
    private String [] semestre = {"1", "2", "3", "4","5"};
    public VentanaTres(){
        Eventos manejador = new Eventos();
        Container panel = getContentPane();
        panel.setLayout(new BorderLayout());

        calificacion=new JTextField(20);
        calificacioness=new JLabel("Calificacion");
        Container boton = getContentPane();
        boton.setLayout(new BorderLayout());
        botoncito = new JPanel();
        botoncito.setSize(1000, 30);
        Container partes = getContentPane();
        partes.setLayout(new BorderLayout());
        opcion=new JPanel(new GridLayout(2,2));
        semestress=new JLabel("Unidad");
        guardar=new JButton("Guardar");
        guardar.addActionListener(manejador);
        cancelar=new JButton("Cancelar");
        cancelar.addActionListener(manejador);
        general=new JButton("Registro General");
        general.addActionListener(manejador);
        JComboBox opcion1 = new JComboBox(semestre);

        opcion.add(semestress);
        opcion.add(opcion1);
        opcion.add(calificacioness);
        opcion.add(calificacion);
        botoncito.add(guardar);
        botoncito.add(cancelar);
        botoncito.add(general);

        partes.add(opcion, BorderLayout.CENTER);
        boton.add(botoncito, BorderLayout.SOUTH);
        semestress.setOpaque(true);
        semestress.setBackground(Color.GRAY);
        semestress.setFont(new Font("Impact", Font.PLAIN, 25));
        semestress.setForeground(Color.PINK);
        calificacioness.setOpaque(true);
        calificacioness.setBackground(Color.GRAY);
        calificacioness.setFont(new Font("Impact", Font.PLAIN, 25));
        calificacioness.setForeground(Color.PINK);
        calificacion.setBackground(Color.PINK);
        calificacion.setFont(new Font("Impact", Font.PLAIN, 25));
        calificacion.setForeground(Color.DARK_GRAY);
        guardar.setFont(new Font("Impact", Font.PLAIN, 20));
        guardar.setBackground(Color.PINK);
        cancelar.setFont(new Font("Impact", Font.PLAIN, 20));
        cancelar.setBackground(Color.PINK);
        general.setFont(new Font("Impact", Font.PLAIN, 20));
        general.setBackground(Color.PINK);

        
        setSize(500,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("REGRISTRO DE CALIFICACION");
 }
 void Calificacion() {
    VentanaTres ventana1 = new VentanaTres();
    ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 class Eventos extends ClasImp implements ActionListener {
        @Override//al implementar un metodo asbtracto aparecera esta linea
        public  void actionPerformed(ActionEvent ev){
            if(ev.getSource()==guardar){//al dar click en Limpiar va a llamar al metodo desactivar
                aceptar();
            }
            if(ev.getSource()==cancelar){//al dar click en Salir va a llamar al metodo desactivar
                cancelar();
            }
            if(ev.getSource()==general){//al dar click en Limpiar va a llamar al metodo desactivar
                general();
            }
        }

    }

    public void cancelar(){
        VentanaSecundaria ventana1 = new VentanaSecundaria();
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void aceptar(){
       try{
           String cal; 
           cal=calificacion.getText();
           String calcal;
           calcal=cal;
           //byte cant=0;
           int a;
           Byte calcali2 = Byte.parseByte(calcal);
           
           File archivo = new File ("Calificaciones.txt");
           FileWriter escribir = new FileWriter (archivo,true);
           
           escribir.write("Unidad \n"+cal);
           escribir.close();
           //a=(calcali2/cant); 
           //}catch (ArithmeticException ae){
           //JOptionPane.showMessageDialog(null,"Su calificacion no puede ser dividida en cero");
       }catch (NumberFormatException nfe){
           JOptionPane.showMessageDialog(null,"Porfavor ingrese una calififcacion");
       } catch (IOException ioe){
           JOptionPane.showMessageDialog(null,"El archivo no puede ser encontrado");

       }
    }
    
    public void general(){
        CalificacionGeneral gene = new CalificacionGeneral ();
        gene.generalll();
    }
}
