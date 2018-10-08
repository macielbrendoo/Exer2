package edu.java.exer2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela {

	public static void main(String[] args) {

		JFrame janela = new JFrame("");
		JLabel lblPhone = new JLabel("Enter your phone number:");
		JTextField txtphone = new JTextField(30);
		JLabel lblName = new JLabel("Enter your name: ");
		JTextField txtname = new JTextField(30);
		JButton btbOk = new JButton("Ok");
		JButton btbCancel = new JButton("Cancel");
		

		JPanel painel = new JPanel();
		painel.add(lblPhone);
		painel.add(txtphone);
		painel.add(lblName);
		painel.add(txtname);
		painel.add(btbOk);
		painel.add(btbCancel);
		
		janela.setContentPane(painel);
		
		janela.setSize(500, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
