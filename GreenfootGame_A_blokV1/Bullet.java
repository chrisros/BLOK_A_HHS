import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet attributen worden hier aangemaakt en meegeven
 * 
 * @author (Chris Ros & Aaik Oosters)
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int kapot[] = new int[1000];
    int aantalKapot = 0;  
    
    //colission detectie
    private void wallCollide(){
        //of er een solide muur geraakt word
        if(isTouching(IndestructableWall.class)){
            explode();
            Helicopter.rocketInGame = false;
        } //of er een verwijderbare muur geraakt word 
        else if (isTouching(DestructableWall.class)){
           removeTouching(DestructableWall.class);
           explode();
           kapot[aantalKapot] = 1;
           aantalKapot++;
           Helicopter.rocketInGame = false;
        }//of er een bewegende muur geraakt word
        else if(isTouching(MovingWall.class)){
           removeTouching(MovingWall.class);
           explode();
           kapot[aantalKapot] = 1;
           aantalKapot++;
           Helicopter.rocketInGame = false;
        }//of de rand geraakt word 
        else if(isAtEdge()){
            getWorld().removeObject(this);
            Helicopter.rocketInGame = false;
        }
    }
   
    //explodeer animatie aanroepen
    private void explode(){
        World world = getWorld();
        world.addObject(new Explosion(), getX(), getY());
        world.removeObject(this); // remove rocket from world
        Greenfoot.playSound("explosion.wav");
    }

    
    public void act() 
    {
       wallCollide();
       move(20);    
    }   
}

