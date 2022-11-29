package App;

public class CalculaSalario {
	
	Calculadora calculadoraSalario = new Calculadora();
	
	private double reajuste;

	
	public void calculaSalarioFinal() {
		
		System.out.println("Digite o seu salário: ");
		double salario = calculadoraSalario.recebeNumero();
		
			if (salario <= 1000) {
				reajuste = 0.15 * salario;
			}
	     
			else if (salario > 1000 && salario <= 2000) {
				reajuste = 0.10 * salario;
			}
			
			else {
				reajuste = 0.05 * salario;
			}
			
		double salarioFinal = calculadoraSalario.soma(salario,reajuste);
		System.out.println ("Seu salário final é: " +salarioFinal);
	}

}
