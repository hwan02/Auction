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
	public JButton main_state;		// 로그인 상태 버튼
	public JButton main_alarm;		// 알람 버튼
	public JButton main_mypage; // 마이페이지 버튼
	public JButton main_logout;	// 로그아웃 버튼
	public JButton main_search;	// 검색 버튼(이모티콘)
	public JButton main_seller;		// 판매자 등록하기 버튼
	public JButton main_type1;		// 분류1 
	public JButton main_type2;		// 분류2
	public JButton main_type3;		// 분류3
	public JButton main_type4;		// 분류4
	public JButton main_type5;		// 분류5
	public JButton main_type6;		// 분류6
	public JButton main_newPro; // 신규등록순 버튼
	public JButton main_lastpro;	// 마감임박순 버튼
	private JLabel main_point;	// 검색 텍스트 옆 로고
	public NowAuction nowA;		// 현재 경매상품 리스트 
	public PrevAuction prevA;		// 과거 경매상품 리스트
	public NextAuction nextA;		//예정 경매상품 리스트
	public JTabbedPane main_jtab; // 탭
	JPanel panel2;
	JButton bt_1;
	public MainView() {
		setTitle("그림경매");
		bt_1 = new JButton("버튼1");
		nowA = new NowAuction();
		prevA = new PrevAuction();
		nextA = new NextAuction();
		main_searchBar = new JTextField();
		main_state = new JButton("로그인 ID");
		main_alarm = new JButton("알람");
		main_mypage = new JButton("마이페이지");
		main_logout = new JButton("로그아웃");
		main_search = new JButton("검색");
		main_seller = new JButton("판매자 등록하기");
		main_type1 = new JButton("풍경화");
		main_type2 = new JButton("정물화");
		main_type3 = new JButton("인물화");
		main_type4 = new JButton("종교화");
		main_type5 = new JButton("역사화");
		main_type6 = new JButton("유화");
		main_newPro = new JButton("신규등록순");
		main_lastpro = new JButton("마감임박순");
		main_point = new JLabel("경매");
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
	
		main_jtab.setFont(new Font("굴림", Font.PLAIN, 40));
		main_jtab.addTab("과거경매리스트", prevA);
		main_jtab.addTab("현재경매리스트", nowA);
		main_jtab.addTab("예정경매리스트", nextA);
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
