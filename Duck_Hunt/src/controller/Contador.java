package controller;

import javax.swing.JLabel;

/**
 *
 * @author Alfred
 */
public class Contador
{

    /**
     * Patos muertos por ronda o grupo funciona como bandera
     */
    private static int moridos = 0;
    /**
     * Puntaje obtenido basa en el numero de patos muertos "negro" +200; "rojo"
     * +150; "azul" +100;
     */
    private static int puntaje = 0;
    /**
     * Numero de patos indicados por el usuario
     */
    private static int totalPatos;
    /**
     * Numero de patos muertos en toda la partida
     */
    private static int totalMoridos = 0;
    /**
     * Mostrar el puntaje al usuario
     */
    public static JLabel lblPuntaje;
    /**
     * Mostrar el numero de patos restantes
     */
    public static JLabel lblContPatos;

    public static void setTotalPatos(int noPatos)
    {
        totalPatos = noPatos;
    }

    public static int getTotalPatos()
    {
        return totalPatos;
    }

    public static synchronized void resetMoridos()
    {
        moridos = 0;
    }

//    public synchronized void setMoridos()
//    {
//        moridos++;
//        totalMoridos++;
//    }
    public static synchronized int getMoridos()
    {
        return moridos;
    }

    public static synchronized void setPuntaje(int aumento)
    {
        moridos++;
        totalMoridos++;
        puntaje += aumento;
    }

    public static synchronized int getPuntaje()
    {
        return puntaje;
    }

    public static synchronized int getTotalMoridos()
    {
        return totalMoridos;
    }
}
