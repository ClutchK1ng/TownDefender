import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank extends Actor
{
    /**
     * Act - do whatever the Bank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int money;
    private static int roundmoney;
    public void act() 
    {
        // Add your action code here.
    }   
    
     private static boolean setMoney(int newMoney)
    {
        try{
            money=newMoney;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public static boolean minus(int soll)
    {
        try{
            money-=soll;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public static boolean plus(int haben)
    {
        try{
            money+=haben;
            return true;
        }
        catch(Exception e)
        {
            return false;
        } 
    }
    
    public static int getMoney()
    {
        return money;
    }
}
