    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameworld extends World
{
    boolean isPlaying = false;
    boolean start = false;
    int WallCounter;
    int HeliCounter;
    int SPACE_BETWEEN_MUREN = 200;
    int FIRST_WALL = 737;
    
    public int timerSpeed = 0;
    ScoreBoard scoreBoard = new ScoreBoard();
       
    private void playMusic()
    {
        if(!isPlaying)
        {
            //Greenfoot.playSound("darude.wav");
            isPlaying = true;
        }
    }
  
    public Gameworld()
    {         
       super(1200, 600, 1, false);
        addObject( new Helicopter(), 400, 300 );
        addObject( new BackgroundScroller(), 4678, 300 );
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
   
    public void act()
    {
            timerSpeed++;
            WallCounter++;
            addSpeed();
            playMusic();                
            
            if (WallCounter % 250 == 0 && WallCounter % 1000 != 0 )
            { 
                spawnIndestructableWalls();
            } 
            if (WallCounter % 1000 == 0) 
            {     
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
                    scoreBoard.addScore();
                }
                HeliCounter++;
            }     
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
