package Visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


import Modelo.Pe�a;

public class JPe�a extends JLabel{

	private Pe�a pe�a;
	
	public JPe�a(Pe�a pe�a) {
	this.pe�a = pe�a;
	this.setIcon(new ImageIcon(pe�a.getImagem()));
		
	}
	


	public Pe�a getPe�a() {
		return this.pe�a;
	}

}
