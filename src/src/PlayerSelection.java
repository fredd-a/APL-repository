import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {

        String name;
        int age;
        double height;
        double weight;
        int Jnumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter player height (in meters): ");
        height = input.nextDouble();

        System.out.print("Enter player weight (in pounds) : ");
        weight = input.nextDouble();

        System.out.print("Enter the player's jersey number: ");
        Jnumber = input.nextInt();

        final double POUND = 0.45359237;
        final int METER = 100;

        double new_weight = (int) (weight * POUND);
        System.out.println("Weight in kilograms-" + new_weight + "kg");

        double new_height = height * METER;
        System.out.println("Height in centimeters-" + new_height + "cm");

        boolean old_enough = age >= 18;
        boolean young_enough = age <= 35;
        boolean right_weight = new_weight < 90;

        boolean eligible = old_enough && young_enough && right_weight;

        if (eligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        boolean underage = age < 18;
        boolean overweight = new_weight >= 90;

        boolean player_problem = underage || overweight;

        if (player_problem) {
            System.out.println("Player has a problem(either too young or too heavy)");
        }

        if (!eligible) {
            System.out.println("Not Eligible");
        }


        if (age < 20) {
            System.out.println("Category: Rising Star");
        } else if (age <= 30) {
            System.out.println("Category: Prime Player");
        } else {
            System.out.println("Category: Veteran");
        }

        switch (Jnumber) {
            case 1: System.out.println("Goalkeeper");
            break;
            case 2: System.out.println("Defender");
            
            case 6: System.out.println("Midfielder");
            
            case 7: System.out.println("Winger");
            
            case 9: System.out.println("Striker");
            break;
            case 10: System.out.println("Playmaker");
            break;
            case 11: System.out.println("Winger");
            break;
            case 5: System.out.println("Defender");
            break;
            case 8: System.out.println("Midfielder");
            break;
            default:System.out.println("Player position not known");
        }

        if (age >= 20 && age <= 30) {
            if (new_weight < 80) {
                System.out.println("Lineup Decision: Starting Lineup");
            } else {
                System.out.println("Lineup Decision: Bench");
            }
        } else {
            System.out.println("Lineup Decision: Bench");
        }

        
        String final_decision = (eligible) ? "Play" : "Rest";
            System.out.println("Final Decision: " + final_decision);
        }
    }
