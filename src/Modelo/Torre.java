package Modelo;

public class Torre extends Peça {
	
	

	public Torre(EnumCor cor, int linha, int coluna) {
		super(cor, linha, coluna, "C:\figs\torrebranco.png");
		}
	
	public Torre(EnumCor cor, int linha, int coluna, String imagem) {
		super(cor, linha, coluna, imagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaMovimento(int linhaDestino, int colunaDestino) {
		// TODO Auto-generated method stub
		return true;
	}

}
