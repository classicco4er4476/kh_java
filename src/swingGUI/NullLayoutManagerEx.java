package swingGUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutManagerEx extends JFrame {
	public NullLayoutManagerEx() {
		setTitle("��ġ������ ���� �����̳� ����");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // ��ġ ������ ����
		JLabel label = new JLabel("��ġ������ ���� �����̳�");
		label.setLocation(150, 50); // �����̳� ��ġ ����
		label.setSize(200, 20); // �����̳� ũ�� ����
		for (int i = 1; i <= 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBounds(i * 10, i * 10, 50, 20); // �����̳��� ũ��� ��ġ�� �ѹ��� ����
			add(b);
		}
		add(label);
		setVisible(true);
	}
}
