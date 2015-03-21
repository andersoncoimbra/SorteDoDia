package sortedodia;
import java.util.ArrayList;

import signos.Aquario;
import signos.Aries;
import signos.Cancer;
import signos.Capricornio;
import signos.DiretoDoAlem;
import signos.Escorpiao;
import signos.Gemeos;
import signos.Leao;
import signos.Libra;
import signos.Peixe;
import signos.Sagitario;
import signos.Signos;
import signos.Touro;
import signos.Virgem;

import cbd.InsertRecords;




/**
 * 
 * @author Cliente
 *
 */
public class Sortes {
    private String nome;
	private String fraseDoDia;
    /**
     * Essa class fica responsavel pela vereficação de qual signo
     * esta informando e intanciar um novo objeto dependendo de qual e o signo 
     * 
     * @param nome nome do usuario
     * @param signo codigo do signo 
     */
        public Sortes(String nome, int signo){
        	this.nome = nome;
        	Signos s;
        	
        	switch (signo){
        	case 3:
        		s = new Gemeos(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 1:
        		s = new Aries(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 2:
        		 s = new Touro(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 4:
        		s = new Cancer(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 5:
        		s = new Leao(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 6:
        		s = new Virgem(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 7:
        		s = new Libra(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 8:
        		s = new Escorpiao(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 9:
        		s = new Sagitario(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 10:
        		s = new Capricornio(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 11:
        		s = new Aquario(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	case 12:
        		s = new Peixe(this.nome);
        		fraseDoDia = s.getFraseDoDia();
        		break;
        	
        	default:
        		 s = new DiretoDoAlem(this.nome);
        		fraseDoDia = s.getFraseDoDia();

        		break;
        	
        	}
        	
        	/**
        	 * esse função e responsavel de guadar todas as mensagem feita para o cliente no banco de dados
        	 * 
        	 */
       new InsertRecords(fraseDoDia);
        
		
		
		


		
		
	}
	
	public void Frase (){
		
                
		
		
	}
	
	
	public String getFraseDoDia() {
		
			
			return fraseDoDia;
		}
    
}
