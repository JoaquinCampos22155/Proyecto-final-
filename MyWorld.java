import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static Counter puntosjugador1 = new Counter();
    public static Counter puntosesq = new Counter();
    public static Counter tiempo = new Counter();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    { 

        Globo globo = new Globo();
        addObject(globo,429,61);
        globo.setLocation(429,300);

        manzana manzana = new manzana();
        addObject(manzana,531,268);
        manzana.setLocation(540,343);

        calle1 calle1 = new calle1();
        addObject(calle1,220,228);
        calle1.setLocation(240,300);

        carro carro = new carro();
        carro.setRotation(180);
        addObject(carro,220,228);
        carro.setLocation(240,40);

        globo1 globo1 = new globo1();
        addObject(globo1,484,371);
        globo1.setLocation(490,350);

        jugador1 jugador1 = new jugador1();
        addObject(jugador1,73,286);
        jugador1.setLocation(84,287);

        fence fence = new fence();
        addObject(fence, 86,147);
        fence.setLocation(40,201);

        fence fence1 = new fence();
        addObject(fence1, 86,147);
        fence1.setLocation(115,201);

        jugador2 jugador2 = new jugador2();
        addObject(jugador2,86,147);
        jugador2.setLocation(84,116);

        flecha flecha = new flecha();
        flecha.setRotation(90);

        target1 target1 = new target1();
        target1.setRotation(180);
        addObject(target1,86,147);
        target1.setLocation(369,345);

        addObject(puntosjugador1,44,383);
        puntosjugador1.setValue(0);

        addObject(puntosesq,44,15);
        puntosesq.setValue(0);

        
        
        //do{
        Greenfoot.playSound("musicafondo.mp3");
        //}while(MyWorld.puntosesq.getValue() >= 150 && 
        //MyWorld.puntosjugador1.getValue() <= -100 &&
        //MyWorld.puntosesq.getValue() <= -100 &&
        //MyWorld.puntosjugador1.getValue() >= 150);
        
        //Cuando se acaba el tiempo
        //if (tiempo == stopped()){
        //    
        //}
    }
}
