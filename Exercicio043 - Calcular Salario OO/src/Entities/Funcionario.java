package Entities;
import Domain.Principal; 

public class Funcionario {
	public float salarioLiquido(float salarioBruto, float taxaTotal) {
		float salarioLiquido = salarioBruto - taxaTotal;
		return salarioLiquido;
	}
	
	

}
