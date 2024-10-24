package model;

import java.awt.Point;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alfred
 */
public class Perro extends JLabel //implements Runnable
{
    
    private final String PATH = "src/sources/perro/";

    public Perro()
    {
    }
    
    public void intro()
    {
        List<Point> caminar1Coordenadas = List.of(
                new Point(-30, 240),
                new Point(5, 240),
                new Point(30, 240),
                new Point(55, 240)
        );

        List<Point> caminar2Coordenadas = List.of(
                new Point(55, 240),
                new Point(80, 240),
                new Point(105, 240),
                new Point(130, 240)
        );

        List<Point> saltarCoordenadas = List.of(
                new Point(165, 220),
                new Point(175, 200),
                new Point(185, 180),
                new Point(195, 160)
        );

        List<Point> caerCoordenadas = List.of(
                
                new Point(225, 160),
                new Point(235, 180),
                new Point(245, 200),
                new Point(255, 220),
                new Point(265, 240)
        );

        Thread hilo = new Thread(() ->
        {
            accionCaminar(caminar1Coordenadas, "dogright", 180);
            accionOlfatear(caminar1Coordenadas.get(caminar1Coordenadas.size() - 1), "dognuzzle", 70);
            accionCaminar(caminar2Coordenadas, "dogright", 180);
            accionOlfatear(caminar2Coordenadas.get(caminar1Coordenadas.size() - 1), "dognuzzle", 70);
            accionSaltar(saltarCoordenadas, "dogjump1.png", 90);
            accionSaltar(caerCoordenadas, "dogjump2.png", 90);
        });

        hilo.start();
        
        try
        {
            hilo.join();
        } catch (InterruptedException ex)
        {
            System.out.println(ex);
        }
        
        setIcon(null);
    }

    private void accionCaminar(List<Point> coordenadas, String sources, int delay)
    {
        ImageIcon imagen;
        for (int x = 0; x < coordenadas.size(); x++)
        {
            imagen = new ImageIcon(PATH + sources + (x + 1) + ".png");
            setIcon(imagen);
            setBounds(coordenadas.get(x).x, coordenadas.get(x).y, imagen.getIconWidth(), imagen.getIconHeight());
            try
            {
                Thread.sleep(delay);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }

    private void accionOlfatear(Point coordenadas, String sources, int delay)
    {
        ImageIcon imagen;
        for (int x = 0; x < 4; x++)
        {
            imagen = new ImageIcon(PATH + sources + ((x + 1) % 2) + ".png");
            setIcon(imagen);
            setBounds(coordenadas.x, coordenadas.y, imagen.getIconWidth(), imagen.getIconHeight());
            try
            {
                Thread.sleep(delay);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }

    private void accionSaltar(List<Point> coordenadas, String sources, int delay)
    {
        ImageIcon imagen = new ImageIcon(PATH + sources);
        setIcon(imagen);
        for (int x = 0; x < coordenadas.size(); x++)
        {
            setBounds(coordenadas.get(x).x, coordenadas.get(x).y, imagen.getIconWidth(), imagen.getIconHeight());
            try
            {
                Thread.sleep(delay);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}
