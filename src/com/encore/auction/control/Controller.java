package com.encore.auction.control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Controller extends JFrame{
	Socket socket;
	ObjectOutputStream out;
	ObjectInputStream in;
	String serverAddress = "192.168.0.30";
	int serverPortNum = 5001;
	
	/*  
  	C_MSG(client massage) - 클라이언트로부터의 메시지
	S_MSG(server massage) - 서버로부터의 메시지
	REQ(request) - 응답이 필요한 요청
	REG(register) - 응답이 필요하지 않은 요청
	 */
	static final String C_MSG_REQ_LOGIN = "C_MSG_REQ_LOGIN";
	static final String C_MSG_REQ_ID_CHECK = "C_MSG_REQ_ID_CHECK";
	static final String C_MSG_REQ_JOIN = "C_MSG_REQ_JOIN";
	static final String C_MSG_REQ_CHANGE_INFO = "C_MSG_REQ_CHANGE_INFO";
	static final String C_MSG_REQ_REJOIN = "C_MSG_REQ_REJOIN";
	static final String C_MSG_REQ_PAST_LIST = "C_MSG_REQ_PAST_LIST";
	static final String C_MSG_REQ_PRESENT_LIST = "C_MSG_REQ_PRESENT_LIST";
	static final String C_MSG_REQ_FUTURE_LIST = "C_MSG_REQ_FUTURE_LIST";
	static final String C_MSG_REQ_PURCHASED_LIST = "C_MSG_REQ_PURCHASED_LIST";
	static final String C_MSG_REQ_BLACK_LIST = "C_MSG_REQ_BLACK_LIST";
	static final String C_MSG_REQ_SUBSCRIBE_LIST = "C_MSG_REQ_SUBSCRIBE_LIST";
	static final String C_MSG_REQ_PRODUCT_INFO = "C_MSG_REQ_PRODUCT_INFO";
	static final String C_MSG_REQ_BALANCE_INFO = "C_MSG_REQ_BALANCE_INFO";
	static final String C_MSG_REQ_BUY = "C_MSG_REQ_BUY";
	static final String C_MSG_REQ_WRITE = "C_MSG_REQ_WRITE";
	static final String C_MSG_REQ_WRITE_NOTICE = "C_MSG_REQ_WRITE_NOTICE";
	static final String C_MSG_REQ_EXPECT = "C_MSG_REQ_EXPECT";
	static final String C_MSG_REQ_CANCEL_REG_STUFF = "C_MSG_REQ_CANCEL_REG_STUFF";
	static final String C_MSG_REQ_ENTER_ROOM = "C_MSG_REQ_ENTER_ROOM";
	static final String C_MSG_REG_CHATTING_TEXT = "C_MSG_REG_CHATTING_TEXT";
	static final String C_MSG_REG_KICK = "C_MSG_REG_KICK";
	static final String C_MSG_REG_SUBSCRIBE = "C_MSG_REG_SUBSCRIBE";
	static final String C_MSG_REG_PRODUCT = "C_MSG_REG_PRODUCT";
	static final String C_MSG_REG_LEAVE = "C_MSG_REG_LEAVE";
	static final String C_MSG_REG_SELLER = "C_MSG_REG_SELLER";
	static final String C_MSG_REG_ASKING = "C_MSG_REG_ASKING";
	static final String C_MSG_REG_START_PRICE = "C_MSG_REG_START_PRICE";
	static final String C_MSG_REG_ASKING_UNIT = "C_MSG_REG_ASKING_UNIT";
	static final String C_MSG_REG_AGREE_SELLER = "C_MSG_REG_AGREE_SELLER";
	static final String C_MSG_REG_AGREE_STUFF = "C_MSG_REG_AGREE_STUFF";
	static final String C_MSG_REG_ADJUST_GRADE = "C_MSG_REG_ADJUST_GRADE";
	static final String C_MSG_REG_FREEZE = "C_MSG_REG_FREEZE";
	static final String C_MSG_REG_LEAVE_ROOM = "C_MSG_REG_LEAVE_ROOM";
	static final String S_MSG_RESULT = "S_MSG_RESULT";
	static final String S_MSG_REG_ASKING_UNIT = "S_MSG_REG_ASKING_UNIT";
	static final String S_MSG_REG_CHANGE_ASKING = "S_MSG_REG_CHANGE_ASKING";
	static final String S_MSG_REG_CHATTING_TEXT = "S_MSG_REG_CHATTING_TEXT";
	static final String S_MSG_REG_KICK = "S_MSG_REG_KICK";
	static final String S_MSG_REG_FREEZE = "S_MSG_REG_FREEZE";
	static final String S_MSG_REG_ALARM = "S_MSG_REG_ALARM";
	
	public Controller() {
		connectToServer();
		eventUp();
	}
	
	public void eventUp() {
		//리스너등록
	}
	
	private void connectToServer() {
		try {
			socket = new Socket("localhost", serverPortNum);
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
			new Receiver().start();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void sendMsg(String msg, String type) throws IOException { //해당 클라이언트에게 보내는 메시지
		out.writeObject(type + ":" +msg);
		out.flush();
	}
	
	private String getType(String msg) {
		return msg.split(":")[0];
	}
	
	private String getMsg(String msg) {
		return msg.split(":")[1];
	}
	
	class Receiver extends Thread {
		@Override
		public void run() {
			try {
//				Vector<ImageIcon> v = (Vector<ImageIcon>) in.readObject();
//				ImageIcon i  = v.get(0);
//				Controller.this.add(new JLabel(i));
//				Controller.this.setSize(300, 300);
//				Controller.this.setVisible(true);
				while(true) {
					String msgPack = (String)in.readObject();
					String type = getType(msgPack);
					String msg = getMsg(msgPack);
					
					switch(type) {
						case S_MSG_REG_ASKING_UNIT : break;
						case S_MSG_REG_CHANGE_ASKING : break;
						case S_MSG_REG_CHATTING_TEXT : break;
						case S_MSG_REG_KICK : break;
						case S_MSG_REG_FREEZE : break;
						case S_MSG_REG_ALARM : break;
					}
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Controller();

	}
}
