import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{
    private int counterIndestructableWalls;
    private int counterDestructableWalls;
    int SPACE_BETWEEN_MUREN = 200;
       
    
  
    public Sky()
    {         
       super(1200, 600, 1, false); 
       //Greenfoot.playSound("darude.wav");
        addObject( new Helicopter(), 400, 300 );
        addObject( new MovingWall(), 100, 100);
        setPaintOrder(IndestructableWall.class, DestructableWall.class);
               
    }
   
    public void act()
    {
        spawnIndestructableWalls();
        spawnDestructableWalls();
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
