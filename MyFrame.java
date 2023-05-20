
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	Image image;
	Graphics graphics;
	Box player;
	Box enemy;
	boolean gameOver;
	
	MyFrame(){
		
		player = new Box(100, 300, 50, 50, Color.blue);
		enemy = new Box(500, 300, 50, 50, Color.red);
		gameOver = false;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		//this.addKeyListener(new AL());
		
	}
	
	public void paint(Graphics g) {
		image = createImage(this.getWidth(), this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);
		
		player.draw(g);
		enemy.draw(g);
	}
	
	public class AL extends KeyAdapter {
		
	}
	
}
	
	
