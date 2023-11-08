package calsi;
import java.util.Scanner;

public class CuboidArea {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the length, width and height of the cuboid from the user
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        // Calculate the surface area of the cuboid
        double surfaceArea = 2 * (length * width + width * height + length * height);

        // Display the surface area of the cuboid
        System.out.println("The surface area of the cuboid is: " + surfaceArea);
    }
}

