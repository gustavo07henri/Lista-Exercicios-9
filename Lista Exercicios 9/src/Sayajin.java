public class Sayajin  extends PersonagemDragonBall implements Transformavel{
    int nivelMaximoSSJ;
    boolean temRabo;

    public Sayajin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        //TODO Auto-generated constructor stub
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }
    public int getNivelMaximoSSJ(){
        return nivelMaximoSSJ;
    }

    @Override
    public double calcularPoder() {
        // TODO Auto-generated method stub
        return ki * ( nivelMaximoSSJ * 0.1);
    }
    @Override
    public void transformar(int nivel) {
        // TODO Auto-generated method stub
        if(nivel <= 3 || (nivel <= 5 && (nome.equals("Goku") || nome.equals("Goku")))){
            System.out.println(nome + " transformou para super sayajin nível "+ nivel + ". ");
        }else{
            System.out.println("Não foi possível transformar esse sayajin.");
        }
        
    }
    public String toString(){
        return "Nome: " + this.nome + "\n"
            + "Idade: " + this.idade + "\n"
            + "Sexo: " + this.sexo + "\n"
            + "Temporada: " + this.temporada + "\n"
            + "Ki: " + this.ki + "\n" 
            + "Poder Especial: " + this.poderEspecial + "\n"
            + "Nivel Maximo super Sayajin: " + this.nivelMaximoSSJ + "\n"
            + "Tem Rabo: " + this.temRabo + "\n";
    }

}
