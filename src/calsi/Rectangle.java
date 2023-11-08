package calsi;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the length and width of the rectangle from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the area of the rectangle
        System.out.println("The area of the rectangle is: harika" + area);
    }
}

