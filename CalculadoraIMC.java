public class CalculadoraIMC{
	
	private double peso;
	private double altura;
	private int idade;
	private String sexo;
	private double imc;

	public String calcularImc(double peso, double altura, int idade, String sexo){
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.sexo = sexo;
		
		double imc = peso / (altura * altura);

	}
}
