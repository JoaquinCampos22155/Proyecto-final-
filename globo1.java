import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class globo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class globo1 extends Actor
{
    int movy = 3;
    /**
     * Act - do whatever the globo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + movy);
        if ((getY() > 350) || (getY() < 30))
        {
            movy = movy * -1;
        }
    }
}
