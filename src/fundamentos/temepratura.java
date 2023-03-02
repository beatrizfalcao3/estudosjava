package fundamentos;

public class temepratura {
    public static void main(String[] args) {
        //(°F - 32 ) x 3/9 = °C
        final double FATOR = 5 / 9.0;
        final int AJUSTE = 32;

        double fahrenheit = 150;
        double celcius = ( fahrenheit - AJUSTE ) * FATOR;

        System.out.println("resultado: "  + celcius + "°C.");

        fahrenheit = 0;
        celcius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("resultado:" + celcius + "°C.");
    }
}
