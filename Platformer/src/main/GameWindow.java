package main;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
public class GameWindow {
	
private JFrame frame;
	
public GameWindow(GamePanel gamepanel)
    {
        frame = new JFrame();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamepanel);
        frame.setResizable(false);// makes the frame still and not resizeable as it changes the ups and downs of the pixel of the game
        frame.pack();//is used to fit the size of the window to its preferred components
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowFocusListener(new WindowFocusListener() {

        
        
			
			@Override
			public void windowLostFocus(WindowEvent e) {
				gamepanel.getGame().windowFocusLost();
				
			}
			
			@Override
			public void windowGainedFocus(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
    }
}
