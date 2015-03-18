package sortedodia;
import java.util.ArrayList;

import signos.Gemeos;


public class Sortes {
    private String nome;
	private String fraseDoDia;
    
        public Sortes(String nome, int signo){
        	this.nome = nome;
        	
        	switch (signo){
        	case 1:
        		Gemeos g = new Gemeos(this.nome);
        		fraseDoDia = g.getFraseDoDia();
        		break;
        	
        	default:
        		fraseDoDia = "Frase Default";
        		break;
        	
        	}
		
		
		


		
		
	}
	
	public void Frase (){
		
                
		
		
	}
	
	
	public String getFraseDoDia() {
		
			
			return fraseDoDia;
		}
    
}
