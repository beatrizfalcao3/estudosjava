package fundamentos;

public class TrabalhosOperadoresLogicos {

    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if (trabalho1 && trabalho2){
            System.out.println("compro a tv de 50");
        }else if(trabalho1 || trabalho2){
            System.out.println("compro a tv de 32");
        }else {
            System.out.println("compro sorvete");
        }

    }

}

