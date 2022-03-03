package Visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class JCelula extends JLabel{
	
	private int linha, coluna;
	
	private JPeça jPeça;

	public JCelula(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		
	}
	
	public JCelula(JPeça jPeça) {
		this.jPeça = jPeça;
		this.linha = jPeça.getPeça().getLinha();
		this.coluna = jPeça.getPeça().getColuna();
		this.add(jPeça);
		jPeça.setOpaque(true);
		jPeça.setText("PEÇA");
		
		
		
		if((jPeça.getPeça() != null) && jPeça.getPeça().isSelecionada()) {
			
			this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
			
		}
	}

}
