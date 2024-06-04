public class PersonagemFactory {
    public static PersonagemDragonBall criacaoDePersonagemDragonBall (int opçao){
        switch (opçao) {
            case 1:
                return new Terraqueo("Kuririn", 26, "Homen", "Dragon ball Z", 1800, "Kienzan ", "Indefinido", "Casa do Kame");
            case 2:
                return new Sayajin("Goku", 25, "Homem", "Dragon ball Z" , 8000 , "Kaioken", 5, false);
            case 3:
                return new Namekuseijin("Dendê", 0, "Assexuado", "Saga Freeza", 0, "Poder de cura", 7, true);
            case 4:
                return new Sayajin("Gohan", 11, "Homen", "Saga dos Androids", 10000, "Kamehameha", 3, false);
            default:
                return null;
        }
    }
}
