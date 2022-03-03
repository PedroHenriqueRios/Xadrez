package Modelo;

public class Tabuleiro {
	
	private Pe�a[][] pe�as;
	private Pe�a pe�aSelecionada = null;
	private EnumCor vez = EnumCor.BRANCO;
	
	public static final int TEMPO_JOGADA = 10000;
	
	public Tabuleiro() {
		this.pe�as = new Pe�a[8][8];
		Torre torreBranca1 = new Torre(EnumCor.BRANCO,0,0);
		Torre torreBranca2 = new Torre(EnumCor.PRETO,0,7);
		this.adicionaPe�a(torreBranca1);
		this.adicionaPe�a(torreBranca2);
		Torre torrePreta1 = new Torre(EnumCor.BRANCO,7,0);
		Torre torrePreta2 = new Torre(EnumCor.PRETO,7,7);
	}
	
	public Pe�a getPe�a(int linha, int coluna) {
		return this.pe�as[linha][coluna];
	}
	
	public void adicionaPe�a(Pe�a pe�a) {
		this.pe�as[pe�a.getLinha()][pe�a.getColuna()] = pe�a;
		pe�a.setTabuleiro(this);
	}
	
	public void selecionaPe�a(Pe�a pe�a) {
		if(pe�a.isSelecionada()) {
			pe�a.setSelecionada(false);
			this.pe�aSelecionada = null;
		} else {
			pe�a.setSelecionada(true);
			this.pe�aSelecionada = pe�a;
		}
	}
	
	public void movePe�a(Pe�a pe�a, int novaLinha, int novaColuna) {
		
	}
	
	public void inverteVez() {
		if(this.vez.equals(EnumCor.BRANCO)) {
			this.vez = EnumCor.PRETO;
		} else {
			
		}this.vez = EnumCor.BRANCO;
	}

}
