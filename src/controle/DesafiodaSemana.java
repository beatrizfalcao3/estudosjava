package controle;

import java.util.Scanner;

public class DesafiodaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da Semana: ");

        String dia = entrada.next().toUpperCase();


        if (dia.equals("DOMINGO")){
            System.out.println("Dia 1");
        }else if (dia.equals("SEGUNDA")){
            System.out.println("Dia 2");
        }else if (dia.equals("TERCA")){
            System.out.println("Dia 3");
        }else if (dia.equals("QUARTA")){
            System.out.println("Dia 4");
        }else if (dia.equals("QUINTA")){
            System.out.println("Dia 5");
        }else if (dia.equals("SEXTA")){
            System.out.println("Dia 6");
        }else if (dia.equals("SABADO")){
            System.out.println("Dia 7");
        }else {
            System.out.println("Dia invalido");
        }



        System.out.println("Fim!");
        entrada.close();


    }
}
