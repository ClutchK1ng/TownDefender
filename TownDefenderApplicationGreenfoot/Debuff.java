import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debuff extends Actor
{
    /**
     * Act - do whatever the Debuff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double damageBuff;
    private double attackSpeedBuff;
    private int moneyBuff;
    private double movementSpeedBuff;
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Debuff()
    {
    }
    
    public Debuff getBuff()
    {
        return this;
    }
}
