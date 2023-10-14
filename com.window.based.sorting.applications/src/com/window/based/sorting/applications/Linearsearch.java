package com.window.based.sorting.applications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Linearsearch extends JFrame {
	

	private JPanel Linearsearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Linearsearch frame = new Linearsearch();
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
	public Linearsearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Linearsearch = new JPanel();
		Linearsearch.setBackground(new Color(128, 255, 0));
		Linearsearch.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Linearsearch);
		Linearsearch.setLayout(null);
		
		JLabel l1 = new JLabel("Linearsearch");
		l1.setFont(new Font("Tahoma", Font.BOLD, 20));
		l1.setBounds(163, 21, 130, 25);
		Linearsearch.add(l1);
		
		JLabel l2 = new JLabel("Enter numbers");
		l2.setFont(new Font("Tahoma", Font.BOLD, 18));
		l2.setBounds(32, 80, 138, 22);
		Linearsearch.add(l2);
		
		JLabel l3 = new JLabel("Enter key to search");
		l3.setFont(new Font("Tahoma", Font.BOLD, 18));
		l3.setBounds(0, 133, 181, 22);
		Linearsearch.add(l3);
		
		JLabel l4 = new JLabel("Result");
		l4.setFont(new Font("Tahoma", Font.BOLD, 18));
		l4.setBounds(115, 181, 60, 22);
		Linearsearch.add(l4);
		
		JButton b1 = new JButton("Linearsearch");
		b1.addActionListener(new ActionListener() {
			
			private JLabel ta1;
			private JLabel ta3;
			private JLabel ta2;

			public void actionPerformed(ActionEvent e) 
			{
				
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				 
				String key=ta2.getText();
				String result="Key found at:";
				for(int i=0;i<=arr.length-1;i++)
				{
					if(Integer.valueOf(arr[i])==Integer.valueOf(key))
					{
						result=result+i;
						ta3.setText(result);
						return;
						
					}
				}
				String result1="Key not found";
				ta3.setText(result1);
				
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(163, 232, 153, 31);
		Linearsearch.add(b1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(195, 82, 219, 22);
		Linearsearch.add(ta1);
		
		JTextArea ta2 = new JTextArea();
		ta2.setBounds(195, 135, 219, 22);
		Linearsearch.add(ta2);
		
		JTextArea ta3 = new JTextArea();
		ta3.setBounds(195, 183, 219, 22);
		Linearsearch.add(ta3);
	}
}
