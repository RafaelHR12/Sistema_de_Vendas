
public class Pessoa {

	private String nome;
	private String CPF;
	private String RG;
	
	private Endereco endereco;
	
	public void setEndereco(Endereco endereco) {
		//Associa um endereco a uma pessoa
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	// nome
	
		public boolean setNome( String nome ) {
			if ( nome.length() >= 2 ) {
				this.nome = nome;
				return true;
			}
			return false;
		}
		
		public String getNome() {
			return this.nome;
		}
		
		// CPF
		
			public boolean setCPF( String CPF ) {
				if ( CPF.length() == 11 && CPF.matches(".*[0-9].*") ) {
					this.CPF = CPF;
					return true;
				}
				return false;
			}
			
			public String getCPF() {
				return this.CPF;
			}
			
			// RG
			
				public boolean setRG( String RG ) {
					if ( RG.length() == 7 && RG.matches(".*[0-9].*")) {
						this.RG = RG;
						return true;
					}
					return false;
				}
				
				public String getRG() {
					return this.RG;
				}
}
