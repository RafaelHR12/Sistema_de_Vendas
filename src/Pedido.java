import java.util.Date;

public class Pedido {

	private int qtddItens;
	private int numero;
	private Date data;
	
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
}
