import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganador2 extends World
{

    /**
     * Constructor for objects of class Ganador2.
     * 
     */
    public Ganador2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare(){
        jugador2d jugador2d = new jugador2d();
        addObject(jugador2d,73,286);
        jugador2d.setLocation(300,200);
        
        getBackground().drawString("El ganador es... \n Jugador 2", 260, 50);
    }
}
