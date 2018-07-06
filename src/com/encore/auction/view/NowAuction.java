package com.encore.auction.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class NowAuction extends JPanel{
	Picture p1;
	Picture p2;
	Picture p3;
	Picture p4;
	Picture p5;
	Picture p6;
	Picture p7;
	Picture p8;
	Picture p9;
	JButton bt_prev;
	JButton bt_next;
	
public NowAuction() {
		setBackground(Color.CYAN);
		p1 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_landscape.jpg");
		p2 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_stillLife.jpg");
		p3 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_figure.jpg");
		p4 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_holy.jpg");
		p5 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_history.jpg");
		p5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		p5.setBackground(Color.LIGHT_GRAY);
		p6 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_oil.jpg");
		p7 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_figure2.jpg");
		p8 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_figure3.jpg");
		p9 = new Picture("C:\\Users\\Playdata\\Pictures\\picture_oil2.jpg");
		bt_prev = new JButton("이전");
		bt_next = new JButton("다음");
		p1.setBounds(163, 12, 263, 255);
		p2.setBounds(490, 12, 263, 255);
		p3.setBounds(829, 12, 263, 255);
		p4.setBounds(163, 279, 263, 255);
		p5.setBounds(490, 279, 263, 255);
		p6.setBounds(829, 279, 263, 255);
		p7.setBounds(163, 546, 263, 255);
		p8.setBounds(490, 546, 263, 255);
		p9.setBounds(829, 546, 263, 255);
		bt_prev.setBounds(44,392,87,97);
		bt_next.setBounds(1128,392,87,97);
		setLayout(null);
		
		add(p1);
		add(p2);
		add(p3);
		p3.setLayout(null);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		add(bt_prev);
		add(bt_next);
		setSize(1240,800);
		setVisible(true);
	}
}
