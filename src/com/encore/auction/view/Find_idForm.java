package com.encore.auction.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Find_idForm extends JPanel{
	private JLabel find_idAlert; 		//���̵� ã��_����
	private JLabel find_idTime;			//���̵�ã��_�����ð�
	public JButton find_idConfirm;	//���̵�ã��_������ư
	public JButton find_idSubmit; 	//���̵� ã�� Ȯ�� ��ư
	private JTextField find_idName;	//�̸����ּ�ã��_�̸� 
	private JTextField find_idTel;		//�̸����ּ�ã��_��ȭ��ȣ
	private JTextField find_idNum;	//�̸����ּ�ã��_������ȣ
	public Find_idForm() {
		
		find_idAlert = new JLabel("�̸��� ������ ���� ���̵� ã������,");
		find_idTime = new JLabel("�ð�");
		find_idConfirm = new JButton("����");
		find_idSubmit = new JButton("Ȯ��");
		find_idName = new JTextField();
		find_idTel = new JTextField();
		find_idNum = new JTextField();
		
		setLayout(null);
		find_idAlert.setBounds(304, 193, 114, 26);
		find_idTime.setBounds(304, 193, 114, 26);
		find_idConfirm.setBounds(161, 244, 153, 44);
		find_idSubmit.setBounds(304, 116, 130, 44);
		find_idName.setBounds(0, 50, 290, 50);
		find_idTel.setBounds(0, 113, 290, 50);
		find_idNum.setBounds(0, 184, 290, 44);
		
		add(find_idAlert);
		add(find_idTime);
		add(find_idConfirm);
		add(find_idSubmit);
		add(find_idName);
		add(find_idTel);
		add(find_idNum);
		
		setBounds(0, 0, 450, 50);
		setVisible(true);
	}
}
