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
	
	public Pedido() {
        this.produtos = new ArrayList<>();
    }
	
	public void addProduto (Produtos produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(int indice) {
		this.produtos.remove(indice);
	}
	
	public void imprimirProdutos() {
        System.out.println("Produtos no pedido:");
        for (Produtos produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
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
	
	public Date setData( Date data ) {
			if ( data != null ) {
				this.data = data;
			}
			return this.data = data;
		}
		
	public Date getData() {
			return this.data;
		}
		
}
