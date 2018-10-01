import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class tiempo extends Actor
{
    private SimpleTimer timer;
    private Counter contador;
    
    public tiempo(){
        timer = new SimpleTimer();
        contador = new Counter("Tiempo: ");
        contador.setValue(60);
    }
    
    protected void addedToWorld(World world){
        world.addObject(contador,60,20);
    }
    
    
    public void act() 
    {
        if(timer.millisElapsed()>1000){
            //System.out.println(timer.millisElapsed());
            contador.setValue(contador.getValue()-1);
            timer.mark();
        }
    }    
}
