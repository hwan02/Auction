package com.encore.auction.control;

import javax.swing.JFrame;

import com.encore.auction.view.AddIdPassForm;
import com.encore.auction.view.MainView;

public class Controller extends JFrame {
	MainView mainView; 
	AddIdPassForm addIdPass;				//아이디, 비밀번호 찾기폼
	 
	public Controller() {
		mainView = new MainView();
		addIdPass = new AddIdPassForm();
		
	}
	public static void main(String[] args) {
		new Controller();
		
		
	}
}
