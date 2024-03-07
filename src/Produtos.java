
public class Produtos {

	private String nome;
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
	
	public boolean setNome( String nome ) {
		if ( nome.length() >= 5 ) {
			this.nome = nome;
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}
}
