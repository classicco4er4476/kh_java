package swingGUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutEx extends JFrame {
	// ��ư ����
	JButton b1 = new JButton("��ư1");
	JButton b2 = new JButton("��ư2");
	JButton b3 = new JButton("��ư3");

	public FlowLayoutEx() {
		setTitle("FlowLayout ����");
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30)); // ��ġ ������ ����
		// ��ư �߰�
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
	}
}