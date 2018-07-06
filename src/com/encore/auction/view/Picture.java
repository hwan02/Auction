package com.encore.auction.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Picture extends JPanel{
	 ImageIcon picture_landscape;
	 JLabel label_landscape;
	 JLabel label_price;
	 JLabel label_bidder;
	 JLabel label_leftTime;
	 public Picture(String path) {

		 picture_landscape = new ImageIcon(path);
		 label_price = new JLabel("현재가");
		 label_bidder = new JLabel("입찰자");
		 label_leftTime = new JLabel("남은시간");
		 label_landscape = new JLabel(picture_landscape);
		 
		 setLayout(null);
		 label_landscape.setBounds(0, 0, 264, 191);
		 label_price.setBounds(26, 204, 42, 18);
		 label_bidder.setBounds(26, 234, 42, 18);
		 label_leftTime.setBounds(154, 234, 56, 18);
		 
		 add(label_landscape);
		 add(label_price);
		 add(label_bidder);
		 add(label_leftTime);
	    setVisible(true);
	 }
}
