package signos;

public class Gemeos extends Signos{

    public Gemeos(String nome) {
        super(nome);
    }

    @Override
    public void frases() {  // adicionando as frases ao objetos Array list herdado de signos
        this.frase.add("");
        this.frase.add("O verdadeiro homem mede a sua for�a, quando se defronta com o obst�culo.");
        this.frase.add("Voc� precisa fazer aquilo que pensa que n�o � capaz de fazer.");
        this.frase.add("Quem quer vencer um obst�culo deve armar-se da for�a do le�o e da prud�ncia da serpente.");
        this.frase.add("A adversidade desperta em n�s capacidades que, em circunst�ncias favor�veis, teriam ficado adormecidas.");
        this.frase.add("A vida � para quem topa qualquer parada. N�o para quem p�ra em qualquer topada.");
        
    }
    
}

