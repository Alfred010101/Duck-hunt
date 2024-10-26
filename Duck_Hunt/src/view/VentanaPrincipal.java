package view;

import controller.Contador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Queue;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import model.Pato;
import model.Perro;

/**
 *
 * @author Alfred
 */
public class VentanaPrincipal extends JFrame implements Runnable
{

    private JLayeredPane layeredPane;
//    private Image imagen;
    private final Queue<Pato> patos;
    private JLabel patosRestante;
//    private final int patos;
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
//        imagen = new ImageIcon("src/sources/fondo_fondo.png").getImage();
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
        layeredPane.add(lblFondo2, Integer.valueOf(3));
        
        patosRestante = initJLabel(patosRestante, "Patos restantes : " + Contador.getTotalPatos(), 30, 380);

        Contador.lblContPatos = initJLabel(Contador.lblContPatos, "Patos Cazdos : " + Contador.getTotalMoridos(), 30, 400);

        Contador.lblPuntaje = initJLabel(Contador.lblPuntaje, "Puntaje : " + Contador.getPuntaje(), 300, 400);

    }

    @Override
    public void run()
    {
        Perro perro = new Perro(layeredPane);
        layeredPane.add(perro, Integer.valueOf(5));

        perro.intro();

        Random rand = new Random();

        Thread[] hilosEjucutar = new Thread[2];
        Pato[] patosEjucutar = new Pato[2];
        int cont = 0;

        while (!patos.isEmpty())
        {
            int noPatosEjecutar;
            if (patos.size() > 1)
            {
                noPatosEjecutar = ((rand.nextInt(99) + 1) % 2) + 1;
            } else
            {
                noPatosEjecutar = 1;
            }

            for (int i = 0; i < noPatosEjecutar; i++, cont++)
            {
                patosEjucutar[i] = patos.poll();
                hilosEjucutar[i] = new Thread(patosEjucutar[i]);
                layeredPane.add(patosEjucutar[i], Integer.valueOf(1));
                hilosEjucutar[i].start();
            }
            
            patosRestante.setText("Patos restantes : " + patos.size());
            
            for (int i = 0; i < noPatosEjecutar; i++)
            {
                try
                {
                    hilosEjucutar[i].join();
                } catch (InterruptedException e)
                {
                    System.out.println(e);
                }
            }
            
            if (Contador.getMoridos() > 0)
            {
                perro.atrapar(Contador.getMoridos());
                Contador.resetMoridos();
            } else
            {
                perro.troll();
            }
        }

        JOptionPane.showMessageDialog(this, "Tu puntaje final es: "
                + Contador.getPuntaje() + "\nPatos: " + Contador.getTotalMoridos() + "/" + Contador.getTotalPatos());
    }
    
    private JLabel initJLabel(JLabel lbl, String txt, int x, int y)
    {
        lbl = new JLabel(txt);
        lbl.setFont(new Font("Arial", Font.BOLD, 20));
        lbl.setPreferredSize(new Dimension(300, 30));
        lbl.setBounds(x, y,lbl.getPreferredSize().width, lbl.getPreferredSize().height);
        lbl.setForeground(Color.BLACK); 
        layeredPane.add(lbl, Integer.valueOf(4));
        return lbl;
    }
}
