package Visao;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Modelo.Pe�a;
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
				Pe�a pe�a = this.tabuleiro.getPe�a(i,j);
				
				if(pe�a == null) {
					jCelula = new JCelula(i,j);
				} else {
					jCelula = new JCelula(new JPe�a(pe�a));
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
