import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Vidas extends Actor
{
    private Counter contador;
    
    public Vidas(int vid){
        contador = new Counter("Vidas: ");
        contador.setValue(vid);
    } 
    
    protected void addedToWorld(World world){
        world.addObject(contador,500,20);
    }
    
    
    public void menosVida() 
    {
        contador.setValue(contador.getValue()-1);
    }   
}
