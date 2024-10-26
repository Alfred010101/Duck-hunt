package model;

import controller.Contador;
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
    private final int delay;
    private final Contador contador;

    public Pato(String color, int delay, int trayectoria, Contador contador)
    { 
        this.delay = delay;
        this.contador = contador;
        PATH = "src/sources/patos/" + color + "/";
        TRAYECTORIA = new TrayectoriaVuelo(trayectoria);

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
//                System.out.println("Hola, come frutas y verduras ... xD");
                if (!morido)
                {
                    morido = !morido;
                }
            }
        });
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i < TRAYECTORIA.getCoordenadas().size(); i++)
            {
                imagen = new ImageIcon(PATH + TRAYECTORIA.getSprites().get(i));
                setIcon(imagen);
                Point punto = TRAYECTORIA.getCoordenadas().get(i);
                setBounds(punto.x, punto.y, imagen.getIconWidth(), imagen.getIconHeight());

                Thread.sleep(delay);

                if (morido)
                {
                    contador.setMoridos();
                    contador.setPuntaje(100);
                    if (TRAYECTORIA.getCoordenadas().get(0).x < TRAYECTORIA.getCoordenadas().get(TRAYECTORIA.getCoordenadas().size() - 1).x)
                    {
                        imagen = new ImageIcon(PATH + "scaredRight.png");
                    } else
                    {
                        imagen = new ImageIcon(PATH + "scaredLeft.png");
                    }
                    setIcon(imagen);
                    setBounds(punto.x, punto.y, imagen.getIconWidth(), imagen.getIconHeight());

                    Thread.sleep(250);

                    int a = 1;
                    int posY = punto.y;
                    while (posY < 300)
                    {
                        imagen = new ImageIcon(PATH + "duckfall" + a + ".png");
                        setIcon(imagen);
                        setBounds(punto.x, posY, imagen.getIconWidth(), imagen.getIconHeight());
                        posY += 10;
                        a = (a == 1) ? 2 : 1;

                        Thread.sleep(40);
                    }
                    setIcon(null);
                    break;
                }
            }
        } catch (InterruptedException ex)
        {
            System.out.println(ex);
        }
    }
}
