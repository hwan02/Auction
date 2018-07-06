package com.encore.auction.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Find_idForm extends JPanel{
	private JLabel find_idAlert; 		//아이디 찾기_내용
	private JLabel find_idTime;			//아이디찾기_인증시간
	public JButton find_idConfirm;	//아이디찾기_인증버튼
	public JButton find_idSubmit; 	//아이디 찾기 확인 버튼
	private JTextField find_idName;	//이메일주소찾기_이름 
	private JTextField find_idTel;		//이메일주소찾기_전화번호
	private JTextField find_idNum;	//이메일주소찾기_인증번호
	public Find_idForm() {
		
		find_idAlert = new JLabel("이메일 인증을 통해 아이디를 찾으세요,");
		find_idTime = new JLabel("시간");
		find_idConfirm = new JButton("인증");
		find_idSubmit = new JButton("확인");
		find_idName = new JTextField();
		find_idTel = new JTextField();
		find_idNum = new JTextField();
		
		setLayout(null);
		find_idAlert.setBounds(78, 12, 282, 26);
		find_idTime.setBounds(327, 239, 114, 26);
		find_idConfirm.setBounds(327, 160, 153, 44);
		find_idSubmit.setBounds(181, 309, 130, 44);
		find_idName.setBounds(23, 76, 290, 50);
		find_idTel.setBounds(23, 154, 290, 50);
		find_idNum.setBounds(23, 230, 290, 44);
		
		add(find_idAlert);
		add(find_idTime);
		add(find_idConfirm);
		add(find_idSubmit);
		add(find_idName);
		add(find_idTel);
		add(find_idNum);
		
		setBounds(0, 0, 495, 365);
		setVisible(true);
	}
}
