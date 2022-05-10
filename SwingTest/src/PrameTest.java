import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrameTest {

	public static void main(String[] args) {
		
		System.out.print(5);
		
		JFrame frame;
		frame = new JFrame();
		frame.setBounds(200, 100, 400, 500);
		frame.setTitle("Zoom 클라우드 회의");
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel label = new JLabel();
		Color color = new Color(234,188,12);
		label.setForeground(color);
		label.setFont(new Font("궁서체", Font.ITALIC,20));
		label.setText("안녕하세요");
		label.setBounds(50,50,100,20);
		frame.add(label);
		
		JLabel label2 = new JLabel();
		label2.setForeground(Color.GREEN);
		label2.setText("감사합니다");
		label2.setBounds(300,300,100,20);
		frame.add(label2);
		
		JButton button = new JButton("누르세요");
		button.setBounds(200,400,100,50);
		frame.add(button);
	}

}
