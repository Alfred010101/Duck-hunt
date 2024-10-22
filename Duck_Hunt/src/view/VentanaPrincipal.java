package view;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alfred
 */
public class VentanaPrincipal extends JFrame
{

    private JPanel fondo;

    public VentanaPrincipal() throws HeadlessException
    {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        initComponents();
    }

    private void initComponents()
    {
        initFondo();
        add(fondo);
    }

    private void initFondo()
    {
        Image imagen = new ImageIcon("src/sources/world.png").getImage();
        fondo = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
    }

}
