import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intruder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Intruder extends Actor
{
    /**
     * Act - do whatever the Intruder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hp;   //Lebenspunkte
    private double mvmspeed;  //Bewegungsgeschwindigkeit 
    // private String model; //Serie von Fotos die die Bewegung darstellen
    private String currentPic; //Pfad der Bilder
    private int bounty; //Geld das gutgeschrieben wird, wenn $Objekt stirbt
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Intruder(int hp, double mvmspeed, String picturePath, int bounty)
    {
        this.hp=hp;
        this.mvmspeed=mvmspeed;
        this.currentPic=picturePath;
        this.bounty=bounty;
    }
    
    private int die()
    {
        //remove Object
        return bounty;
    }
    
    public boolean hit(double damage)
    {
        return false;
    }
    
    public boolean move(double movementSpeed)
    {
        return false;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public double getSpeed()
    {
        return mvmspeed;
    }
    
    public String getPic()
    {
        return currentPic;
    }
    
    public boolean setPic(String picturePath)
    {
        try{
            currentPic=picturePath;
            return true;
        }
        catch(Exception e)
        {
            return false;
        }                  
    }
    
    public boolean setSpeed(double newSpeed)
    {
        try{
            this.mvmspeed=newSpeed;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public boolean turnBoolean(int grad)
    {
        return false;
    }
}
