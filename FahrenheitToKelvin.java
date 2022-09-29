import java.util.Scanner;

public class FahrenheitToKelvin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input in fahrenheit the temperature you will like to convert into kelvin: ");
        float temperature = scan.nextFloat();
        temperature = (float) ((temperature + 459.67) * 5/9);
        System.out.println("The temperature in kelvin is: " + temperature);
    }
}
