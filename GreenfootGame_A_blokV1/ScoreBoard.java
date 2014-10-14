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
    public ScoreBoard() {
        GreenfootImage scoreImage = new GreenfootImage(100,50);
        setImage(scoreImage);             
        
    }
    
    public void setScore(int score) {
        GreenfootImage scoreImage = getImage();
        scoreImage.clear();
        
        Color c = new Color(0, 0, 0, 127);
        Font f = new Font("Comic Sans MS", Font.PLAIN, 32);
        scoreImage.setFont(f);
        
        scoreImage.setColor(c);
        scoreImage.fill();
        scoreImage.setColor(Color.white);
        scoreImage.drawString("" + score, 100, 100);
        setImage(scoreImage);
    }  
}
