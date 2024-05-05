import java.awt.BorderLayout;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public  class VentanaPrincipal extends JFrame implements Metabst{
    private JTextField userc,paswordc,u,p;
    private JLabel user,pasword; 
    private JButton aceptar,borrar;
    private JPanel central;
    private int repetir=3;
    public VentanaPrincipal (){
        Eventos manejador = new Eventos();
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        
        central = new JPanel(new GridLayout(3,2));
        userc = new JTextField(10);
        user = new JLabel("USER", SwingConstants.CENTER);
        paswordc = new JTextField(10);
        pasword = new JLabel("PASSWORD", SwingConstants.CENTER);
        borrar = new JButton("BORRAR");
        borrar.addActionListener(manejador);
        aceptar = new JButton ("ACEPTAR");
        aceptar.addActionListener(manejador);
        central.add(user);
        central.add(userc);
        central.add(pasword);
        central.add(paswordc);
        central.add(aceptar);
        central.add(borrar);
        
        central.setBackground(Color.BLACK);
        userc.setBackground(Color.PINK);
        userc.setFont(new Font("Impact", Font.PLAIN, 25));
        userc.setForeground(Color.DARK_GRAY);
        paswordc.setBackground(Color.PINK);
        paswordc.setFont(new Font("Impact", Font.PLAIN, 25));
        paswordc.setForeground(Color.DARK_GRAY);
        aceptar.setBackground(Color.BLACK);
        aceptar.setFont(new Font("Impact", Font.PLAIN, 20));
        aceptar.setForeground(Color.GREEN);
        borrar.setBackground(Color.BLACK);
        borrar.setFont(new Font("Impact", Font.PLAIN, 20));
        borrar.setForeground(Color.RED);
        user.setFont(new Font("Impact", Font.PLAIN, 50));
        user.setForeground(Color.PINK);
        pasword.setFont(new Font("Impact", Font.PLAIN, 50));
        pasword.setForeground(Color.PINK);
        
        
        contenedor.add(central,BorderLayout.CENTER);
        setSize(700,300);
        setVisible(true);
        setTitle("AUTENTIFICACION");
        
        
    }
    public static void main(String[] args) { 
        VentanaPrincipal objnoinc = new VentanaPrincipal();
        objnoinc.Bienvenido();
    }
   
    JFrame mensaje;
    public void Bienvenido() {
        try{
            mensaje.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
            mensaje.setVisible (true);  
            JOptionPane.showMessageDialog(null,"Bienvenido");
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null,"No se puede dar la bienvenida");
        }
    }

    class Eventos extends ClasImp implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev){
            if(ev.getSource()==aceptar){
                aceptar();
            }
            if(ev.getSource()==borrar){
                cancelar();
            }
        }
    }
    
    public  void aceptar(){
        String pasword, user,p,u;
        u=userc.getText();
        user="Shania";
        p=paswordc.getText();
        pasword="Kisha08";
        
        if(u.equals(user)){
            if(p.equals(pasword)){
                System.out.print("Acceso consedido");
                VentanaSecundaria a = new VentanaSecundaria(); 
                a.Semestres();
                setVisible(false);
            }else {
                System.out.print("\nIncorrecto \n Intente nuevamente");
                userc.setText(null);
                paswordc.setText(null);
                repetir --;
            }
        }else {
            System.out.print("\nIncorrecto \n Intente nuevamente");
            userc.setText(null);
            paswordc.setText(null);
            repetir --;
            if(repetir==0){
                System.out.print("\nIncorrecto \n Acceso denegado \n");
                System.exit(0);
            }
        }            
    }
    
    public void cancelar(){
        userc.setText(null);
        paswordc.setText(null);
    }
      
}
