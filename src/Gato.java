public class Gato extends Animal {
    
    private boolean aceitaOutrosAnimais;

    //Construtor Gato
    public Gato(boolean aceitaOutrosAnimais, String nome, String cor, String raca, int idade, String sexo, boolean adotado) {
        super(nome, cor, raca, idade, sexo, adotado);
        this.aceitaOutrosAnimais = aceitaOutrosAnimais;
    }

    public boolean isAceitaOutrosAnimais() {
        return aceitaOutrosAnimais;
    }

    public void setAceitaOutrosAnimais(boolean aceitaOutrosAnimais) {
        this.aceitaOutrosAnimais = aceitaOutrosAnimais;
    }

    @Override 
    public void emitirSom(){
        System.out.println("Miau!");
    }
}
