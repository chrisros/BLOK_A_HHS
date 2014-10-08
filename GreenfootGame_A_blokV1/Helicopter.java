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
    private int animationCount;                     //loop door de animatie
    private static int reloadTime;            //minimum tijd tussen schoten
    private String helicopterImage = "helicopter0.png";                
    //helicopter klaarmaken
    public Helicopter(){
        reloadDelay = reloadTime+1;
        animationCount = 1;
        reloadTime = 30;
    }
    
    //animeren van helicopter
    private void heliAnimationCount(){
        if (animationCount<3){
            animationCount++;
            
        } else {
            animationCount=0;    
        }  
        helicopterImage="helicopter"+animationCount+".png";
        setImage(helicopterImage);
   }
  
    
    //Controle of er niet tegen een muur aan word gebotst
    private void checkCollision()
    {
        Actor a = getOneIntersectingObject(Wall.class);
        if (a != null||isAtEdge() )
        {
            World world = getWorld();
            world.addObject(new Explosion(), getX(), getY());
            world.removeObject(this); // remove helicopter from world
            gameOver(); //call gameover 
        }
    }
    
    //op en neer bewegen
    private void movement(){
             if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-8);  
        } else if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+8);   }
    }
    
    //schieten van kogel
    private void shoot(){
        if(Greenfoot.isKeyDown("space")&&reloadDelay>reloadTime){
            World world = getWorld();
            world.addObject(new Bullet(), (getX()+25), (getY()+15));
            reloadDelay = 0;
        }
    }
    
    private void gameOver(){
        Delay(50); 
        Greenfoot.stop();
    }
    
    public void act() 
    {
        movement();
        checkCollision();
        shoot();
        reloadDelay++;
        heliAnimationCount();

    }
    
    
    }    

