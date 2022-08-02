import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Globo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Globo extends Actor
{
    int movy = 5;
    public Globo(){
        GreenfootImage Globo = getImage();
        
        int nuevaAltura = (int)Globo.getHeight();
        int nuevoAncho = (int)Globo.getWidth();
        Globo.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the Globo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + movy);
        if ((getY() > 350) || (getY() < 30))
        {
            movy = movy * -1;
        }
        // Add your action code here.
    }
}
