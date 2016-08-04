import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class GameScreen extends JComponent {
	
	private BufferedImage OImg;
	private Circle circle;
	private ArrayList<Enemy> enemys;
	
	private int counter;
	
	public GameScreen() {
		try {
			OImg = ImageIO.read(GameScreen.class.getClassLoader().getResourceAsStream("assets/o.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					circle.moveLeft();
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					circle.moveRight();
				}
			}
		});
		
		circle = new Circle();
		counter = 0;
		enemys = new ArrayList<Enemy>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.RED);
		
		circle.update();
		g2d.fillOval(circle.getX(), 600 - 140, 100, 100);
		
		if(counter > 55) {
			enemys.add(new Enemy());
			counter = 0;
		} else {
			counter++;
		}
		
		for(int i=0; i<enemys.size(); i++) {
			g2d.setColor(Color.BLUE);
			
			g2d.fillOval(
				enemys.get(i).getX(),
				enemys.get(i).getY(),
				50,
				50
			);
			
			enemys.get(i).update();
		}
	}
}
