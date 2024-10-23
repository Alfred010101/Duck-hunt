package view;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        
        Pato pato = new Pato(fondo, "negro","blackduckleft");
        Thread hilo2 = new Thread(pato);
        
        
        
        fondo.add(pato);
        fondo.add(perro);
        
        hilo.start();
        hilo2.start();
        
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

class Pato extends JLabel implements Runnable
{
    public int posX = 460;
    public int posY = 50;
    private final String PATH = "src/sources/patos/"; 
    private final String color;
    private final String sources;
    private final JComponent padre;
    public Pato(JComponent padre, String color, String sources)
    {
        this.padre = padre;
        this.sources = sources;
        this.color = color;        
        setIcon(new ImageIcon(PATH + color + "/" + sources + "1.png"));
        setBounds(-200, -200, getWidth(), getHeight());
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
        int i = 1;
        while(true)
        {
            if (posX == -10)
            {
                posX = 460;
            }else
            {
                posX-=10;
            }
            try
            {
                setIcon(new ImageIcon(PATH + color + "/" + sources + i + ".png"));
                setBounds(posX, posY, getWidth(), getHeight());
                Thread.sleep(80);
                padre.repaint();
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
            i = (i == 4) ? 1 : ++i;
        }
    }
    
}
