public class Animal {
    
    //ATRIBUTOS
    private String nome;
    private String cor;
    private String raca;
    private int idade;
    private String sexo;
    private boolean adotado;

    //CONSTRUTOR
    public Animal(String nome, String cor, String raca, int idade, String sexo, boolean adotado) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.adotado = adotado;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public boolean isAdotado() {
        return adotado;
    }
    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public void emitirSom(){
        System.out.println("Som do animal!");
    }

    @Override
    public String toString() {
        return "Animal {nome = " + nome + ", cor = " + cor + ", raca = " + raca + ", idade = " + idade + ", sexo = " + sexo
                + ", adotado = " + adotado + "}";
    }
    
}
