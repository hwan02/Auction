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

public class SignupView extends JFrame {
	JLabel id_Lb;                    //아이디 라벨
	JLabel Password_Lb;              //비번 라벨
	JLabel passwordCheck_Lb;         //비번확인 라벨
	JLabel name_Lb;                  //이름 라벨
	JLabel jumin_Lb;                 //주민번호 라벨
	JLabel juminHyphen_Lb;           //주민번호 하아픈 라벨
	JLabel tel_Lb;                   //전화번호 라벨
	JLabel telHyphen_Lb;             //전화번호 하이픈 라벨
	JLabel telHyphen2_Lb;            //전화번호 하이픈 라벨
	JLabel addr_Lb;                  //주소 라벨
	JLabel genre_Lb;                 //장르 라벨
	
	JButton doublecheck_bt;          //중복확인 버튼
	JButton addr_bt;                 //주소검색 버튼
	JButton sinup_bt;                //가입 버튼
	JButton cancel_bt;               //취소 버튼
	
	JPasswordField password_pf;      //비번 * 표시
	JPasswordField passwordCheck_pf; //비번확인 * 표시
	JPasswordField jumin_pf;         //주민번호 뒷자리 * 표시

	JTextField id_tf;                //아이디 작성
	JTextField name_tf;              //이름 작성  
	JTextField tel_tf_01;            //전화전호 앞 자리 
	JTextField tel_tf_02;            //전화번호 중간 자리
	JTextField tel_tf_03;            //전화전호 뒷 자리
	JTextField addr_tf;              //주소검색 후 우편번호 자동으로 나오는곳
	JTextField jumin_tf;             //주민번호 앞자리 작성
	
	JTextArea addr_ta;               //주소검색 후 주소 자동으로 나오는곳
	JComboBox genre_cb;              //장르 선택
	

	
	public SignupView() {
		setTitle("회원가입");
		
		id_Lb = new JLabel("아이디");
		Password_Lb = new JLabel("비밀번호 ");
		passwordCheck_Lb = new JLabel("비밀번호 확인");
		name_Lb = new JLabel("이름");
		jumin_Lb = new JLabel("주민번호");
		juminHyphen_Lb = new JLabel("ㅡ");
		tel_Lb = new JLabel("전화번호");		
		telHyphen_Lb = new JLabel("-");
		telHyphen2_Lb = new JLabel("-");
		addr_Lb = new JLabel("주소");
		genre_Lb = new JLabel("장르");				
		
		doublecheck_bt = new JButton("중복확인");
		addr_bt = new JButton("주소검색");
		sinup_bt = new JButton("가입");
		cancel_bt = new JButton("취소");				
		
		password_pf=new JPasswordField();
		passwordCheck_pf=new JPasswordField();
		jumin_pf=new JPasswordField();		
		
		id_tf = new JTextField();
		name_tf = new JTextField();
		tel_tf_01=new JTextField();
		tel_tf_02=new JTextField();
		tel_tf_03=new JTextField();
		jumin_tf=new JTextField();				
		addr_tf=new JTextField();
		
		addr_ta = new JTextArea();	
		genre_cb = new JComboBox();				

		
		id_Lb.setBounds(38, 30, 98, 18);
		Password_Lb.setBounds(38, 63, 98, 18);
		passwordCheck_Lb.setBounds(38, 99, 98, 18);
		name_Lb.setBounds(38, 132, 98, 18);
		jumin_Lb.setBounds(38, 171, 98, 18);
		juminHyphen_Lb.setBounds(204, 165, 25, 18);
		tel_Lb.setBounds(38, 204, 98, 18);
		telHyphen_Lb.setBounds(185, 203, 17, 21);
		telHyphen2_Lb.setBounds(259, 203, 17, 21);
		addr_Lb.setBounds(38, 234, 98, 18);
		genre_Lb.setBounds(38, 347, 57, 18);		
		
		doublecheck_bt.setBounds(269, 26, 105, 27);
		sinup_bt.setBounds(132, 415, 105, 27);
		addr_bt.setBounds(218, 233, 105, 27);
		cancel_bt.setBounds(251, 415, 105, 27);
	
		jumin_pf.setBounds(219, 165, 107, 24);
		password_pf.setBounds(139, 60, 116, 24);
		passwordCheck_pf.setBounds(139, 93, 116, 24);
	
		id_tf.setBounds(139, 27, 116, 24);
		name_tf.setBounds(139, 129, 116, 24);
		tel_tf_01.setBounds(139, 201, 45, 24);
		tel_tf_02.setBounds(198, 201, 57, 24);
		tel_tf_03.setBounds(269, 201, 57, 24);
		jumin_tf.setBounds(139, 165, 63, 24);
		addr_tf.setBounds(139, 234, 63, 24);
		
		genre_cb.setBounds(139, 346, 235, 21);
		addr_ta.setBounds(140, 269, 234, 61);		

		
		id_tf.setFont(new Font("굴림", Font.PLAIN, 15));
		juminHyphen_Lb.setFont(new Font("굴림", Font.BOLD, 15));
		telHyphen_Lb.setFont(new Font("굴림", Font.BOLD, 15));
		telHyphen2_Lb.setFont(new Font("굴림", Font.BOLD, 15));
		

		id_tf.setColumns(10);
		name_tf.setColumns(10);
		jumin_tf.setColumns(10);
		tel_tf_01.setColumns(10);	
		tel_tf_02.setColumns(10);
		tel_tf_03.setColumns(10);
		addr_tf.setColumns(10);
	

		genre_cb.addItem("공포");
		genre_cb.addItem("감성");
		genre_cb.addItem("코믹");

		
		getContentPane().setLayout(null);
		getContentPane().add(id_Lb);
		getContentPane().add(name_Lb);
		getContentPane().add(jumin_Lb);
		getContentPane().add(Password_Lb);
		getContentPane().add(passwordCheck_Lb);
		getContentPane().add(juminHyphen_Lb);
		getContentPane().add(tel_Lb);
		getContentPane().add(telHyphen_Lb);
		getContentPane().add(telHyphen2_Lb);
		getContentPane().add(addr_Lb);
		getContentPane().add(genre_Lb);
		
		
		getContentPane().add(sinup_bt);
		getContentPane().add(cancel_bt);
		getContentPane().add(addr_bt);
		getContentPane().add(doublecheck_bt);
		
		getContentPane().add(id_tf);
		getContentPane().add(name_tf);
		getContentPane().add(jumin_tf);
		getContentPane().add(addr_tf);
		getContentPane().add(tel_tf_01);	
		getContentPane().add(tel_tf_02);
		getContentPane().add(tel_tf_03);

		getContentPane().add(password_pf);
		getContentPane().add(passwordCheck_pf);
		getContentPane().add(jumin_pf);
		getContentPane().add(genre_cb);
		
		getContentPane().add(addr_ta);

		
		setBounds(300, 200, 490, 523);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	public static void main(String[] args) {
		new SignupView();
	}// main End
}// class End
