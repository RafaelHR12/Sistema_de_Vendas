
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
			if (this.nome == null)
				return "Nome Inválido";
			else 
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
				return this.CPF.substring(0,3) + "." + this.CPF.substring(3, 6) + "." + this.CPF.substring(6, 9) + "-" + this.CPF.substring(9, 11);
			}
			
			// RG
			
				public boolean setRG( String RG ) {
					if ( (RG.length() == 7 || RG.length() == 9) && RG.matches(".*[0-9].*")) {
						this.RG = RG;
						return true;
					}
					return false;
				}
				
				public String getRG() {
					if ( RG.length() == 7) {
						return this.RG.substring(0, 1) + "." + this.RG.substring(1, 4) + "." + this.RG.substring(4, 7);
					}
					if ( RG.length() == 9) {
						return this.RG.substring(0, 2) + "." + this.RG.substring(2, 5) + "." + this.RG.substring(5, 8) + "-" + this.RG.substring(8);
					}
					return this.RG;
				}
}
