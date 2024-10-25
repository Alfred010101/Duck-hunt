package model;

import controller.TrayectoriaVuelo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alfred
 */
public class Pato extends JLabel implements Runnable
{

    private final String PATH;
    private ImageIcon imagen;
    private final TrayectoriaVuelo TRAYECTORIA;
    private boolean morido = false;
    private int delay;
    
    public Pato(String color, int delay)
    {
        PATH = "src/sources/patos/" + color + "/";
        TRAYECTORIA = new TrayectoriaVuelo();
        this.delay = delay;
        
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
//                System.out.println("Hola, come frutas y verduras ... xD");
                if (!morido)
                {
                    System.out.println("+100");
                    morido = !morido;
                }                
            }
        });
    }

    @Override
    public void run()
    {
        for (int i = 0; i < TRAYECTORIA.getCoordenadas().size(); i++)
        {
            imagen = new ImageIcon(PATH + TRAYECTORIA.getSprites().get(i));
            setIcon(imagen);
            Point punto = TRAYECTORIA.getCoordenadas().get(i);
            setBounds(punto.x, punto.y, imagen.getIconWidth(), imagen.getIconHeight());
            try
            {
                Thread.sleep(delay);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
            if (morido)
            {
                int a = 1;
                int posY = punto.y;
                while (posY < 300)
                {
                    imagen = new ImageIcon(PATH + "duckfall" + a + ".png");
                    setIcon(imagen);
                    setBounds(punto.x, posY, imagen.getIconWidth(), imagen.getIconHeight());
                    posY += 10;
                    a = (a == 1) ? 2 : 1;
                    try
                    {
                        Thread.sleep(40);
                    } catch (InterruptedException ex)
                    {
                        System.out.println(ex);
                    }
                }
                setIcon(null);
                break;
            }
        }
    }
}
