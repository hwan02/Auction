package com.encore.auction.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Find_passForm extends JPanel{
	private JLabel find_passAlert; 		//비밀번호 찾기_아이디안내
	private JLabel find_passMethod; 	//비밀번호 찾기_방법안내
	private JTextField find_passName;	//비밀번호 찾기_아이디입력 
	public JButton find_passIdConfirm;//비밀번호 찾기_아이디확인
	public JButton find_passTel;			//비밀번호 찾기_
	public JButton find_passEmail;		//비밀번호 찾기_인증버튼
	public Find_passForm() {
		find_passAlert = new JLabel("비밀번호 찾기 할 아이디를 입력해주세요.");
		find_passMethod = new JLabel("비밀번호 찾기 할 방법을 선택해주세요..");
		find_passName = new JTextField();
		find_passIdConfirm = new JButton("확인");
		find_passTel = new JButton("휴대폰 본인 인증");
		find_passEmail = new JButton("메일 인증");
		
		setLayout(null);
		find_passAlert.setBounds(304, 193, 114, 26);
		find_passMethod.setBounds(304, 193, 114, 26);
		find_passName.setBounds(161, 244, 153, 44);
		find_passIdConfirm.setBounds(304, 116, 130, 44);
		find_passTel.setBounds(0, 50, 290, 50);
		find_passEmail.setBounds(0, 113, 290, 50);
		
		add(find_passAlert);
		add(find_passMethod);
		add(find_passName);
		add(find_passIdConfirm);
		add(find_passTel);
		add(find_passEmail);
		
		setBounds(0, 0, 450, 50);
		setVisible(true);
	}
}
