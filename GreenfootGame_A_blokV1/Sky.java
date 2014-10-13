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
    int WallCounter;
    int HeliCounter;
    int SPACE_BETWEEN_MUREN = 200;
    int FIRST_WALL = 737;
    int score = 0;
       
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
        //addObject( new MovingWall(), 1200, 600);
        setPaintOrder(Explosion.class,IndestructableWall.class, DestructableWall.class,Helicopter.class,Bullet.class,MovingWall.class,ScoreBoard.class,BackgroundScroller.class);
               
    }
   
    public void act()
    {
        WallCounter++;
        playMusic();
        
        //System.out.println(counter);
        
        if (WallCounter % 250 == 0 && WallCounter % 1000 != 0 )
        { 
            spawnIndestructableWalls();
        } 
        if (WallCounter % 1000 == 0) {
            
            addObject( new MovingWall(), 1200, 600);
        }
        if (WallCounter % 750 == 0 && WallCounter % 1000 != 0)
        {
            spawnDestructableWalls();
        }
        
        if (WallCounter >= FIRST_WALL)
        {
            if (HeliCounter % 250 == 0)
            { 
                score++;
                System.out.println(score);
            }
            HeliCounter++;
            
        }
        
    }
    
    private void spawnIndestructableWalls()
    {
        // Down Wall
        DownIndestructableWall downMuur = new DownIndestructableWall();           
        GreenfootImage downImage = downMuur.getImage();
        addObject(downMuur, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));    
        
        // Up Wall
        UpIndestructableWall upMuur = new UpIndestructableWall();
        addObject(upMuur, getWidth(), downMuur.getY() - downImage.getHeight() -SPACE_BETWEEN_MUREN );
           
    }
    
    private void spawnDestructableWalls()
    
    {
        DestructableWall destruct = new DestructableWall();
        GreenfootImage destructImage = destruct.getImage();
           
        addObject(destruct, getWidth(), getHeight()/2);
    }
      
    
    /*    public static gameOver() 
    {
        
    }
    */
}
