package calculadoraIMC;
import java.util.Scanner;

public class TestaCalculoIMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); 
		
		String nome;
		double altura;
		double massa;
		
		System.out.println("Vamos calcular seu IMC!");
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.println(" Digite seu peso: ");
		massa = scanner.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		altura = scanner.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome, massa, altura);
		pessoa.calculaimc();
		
		System.out.println(" Olá " + pessoa.getNome());
		System.out.println(" O seu imc "  + pessoa.getImc());
		System.out.println(" Sua categoria de peso é  "  + pessoa.retornaCategoriaDePeso());
	}

}
