import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador1 extends Actor
{
    SimpleTimer ttiro1 = new SimpleTimer();
    public jugador1(){
        GreenfootImage jugador1 = getImage();
        
        int nuevaAltura = (int)jugador1.getHeight()/3;
        int nuevoAncho = (int)jugador1.getWidth()/3;
        jugador1.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the jugador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+1);
        }
        //flecha
        if(Greenfoot.isKeyDown("0") && ttiro1.millisElapsed() > 600){
            getWorld().addObject(new flecha(),getX(),getY());
            //Greenfoot.playSound("sonidoflecha.mp3");
            ttiro1.mark();
        }
        
        calle1 b1 = (calle1) getOneIntersectingObject(calle1.class);
        if(b1 != null){
            setLocation(84,287);
        }
        fence b2 = (fence) getOneIntersectingObject(fence.class);
        if(b2 != null){
            setLocation(84,287);
        }
        // Add your action code here.
    }
}
