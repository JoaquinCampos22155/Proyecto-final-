import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fence extends Actor
{
    public fence(){
        GreenfootImage fence = getImage();
        
        int nuevaAltura = (int)fence.getHeight()/8;
        int nuevoAncho = (int)fence.getWidth()/8;
        fence.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the fence wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
