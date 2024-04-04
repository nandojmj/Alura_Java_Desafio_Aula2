//import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }

    /*
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese temperatura en Celsius: ");
        double temperaturaEnCelsius = scanner.nextDouble();
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;
        System.out.println("Temperatura en Fahrenheit: " + temperaturaEnFahrenheit);

        // Crear variable entera para mostrar la temperatura en Fahrenheit sin decimales
        int temperaturaFahrenheitEntera = (int) temperaturaEnFahrenheit;
        System.out.println("Temperatura en Fahrenheit (entera): " + temperaturaFahrenheitEntera);*/
    }



}
