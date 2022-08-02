import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class calle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calle1 extends Actor
{
    public calle1(){
        GreenfootImage calle1 = getImage();
        
        int nuevaAltura = (int)calle1.getHeight()*2;
        int nuevoAncho = (int)calle1.getWidth()*2;
        calle1.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the calle1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
