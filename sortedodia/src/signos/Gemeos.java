package signos;

public class Gemeos extends Signos{

    public Gemeos(String nome) {
        super(nome);
    }

    @Override
    public void frases() {  // adicionando as frases ao objetos Array list herdado de signos
        this.frase.add("");
        this.frase.add("O verdadeiro homem mede a sua força, quando se defronta com o obstáculo.");
        this.frase.add("Você precisa fazer aquilo que pensa que não é capaz de fazer.");
        this.frase.add("Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.");
        this.frase.add("A adversidade desperta em nós capacidades que, em circunstâncias favoráveis, teriam ficado adormecidas.");
        this.frase.add("A vida é para quem topa qualquer parada. Não para quem pára em qualquer topada.");
        
    }
    
}

