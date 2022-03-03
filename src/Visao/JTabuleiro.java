package Visao;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Modelo.Peça;
import Modelo.Tabuleiro;

public class JTabuleiro extends JPanel{
	
	private Tabuleiro tabuleiro;
	
	public JTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		this.desenhaTabuleiro();
	}

	public void desenhaTabuleiro() {
		this.removeAll();
		this.setLayout(new GridLayout(8,8));
		
		for(int i = 0 ; i < 8; i++) {
			for(int j = 0 ; j < 8; j++) {
				JCelula jCelula;
				Peça peça = this.tabuleiro.getPeça(i,j);
				
				if(peça == null) {
					jCelula = new JCelula(i,j);
				} else {
					jCelula = new JCelula(new JPeça(peça));
				}
				if((i + j) % 2 == 0) {
					
					jCelula.setBackground(Color.WHITE);
					jCelula.setOpaque(true);
				} else {
					
					jCelula.setBackground(Color.BLACK);
					jCelula.setOpaque(true);
				}
				
				this.add(jCelula);
			}
		}
		
		this.revalidate();
	}

}
