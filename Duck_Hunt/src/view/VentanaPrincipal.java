package view;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Alfred
 */
public class VentanaPrincipal extends JFrame
{

    private JPanel fondo;
    private Image imagen;
    public VentanaPrincipal() throws HeadlessException
    {
        setLocation(0, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        setSize(imagen.getWidth(rootPane), imagen.getHeight(rootPane));
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
        
        Perro perro = new Perro(fondo, "clue.png");
        Thread hilo = new Thread(perro);
        hilo.start();
        
        fondo.add(perro);
        
    }
}


class Perro extends JLabel implements Runnable
{
    public int posX = 0;
    public int posY = 270;
    private final String PATH = "src/sources/"; 
    private final String img;
    private final JComponent padre;
    public Perro(JComponent padre, String img)
    {
        this.img = img;
        this.padre = padre;
        setIcon(new ImageIcon(PATH + img));
        setBounds(posX, posY, getWidth(), getHeight());
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Hola, come frutas y verduras ... xD");
            }
            
        });
    }

    
    @Override
    public void run()
    {
        while(true)
        {
            if (posX == 450)
            {
                posX = 0;
            }else
            {
                posX++;
            }
            try
            {
                setBounds(posX, posY, getWidth(), getHeight());
                Thread.sleep(9);
                padre.repaint();
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
    
}
