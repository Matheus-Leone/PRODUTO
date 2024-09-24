package pacote;

	//Criação da Classe Produto com alguns atributos privados a fim de segurança
	public class PRODUTO {
		//Atributos da Classe Produto
		private String Nome;
		private String Marca;
		private double Preco_Custo;
		private double Preco_Venda;
		private int qtd_Vendas;
		private double Lucro;
	
	//Setando a Ordem de apresentação de Atributos e colocando eles para serem organizados e utilizados em outras classes
	public PRODUTO(String nome, String marca, double Preco_Custo, double Preco_Venda, int qtd_Vendas, double Lucro) {
		this.Nome = nome;
		this.Marca = marca;
		this.Preco_Custo = Preco_Custo;
		this.Preco_Venda = Preco_Venda;
		this.qtd_Vendas = qtd_Vendas;
		this.Lucro = (Preco_Custo - Preco_Venda)*qtd_Vendas ;
		
	}
 
	//Formatação de como Todas as informações Anteriores serão dispostas no Terminal(Output)
	String Calculo_Lucro() {
		return
				"Nome " + this.Nome + "\n" +
				"Marca " + this.Marca + "\n" +
				"Preço de Custo " + this.Preco_Custo + "\n" +
				"Preço de Venda " + this.Preco_Venda + "\n" +
				"Quantidade de Vendas " + this.qtd_Vendas + "\n" +
				"Lucro " + this.Lucro + "\n";
		}
	
}
