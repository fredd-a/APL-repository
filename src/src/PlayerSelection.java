import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter player height (in meters): ");
        float height = input.nextFloat();

        System.out.print("Enter player weight (in pounds) : ");;
        int weight = input.nextInt();

        System.out.print("Enter the player's jersey number: ");
        int Jersey_number = input.nextInt();


    }
}