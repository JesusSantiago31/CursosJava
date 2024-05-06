import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class VentanaSecundaria extends JFrame implements Metabst{
 private JPanel titulo, opcion, botoncito;
 private JLabel titu, semestress, periodoss, materiass;
 private JButton siguiente, borrar;
 private String [] semestre = {"Primero", "Segundo", "Tercero", "Cuarto","Quinto","Sexto","Septimo","Octavo","Noveno"};
 private String [] periodo= {"2022 - 2", "2023 - 1","2023 - 2","2024 - 1","2024 - 2","2025 - 1","2025 - 2","2026 - 1","2026 - 2"};
 private String [] materia = {"Calculo integral", "Probabilidad y estadistica", "Fisica", "Algebralineal", "ingles", "POO", "Taller de administracion" };
 public VentanaSecundaria(){
    Eventos manejador=new Eventos();
    Container panel = getContentPane();
    panel.setLayout(new BorderLayout());
    titulo= new JPanel();
    titulo.setSize(1000,30);
    Container boton = getContentPane();
    boton.setLayout(new BorderLayout());
    botoncito = new JPanel();
    botoncito.setSize(1000, 30);
    Container partes = getContentPane();
    partes.setLayout(new BorderLayout());
    opcion=new JPanel(new GridLayout(3,2));
    titu= new JLabel();
    semestress=new JLabel("Semestre");
    periodoss=new JLabel("Periodo");
    materiass=new JLabel("Materia");
    siguiente=new JButton("ACEPTAR"); 
    siguiente.addActionListener(manejador);
    borrar = new JButton("CANCELAR");
    borrar.addActionListener(manejador);
    JComboBox opcion1 = new JComboBox(semestre);
    JComboBox opcion2 = new JComboBox (periodo);
    JComboBox opcion3 = new JComboBox (materia);
    titulo.add(titu);
    opcion.add(semestress);
    opcion.add(opcion1);
    opcion.add(periodoss);
    opcion.add(opcion2);
    opcion.add(materiass);
    opcion.add(opcion3);
    botoncito.add(siguiente);
    botoncito.add(borrar);
    
    semestress.setOpaque(true);
    semestress.setBackground(Color.DARK_GRAY);
    semestress.setFont(new Font("Impact", Font.PLAIN, 25));
    semestress.setForeground(Color.PINK);
    periodoss.setOpaque(true);
    periodoss.setBackground(Color.DARK_GRAY);
    periodoss.setFont(new Font("Impact", Font.PLAIN, 25));
    periodoss.setForeground(Color.PINK);
    materiass.setOpaque(true);
    materiass.setBackground(Color.DARK_GRAY);
    materiass.setFont(new Font("Impact", Font.PLAIN, 25));
    materiass.setForeground(Color.PINK);
    
    titulo.setBackground(Color.PINK);
    titu.setForeground(Color.DARK_GRAY);
    
    
    siguiente.setFont(new Font("Impact", Font.PLAIN, 20));
    siguiente.setBackground(Color.PINK);
    borrar.setFont(new Font("Impact", Font.PLAIN, 20));
    borrar.setBackground(Color.PINK);
    
    titu.setText("Ingenieria en sistemas computacionales");
    partes.add(opcion, BorderLayout.CENTER);
    panel.add(titulo, BorderLayout.NORTH);
    boton.add(botoncito, BorderLayout.SOUTH);   
    
    setSize(700,300);
    setVisible(true);
    setLocationRelativeTo(null);
    setTitle("SELECCION SEMESTRE");
 }
public void Semestres() {
    VentanaSecundaria ventana1 = new VentanaSecundaria();
    ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
 }
 
 class Eventos extends ClasImp implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ev) {
    if (ev.getSource()==siguiente){
        aceptar();
    }
    if(ev.getSource()==borrar){//al dar click en Salir va a llamar al metodo desactivar
        cancelar();
        }
    }
 }
 public void aceptar(){    
    VentanaTres sigues = new VentanaTres ();
    sigues.Calificacion();
    //setVisible(false);
    //BufferedReader br = null;
    //try {
        //br = new BufferedReader(new FileReader("myfile.txt"));
        //String data = null;
        //while ((data = br.readLine()) != null) {
                //System.out.println(data);
            //}
        //} catch (IOException ioe) {
            //ioe.printStackTrace();
            //JOptionPane.showMessageDialog(null,"El archivo no puede ser encontrado");

        //}
    
 }
 public void cancelar(){
        VentanaPrincipal ventana1 = new VentanaPrincipal();
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}