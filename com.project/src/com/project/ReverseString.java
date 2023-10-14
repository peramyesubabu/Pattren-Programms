package com.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ReverseString extends JFrame {

	private JPanel ReverseString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseString frame = new ReverseString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReverseString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ReverseString = new JPanel();
		ReverseString.setBackground(new Color(128, 128, 255));
		ReverseString.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ReverseString);
		ReverseString.setLayout(null);
		
		JLabel lable1 = new JLabel("Reverse String");
		lable1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lable1.setBounds(145, 10, 148, 25);
		ReverseString.add(lable1);
		
		JLabel lable3 = new JLabel("Reverse String");
		lable3.setForeground(new Color(255, 0, 0));
		lable3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lable3.setBounds(21, 228, 148, 25);
		ReverseString.add(lable3);
		
		JLabel lable2 = new JLabel("Entere a String");
		lable2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lable2.setBounds(21, 84, 150, 25);
		ReverseString.add(lable2);
		
		JButton button1 = new JButton("Reverse String");
		button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button1.setHorizontalAlignment(SwingConstants.RIGHT);
		button1.setBounds(145, 165, 171, 31);
		ReverseString.add(button1);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(196, 78, 230, 31);
		ReverseString.add(textArea1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(196, 228, 230, 31);
		ReverseString.add(textArea_1);
	}
}
