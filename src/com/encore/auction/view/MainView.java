package com.encore.auction.view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
public class MainView extends JFrame{
	private JTextField main_searchBar;
	public JButton main_state;		// �α��� ���� ��ư
	public JButton main_alarm;		// �˶� ��ư
	public JButton main_mypage; // ���������� ��ư
	public JButton main_logout;	// �α׾ƿ� ��ư
	public JButton main_search;	// �˻� ��ư(�̸�Ƽ��)
	public JButton main_seller;		// �Ǹ��� ����ϱ� ��ư
	public JButton main_type1;		// �з�1 
	public JButton main_type2;		// �з�2
	public JButton main_type3;		// �з�3
	public JButton main_type4;		// �з�4
	public JButton main_type5;		// �з�5
	public JButton main_type6;		// �з�6
	public JButton main_newPro; // �űԵ�ϼ� ��ư
	public JButton main_lastpro;	// �����ӹڼ� ��ư
	private JLabel main_point;	// �˻� �ؽ�Ʈ �� �ΰ�
	public NowAuction nowA;		// ���� ��Ż�ǰ ����Ʈ 
	public PrevAuction prevA;		// ���� ��Ż�ǰ ����Ʈ
	public NextAuction nextA;		//���� ��Ż�ǰ ����Ʈ
	public JTabbedPane main_jtab; // ��
	JPanel panel2;
	JButton bt_1;
	public MainView() {
		setTitle("�׸����");
		bt_1 = new JButton("��ư1");
		nowA = new NowAuction();
		prevA = new PrevAuction();
		nextA = new NextAuction();
		main_searchBar = new JTextField();
		main_state = new JButton("�α��� ID");
		main_alarm = new JButton("�˶�");
		main_mypage = new JButton("����������");
		main_logout = new JButton("�α׾ƿ�");
		main_search = new JButton("�˻�");
		main_seller = new JButton("�Ǹ��� ����ϱ�");
		main_type1 = new JButton("ǳ��ȭ");
		main_type2 = new JButton("����ȭ");
		main_type3 = new JButton("�ι�ȭ");
		main_type4 = new JButton("����ȭ");
		main_type5 = new JButton("����ȭ");
		main_type6 = new JButton("��ȭ");
		main_newPro = new JButton("�űԵ�ϼ�");
		main_lastpro = new JButton("�����ӹڼ�");
		main_point = new JLabel("���");
		main_jtab = new JTabbedPane();
		
		getContentPane().setLayout(null);
		
		main_searchBar.setBounds(263, 61, 180, 39);
		main_state.setBounds(678, 12, 105, 27);
		main_alarm.setBounds(797, 12, 105, 27);
		main_mypage.setBounds(916, 12, 105, 27);
		main_logout.setBounds(1035, 12, 105, 27);
		main_search.setBounds(457, 61, 94, 39);
		main_seller.setBounds(592, 51, 140, 59);
		main_type1.setBounds(195, 121, 140, 59);
		main_type2.setBounds(368, 121, 140, 59);
		main_type3.setBounds(535, 121, 140, 59);
		main_type4.setBounds(707, 121, 140, 59);
		main_type5.setBounds(881, 121, 140, 59);
		main_type6.setBounds(1048, 121, 140, 59);
		main_newPro.setBounds(24, 147, 146, 33);
		main_lastpro.setBounds(24, 107, 146, 33);
		main_point.setBounds(134, 51, 115, 59);
		main_jtab.setBounds(14, 192, 1254, 888);
	
		main_jtab.setFont(new Font("����", Font.PLAIN, 40));
		main_jtab.addTab("���Ű�Ÿ���Ʈ", prevA);
		main_jtab.addTab("�����Ÿ���Ʈ", nowA);
		main_jtab.addTab("������Ÿ���Ʈ", nextA);
		getContentPane().add(main_searchBar);
		getContentPane().add(main_state);
		getContentPane().add(main_alarm);
		getContentPane().add(main_mypage);
		getContentPane().add(main_logout);
		getContentPane().add(main_search);
		getContentPane().add(main_seller);
		getContentPane().add(main_type1);
		getContentPane().add(main_type2);
		getContentPane().add(main_type3);
		getContentPane().add(main_type4);
		getContentPane().add(main_type5);
		getContentPane().add(main_type6);
		getContentPane().add(main_newPro);
		getContentPane().add(main_lastpro);
		getContentPane().add(main_point);
		getContentPane().add(main_jtab);
		
		setSize(1300,1600);
		setVisible(true);
	}
}
