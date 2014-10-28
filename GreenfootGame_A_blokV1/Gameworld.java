    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameworld here.
 * 
 * @author (Chris Ros & Aaik Oosters) 
 * @version (1.4.1)
 */
public class Gameworld extends World
{
    boolean isPlaying = false;
    boolean start = false;
    int WallCounter;                                // Teller voor de muren
    int HeliCounter;                                // Teller voor punten helicopter
    public int timerSpeed;                          // Teller voor snelheid
    final int SPACE_BETWEEN_MUREN;                  // Afstand tussen Up en Down muur
    final int FIRST_WALL;                           // Afstand na eerste muur
    final int AFSTAND_INDESTRUCTABLEWALL;           // Afstand tussen IndestructableWalls
    final int AFSTAND_DESTRUCTABLEWALL;             // Afstand tussen DestructableWalls
    final int NIEUWE_MOVINGWALL;                    // Afstand tussen MovingWalls
    final int VERHOOG_SNELHEID;                     // Afstand na aantal px snelheid +1  
        
    ScoreBoard scoreBoard = new ScoreBoard();       // Nieuw ScoreBoard toevoegen
       
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
        addObject(scoreBoard, 600, 60);
        
        timerSpeed = 0;                     
        SPACE_BETWEEN_MUREN = 150;            
        FIRST_WALL = 737;                     
        AFSTAND_INDESTRUCTABLEWALL = 250;     
        AFSTAND_DESTRUCTABLEWALL = 750;       
        NIEUWE_MOVINGWALL = 1000;           
        VERHOOG_SNELHEID = 2200; 
        
        
        setPaintOrder
        (
        ScoreBoard.class,
        Gameover.class,
        Start.class,         
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
 
            timerSpeed++; // teller voor wanneer snelheid verhoge
            WallCounter++; // teller voor wanneer muren neerzetten
            addSpeed(); // aanroepen addSpeed
            playMusic();                
                
           
            if (Helicopter.gameOverCheck()==false)
            {
            // Roep IndestructableWall aan
            if (WallCounter % AFSTAND_INDESTRUCTABLEWALL == 0 && WallCounter % NIEUWE_MOVINGWALL != 0 )
            {
                spawnIndestructableWalls();
            } 
            // Roep MovingWall aan
            if (WallCounter % NIEUWE_MOVINGWALL == 0) 
            {     
                 addObject( new MovingWall(), 1200, 600);
            }
            // Roep DestructableWall aan
            if (WallCounter % AFSTAND_DESTRUCTABLEWALL == 0 && WallCounter % NIEUWE_MOVINGWALL != 0)
            {
                    spawnDestructableWalls();
            }
            // Score updaten    
            if (WallCounter >= FIRST_WALL)
            {
                if (HeliCounter % AFSTAND_INDESTRUCTABLEWALL == 0)
                {
                    scoreBoard.addScore();
                }
                HeliCounter++;
            }     
        }
        }
    
    
    public ScoreBoard getCounter()    
    {
        return scoreBoard;        
    } 
    
    public void addSpeed()
    {
        if (timerSpeed % VERHOOG_SNELHEID == 0)
        {
            Wall.speed++;
        }
    }
   
    
    private void spawnIndestructableWalls()
    {
        // Down Wall
        
        // nieuwe muur
        DownIndestructableWall downWall = new DownIndestructableWall();
        // verkrijg de afbeelding
        GreenfootImage downImage = downWall.getImage();
        // voeg object toe aan wereld
        addObject(downWall, getWidth(), getHeight()+ downImage.getHeight()-(Greenfoot.getRandomNumber(400) +300));    
        
        // Up Wall
        
        // nieuwe hoge muur
        UpIndestructableWall upWall = new UpIndestructableWall();
        // voeg object toe aan wereld
        addObject(upWall, getWidth(), downWall.getY() - downImage.getHeight() - SPACE_BETWEEN_MUREN );
           
    }
    
    private void spawnDestructableWalls()  
    {
        // nieuwe DestructableWall
        DestructableWall destructableWall = new DestructableWall();
        // Verkrijg de afbeelding
        GreenfootImage downImage = destructableWall.getImage();
        // Voeg object toe aan wereld           
        addObject(destructableWall, getWidth(), getHeight()/2);
    }    
}
