import java.util.ArrayList;

public class CalculaMateriais {
    
    Calculadora calculadora = new Calculadora();
    
    //Coeficientes são as quantidades dos materiais por m² conforme a ordem da lista materiais.
    
    //Materiais para parede de alvenaria:
    private String[] materiais = {"Tijolo","Cimento","Areia Média","Cal"};
    private double[] coeficientes = {25,0.0436,0.015,0.109};
    private String[] unidades = {"UN","SACO 50KG","M³","SACO 20KG"};

    
    //Calculo materiais de uma parede de alvenaria conforme a área digitada pelo usuário:
    public void materiaisParedeAlvenaria() {
        ArrayList<Double> quantidadeMateriais = new ArrayList<Double>();
        double areaParede = calculadora.recebeNumero();
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
