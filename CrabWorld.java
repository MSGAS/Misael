import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class CrabWorld extends greenfoot.World
{
    private ArrayList <Worm> gusanos;
    
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1);
        
        
        
        Tiempo time = new Tiempo();
        this.addObject(time,60,20);
        
        gusanos = new ArrayList<Worm>();;
        
        prepareWorld();
    }
    
    public void prepareWorld(){

        Crab crab = new Crab();
        Lobster lob = new Lobster();
        for(int i=0; i<9; i++){
            gusanos.add(new Worm());
        }
        
        this.addObject(crab,100,100);
        this.addObject(lob,190,30);
        for(int i=0; i<9; i++){
            this.addObject(gusanos.get(i),(int)(Math.random()*500)+15,(int)(Math.random()*500)+15);
        }
    }
    
    
}
