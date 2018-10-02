import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Crab extends Actor
{
    Vidas vidas;
    private int iVidas;
    public Crab(){
        iVidas=5;
        vidas = new Vidas(iVidas);
        
        
    }
    
    
    
    public void act() 
    {
        World world=getWorld();
        world.addObject(vidas,500,20);
        int a=5;
        int r=5;
        super.move(a);
        
        
        if(Greenfoot.isKeyDown("right")){
            super.turn(r);
        }
        if(Greenfoot.isKeyDown("left")){
            super.turn(-r);
        }
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
        }
        if(isTouching(Lobster.class)){
            vidas.menosVida();
            iVidas--;
            this.setLocation(250,250);
        }
    }    
}
