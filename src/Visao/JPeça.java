package Visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


import Modelo.Peça;

public class JPeça extends JLabel{

	private Peça peça;
	
	public JPeça(Peça peça) {
	this.peça = peça;
	this.setIcon(new ImageIcon(peça.getImagem()));
		
	}
	


	public Peça getPeça() {
		return this.peça;
	}

}
