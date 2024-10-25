package view;

import java.awt.Dimension;
import java.awt.Image;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import model.Pato;
import model.Perro;

/**
 *
 * @author Alfred
 */
public class VentanaPrincipal extends JFrame implements Runnable
{

    private JLayeredPane layeredPane;
    private Image imagen;
    private Queue<Pato> patos;

    public VentanaPrincipal(Queue<Pato> patos)
    {
        this.patos = patos;
        setLocation(200, 400);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setSize(525, 480);
        initComponents();
    }

    private void initComponents()
    {
        imagen = new ImageIcon("src/sources/fondo_fondo.png").getImage();
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(525, 480));
        setContentPane(layeredPane);
        layeredPane.setLayout(null);

        ImageIcon n1 = new ImageIcon("src/sources/fondo_fondo.png");
        ImageIcon n2 = new ImageIcon("src/sources/world.png");

        JLabel lblFondo1 = new JLabel(n1);
        lblFondo1.setBounds(0, 0, n1.getIconWidth(), n1.getIconHeight());

        JLabel lblFondo2 = new JLabel(n2);
        lblFondo2.setBounds(0, 0, n2.getIconWidth(), n2.getIconHeight());
        layeredPane.add(lblFondo1, Integer.valueOf(0));
        layeredPane.add(lblFondo2,Integer.valueOf(3));
    }

    @Override
    public void run()
    {
        Perro perro = new Perro(layeredPane);
        layeredPane.add(perro, Integer.valueOf(5));
        
        Pato pato1 = new Pato("negro", 490);
        Pato pato2 = new Pato("rojo", 335);
        Pato pato3 = new Pato("azul", 1200);
        layeredPane.add(pato1,Integer.valueOf(1));
        layeredPane.add(pato2,Integer.valueOf(1));
        layeredPane.add(pato3,Integer.valueOf(1));

        perro.intro();
        
        Thread hiloPato1 = new Thread(pato1);
        Thread hiloPato2 = new Thread(pato2);
        Thread hiloPato3 = new Thread(pato3);
        hiloPato1.start();
        hiloPato2.start();
        hiloPato3.start();
    }
}
