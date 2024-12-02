package control;

public class CalcularIMC{
	
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
		
		imc = peso / (altura * altura);

	}
  
public String getSexo(){
	return this.sexo;
}	
public int getIdade(){
	return this.idade;
}

if(idade = 2)
	menino2(idade);
	menina2(idade);
if(idade = 4)
	menino4(idade);
	menina4(idade);
if(idade = 6)
	menino6(idade);
	menina6(idade);
if(idade = 8)
	menino8(idade);
	menina8(idade);
if(idade = 10)
	menino10(idade);
	menina10(idade);
if(idade = 12)
	menino12(idade);
	menina12(idade);

if(sexo.equals("F"))
	feminino(sexo);
if(sexo.equals == ("M"))
	masculino(sexo);
public void masculino(String sexo){
	this.sexo = sexo;
}

public void feminino(String sexo){
	this.sexo = sexo;
}

public void menino2(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 14,7)
		System.out.printf("Baixo peso");
	if(imc >= 14,7 && imc < 18,25)
		System.out.printf("Peso normal");
	if(imc >= 18,25 && imc =< 19,25)
		System.out.printf("Sobrepeso");
	if(imc > 19,25)
		System.out.printf("Obesidade");
}
public void menino4(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 14)
		System.out.printf("Baixo peso");
	if(imc >= 14 && imc < 16,85)
		System.out.printf("Peso normal");
	if(imc >= 16,85 && imc =< 17,85)
		System.out.printf("Sobrepeso");
	if(imc > 17,85)
		System.out.printf("Obesidade");
}
public void menino6(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 13,6)
		System.out.printf("Baixo peso");
	if(imc >= 13,6 && imc < 15)
		System.out.printf("Peso normal");
	if(imc >= 15 && imc =< )
		System.out.printf("Sobrepeso");
	if(imc > 18,45)
		System.out.printf("Obesidade");
}
public void menino8(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 13,6)
		System.out.printf("Baixo peso");
	if(imc >= 13,6 && imc < 17,75)
		System.out.printf("Peso normal");
	if(imc >= 17,75 && imc =< 20)
		System.out.printf("Sobrepeso");
	if(imc > 20)
		System.out.printf("Obesidade");
}
public void menino10(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 14,25)
		System.out.printf("Baixo peso");
	if(imc >= 14,25 && imc < 19,35)
		System.out.printf("Peso normal");
	if(imc >= 19,35 && imc =< 22)
		System.out.printf("Sobrepeso");
	if(imc > 22)
		System.out.printf("Obesidade");
}
public void menino12(String sexo, int idade, double imc){
	masculino(sexo);
	if(imc < 14,5)
		System.out.printf("Baixo peso");
	if(imc >= 14,5 && imc < 21)
		System.out.printf("Peso normal");
	if(imc >= 21 && imc =< 24)
		System.out.printf("Sobrepeso");
	if(imc > 24)
		System.out.printf("Obesidade");

public void menina2(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 14,5)
		System.out.printf("Baixo peso");
	if(imc >= 14,5 && imc < 18)
		System.out.printf("Peso normal");
	if(imc >= 18 && imc =< 19)
		System.out.printf("Sobrepeso");
	if(imc > 19)
		System.out.printf("Obesidade");
}
public void menina4(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 14,7)
		System.out.printf("Baixo peso");
	if(imc >= 14,7 && imc < 16,85)
		System.out.printf("Peso normal");
	if(imc >= 16,85 && imc =< 18)
		System.out.printf("Sobrepeso");
	if(imc > 18)
		System.out.printf("Obesidade");

public void menina6(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 13,5)
		System.out.printf("Baixo peso");
	if(imc >= 13,5 && imc < 17)
		System.out.printf("Peso normal");
	if(imc >= 17 && imc =< 18,85)
		System.out.printf("Sobrepeso");
	if(imc > 18,85)
		System.out.printf("Obesidade");
}
public void menina8(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 13,5)
		System.out.printf("Baixo peso");
	if(imc >= 13,5 && imc < 18,25)
		System.out.printf("Peso normal");
	if(imc >= 18,25 && imc =< 20,5)
		System.out.printf("Sobrepeso");
	if(imc > 20,5)
		System.out.printf("Obesidade");
}
public void menina10(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 14)
		System.out.printf("Baixo peso");
	if(imc >= 14 && imc < 20)
		System.out.printf("Peso normal");
	if(imc >= 20 && imc =< 23)
		System.out.printf("Sobrepeso");
	if(imc > 23)
		System.out.printf("Obesidade");
}
public void menina12(String sexo, int idade, double imc){
	feminino(sexo);
	if(imc < 14,75)
		System.out.printf("Baixo peso");
	if(imc >= 14,75 && imc < 21,5)
		System.out.printf("Peso normal");
	if(imc >= 21,5&& imc =< 25)
		System.out.printf("Sobrepeso");
	if(imc > 25)
		System.out.printf("Obesidade");



if(imc < 16)
	System.out.printf("Baixo peso muito grave");
if(imc >= 16 && imc =< 16,99)
	System.out.printf("Baixo peso grave");
if(imc >= 17 && imc =< 18,49)
	System.out.printf("Baixo peso");
if(imc >= 18,5 && imc =< 24,99)
	System.out.printf("Peso normal");
if(imc >= 25 && imc =< 29,99)
	System.out.printf("Sobrepeso");
if(imc >= 30 && imc =< 34,99)
	System.out.printf("Obesidade grau I");
if(imc >= 35 && imc =< 39,99)
	System.out.printf("Obesidade grau II");
if(imc > 40)
	System.out.printf("Obesidade grau III");
}
}



