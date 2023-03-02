package controle;

public class Switch {

    public static void main(String[] args) {

        String faixa = "verde";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o bassai - dai...");
            case "marron":
                System.out.println("Sei o tekki shodan");
            case "roxa":
                System.out.println("Sei o heian godan");
            case "verde":
                System.out.println("Sei o heian yodan");
            case "laranja":
                System.out.println(" Sei o heian sandan");
            case "Vermelha":
                System.out.println("Sei o heian nidan");
            case "amarela":
                System.out.println("Sei o heian shodan");
                break;
            default:
                System.out.println("Sei nada");
        }
    }
}
