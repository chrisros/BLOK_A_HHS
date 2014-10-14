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
    public static boolean gameOverBool;                        //true als je tegen een muur aan botst
    private static int gameOverDelay;
    public int rocketsFired;                        //hoeveelheid raketten afgevuurd
    private static int reloadTime;            //minimum tijd tussen schoten
    private String helicopterImage = "helicopter0.png";                
   
    //helicopter klaarmaken
    public Helicopter(){
        reloadDelay = reloadTime+1;
        animationCount = 1;
        reloadTime = 30;
        gameOverDelay = 0;
        rocketsFired = 0;
        gameOverBool = false;
    }
    
    //animeren van helicopter
    private void heliAnimationCount()
    {
        if (animationCount<3)
        {
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
            gameOverBool=true; //call gameover
            World world = getWorld();
            world.addObject(new Explosion(), getX(), getY());
            world.removeObject(this); // remove helicopter from world
            Greenfoot.playSound("heliExplosion.wav");
             
        }
    }
    private void test(){
        if(Greenfoot.isKeyDown("k")){
          gameOverBool = true;  
        }
    }
    
    //op en neer bewegen
    private void movement()
    {
        if(Greenfoot.isKeyDown("up"))
        {
        setLocation(getX(), getY()-6);  
        } else if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+6);   
        }
    }
    
    //schieten van kogel
    private void shoot()
    {
        if(Greenfoot.isKeyDown("space")&&reloadDelay>reloadTime)
        {
            World world = getWorld();
            world.addObject(new Bullet(), (getX()+25), (getY()+15));
            reloadDelay = 0;
            Greenfoot.playSound("launch.wav");
            rocketsFired++;
        }
    }
    
    private void gameOver(){      
        if(gameOverBool==true){
            gameOverDelay++;
        }
        if (gameOverDelay>20 && gameOverBool==true)
        {
            Greenfoot.stop();
        }        
    }
    
    
    public void act() 
    {
        gameOver();
        movement();
        checkCollision();
        shoot();
        reloadDelay++;
        heliAnimationCount();
        test();
    }
    
    
    }    

