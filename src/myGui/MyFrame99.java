package myGui;

import java.awt.*;
import java.awt.event.*;

//AWT ȭ���� �����ϴ� Ŭ����
public class MyFrame99 {
	private Frame fr; // ���� ȭ�� ��ü
	private Label label;
	private Panel panel;

	public MyFrame99() {
		initFrame();
	}

// ���� ȭ�鿡 ���� ����
	private void initFrame() {
		fr = new Frame("The Greatest First GUI");
		fr.setSize(700, 300);
		fr.setLayout(new GridLayout(3, 1));
		fr.setVisible(true);
		// GUI ���α׷� �����̺�Ʈ ó��
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ������ ������ ǥ���ϴ� label ��ü
		label = new Label();
		label.setText("���⿡ �ؽ�Ʈ�ڽ� �־����");
		label.setAlignment(Label.CENTER);
		label.setSize(300, 300);
		// ��ư�� ��� ���� panel ��ü
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		// panel�� label�� frame�� �߰��ϰ� ȭ�鿡 ���̵��� ��
		
		fr.add(panel);
		fr.add(label);
		fr.setVisible(true);
	}

	// ��ư�� �����ϰ� Ŭ�� �̺�Ʈ�� ó���ϴ� �޼ҵ�
	void showButton() {
		Button btnOk = new Button("�¾ƿ�");
		Button btnCancel = new Button("�ƴϿ���");
		// btnOk ��ư�� Ŭ���� ��� label�� ��Ȯ�Ρ� ���� ���
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("�±���!");
			}

		});
		// btnCancel ��ư�� Ŭ���� ��� label�� ����ҡ� ���� ���
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("�ٽ� Ȯ���غ��Կ�");
			}
		});
		// panel ��ü�� 2���� ��ư�� �߰��ϰ� frame�� ���
		panel.add(btnOk);
		panel.add(btnCancel);
		fr.setVisible(true);
	}
}