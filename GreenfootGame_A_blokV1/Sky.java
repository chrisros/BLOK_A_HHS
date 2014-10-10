import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    boolean isPlaying = false;
    private int counterIndestructableWalls;
    private int counterDestructableWalls;
    int SPACE_BETWEEN_MUREN = 200;
       
    private void playMusic()
    {
        if(!isPlaying)
        {
            Greenfoot.playSound("darude.wav");
            isPlaying = true;
        }
    }
  
    public Sky()
    {         
       super(1200, 600, 1, false); 
      
        addObject( new Helicopter(), 400, 300 );
        addObject( new BackgroundScroller(), 1200, 300 );
        addObject( new MovingWall(), 100, 100);
        setPaintOrder(Explosion.class,IndestructableWall.class, DestructableWall.class,Helicopter.class,Bullet.class,MovingWall.class,ScoreBoard.class,BackgroundScroller.class);
               
    }
   
    public void act()
    {
        spawnIndestructableWalls();
        spawnDestructableWalls();
        playMusic();
    }
    
    private void spawnIndestructableWalls()

    {
       counterIndestructableWalls++;
       if (counterIndestructableWalls == 250) {
          
           // Down Wall
           DownIndestructableWall downMuur = new DownIndestructableWall();           
           GreenfootImage downImage = downMuur.getImage();
           addObject(downMuur, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));    
           
           // Up Wall
           UpIndestructableWall upMuur = new UpIndestructableWall();
           addObject(upMuur, getWidth(), downMuur.getY() - downImage.getHeight() -SPACE_BETWEEN_MUREN );
                    
           // Put counter to 0
           counterIndestructableWalls = 0;
           
           
           
        }
    }
    
    private void spawnDestructableWalls()
    
    {
       counterDestructableWalls++;
       if (counterDestructableWalls == 750) {
           DestructableWall destruct = new DestructableWall();
           GreenfootImage destructImage = destruct.getImage();
           
           addObject(destruct, getWidth(), getHeight()/2);
           // Put counter to 0
           counterDestructableWalls = 0;
        }
    }
    
    
    
    
    
    /*    public static gameOver() 
    {
        
    }
    */
}
