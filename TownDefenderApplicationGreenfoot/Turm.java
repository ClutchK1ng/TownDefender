import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turm extends Actor
{
    /**
     * Act - do whatever the Turm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int level; //welches Level der Turm aktuell hat
    private int bauPreis; //die Kosten zum ersten mal Bauen
    private double grundSchaden; //der Schaden beim ersten mal Bauen ohne Upgrades
    private double reichweite; //die Reichweite in dem der Turm angreifen kann
    private int maxLevel; //das maximale Level den der Turm erreichen kann
    private double schadensMultiplikator; //um wie viel sich der Schaden vervielfacht
    private double attackSpeed; //die Angriffsrate in Millisekunden
    private int kills; //wie viel Schaden der Turm angerichtet hat
    private boolean buildableOnWater; //kann man den Turm auf Wasser platzieren
    private String currentPic; 
    //private Debuff debuffs; #REWORK#
    public void act() 
    {
        // Add your action code here.
    }    
    
     private int berechneSellPrize()
    {
        return -1;
    }
    
    private double berechneSchaden()
    {
        return -1;
    }
    
    public double sell()
    {
        return -1;
    }
    
    public int getKills()
    {
        return kills;
    }
    
    public boolean setPicture(String bildquelle)
    {
        try{
            currentPic=bildquelle;
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
    
    public boolean upgraden()
    {
        return false;
    }
    
    // public boolean setBuff(Buff buff)
    // {
        // return false;
    // }
}
