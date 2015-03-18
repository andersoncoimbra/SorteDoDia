package signos;


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public abstract class Signos {
    private String nome;
    public ArrayList<String> frase = new ArrayList<String>();
    private String fraseDoDia;
    private Random indice;
    
    public Signos(String nome){
        this.nome = nome;
        frases();
        indice = new Random();
        fraseDoDia = nome+" sua sorte é "+frase.get(indice.nextInt(frase.size()));
    
    
    }
    public abstract void frases();
    

    public String getFraseDoDia() {
        return fraseDoDia;
    }
    
    
}
