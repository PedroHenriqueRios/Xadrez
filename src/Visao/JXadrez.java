package Visao;

import javax.swing.JFrame;

import Modelo.Tabuleiro;

public class JXadrez extends JFrame {
	
	public JXadrez() {
		setTitle("Jogo de Xadrez");
		this.add(new JTabuleiro(new Tabuleiro()));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		new JXadrez();
		
		
	}

}
