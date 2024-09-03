package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gamestates.Gamestate;
import main.GamePanel;
import static utilz.Constants.Directions.*;

public class KeyBoardInputs implements KeyListener{
	
	private  GamePanel gamepanel;

	public KeyBoardInputs(GamePanel gamepanel) {
		this.gamepanel = gamepanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	switch(Gamestate.state) {
	case MENU:
		gamepanel.getGame().getMenu().keyReleased(e);
		break;
	case PLAYING:
		gamepanel.getGame().getPlaying().keyReleased(e);
		break;
	default:
		break;
	
	}
	
	}
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(Gamestate.state) {
		case MENU:
			gamepanel.getGame().getMenu().keyPressed(e);
			break;
		case PLAYING:
			gamepanel.getGame().getPlaying().keyPressed(e);
			break;
		default:
			break;
		
		}
		
		}
		
	}


