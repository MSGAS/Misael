import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Crab extends Actor
{
    
    public void act() 
    {
        int a=5;
        int r=5;
        super.move(a);
        if(Greenfoot.isKeyDown("right")){
            super.turn(r);
        }
        if(Greenfoot.isKeyDown("left")){
            super.turn(-r);
        }
        if(isTouching(worm.class)){
            removeTouching(worm.class);
        }
    }    
}
