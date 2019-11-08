package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Length: ");
        length = input.nextDouble();
        System.out.println("Width: ");
        width = input.nextDouble();
        input.close();
        System.out.println("The area of the rectangle is: "  + (2 * width + 2 * length));
    }
}
