import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Lobster extends Actor
{
    public void act() 
    {
        super.move(3);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if(getX()<=5 || getX()>=getWorld().getWidth()-5){
            turn(180);
        }
        if(getY()<=5 || getY()>=getWorld().getHeight()-5){
            turn(180);
        }
        
    }    
}
