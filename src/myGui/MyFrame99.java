package myGui;

import java.awt.*;
import java.awt.event.*;

//AWT 화면을 구성하는 클래스
public class MyFrame99 {
	private Frame fr; // 메인 화면 객체
	private Label label;
	private Panel panel;

	public MyFrame99() {
		initFrame();
	}

// 메인 화면에 대한 설정
	private void initFrame() {
		fr = new Frame("The Greatest First GUI");
		fr.setSize(700, 300);
		fr.setLayout(new GridLayout(3, 1));
		fr.setVisible(true);
		// GUI 프로그램 종료이벤트 처리
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 간단한 구문을 표현하는 label 객체
		label = new Label();
		label.setText("여기에 텍스트박스 넣어야지");
		label.setAlignment(Label.CENTER);
		label.setSize(300, 300);
		// 버튼을 담고 있을 panel 객체
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		// panel과 label을 frame에 추가하고 화면에 보이도록 함
		
		fr.add(panel);
		fr.add(label);
		fr.setVisible(true);
	}

	// 버튼을 생성하고 클릭 이벤트를 처리하는 메소드
	void showButton() {
		Button btnOk = new Button("맞아요");
		Button btnCancel = new Button("아니에요");
		// btnOk 버튼을 클릭할 경우 label에 “확인” 문구 출력
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("맞군요!");
			}

		});
		// btnCancel 버튼을 클릭할 경우 label에 “취소” 문구 출력
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("다시 확인해볼게요");
			}
		});
		// panel 객체에 2개의 버튼을 추가하고 frame에 출력
		panel.add(btnOk);
		panel.add(btnCancel);
		fr.setVisible(true);
	}
}