package run;

import controller.Contador;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Pato;
import view.VentanaPrincipal;

/**
 *
 * @author Alfred
 */
public class App
{

    public static void main(String[] args)
    {
        Thread hilo = null;
        VentanaPrincipal ventana = null;
        String input = JOptionPane.showInputDialog(null, "Ingrese el numero de patos", "INPUT", JOptionPane.QUESTION_MESSAGE);
//        String input = "5";
        if (input != null)
        {
            try
            {
                int noPatos = Integer.parseInt(input);
                if (noPatos > 0)
                {
                    Contador contador = new Contador(noPatos);
                    Random rand = new Random();
                    int trayectoria = -1;
                    int tmp;

                    Queue<Pato> patos = new LinkedList<>();
                    for (int i = 0; i < noPatos; i++)
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
                        } while (trayectoria == tmp);
                        trayectoria = tmp;

                        patos.add(new Pato(color, 70, trayectoria, contador));
                    }
                    ventana = new VentanaPrincipal(patos, contador);
                    hilo = new Thread(ventana);
                    hilo.start();
                } else
                {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El dato introducido no es valido", "Error de datos de entrada", JOptionPane.ERROR_MESSAGE);
            }

            if (hilo != null && ventana != null)
            {
                try
                {
                    hilo.join();
                    ventana.dispose();
                } catch (InterruptedException ex)
                {
                    System.out.println(ex);
                }
            }
        }
    }
}
