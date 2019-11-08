package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        miles = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Gas consumed: ");
        gas = input.nextDouble();
        input.close();
        System.out.println((miles / gas) + " Miles per gallon");
    }
}
