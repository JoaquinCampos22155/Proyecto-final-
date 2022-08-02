import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flecha extends Actor
{
    public flecha(){
        GreenfootImage flecha = getImage();
        
        int nuevaAltura = (int)flecha.getHeight()/6;
        int nuevoAncho = (int)flecha.getWidth()/6;
        flecha.scale(nuevoAncho,nuevaAltura);
        
    }
    /**
     * Act - do whatever the flecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        setLocation(getX() + 15, getY());
        
        target1 t = (target1) getOneIntersectingObject(target1.class);
        carro c = (carro) getOneIntersectingObject(carro.class);
        globo1 g1 = (globo1) getOneIntersectingObject(globo1.class);
        Globo G = (Globo) getOneIntersectingObject(Globo.class);
        manzana m = (manzana) getOneIntersectingObject(manzana.class);
        if (getX() > 590){
            getWorld().removeObject(this);
        }else if(t != null){
            MyWorld.puntosjugador1.add(+1);
            Greenfoot.playSound("sonidotarget.mp3");
            getWorld().removeObject(this);
        }else if(c != null){
            MyWorld.puntosjugador1.add(-5);
            Greenfoot.playSound("sonidocarro.mp3");
            getWorld().removeObject(this);
        }else if(g1 != null){
            MyWorld.puntosjugador1.add(+5);
            //Greenfoot.playSound("sonidoglovodorado.mp3");
            getWorld().removeObject(this);
        }else if(G != null){
            MyWorld.puntosjugador1.add(+3);
            //Greenfoot.playSound("sonidoglovodorado.mp3");
            getWorld().removeObject(this);
        }else if(m != null){
            MyWorld.puntosjugador1.add(+20);
            Greenfoot.playSound("sonidomanzana.mp3");
            getWorld().removeObject(this);
        }
    }
    
}
