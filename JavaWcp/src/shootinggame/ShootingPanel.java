package shootinggame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ShootingPanel extends JPanel {
	public BufferedImage image; 
	
	public ShootingPanel() {
		super();
		this.image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	}
	@Override
	public void paint(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		super.paint(g);
		g.drawImage(image, 0, 0, this);
	}
	
	public void draw() {
		this.repaint();
	}

}
