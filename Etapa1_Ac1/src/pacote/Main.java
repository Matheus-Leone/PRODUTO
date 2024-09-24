package pacote;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Try é utilizado para que mesmo com o erro da data, o programa não pare e mostre a mensagem de "Erro"
		try {
			
			LocalDate dataNascimento = LocalDate.of(2005, 8, 8);
			PESSOA pessoa1 = new PESSOA ("Matheus Leone", dataNascimento, 1.73);
			
			System.out.println(pessoa1.descricao());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

		//Prints de tudo produtos após puxar tudo com o GET e outras informações de PESSOA 
		System.out.println();
		System.out.println();
		
		//Prints de tudo produtos após puxar tudo com o GET e outras informações de PRODUTO
		PRODUTO produto1 = new PRODUTO("Overwatch","Blizzard",200,150,80,0);
		System.out.println(produto1.Calculo_Lucro());
		
	}

}
