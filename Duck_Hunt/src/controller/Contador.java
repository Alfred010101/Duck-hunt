package controller;

/**
 *
 * @author Alfred
 */
public class Contador
{

    private int moridos = 0;
    private int puntaje = 0;
    private final int totalPatos;
    private int totalMoridos = 0;

    public Contador(int totalPatos)
    {
        this.totalPatos = totalPatos;
    }

    public synchronized void resetMoridos()
    {
        moridos = 0;
    }

    public synchronized void setMoridos()
    {
        moridos++;
        totalMoridos++;
    }

    public synchronized int getMoridos()
    {
        return moridos;
    }

    public synchronized void setPuntaje(int aumento)
    {
        puntaje += aumento;
    }

    public synchronized int getPuntaje()
    {
        return puntaje;
    }

    public int getTotalPatos()
    {
        return totalPatos;
    }

    public int getTotalMoridos()
    {
        return totalMoridos;
    }
}
