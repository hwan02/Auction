package com.encore.auction.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class AuctionDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	Properties pro;
	
	public AuctionDAO() {
		try {
			pro = new Properties();
			pro.load(new FileReader("conn/conn.properties"));
			
			Class.forName(pro.getProperty("driver"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//������
	
	private void connect() {
		try {
			conn = DriverManager.getConnection(pro.getProperty("url"), pro);
			
			System.out.println("DB���� ����!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//connect
	
	private void disconnect() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//disconnect
	
	public int isLoginSuccess(String id, String password) {return 0;}
	//�α��� ���� ����(-1����, 0Ż��  1������ 2�Ǹ��� 3������)
	
	public boolean setJoin(Member m) {return true;}
	//ȸ�� ����
	
	public void setRejoin(String id) {}
	//ȸ��Ż�� öȸ
	
	public String getID(String name, String phone) {return null;}
	//���̵� ã��
	
	public boolean isIDExisting(String id){return true;}
	//���̵� ���翩��
	
	public String getPasswordQuestion(String id){return null;}
	//��й�ȣ �������
	
	public String getPassword(String id, String answer){return null;}
	//��й�ȣ ã��
	
	public void setLeave(String id) {}
	//ȸ��Ż��
	
	public void setSeller(Member m) {}
	//�Ǹ��� ���
	
	public Member getMember(String id) {return null;}
	//ȸ���������
	
	public boolean setMember(Member m) {return true;}
	//ȸ����������
	
	//public ArrayList<Stuff> getStuffList(String tableType, String pageNum, String orderType) {return null;}
	//��ǰ��������Ʈ���(tableType 0 : ���� 1: ���� 2: ����, �������� 10��, orderType 0: ��¥�ø����� 1:��¥��������)
	
	public ArrayList<String[]> getNoticeList(String pageNum) {return null;}
	//�Խ��Ǿ��(pageNum 1 : 0~10������ pageNum 2: 11~20������ ...1�������� �������� ������, �ֽż�����, �ø������Ϻκи�)
	
	public String getNoticeText(int no){return null;}
	//�۹�ȣ�� �ش��ϴ� ��� ���� ���
	
	public boolean setNotice(String[] noticeContent) {return true;}
	//�Խñ� �ø���
	
	//public ArrayList<Buy> getPurchasedList(String id) {return null;}
	//������ ��ǰ ����Ʈ
	
	//public ArrayList<Stuff> getBasketList(String id) {return null;}
	//��ٱ��� ��ǰ ����Ʈ
	public ArrayList<Member> getSubscribeList(String id) {return null;}
	//���� ����Ʈ
	
	//public ArrayList<Alarm> getAlarmList(String id) {return null;}
	//�˸� ����Ʈ
	
	public boolean setReport(String id) {return false;}
	//�Ű�
	
	//public void setRegStuff(Stuff s) {}
	//�ǸŹ�ǰ���
	
	//public int getExpectedPrice(Stuff s){return 1;}
	//���� �Ǹűݾ� �޾ƺ���--> ��ǰ������ �Ǹŵ� ��ձݾ�
	
	public boolean setCancelAuction(int AuctionNum) {return false;}
	//�Ǹ����
	
	//public Stuff getStuff(int AuctionNum) {return null;}
	//��ǰ���� ���
	
	//public boolean setStuff(Stuff s){return false;}
	//��ǰ���� ����
	
	public int getBalance() {return 0;}
	//�� ���ͱ�(����) ���
	
	//public ArrayList<Stuff> getNowStuffList(Date d, String pageNum) {return null;}
	//������� ��ǰ�Ǹ���Ʈ���(Date���ķ�, pageNum( 1 -> 1~9��, 2-> 10~18�� ...) �ֽż� ����
	
	//public ArrayList<Member> getBlackList(String pageNum) {return null;}
	//������Ʈ ���
	
	public boolean setBuy(int AuctionNum) {return true;}
	//��ǰ ����
	
	public boolean setAdjustGrade(String id, String grade) {return true;}
	//��� ����

	
	public static void main(String[] args) {
		AuctionDAO dao = new AuctionDAO();
		dao.connect();
		dao.disconnect();
	}
	
}
