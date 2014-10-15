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
    boolean start = false;
    int WallCounter;
    int HeliCounter;
    int SPACE_BETWEEN_MUREN = 200;
    int FIRST_WALL = 737;
    int score = 0;
    ScoreBoard scoreBoard = null;
       
    private void playMusic()
    {
        if(!isPlaying)
        {
            //Greenfoot.playSound("darude.wav");
            isPlaying = true;
        }
    }
  
    public Sky()
    {         
       super(1200, 600, 1, false); 
<<<<<<< HEAD
      

        addObject( new Helicopter(), 400, 300 );
        addObject( new BackgroundScroller(), 10, 300 );
        addObject ( scoreBoard, 100, 100);
                
               
        setPaintOrder(GameOver.class, ScoreBoard.class, Explosion.class,IndestructableWall.class, DestructableWall.class,Helicopter.class,Bullet.class,MovingWall.class,BackgroundScroller.class);

               
    }
    
    public ScoreBoard getCounter()
    
    {
        return scoreBoard;
        
    }
   public void addSpeed()
   {
       if (timerSpeed % 2500 == 0)
       {
           Wall.speed++;
       }
   }
=======
        
        addObject( new Start(), 600, 300);
        addObject( new Helicopter(), 400, 300 );
        addObject( new BackgroundScroller(), 10, 300 );
        
        scoreBoard = new ScoreBoard();
        scoreBoard.setScore(0);
        
        addObject(scoreBoard, 100, 100);
        
        setPaintOrder
        (
        GameOver.class,
        Start.class,
        ScoreBoard.class, 
        Explosion.class,
        IndestructableWall.class, 
        DestructableWall.class,
        Helicopter.class,
        Bullet.class,
        MovingWall.class,
        BackgroundScroller.class
        );
               
    }
>>>>>>> origin/master
   
    public void act()
    {

            WallCounter++;
            playMusic();                
            
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
                    scoreBoard.setScore(score);
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
      
    
    
}
