import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class manzana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manzana extends Actor
{
    int movy = 1;
    public manzana(){
        GreenfootImage MyWorld = getImage();
        
        int nuevaAltura = (int)MyWorld.getHeight()/2;
        int nuevoAncho = (int)MyWorld.getWidth()/2;
        MyWorld.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the manzana wants to do. This method is called whenever
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
