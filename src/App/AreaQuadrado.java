package App;

public class AreaQuadrado {
	Calculadora celular = new Calculadora();
	public double calculaArea() {
		System.out.println("Digite o lado do quadrado:");
		double lado = celular.recebeNumero();
		return celular.multiplicacao(lado, lado);
	}
}
