package App;
public class App {
    public static void main(String[] args) throws Exception {
        
        //teste classe CalculaMateriais
        
        /*CalculaMateriais alvenaria = new CalculaMateriais();

        alvenaria.materiaisParedeAlvenaria();*/
    	
    	//teste classe CalculaJanelas
        
        CalculoJanelas janelas = new CalculoJanelas();
    	
    	System.out.println(janelas.quantJanelas());
    	
    }
}
