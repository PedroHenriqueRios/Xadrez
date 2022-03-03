package Modelo;

public class Rainha extends Peça {

	public Rainha(EnumCor cor, int linha, int coluna, String imagem) {
		super(cor, linha, coluna, imagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validaMovimento(int linhaDestino, int colunaDestino) {
		// TODO Auto-generated method stub
		return true;
	}

}
