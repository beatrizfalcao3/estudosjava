package fundamentos;

public class Interferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);

        c = "outro texto";
        System.out.println(c);

        // c = 4.5;

        double d; // variavel foi  declarada
        d = 123.65; // variavel foi inicializada
        System.out.println(d); // usada!

        var e = 123.45;
        System.out.println(e);

        var f = 12; // inteiro
        System.out.println(f);

        //bia eh linda e gostosa


    }
}
