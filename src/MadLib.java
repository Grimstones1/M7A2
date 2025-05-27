import java.util.Scanner;

import static java.lang.System.out;

public class MadLib {
    public static void main(String[] args) {
        out.println("Mad Lib!");

        Scanner input = new Scanner(System.in);
        out.println("Enter an adjective (e.g., red, bright, smart):");
        String adjective = input.nextLine();
        out.println("Enter a noun (e.g., wizard, robot, mountain):");
        String noun = input.nextLine();
        out.println("Enter a verb (e.g., ran, cooked, danced):");
        String verb = input.nextLine();
        out.println("Enter an adverb (e.g., viciously, brightly, sometimes):");
        String adverb = input.nextLine();
        input.close();

        out.println("The " + adjective + " " + noun + " " + verb + " " + adverb);
    }
}