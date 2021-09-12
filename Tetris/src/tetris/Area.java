package tetris;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Area extends JPanel{
	
	public Area() {
		
	}
	
	
	protected void rectangle(Graphics g) {
		g.fillRect(0, 0, 50, 50);
	}
}
