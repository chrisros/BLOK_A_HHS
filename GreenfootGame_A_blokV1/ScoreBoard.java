import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    int score = 0;
    
    public void act()
    
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.BLACK, null));
    }
    
    public void addScore()
    
    {
        score++;
    }
    
}
