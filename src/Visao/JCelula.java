package Visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class JCelula extends JLabel{
	
	private int linha, coluna;
	
	private JPe�a jPe�a;

	public JCelula(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		
	}
	
	public JCelula(JPe�a jPe�a) {
		this.jPe�a = jPe�a;
		this.linha = jPe�a.getPe�a().getLinha();
		this.coluna = jPe�a.getPe�a().getColuna();
		this.add(jPe�a);
		jPe�a.setOpaque(true);
		jPe�a.setText("PE�A");
		
		
		
		if((jPe�a.getPe�a() != null) && jPe�a.getPe�a().isSelecionada()) {
			
			this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
			
		}
	}

}
