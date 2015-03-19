package signos;


import java.util.ArrayList;
import java.util.Random;

/**
 *  Classe abstrata que sera usada para a construçao das subclasse signos 
 *
 * @author Anderson Coimbra
 * 
 */
public abstract class Signos {
    private String nome;
    public ArrayList<String> frase = new ArrayList<String>();
    private String fraseDoDia;
    private Random indice;
    
    /**
     *  Metodo construtor  usado para organizar e torna a subclase em um estado valido 
     *  -> nome passado como paramentro sera o nome do usuario para se amazenado  
     *  -> o metodo frase() sera responsavel por adiciona as lista de frases correspodente a cada signo no arraylist
     *  -> a variavel indice sera do tipo Random que sera usado para selecionar a frase dentro do arraylist 
     *  -> a variavel frasedodia sera do tipo String que concatenarar o nome do usuario mais a frase sorteada pelo indice
     *  -> o metodo frase.get(int) responsavel por pegar um item do array é necessario um numero interio que corresponda o indece da frase desejada 
     *  -> o metodo indice.nextInt(int) sera responsavel por gera um numero aleatorio que sera usado pelo metodo frase.get(), porem sera necessario fornecer um intervlo entre 0 e o numero maximo 
     *  -> o metodo frase.size() retona o total de elemento no arraylist frase[], sera usado pelo indice.nextInt() para completar o processo para escolhe a frase aleatoria dentro do arraylist
     *
     * @param nome  nome passado pelo usuario  
     */
    public Signos(String nome){
        this.nome = nome;
        frases();
        indice = new Random();
        fraseDoDia = nome+" sua sorte é "+frase.get(indice.nextInt(frase.size()));
    
    
    }
    /**
	 *  Esse metodo sera usado por subclasses de Signos para adiciona frases de sorte nos Arraylist frase
	 */
    public abstract void frases();
    
    /**
     * Esse metodo ficara responsavel para fornecer a frase completa com o nome e a frase de sorte 
     * @return
     */
    public String getFraseDoDia() {
        return fraseDoDia;
    }
    
    
}
