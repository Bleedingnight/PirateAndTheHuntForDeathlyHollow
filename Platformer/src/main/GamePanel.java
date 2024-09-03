package main;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import inputs.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;


public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;// we do this cause otherwise we will have to call 2 different mouse inputs as new MouseInputs like this twice and it is not a good practice so instead of calling then twice we make an private object of the mouse inputs and then call it twice which is same object called twice instead of making 2 different objects
	private Game game;
	public GamePanel(Game game) {
	 mouseInputs = new MouseInputs(this);
	 this.game = game;
	 setPanelSize();
	 addKeyListener(new KeyBoardInputs(this));
	 addMouseListener(mouseInputs);
	 addMouseMotionListener(mouseInputs);
		   
 }

	
	private void setPanelSize() {
		Dimension size = new Dimension(Game.GAME_WIDTH , Game.GAME_HEIGHT);
		setPreferredSize(size);
	}
	
	public void updateGame() {
		
	}
	
	
	
 public void paintComponent( Graphics pen) {
	super.paintComponent(pen);//calling JPanel to draw with the pen it also clears the screen again and again to have a clear screen to work on it pen.drawImage(img , x, y, WIDTH, HEIGHT, getFocusCycleRootAncestor()) img here is a subpart of the main image
    game.render(pen);
 		}
 
 public Game getGame() {
	 return game;
 }
			}



























































// VIRIDIAN WOLF
