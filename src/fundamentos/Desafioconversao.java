package fundamentos;

import java.util.Scanner;

public class Desafioconversao {
    public static void main(String[] args) {

         Scanner teclado = new Scanner (System.in);

         System.out.println("Informe o primeiro Salario: ");
         String valor1 = teclado.next().replace("," ,".");

         System.out.println("Informe o segundo salario: ");
         String valor2 = teclado.next().replace("," ,".");

         System.out.println("Informe o terceiro salario: ");
         String valor3 = teclado.next().replace("," ,".");

         Double salario1 = Double.parseDouble(valor1);
         Double salario2 = Double.parseDouble(valor2);
         Double salario3 = Double.parseDouble(valor3);

         double soma = (salario1 + salario2 + salario3) / 3;

         System.out.println("A media dos salarios eh: " + soma );

         teclado.close();


    }
}
