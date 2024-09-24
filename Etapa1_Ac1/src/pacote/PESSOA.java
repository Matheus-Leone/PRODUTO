package pacote;
import java.time.LocalDate; //IMPORT de duas ferramentas, uma para calcular a data
import java.time.format.DateTimeFormatter;//E a outra para termos a formatação DD/MM/AAAA

 	//Criando os Atributos para a Classe pública PESSOA
	public class PESSOA {
		private String Nome;
		private LocalDate dataNascimento;
		private double Altura;
		private String Email;
	
	//Setando a Ordem de apresentação de Atributos e colocando eles para serem organizados e utilizados em outras classes
	public PESSOA (String nome, LocalDate dataNascimento, double altura) throws IllegalArgumentException {
		this.Nome = nome;
		this.Altura = altura;
		
	//Configurando o LocalDate para receber 	
	LocalDate DataHoje = LocalDate.now();
		
	/*Esse IF serve para barrar a execução do programa caso a pessoa tente colocar uma data de nascimento mentirosa tipo 08/08/2150, 
	pois o progra sabe que dia é hoje por conta do LocalDate*/
	if (dataNascimento.isAfter(DataHoje)) {
		throw new IllegalArgumentException("Essa pessoa não existe.");
		
	}
		//o This é para puxar a informação do Public PESSOA (onde foi configurado o nome que cada dado vai receber) 
		this.dataNascimento = dataNascimento;
		this.Email = emailPessoa(nome);
	}
	
	//Utilizar o Private para fins de segurança. Além de configurar a formatação do Email, dividindo o nome em 2 e colocando o @email no final
	private String emailPessoa(String nome) {
		String[] parteNome = nome.split(" ");
		String nome1 = parteNome[0].toLowerCase();
		String sobrenome = parteNome[parteNome.length - 1].toLowerCase();
		return nome1 + "." + sobrenome + "@email.com";
			
		}
	
	//Get para puxar os dados e enviá-los quando forem requisitados
	public String getnome() {
		return Nome;
	}
	
	public double getAltura() {
		return Altura;
	}
	
	public LocalDate getdataNascimento() {
		return dataNascimento;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public String descricao() {
		
	//Formatação da Data de Nascimento
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	
	//Formatação de Como Todas as informações Anteriores serão dispostas no Terminal(Output)
	return
		"Nome: " + getnome() + "\n" +
		"Altura: " + getAltura() + "\n" +
		"Data de Nascimento: " + getdataNascimento().format(formatter) + "\n" +
		"Email: " + getEmail();
		
		
	}
	

	
	
	
	
	
	

}
