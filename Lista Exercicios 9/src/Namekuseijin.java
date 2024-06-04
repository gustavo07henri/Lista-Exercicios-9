import java.util.HashMap;
import java.util.Map;

public class Namekuseijin extends PersonagemDragonBall {
    int quantidadeEsferas;
    boolean podeCurar;
    Map <String, String> dicionario;

    public Namekuseijin(String nome, int idade, String sexo, String temporada, int ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public double calcularPoder() {
        return ki * (1 + (podeCurar ? 0.2 : 0));
    }
    public String fazerDesejo(String desejo){
        dicionario = new HashMap<>();
        for(String palavra: desejo.split(" ")){
            String palavraRegex = palavra.replaceAll("[aA]", "@")
                                        .replaceAll("[Ee]", "&")
                                        .replaceAll("[Ii]", "|")
                                        .replaceAll("[Oo]", "0")
                                        .replaceAll("[Uu]", "*");
            dicionario.put(palavra, palavraRegex);
        }
        StringBuilder desejoFormatado = new StringBuilder();
        for(String palavra: desejo.split(" ")){
            desejoFormatado.append(dicionario.getOrDefault(palavra, palavra)).append(" ");
        }
        return desejoFormatado.toString();
    }
    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
            + "Idade: " + this.idade + "\n"
            + "Sexo: " + this.sexo + "\n"
            + "Temporada: " + this.temporada + "\n"
            + "Ki: " + this.ki + "\n" 
            + "Poder Especial: " + this.poderEspecial + "\n"
            + "Quantidade de Esferas: " + this.quantidadeEsferas + "\n"
            + "Pode Curar: " + this.podeCurar + "\n";
    }
}
