import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLose extends World
{
    GreenfootImage lost = new GreenfootImage("loser.png");
    public GameLose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
    }
    
    public void act(){
        setBackground(lost);
        Greenfoot.playSound("hore.wav");
        Greenfoot.stop();
    }
}
