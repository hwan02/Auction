package com.encore.auction.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class AddIdPassForm extends JFrame{
	 Find_idForm find_idForm;				//���̵� ã����
	 Find_passForm find_passForm;	//��й�ȣ ã����
	 JTabbedPane jtab;
	public AddIdPassForm() {
		setTitle("���̵�/��й�ȣ ã��");
		find_idForm = new Find_idForm();
		find_passForm = new Find_passForm();
		jtab = new JTabbedPane();
		
		jtab.addTab("���̵� ã��", find_idForm);
		jtab.addTab("��й�ȣ ã��", find_passForm);
		
		add(jtab);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
}
