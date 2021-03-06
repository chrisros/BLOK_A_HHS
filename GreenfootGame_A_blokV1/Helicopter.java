import greenfoot.*; 
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
    public static boolean gameOverBool;                    //true als je tegen een muur aan botst
    private static int gameOverDelay;
    public static int rocketsFired;                        //hoeveelheid raketten afgevuurd
    private static int reloadTime;                  //minimum tijd tussen schoten
    private String helicopterImage = "helicopter0.png";                
    public static boolean rocketInGame;
    //helicopter klaarmaken
    public Helicopter()
    {
        reloadDelay = reloadTime+1;
        animationCount = 1;
        reloadTime = 30;
        gameOverDelay = 20;
        rocketsFired = 0;
        gameOverBool = false;
        setRotation(5);
        rocketInGame = false;
    }
    
    public static boolean gameOverCheck()
    {
        return gameOverBool;
    }

    
    //animeren van helicopter
    private void heliAnimationCount()
    {
        if(gameOverBool==false)
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
    }
  
    
    //Controle of er niet tegen een muur aan word gebotst
    private void checkCollision()
    {
        if (gameOverBool==false)
        {   
            Actor a = getOneIntersectingObject(Wall.class);
            if (a != null||isAtEdge())
            {
                setImage("gone.png");//laat de helicopter verdwijnen
                //greenfoot.GreenfootSound.stop("helisound.wav");
                World world = getWorld();
                world.addObject(new Explosion(), getX(), getY());
                Greenfoot.playSound("heliExplosion.wav");
                world.addObject( new Gameover(), 600, 300 );
                gameOverBool = true; 
            }
        }    
    }
    
    //op en neer bewegen
    private void movement()
    {
        if(gameOverBool==false)
        {
            if(Greenfoot.isKeyDown("up"))
            {
            setLocation(getX(), getY()-6);
            setRotation(2);
            } else if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+6); 
            setRotation(8);
            } else{
                setRotation(5);
            }   
        }
    }
    //schieten van kogel
    private void shoot()
    {
        if(Greenfoot.isKeyDown("space")&&reloadDelay>reloadTime)
        {
            World world = getWorld();
            world.addObject(new Bullet(), (getX()+25), (getY()+15));
            rocketInGame = true;
            reloadDelay = 0;
            Greenfoot.playSound("launch.wav");
            rocketsFired++;
        }
        reloadDelay++;
    }
    
    private void gameOver()
    {        
        if(gameOverBool==true)
        {
            gameOverDelay--;
        }
        if (gameOverDelay<0 && gameOverBool==true)
        {       
            World world = getWorld();
            world.removeObject(this); // remove helicopter from world
            //Greenfoot.delay(5000000);
        }        
    }
     
    public void act() 
    {
        //GreenfootSound.playLoop(playSound("helisound.mp3")); 
        gameOver();
        movement();
        checkCollision();
        shoot();
        heliAnimationCount();
       
    }
    
    
    }    

