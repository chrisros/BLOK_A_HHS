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
    //controle of muur geraakt word 
    private void wallCollide(){
        if(isTouching(IndestructableWall.class)){
            explode();
            Helicopter.rocketInGame = false;
        } else if (isTouching(DestructableWall.class)){
           removeTouching(DestructableWall.class);
           explode();
           kapot[aantalKapot] = 1;
           aantalKapot++;
           Helicopter.rocketInGame = false;
        }else if(isTouching(MovingWall.class)){
           removeTouching(MovingWall.class);
           explode();
           kapot[aantalKapot] = 1;
           aantalKapot++;
           Helicopter.rocketInGame = false;
        } else if(isAtEdge()){
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

