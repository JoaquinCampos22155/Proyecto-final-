import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bonearrow1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bonearrow1 extends Actor
{
    
    public bonearrow1(){
        GreenfootImage bonearrow1 = getImage();
        
        int nuevaAltura = (int)bonearrow1.getHeight()/22;
        int nuevoAncho = (int)bonearrow1.getWidth()/21;
        bonearrow1.scale(nuevoAncho,nuevaAltura);
    }
    /**
     * Act - do whatever the bonearrow1 wants to do. This method is called whenever
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
            MyWorld.puntosesq.add(+1);
            Greenfoot.playSound("sonidotarget.mp3");
            getWorld().removeObject(this);
        }else if(c != null){
            MyWorld.puntosesq.add(-5);
            Greenfoot.playSound("sonidocarro.mp3");
            getWorld().removeObject(this);
        }else if(g1 != null){
            MyWorld.puntosesq.add(+5);
            //Greenfoot.playSound("sonidoglovodorado.mp3");
            getWorld().removeObject(this);
        }else if(G != null){
            MyWorld.puntosesq.add(+3);
            //Greenfoot.playSound("sonidoglovodorado.mp3");
            getWorld().removeObject(this);
        }else if(m != null){
            MyWorld.puntosesq.add(+20);
            Greenfoot.playSound("sonidomanzana.mp3");
            getWorld().removeObject(this);
        }
        
    }
}
