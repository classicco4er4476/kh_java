package swingGUI;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
// ��ư ����
	JButton b1 = new JButton("��ư1");
	JButton b2 = new JButton("��ư2");
	JButton b3 = new JButton("��ư3");
	JButton b4 = new JButton("��ư4");
	JButton b5 = new JButton("��ư5");

	public GridLayoutEx() {
		setTitle("GridLayout ����");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 2)); // 3�� 2�� GridLayout ����
//��ư �߰�
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setVisible(true);
	}
}