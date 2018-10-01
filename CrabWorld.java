import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class CrabWorld extends greenfoot.World
{
    private ArrayList <worm> gusanos;
    
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        tiempo time = new tiempo();
        this.addObject(time,60,20);
        prepareWorld();
    }
    
    public void prepareWorld(){
        Crab crab = new Crab();
        
        lobster lob = new lobster();
        
        
        
        this.addObject(crab,100,100);
        this.addObject(lob,190,30);
    }
}
