
package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Alfred
 */

public class VentanaPrincipal extends JFrame
{

    public VentanaPrincipal() throws HeadlessException
    {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
    }
    
}
