
package controller;

/**
 *
 * @author Alfred
 */

public class Contador
{
    private int  moridos = 0;
    private int puntaje = 0;
    
    public synchronized void resetMoridos()
    {
        moridos = 0;
    }
    
    public synchronized void setMoridos()
    {
        moridos++;
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
}
