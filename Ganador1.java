import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganador1 extends World
{

    /**
     * Constructor for objects of class Ganador.
     * 
     */
    public Ganador1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare(){
        jugador1d jugador1d = new jugador1d();
        addObject(jugador1d,73,286);
        jugador1d.setLocation(300,200);
        
        getBackground().drawString("El ganador es... \n Jugador 1", 260, 50);

    }
}
