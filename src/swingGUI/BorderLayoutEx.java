package swingGUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BorderLayoutEx extends JFrame {
	// ��ư ����
	JButton btnAdd = new JButton("Add");
	JButton btnSub = new JButton("Sub");
	JButton btnMul = new JButton("Mul");
	JButton btnDiv = new JButton("Div");
	JButton btnCalc = new JButton("Calculate");

	public BorderLayoutEx() {
		setTitle("BorderLayout ����");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // ��ġ ������ ����
// ��ư �߰�
		add(btnSub, "East");
		add(btnAdd, "West");
		add(btnDiv, "South");
		add(btnMul, "North");
		add(btnCalc, "Center");
		setVisible(true);
	}
}