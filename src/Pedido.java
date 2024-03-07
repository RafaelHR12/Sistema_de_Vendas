import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int qtddItens;
	private int numero;
	private Date data;
	
	//Quem fez o pedido
	private Pessoa pessoa;
	
	//Lista de produtos
	private ArrayList<Produtos> produtos;
	
	public void addProduto (Produtos produto) {
		this.produtos.add(produto);
	}
	
	public void removeProduto(int indice) {
		this.produtos.remove(indice);
	}
	
	public Produtos getProduto(int indice) {
		return this.produtos.get(indice);
	}
	
	// qtddItens
	
	public boolean setQtddItens( int qtddItens ) {
		if ( qtddItens > 0 ) {
			this.qtddItens = qtddItens;
			return true;
		}
		return false;
	}
	
	public int getQtddItens() {
		return this.qtddItens;
	}
	
	// numero
	
	public boolean setNumero( int numero ) {
		if ( numero > 0 ) {
			this.numero = numero;
			return true;
		}
		return false;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	// data
	
	public boolean setData( Date data ) {
			if ( data != null ) {
				this.data = data;
				return true;
			}
			return false;
		}
		
	public Date getData() {
			return this.data;
		}
		
	public double getValortotal() {
		double valorTotal = 0;
		
		for(int a=0; a<produtos.size(); a++) {
			valorTotal += getProduto(a).getPreco();
		}
		
		return valorTotal;
	}
}
