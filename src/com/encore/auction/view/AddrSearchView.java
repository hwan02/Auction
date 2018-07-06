package com.encore.auction.view;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class AddrSearchView extends JFrame {
	JTabbedPane tPane;               //주소검색 탭 틀
	
	JPanel streetNameAddr_p;         //도로명 주소 JPanel 
	JPanel addr_p;                   //지번 주소 JPanel
	
	JLabel addr_Lb;                  //지번주소 JLabel
	
	JTextField streetNameAddr_tf;    //도로명 주소 JTextField
	JTextField addr_tf;              //지번주소 JTextField
	
	JTextArea streetNameAddr_ta;     //도로명 주소 JTextArea  
	JTextArea addr_ta;               //지번주소 JTextArea
	JTextArea addr_ta2;              //지번주소 JTextArea

	JButton streetNameAddr_SearchBt; //도로명 주소에서 주소 검색 버튼
	JButton streetNameAddr_ExitBT;   //도로명 주소에서 주소 닫기 버튼
	JButton addr_SearchBt;           //지번주소에서 주소검색 버튼
	JButton addr_ExitBT;             //지번주소에서 닫기 버튼

	public AddrSearchView() {
		setTitle("주소 검색");
		
		tPane = new JTabbedPane();
		addr_Lb = new JLabel("두번째", SwingConstants.CENTER);
		streetNameAddr_p = new JPanel(null);
		addr_p = new JPanel(null);
		streetNameAddr_tf = new JTextField();
		streetNameAddr_SearchBt = new JButton("주소 검색");
		streetNameAddr_ExitBT = new JButton("닫기");
		streetNameAddr_ta = new JTextArea();
		addr_ta = new JTextArea();
		addr_ta2 = new JTextArea();
		addr_tf = new JTextField();
		addr_SearchBt = new JButton("주소 검색");
		addr_ExitBT = new JButton("닫기");
		
		
		addr_ta.setBounds(14, 12, 749, 79);
		streetNameAddr_ta.setBounds(14, 12, 749, 79);
		addr_ta2.setBounds(14, 148, 749, 55);
		streetNameAddr_tf.setBounds(14, 103, 606, 24);
		addr_tf.setBounds(14, 103, 606, 24);
		addr_p.setBounds(293, 139, 129, 27);
		streetNameAddr_SearchBt.setBounds(634, 102, 129, 27);
		addr_SearchBt.setBounds(634, 102, 129, 27);
		addr_ExitBT.setBounds(293, 223, 129, 27);

		streetNameAddr_ta.setFont(new Font("Monospaced", Font.PLAIN, 15));
		addr_ta.setFont(new Font("Monospaced", Font.PLAIN, 15));
		addr_ta2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		streetNameAddr_ta.setText("찾으시려는 도로명주소+건물번호/건물명 혹은 지번주소+번지수/건물명을 입력해주세요. \r\n예) 도로명 : 불정로 432번길 / 지번 : 정자동 178-1, 대치동 현대아파트\r\n* 단, 도로명 혹은 동(읍/면/리)만 검색하시는 경우 정확한 검색결과가 나오지 않을 수 있습니다.");
		addr_ta.setText("찾으시려는 동(읍/면/리)과 번지수or건물명을 정확하게 입력해 주세요.\r\n동(읍/면/리)만 입력하시는 경우 구우편번호(6자리)가 노출될 수 있습니다.\r\n예) 정자동 178-1, 대치2동 현대아파트");
		addr_ta2.setText("2016년 8월 1일부터는 5자리 우편번호 사용이 의무화됩니다.\r\n도로명주소+5자리 우편번호로 등록하셔서 미술경매 이용에 불편함이 없도록 하시길 바랍니다.");
		
		streetNameAddr_tf.setColumns(10);
		addr_tf.setColumns(10);
		
		
		tPane.addTab("도로명 주소", streetNameAddr_p);
		streetNameAddr_p.add(streetNameAddr_ta);
		streetNameAddr_p.add(streetNameAddr_tf);
		streetNameAddr_p.add(streetNameAddr_SearchBt);
		
		streetNameAddr_ExitBT.setBounds(256, 139, 129, 27);
		streetNameAddr_p.add(streetNameAddr_ExitBT);
		
		tPane.addTab("지번 주소", addr_p);
		addr_p.add(addr_Lb);
		addr_p.add(addr_ta);
		addr_p.add(addr_tf);
		addr_p.add(addr_SearchBt);
		addr_p.add(addr_ExitBT);
		addr_p.add(addr_ta2);
		getContentPane().add(tPane);
		setSize(800, 341);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] ar) {
		new AddrSearchView();
	}
}
