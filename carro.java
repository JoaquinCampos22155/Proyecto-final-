import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carro extends calle1
{
    int movy = 4;
    public carro(){
        GreenfootImage carro = getImage();
        
        int nuevaAltura = (int)carro.getHeight()/2;
        int nuevoAncho = (int)carro.getWidth()/2;
        carro.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + movy);
        if ((getY() > 350) || (getY() < 30))
        {
            movy = movy * -1;
            setRotation(getRotation() + 180);
        }
        // Add your action code here.
    }
}
