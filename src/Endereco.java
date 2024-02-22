
public class Endereco {

	private String rua;
	private String complemento;
	private String bairro;
	private String CEP;
	private int numero;
	private String x;
	
	public void atualizarEndereco() {
		
	}
	
	// rua
	
		public boolean setRua( String rua ) {
			if ( rua.length() >= 10 ) {
				this.rua = rua;
				return true;
			}
			return false;
		}
		
		public String getRua() {
			return this.rua;
		}
		
		// complemento
		
			public boolean setComplemento( String complemento ) {
				this.complemento = complemento;
				return true;
			}
			
			public String getComplemento() {
				return this.complemento;
			}
	
			
			// bairro
			
			public boolean setBairro( String bairro ) {
				if ( rua.length() >= 10 ) {
					this.bairro = bairro;
					return true;
				}
				return false;
			}
			
			public String getBairro() {
				return this.bairro;
			}
			
			
			// CEP
			
			public boolean setCEP( String CEP ) {
				if ( CEP.length() == 8 && CEP.matches(".*[0-9].*") ) {
					this.CEP = CEP;
					return true;
				}
				return false;
			}
			
			public String getCEP() {
				return this.CEP;
			}
			
			// numero
			
			public boolean setNumero( int numero ) {
				if ( numero > 0  ) {
					this.numero = numero;
					return true;
				}
				return false;
			}
			
			public int getNumero() {
				return this.numero;
			}
			
}
