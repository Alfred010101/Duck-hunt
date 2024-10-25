package view;

import controller.Contador;
import java.awt.Dimension;
import java.awt.Image;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
//    private Queue<Pato> patos;
    private final int patos;

    public VentanaPrincipal(int patos)
    {
        this.patos = patos;
        setLocation(200, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setResizable(false);
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
        layeredPane.add(lblFondo2, Integer.valueOf(3));
    }

    @Override
    public void run()
    {
        Contador contador = new Contador();
        
        Perro perro = new Perro(layeredPane);
        layeredPane.add(perro, Integer.valueOf(5));

//        Pato pato1 = new Pato("azul", 120);
//        Pato pato2 = new Pato("negro", 80);
//        Pato pato3 = new Pato("azul", 95);
//        layeredPane.add(pato1,Integer.valueOf(1));
//        layeredPane.add(pato2,Integer.valueOf(1));
//        layeredPane.add(pato3,Integer.valueOf(1));
        perro.intro();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Random rand = new Random();
        int trayectoria = -1;
        int tmp;
        for (int i = 0; i < patos;)
        {
            int tasksInGroup;
            if (i + 1 < patos)
            {
                tasksInGroup = ((rand.nextInt(99) + 1) % 2) + 1;
            }
            else
            {
                tasksInGroup = 1;
            }

            CyclicBarrier barrier = new CyclicBarrier(tasksInGroup , () ->
            {
                if(contador.getMoridos() > 0)
                {
                    perro.atrapar(contador.getMoridos());
                    contador.resetMoridos();
                }else
                {
                    perro.troll();
                }
                System.out.println(contador.getPuntaje());
            });
            
            for (int j = 0; j < tasksInGroup && i < patos; j++, i++)
            {
                String color = switch (rand.nextInt(3))
                {
                    case 0 ->
                        "azul";
                    case 1 ->
                        "negro";
                    case 2 ->
                        "rojo";
                    default ->
                        "negro";
                };
                
                do
                {
                    tmp = rand.nextInt(3);
                }while(trayectoria == tmp);
                trayectoria = tmp;
                Pato pato = new Pato(barrier, color, 120, trayectoria, contador);
                layeredPane.add(pato, Integer.valueOf(1));
                executor.submit(pato);
                System.out.println("Pato : " + (i + 1));
            }
        }
//        Thread hiloPato1 = new Thread(pato1);
//        Thread hiloPato2 = new Thread(pato2);
//        Thread hiloPato3 = new Thread(pato3);
//        hiloPato1.start();
//        hiloPato2.start();
//        hiloPato3.start();
        executor.shutdown();
//        while (!executor.isTerminated()){}
    }
}
