package run;

import java.util.LinkedList;
import java.util.Queue;
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
//        String input = JOptionPane.showInputDialog(null, "Ingrese el numero de patos", "INPUT", JOptionPane.QUESTION_MESSAGE);
        String input = "5";
        if (input != null)
        {
            try
            {
                int noPatos = Integer.parseInt(input);
                Queue<Pato> patos = new LinkedList<>();
//                for (int i = 0; i < noPatos; i++)
//                {
//                    patos.add(null);
//                }
                new Thread(new VentanaPrincipal(patos)).start();
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El dato introducido no es valido", "Error de datos de entrada", JOptionPane.ERROR_MESSAGE);
            }            
        }
    }
}
