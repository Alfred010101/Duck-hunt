package view;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Pato;
import model.Perro;

/**
 *
 * @author Alfred
 */
public class VentanaPrincipal extends JFrame implements Runnable
{

    private JPanel fondo;
    private Image imagen;
    private Queue<Pato> patos;
    
    public VentanaPrincipal(Queue<Pato> patos)
    {
        this.patos = patos;
        setLocation(0, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        initComponents();
        setSize(imagen.getWidth(null), imagen.getHeight(null));
    }

    private void initComponents()
    {
        initFondo();
        add(fondo);
    }

    private void initFondo()
    {
        imagen = new ImageIcon("src/sources/world.png").getImage();
        fondo = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        };

        fondo.setLayout(null);
    }

    @Override
    public void run()
    {
        Perro perro = new Perro();
        Pato pato1 = new Pato("negro", 490);
        Pato pato2 = new Pato("rojo", 335);
        Pato pato3 = new Pato("azul", 1200);
        fondo.add(pato1);
        fondo.add(pato2);
        fondo.add(pato3);
        fondo.add(perro);
        perro.intro();
        Thread hiloPato1 = new Thread(pato1);
        Thread hiloPato2 = new Thread(pato2);
        Thread hiloPato3 = new Thread(pato3);
        hiloPato1.start();
//        try
//        {
//            Thread.sleep(700);
//        } catch (InterruptedException ex)
//        {
//            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
        hiloPato2.start();
//        try
//        {
//            Thread.sleep(500);
//        } catch (InterruptedException ex)
//        {
//            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
        hiloPato3.start();
    }
}
