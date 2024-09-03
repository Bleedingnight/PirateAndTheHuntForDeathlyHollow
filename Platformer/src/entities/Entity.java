package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public abstract class  Entity {
	
	protected float x , y ;
	protected int width , height;//where protected means it can be called from this class to another class
	//only classes that extends Entity will be able to use
	protected Rectangle2D.Float hitbox;
 public Entity(float x , float y , int width , int height) {
	 this.x = x;
	 this.y = y;
	 this.width = width;
	 this.height = height;
 }

 protected void drawHitbox(Graphics pen , int xLvlOffset) {
	 pen.setColor(Color.PINK);
	 pen.drawRect( (int)hitbox.x - xLvlOffset,  (int)hitbox.y,  (int)hitbox.width,  (int)hitbox.height); 
 }
//initializes the hitbox at x and y coordinates and with height and width of the character taken from entitiy constructor
protected void initHitbox( float x , float y , int width , int height) {
	 hitbox = new Rectangle2D.Float(  x ,  y , width , height);
}
//updates the position of the rectangle with respect to the characters positions as it also gets updated as we input from keyboard



//protected void updateHitbox() {
//	hitbox.x = (int) x;
//	hitbox.y = (int) y;
//}
// returns the hitbox everytime its drawn
public Rectangle2D.Float getHitbox() {
	return  hitbox;
}

}
