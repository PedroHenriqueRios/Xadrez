package Modelo;

public class Tabuleiro {
	
	private Peça[][] peças;
	private Peça peçaSelecionada = null;
	private EnumCor vez = EnumCor.BRANCO;
	
	public static final int TEMPO_JOGADA = 10000;
	
	public Tabuleiro() {
		this.peças = new Peça[8][8];
		Torre torreBranca1 = new Torre(EnumCor.BRANCO,0,0);
		Torre torreBranca2 = new Torre(EnumCor.PRETO,0,7);
		this.adicionaPeça(torreBranca1);
		this.adicionaPeça(torreBranca2);
		Torre torrePreta1 = new Torre(EnumCor.BRANCO,7,0);
		Torre torrePreta2 = new Torre(EnumCor.PRETO,7,7);
	}
	
	public Peça getPeça(int linha, int coluna) {
		return this.peças[linha][coluna];
	}
	
	public void adicionaPeça(Peça peça) {
		this.peças[peça.getLinha()][peça.getColuna()] = peça;
		peça.setTabuleiro(this);
	}
	
	public void selecionaPeça(Peça peça) {
		if(peça.isSelecionada()) {
			peça.setSelecionada(false);
			this.peçaSelecionada = null;
		} else {
			peça.setSelecionada(true);
			this.peçaSelecionada = peça;
		}
	}
	
	public void movePeça(Peça peça, int novaLinha, int novaColuna) {
		
	}
	
	public void inverteVez() {
		if(this.vez.equals(EnumCor.BRANCO)) {
			this.vez = EnumCor.PRETO;
		} else {
			
		}this.vez = EnumCor.BRANCO;
	}

}
