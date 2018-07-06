package com.encore.auction.control;

import javax.swing.JFrame;

import com.encore.auction.view.AddrSearchView;
import com.encore.auction.view.AddrSearchView2;
import com.encore.auction.view.LoginView;
import com.encore.auction.view.SignupView;



public class Controller extends JFrame {
	LoginView loginView;
	SignupView signupView;
	AddrSearchView addrSearchView;
	AddrSearchView2 addrSearchView2;
	
	public Controller() {
		loginView = new LoginView();
		signupView = new SignupView();
		addrSearchView = new AddrSearchView();
		addrSearchView2 = new AddrSearchView2();
	}
	
	public static void main(String[] args) {
		new Controller();
		}
}
