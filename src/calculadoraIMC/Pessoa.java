package calculadoraIMC;

public class Pessoa {

	private String nome;
	private double massa;
	private double altura;
	private double imc;

	public Pessoa(String nome, double massa, double altura) {
		this.nome = nome;
		this.massa = massa;
		this.altura = altura;
	}
	
	public void calculaimc () {
		this.imc = this.massa / (this.altura * this.altura);
	}
	
	public String retornaCategoriaDePeso() {
		if (this.imc <17) {
			return "Muito abaixo do peso!";
		}
		if (this.imc <18.5) {
			return "Abaixo do peso!";
		}
		if (this.imc <25) {
			return "Peso ideal!";
		}
		if (this.imc <30) {
			return "Sobrepeso!";
		}
		if (this.imc < 35) {
			return "Obesidade!";
		}
		if (this.imc < 40) {
			return "Obesidade Severa!";
		}
		return "Obesidade Mórbida!";
		
			
	}
	public String getNome() {
		return this.nome;
	}

	public double getMassa() {
		return this.massa;
	}

	public double getAltura() {
		return this.altura;
	}

	public double getImc() {
		return this.imc;
	}

}
