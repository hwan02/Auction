package com.encore.auction.control;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Controller extends JFrame{
	Socket socket;
	ObjectOutputStream out;
	ObjectInputStream in;
	String serverAddress = "192.168.0.30";
	int serverPortNum = 5001;
	
	public Controller() {
		
		try {
			socket = new Socket("localhost", serverPortNum);
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());

			System.out.println("Ω√¿€");
			while(true) {
			Vector<ImageIcon> v = (Vector<ImageIcon>) in.readObject();
			ImageIcon i  = v.get(0);
			
			
			this.add(new JLabel(i));
			this.setSize(300, 300);
			this.setVisible(true);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
