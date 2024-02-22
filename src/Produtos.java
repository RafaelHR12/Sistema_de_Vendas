
public class Produtos {

	private String descricao;
	private double preco;
	
	// Preço
	public boolean setPreco( double preco ) {
		if ( preco > 0 ) {
			this.preco = preco;
			return true;
		}
		return false;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	// Descrição
	
	public boolean setDescricao( String descricao ) {
		if ( descricao.length() >= 5 ) {
			this.descricao = descricao;
			return true;
		}
		return false;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
