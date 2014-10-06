import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Actor
{
    private int reloadDelay;                        //tijd sinds laatse schot
    private static final int reloadTime = 20;        //minimum tijd tussen schoten
    
    //private GreenfootImage helicopter = new GreenfootImage("helicopter.png");
    
    //helicopter klaarmaken
    public Helicopter(){
        reloadDelay = reloadTime+1;
    }
    
    //Controle of er niet tegen een muur aan word gebotst
    private void checkCollision()
    {
        Actor a = getOneIntersectingObject(Wall.class);
        if (a != null||isAtEdge() )
        {
            World world = getWorld();
            world.addObject(new Explosion(), getX(), getY());
            world.removeObject(this); // remove helicpter from world
            //Sky.gameOver(); //call gameover 
        }
    }
    
    private void movement(){
             if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-8);  
        } else if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+8);   }
    }
    
    private void shoot(){
        if(Greenfoot.isKeyDown("space")&&reloadDelay>reloadTime){
            World world = getWorld();
            world.addObject(new Bullet(), getX(), getY());
            reloadDelay = 0;
        }
    }
    
    public void act() 
    {
        movement();
        checkCollision();
        shoot();
        reloadDelay++;
        
    }
    
    
    }    

