package shootinggame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class ShootingFrame extends JFrame {
	public ShootingPanel panel;
	
	public ShootingFrame() {
		
		panel = new ShootingPanel();
		
		this.add(panel);
		
		this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                Shooting.loop = true;
            }
        });
		
		//ウインドウの✕を押した時の設定
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//タイトル表示
		this.setTitle("shooting");
		//画面の縦横設定
		this.setSize(500, 500);
		//画面を中央に設定
		this.setLocationRelativeTo(null);
		//リサイズを不能に
		this.setResizable(false);
		//画面の表示。非表示の設定。
		this.setVisible(true);
	}
}
