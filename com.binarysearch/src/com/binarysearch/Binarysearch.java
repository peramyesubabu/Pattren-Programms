package com.binarysearch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Binarysearch extends JFrame {

	private JPanel bs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Binarysearch frame = new Binarysearch();
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
	public Binarysearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		bs = new JPanel();
		bs.setBackground(new Color(192, 192, 192));
		bs.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bs);
		bs.setLayout(null);
		
		JPanel bs_1 = new JPanel();
		bs_1.setLayout(null);
		bs_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		bs_1.setBackground(Color.LIGHT_GRAY);
		bs_1.setBounds(0, 10, 436, 263);
		bs.add(bs_1);
		
		JLabel l4 = new JLabel("Result");
		l4.setForeground(new Color(255, 0, 0));
		l4.setFont(new Font("Tahoma", Font.BOLD, 18));
		l4.setBounds(137, 160, 60, 22);
		bs_1.add(l4);
		
		JLabel l2 = new JLabel("Enter array elements");
		l2.setForeground(new Color(255, 0, 0));
		l2.setBackground(new Color(240, 240, 240));
		l2.setBounds(10, 64, 197, 22);
		bs_1.add(l2);
		l2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel l3 = new JLabel("Enter key to search");
		l3.setForeground(new Color(255, 0, 0));
		l3.setBounds(26, 108, 181, 22);
		bs_1.add(l3);
		l3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton b1 = new JButton("Binarysearch");
		b1.setForeground(new Color(0, 0, 255));
		b1.addActionListener(new ActionListener() {
			public JLabel ta1;
			public JLabel ta2;
			public JLabel ta3;
			

			public void actionPerformed(ActionEvent e) {
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String key =ta2.getText();
				String result="key found at:";
				int mid;
				int low=0;
				int high=arr.length-1;
				while(low<=high)
				{
					mid=(low+high)/2;
					if(Integer.valueOf(arr[mid])==Integer.valueOf(key))
					{
						result=result+mid;
						ta3.setText(result);
						return;
					}
					else if(Integer.valueOf(key)>Integer.valueOf(arr[mid]))
					{
						low=mid+1;
						high=high;
					}
					else
					{
						low=low;
						high=mid-1;
						
					}
				}
				String result1="key not found";
				ta3.setText(result1);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(156, 222, 155, 31);
		bs_1.add(b1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(238, 66, 188, 25);
		bs_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(238, 110, 188, 25);
		bs_1.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(238, 162, 188, 25);
		bs_1.add(textArea_2);
		
		JLabel l1 = new JLabel("Binarysearch");
		l1.setForeground(new Color(255, 0, 0));
		l1.setBounds(149, 0, 131, 25);
		bs_1.add(l1);
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
	}
}
