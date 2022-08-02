import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class target1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class target1 extends Actor
{
    int movy = 4;
    public target1(){
        GreenfootImage target1 = getImage();
        
        int nuevaAltura = (int)target1.getHeight()/8;
        int nuevoAncho = (int)target1.getWidth()/8;
        target1.scale(nuevoAncho,nuevaAltura);
    }
    
    /**
     * Act - do whatever the target1 wants to do. This method is called whenever
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
