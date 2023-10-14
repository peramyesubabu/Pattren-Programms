package com.window.based.sorting.applications;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bubble_sorting extends JFrame {

	private JPanel sorting;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bubble_sorting frame = new Bubble_sorting();
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
	public Bubble_sorting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		sorting = new JPanel();
		sorting.setBackground(new Color(0, 128, 0));
		sorting.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(sorting);
		sorting.setLayout(null);
		
		JLabel l1 = new JLabel("Sorting");
		l1.setFont(new Font("Tahoma", Font.BOLD, 19));
		l1.setBounds(170, 20, 70, 23);
		sorting.add(l1);
		
		JLabel l2 = new JLabel("Enter number for sorting:");
		l2.setFont(new Font("Tahoma", Font.BOLD, 18));
		l2.setBounds(0, 81, 238, 22);
		sorting.add(l2);
		
		JLabel lblNumbersAfterSorting = new JLabel("Numbers after sorting:");
		lblNumbersAfterSorting.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumbersAfterSorting.setBounds(21, 140, 214, 22);
		sorting.add(lblNumbersAfterSorting);
		
		 final JTextArea taa = new JTextArea();
		taa.setBounds(242, 81, 184, 24);
		sorting.add(taa);
		
		 final JTextArea tab = new JTextArea();
		tab.setBounds(242, 142, 184, 24);
		sorting.add(tab);
		
		JButton bubblesort = new JButton("BUBBLE SORTING");
		bubblesort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=taa.getText();
				String arr[]=sentence.split(" ");
				String help;
				
				for(int i=0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							help=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=help;
							
						}
					}
				}
				String result="";
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+" ";
				}
				tab.setText(result);
			}
		});
		bubblesort.setFont(new Font("Tahoma", Font.BOLD, 18));
		bubblesort.setBounds(135, 222, 199, 31);
		sorting.add(bubblesort);
	}
}
