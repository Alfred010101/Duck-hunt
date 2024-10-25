package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Alfred
 */
public class Perro extends JLabel //implements Runnable
{

    private final String PATH = "src/sources/perro/";
    private final JLayeredPane layeredPane;
    private final List<Point> coordenadas;
    private final List<Point> pcCoordendas;

    public Perro(JLayeredPane layeredPane)
    {
        this.layeredPane = layeredPane;

        coordenadas = List.of(
                new Point(220, 280),
                new Point(220, 275),
                new Point(220, 270),
                new Point(220, 265),
                new Point(220, 260),
                new Point(220, 255),
                new Point(220, 250),
                new Point(220, 245),
                new Point(220, 240),
                new Point(220, 235),
                new Point(220, 230),
                new Point(220, 225),
                new Point(220, 220)
        );

        pcCoordendas = new ArrayList<>(coordenadas);
        Collections.reverse(pcCoordendas);
    }

    public void intro()
    {
        List<Point> caminar1Coordenadas = List.of(
                new Point(-30, 280),
                new Point(5, 280),
                new Point(30, 280),
                new Point(55, 280)
        );

        List<Point> caminar2Coordenadas = List.of(
                new Point(55, 280),
                new Point(80, 280),
                new Point(105, 280),
                new Point(130, 280)
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
            accionOlfatear(caminar1Coordenadas.get(caminar1Coordenadas.size() - 1), "dognuzzle", 4, 70);
            accionCaminar(caminar2Coordenadas, "dogright", 180);
            accionOlfatear(caminar2Coordenadas.get(caminar1Coordenadas.size() - 1), "dognuzzle", 4, 70);
            accionPreparado(caminar2Coordenadas.get(caminar1Coordenadas.size() - 1), "clue.png", 300);
            accionSaltar(saltarCoordenadas, "dogjump1.png", 90);
            layeredPane.setLayer(this, 2);
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

    public void troll()
    {

        Thread hilo = new Thread(() ->
        {
            subir(coordenadas, "doglaugh0.png");
            accionOlfatear(coordenadas.get(coordenadas.size() - 1), "doglaugh", 8, 100);
            subir(pcCoordendas, "doglaugh0.png");
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

    public void atrapar(int i)
    {
        String src = (i == 1) ? "oneDuck.png" : "twoDucks.png";
        Thread hilo = new Thread(() ->
        {
            subir(coordenadas, src);
            try
            {
                Thread.sleep(300);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
            subir(pcCoordendas, src);
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

    private void accionOlfatear(Point coordenadas, String sources, int repetir, int delay)
    {
        ImageIcon imagen;
        for (int x = 0; x < repetir; x++)
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

    private void accionPreparado(Point coordenadas, String sources, int delay)
    {
        ImageIcon imagen;
        imagen = new ImageIcon(PATH + sources);
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

    private void subir(List<Point> coordenadas, String sources)
    {
        ImageIcon imagen;
        imagen = new ImageIcon(PATH + sources);
        setIcon(imagen);
        for (int x = 0; x < coordenadas.size(); x++)
        {
            setBounds(coordenadas.get(x).x, coordenadas.get(x).y, imagen.getIconWidth(), imagen.getIconHeight());
            try
            {
                Thread.sleep(60);
            } catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}
