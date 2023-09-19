package course15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 
 
public class Pea99 extends JFrame {
 
	Random random = new Random();
 
	void Tintiro() {
 
		setLayout(new BorderLayout());
 
		// CENTER に入る方々
		JComponent dices = new JLabel("さいころの絵");
		JTextArea textArea = new JTextArea();
 
		// CENTER の構築
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1, 2));
		center.add(dices);
		center.add(new JScrollPane(textArea));
		add(BorderLayout.CENTER, center);
 
		// SOUTH に入る方々
		JButton jb1 = new JButton("まわす");
		JButton jb2 = new JButton("りせっと");
 
		// SOUTH の構築
		JPanel south = new JPanel();
		south.setLayout(new GridLayout(1,2));
		south.add(jb1);
		south.add(jb2);
		add(BorderLayout.SOUTH, south);
 
		// "まわす" のアクションリスナー
		jb1.addActionListener(e -> {
 
			// 0-5 の乱数を発生させる
			int n = random.nextInt(6);
 
			// メッセージを構築する
			String text = (n + 1) + " が出ました\n";
 
			// テキストエリアに追加する
			textArea.append(text);
		});
 
		// "りせっと" のアクションリスナー
		jb2.addActionListener(e -> {
 
			textArea.setText("");
		});
 
		setSize(700,500);
	}
 
	public static void main(String[] args) {
 
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationByPlatform(true);
		f.setVisible(true);
	}
}