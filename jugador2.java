import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador2 extends Actor
{
    SimpleTimer ttiro = new SimpleTimer();
    public jugador2(){
        GreenfootImage jugador2 = getImage();
        
        int nuevaAltura = (int)jugador2.getHeight()/3;
        int nuevoAncho = (int)jugador2.getWidth()/3;
        jugador2.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(1);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+1);
        }
        //// flechas your action code here.
        if(Greenfoot.isKeyDown("space") && ttiro.millisElapsed() > 600){
            getWorld().addObject(new bonearrow1(),getX(),getY());
            //Greenfoot.playSound("sonidoflecha.mp3");
            ttiro.mark();
        }
        
        calle1 b1 = (calle1) getOneIntersectingObject(calle1.class);
        if(b1 != null){
            setLocation(84,116);
        }
        fence b2 = (fence) getOneIntersectingObject(fence.class);
        if(b2 != null){
            setLocation(84,116);
        }
    }
}
