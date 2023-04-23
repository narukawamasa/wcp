package shootinggame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ShootingPanel extends JPanel {
	public BufferedImage gra; 
	
	public ShootingPanel() {
		super();
	}
	@Override
	public void paint(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		super.paint(g);
		g.drawImage(gra, 0, 0, this);
	}
	
	public void draw() {
		this.repaint();
	}

}
