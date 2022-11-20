import java.util.ArrayList;

public class CalculaMateriais {
    
    Calculadora calculadora = new Calculadora();
    
    //Coeficientes são as quantidades dos materiais por m² conforme a ordem da lista materiais.
    
    //Materiais para parede de alvenaria:
    private String[] materiais = {"Tijolo","Cimento","Areia Média","Cal"};
    private double[] coeficientes = {25,0.0436,0.015,0.109};
    private String[] unidades = {"UN","SACO 50KG","M³","SACO 20KG"};

    
    //Calculo materiais de uma parede de alvenaria conforme a dimenções digitadas pelo usuário:
    public void materiaisParedeAlvenaria() {
        System.out.println("==========CALCULO DOS MATERIAIS PARA PAREDE DE ALVENARIA==========");
        ArrayList<Double> quantidadeMateriais = new ArrayList<Double>();
        System.out.println("Digite o comprimento da parede:");
        double comprimento = calculadora.recebeNumero();
        System.out.println("Digite a altura da parede:");
        double altura = calculadora.recebeNumero();
        double areaParede = calculadora.multiplicacao(comprimento, altura);
        for (int i = 0; i<materiais.length; i++) {
            double quantidade = calculadora.multiplicacao(areaParede, coeficientes[i]);
            
            if (i==2) {
                double teste = Math.floor(quantidade);
                if ((quantidade-teste)>0.5) {
                    quantidade=calculadora.teto(quantidade);
                }
                else {
                    quantidade = teste + 0.5;
                }
            }
            else {
                quantidade=calculadora.teto(quantidade);
            }
            quantidadeMateriais.add(quantidade);
            System.out.println(materiais[i]+" = "+quantidadeMateriais.get(i)+" "+unidades[i]);
        }
    }
}
