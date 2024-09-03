package levels;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;
import utilz.LoadSave;

public class LevelManager {
	private Game game;
	private BufferedImage[] levelSprite;
	private Level levelOne;
	private Level levelTwo;
	public LevelManager(Game game) {
		
		this.game = game;
		//levelSprite = LoadSave.GetSpriteAtLas(LoadSave.LEVEL_ATLAS);//this code is calling a specifc picture from a specific place from a specfic method ye code basically getsprites method se level sprite ko bula raha hai or usko phir use kerraha hai push kerne ke liye lOADSAVE MAI PHIRSE TAAKI AAGE VO PRINT HO PAYE
		importOutsideSprites();
		levelOne = new Level(LoadSave.GetLevelData());
	
	}
	
	public void importOutsideSprites() {
		BufferedImage img = LoadSave.GetSpriteAtLas(LoadSave.LEVEL_ATLAS);
		levelSprite = new BufferedImage[48];
		for(int j = 0 ; j < 4 ; j++)
			for(int i = 0 ; i < 12 ; i++) {
				int index = j * 12 + i;
				levelSprite[index] = img.getSubimage(i * 32, j * 32, 32, 32);
			}
				
	}
	
	public void draw(Graphics pen , int xLvlOffset) {
		for(int j = 0 ; j < Game.TILES_IN_HEIGHT ; j++)
			for(int i = 0 ; i < levelOne.getLevelData()[0].length ; i++) {
		
				int index = levelOne.getSpriteIndex(i,j);
				pen.drawImage(levelSprite[index] , Game.TILES_SIZE*i - xLvlOffset , Game.TILES_SIZE*j, Game.TILES_SIZE , Game.TILES_SIZE , null);
		
			}
	}
	
	public void update() {
		
	}
	
	public Level getCurrentLevel() {
		return levelOne;
	}

}
