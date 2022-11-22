package App;
public class App {
    public static void main(String[] args) throws Exception {
        //teste classe CalculaMateriais
        /*CalculaMateriais alvenaria = new CalculaMateriais();

        alvenaria.materiaisParedeAlvenaria();*/
    	
    	CalculoJanelas janelas = new CalculoJanelas();
    	
    	System.out.println(janelas.quantJanelas());
    	
    }
}
