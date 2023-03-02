package controle;

public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
         for(int x = 1; x <= 5; x++){
             System.out.println(valor);
             valor += "#";
         }

         //resposata do  desafio:

         for(String v = "#"; !v.equals("######"); v += "#"){
             System.out.println(v);
         }
    }
}

