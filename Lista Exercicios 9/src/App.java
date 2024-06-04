import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println(
            """
                    Escolha um dos personagens abaixo.
                [1] Kuririn
                [2] Goku
                [3] Dendê 
                [4] Gohan
                    """
        );
        System.out.print("Insira a opção desejada: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                Terraqueo kuririn = (Terraqueo) PersonagemFactory.criacaoDePersonagemDragonBall(opcao);
                System.out.println("Poder de luta: "+ kuririn.calcularPoder()+"\n");
                System.out.println(kuririn.toString());;
                break;
            case 2:
                Sayajin goku = (Sayajin) PersonagemFactory.criacaoDePersonagemDragonBall(opcao);
                System.out.println("Poder de luta: "+ goku.calcularPoder() +"\n");
                goku.transformar(goku.getNivelMaximoSSJ());
                System.out.println(goku.toString()+"\n");;
                break;
            case 3: 
                Namekuseijin dende = (Namekuseijin) PersonagemFactory.criacaoDePersonagemDragonBall(opcao);
                System.out.println("Poder de luta: "+ dende.calcularPoder()+"\n");
                System.out.print("Escreva seu desejo: ");
                input.nextLine();
                String desejo = input.nextLine();
                System.out.println("Seu desejo é: "+dende.fazerDesejo(desejo)+"\n");;
                break;
            case 4:
                Sayajin gohan = (Sayajin) PersonagemFactory.criacaoDePersonagemDragonBall(opcao);
                System.out.println("Poder de luta: "+ gohan.calcularPoder()+"\n");
                gohan.transformar(gohan.getNivelMaximoSSJ());
                System.out.println(gohan.toString()+"\n");;
            default:
                System.out.println("Personagem não encontrado.");
                break;
        }
        
        input.close();
    }
}