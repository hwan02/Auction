package com.encore.auction.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Find_passForm extends JPanel{
	private JLabel find_passAlert; 		//��й�ȣ ã��_���̵�ȳ�
	private JLabel find_passMethod; 	//��й�ȣ ã��_����ȳ�
	private JTextField find_passName;	//��й�ȣ ã��_���̵��Է� 
	public JButton find_passIdConfirm;//��й�ȣ ã��_���̵�Ȯ��
	public JButton find_passTel;			//��й�ȣ ã��_
	public JButton find_passEmail;		//��й�ȣ ã��_������ư
	public Find_passForm() {
		find_passAlert = new JLabel("��й�ȣ ã�� �� ���̵� �Է����ּ���.");
		find_passMethod = new JLabel("��й�ȣ ã�� �� ����� �������ּ���..");
		find_passName = new JTextField();
		find_passIdConfirm = new JButton("Ȯ��");
		find_passTel = new JButton("�޴��� ���� ����");
		find_passEmail = new JButton("���� ����");
		
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
