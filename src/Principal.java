import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Clas Produto
		Produtos prod = new Produtos();
		
		System.out.println("Informe os dados dos produtos");
		
		System.out.println("Informe o preço do produto: ");
		prod.setPreco(sc.nextDouble());
		
		System.out.println("Preço: "+prod.getPreco());
		
		System.out.println("Informe o Nome do produto: ");
		sc.nextLine();
		prod.setNome(sc.nextLine());
		
		System.out.println("Nome: "+prod.getNome());
		
		// Class Pessoa
		Pessoa pes = new Pessoa();
		
		System.out.println("Informe os dados da pessoa");
		
		System.out.println("Informe o seu Nome: ");
		pes.setNome(sc.nextLine());
		
		System.out.println("Nome: "+pes.getNome());
		
		System.out.println("Informe o seu CPF: ");
		pes.setCPF(sc.nextLine());
		
		System.out.println("CPF: "+pes.getCPF());
		
		System.out.println("Informe o seu RG: ");
		pes.setRG(sc.nextLine());
		
		System.out.println("RG: "+pes.getRG());
		
		
		// Class Pedido
		Pedido ped = new Pedido();
		
		System.out.println("Informe os dados do pedido");
		
		System.out.println("Informe a quantidade de itens: ");
		ped.setQtddItens(sc.nextInt());
		
		System.out.println("Quantidade de itens: "+ped.getQtddItens());
		
		System.out.println("Informe o Número do item: ");
		ped.setNumero(sc.nextInt());
		
		System.out.println("Número: "+ped.getNumero());
		
		//Adicionar produtos
		ped.addProduto(prod);
		
		sc.nextLine();
		
		System.out.println(" Informe a data (EX.:dd/mm/yyyy): ");
		String dataStr = sc.nextLine();
		int dia = Integer.parseInt(dataStr.substring(0, 2));
		int mes = Integer.parseInt(dataStr.substring(3, 5))-1;
		int ano = Integer.parseInt(dataStr.substring(6, 10));
		
		Date data = new Date((ano-1900), mes, dia);
		
		System.out.println(ped.setData(data));
		
		// Class Endereco
		Endereco end = new Endereco();
		
		System.out.println("Informe os dados do endereço");
		
		System.out.println("Informe o nome da Rua: ");
		sc.nextLine();
		end.setRua(sc.nextLine());
		
		System.out.println("Rua: "+end.getRua());
		
		System.out.println("Informe o Complemento: ");
		end.setComplemento(sc.nextLine());
		
		System.out.println("Complemento: "+end.getComplemento());
		
		System.out.println("Informe o nome do Bairro: ");
		end.setBairro(sc.nextLine());
		
		System.out.println("Bairro: "+end.getBairro());
		
		System.out.println("Informe o CEP: ");
		end.setCEP(sc.nextLine());
		
		System.out.println("CEP: "+end.getCEP());
		
		System.out.println("Informe o Número da casa/ap.: ");
		end.setNumero(sc.nextInt());
		
		System.out.println("Número casa: "+end.getNumero());
		
		
		pes.setEndereco(end);
		
        // .getRua() é um dado Específico dentro de endereço
		System.out.println("Endereço do(a) " + pes.getNome() +": "+pes.getEndereco());
		
		 ped.imprimirProdutos();
	}

}
