package Modelo;


public class Bispo extends Pe�a {

	public Bispo(EnumCor cor, int linha, int coluna, String imagem) {
		super(cor,linha,coluna,imagem);
	}

	@Override
	public boolean validaMovimento(int linhaDestino, int colunaDestino) {
		// TODO Auto-generated method stub
		return true;
	}

}
