package fundamentos;
public class areacincurferencia {

    public static void main(String[] args) {
        double raio = 3.4;
        double pi = 3.14159;

        double area = pi * raio * raio;
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Area = " + area + "m2.");
    }
}
