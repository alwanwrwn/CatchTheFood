import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Home extends World {
    Level level = new Level();
    GreenfootSound sound1 = new GreenfootSound("DesiJourney.wav");
    public Home() {    
        super(640, 480, 1);
        sound1.play();
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter") || Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(level);
        }
    }
}
