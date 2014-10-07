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
    
    private GreenfootImage helicopter1 = new GreenfootImage("helicopter0.png");
    private GreenfootImage helicopter2 = new GreenfootImage("helicopter1.png");
    private GreenfootImage helicopter3 = new GreenfootImage("helicopter2.png");
    private GreenfootImage helicopter4 = new GreenfootImage("helicopter3.png");
    //helicopter klaarmaken
    public Helicopter(){
        reloadDelay = reloadTime+1;
        animationCount = 1;
        reloadTime = 30;
    }
    
    //animeren van helicopter
    private void heliAnimationCount(){
        if (animationCount<4){
            helicopterImage="helicopter"+animationCount+".png";
            animationCount++;
            
        } else {
            animationCount=0;
            helicopterImage="helicopter"+animationCount+".png";
        }      
   }
   
   //animatie van helicopterwieken
   private void heliAnimation(){
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
            world.removeObject(this); // remove helicpter from world
            //Sky.gameOver(); //call gameover 
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
            world.addObject(new Bullet(), (getX()+30), (getY()+30));
            reloadDelay = 0;
        }
    }
    
    public void act() 
    {
        movement();
        checkCollision();
        shoot();
        reloadDelay++;
        heliAnimation();
        heliAnimationCount();

    }
    
    
    }    

