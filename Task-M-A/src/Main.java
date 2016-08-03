import java.awt.Dimension;

import javax.swing.JFrame;

public class Main { 
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		GameScreen gameScreen = new GameScreen();

		frame.setPreferredSize(new Dimension(600, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(gameScreen);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("XO Game");

		while (true) {
			try {
				Thread.sleep((int) (1000f / 60));
			} catch (InterruptedException e) {
			}
			
			gameScreen.repaint();
			
			gameScreen.requestFocus();
		}
	}
}
