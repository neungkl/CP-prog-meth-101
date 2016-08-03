import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class GameScreen extends JComponent {
	
	private GameState gameState;
	
	private BufferedImage boardImg;
	private BufferedImage XImg;
	private BufferedImage OImg;
	
	public GameScreen() {
		gameState = new GameState();
		
		try {
			boardImg = ImageIO.read(GameScreen.class.getClassLoader().getResourceAsStream("assets/board.png"));
			XImg = ImageIO.read(GameScreen.class.getClassLoader().getResourceAsStream("assets/x.png"));
			OImg = ImageIO.read(GameScreen.class.getClassLoader().getResourceAsStream("assets/o.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		gameState.update();
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, 600, 600);
		
		g2d.drawImage(boardImg, 0, 0, 550, 550, null);
		
		int size = 175;
		
		int[][] board = gameState.getBoard();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j] != BoardControl.BLANK) {
					g2d.drawImage(
						board[i][j] == BoardControl.X_CHIP ? XImg : OImg, 
						10 + j*size, 
						10 + i*size, 
						size, 
						size, 
						null
					);
				}
			}
		}
	}
}
