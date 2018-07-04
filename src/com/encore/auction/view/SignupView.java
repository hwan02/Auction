package com.encore.auction.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.List;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JComboBox;

public class SignupView extends JFrame{
	private JTextField textField;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	public SignupView() {
		setTitle("회원가입");
		
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("아이디");
		lblId.setBounds(38, 30, 98, 18);
		getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 15));
		textField.setBounds(139, 27, 116, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.setBounds(269, 26, 105, 27);
		getContentPane().add(btnNewButton);
		
		JLabel lblPassword = new JLabel("비밀번호 ");
		lblPassword.setBounds(38, 63, 98, 18);
		getContentPane().add(lblPassword);
		
		JLabel label_1 = new JLabel("비밀번호 확인");
		label_1.setBounds(38, 99, 98, 18);
		getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 129, 116, 24);
		getContentPane().add(textField_3);
		
		JLabel label_2 = new JLabel("이름");
		label_2.setBounds(38, 132, 98, 18);
		getContentPane().add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 60, 116, 24);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(139, 93, 116, 24);
		getContentPane().add(passwordField_1);
		
		JLabel label = new JLabel("주민번호");
		label.setBounds(38, 171, 98, 18);
		getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 165, 116, 24);
		getContentPane().add(textField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(284, 165, 116, 24);
		getContentPane().add(passwordField_2);
		
		JLabel label_3 = new JLabel("ㅡ");
		label_3.setFont(new Font("굴림", Font.BOLD, 15));
		label_3.setBounds(259, 168, 25, 18);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("전화번호");
		label_4.setBounds(38, 204, 98, 18);
		getContentPane().add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 201, 45, 24);
		getContentPane().add(textField_2);
		
		JLabel label_5 = new JLabel("-");
		label_5.setFont(new Font("굴림", Font.BOLD, 15));
		label_5.setBounds(185, 203, 17, 21);
		getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(198, 201, 57, 24);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(269, 201, 57, 24);
		getContentPane().add(textField_5);
		
		JLabel label_6 = new JLabel("-");
		label_6.setFont(new Font("굴림", Font.BOLD, 15));
		label_6.setBounds(259, 203, 17, 21);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("주소");
		label_7.setBounds(38, 234, 98, 18);
		getContentPane().add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(132, 234, 268, 92);
		getContentPane().add(textArea);
		
		JLabel label_8 = new JLabel("장르");
		label_8.setBounds(38, 347, 98, 18);
		getContentPane().add(label_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("공포");
		comboBox.addItem("감성");
		comboBox.addItem("코믹");
		comboBox.setBounds(132, 344, 268, 21);
		getContentPane().add(comboBox);
		
		JButton button = new JButton("가입");
		button.setBounds(132, 415, 105, 27);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("취소");
		button_1.setBounds(251, 415, 105, 27);
		getContentPane().add(button_1);
		
		
		setBounds(300,200,490,523);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		new SignupView();

	}//main End
}//class End
