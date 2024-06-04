public class Terraqueo extends PersonagemDragonBall {
    String pais;
    String cidade;

    public Terraqueo(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, String pais, String cidade) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        //TODO Auto-generated constructor stub
        this.pais = pais;
        this.cidade = cidade;
    }

    public double calcularPoder() {
        return ki;
    }
    public String toString(){
        return "Nome: " + this.nome + "\n"
            + "Idade: " + this.idade + "\n"
            + "Sexo: " + this.sexo + "\n"
            + "Temporada: " + this.temporada + "\n"
            + "Ki: " + this.ki + "\n" 
            + "Poder Especial: " + this.poderEspecial + "\n"
            + "Pais: " + this.pais + "\n"
            + "Cidade: " + this.cidade + "\n";
    }
}
