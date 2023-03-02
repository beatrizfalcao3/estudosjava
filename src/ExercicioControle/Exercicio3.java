package ExercicioControle;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota parcial 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota parcial 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media >= 7.0){
            System.out.println("Voce esta aprovado, sua media é: " + media);
        }else if (media >=4){
            System.out.println("Sua média é: " + media + " Voce está em recuperacao!");
        }else
            System.out.println("Sua média é " + media + " Voce está reprovado!");

        scanner.close();
    }


}
