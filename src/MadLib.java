//Freyja Waknitz
//5/27/2025
// This took around an hour
// No sources were used
// I enjoyed how the project built on itself. Thanks to git, you can see different iterations of the project.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class MadLib {
    public static void main(String[] args) {
        ArrayList<String> templates = new ArrayList<>();

        out.println("Mad Lib!");
        templates.add( "The {adjective} {noun} {adverb} {verb}.");
        templates.add("The {adjective} {noun} will {verb} {adverb}.");
        templates.add("{noun} is very {adjective}.");
        templates.add("The coolest {noun} is very {adverb} at {verb}.");
        Random rand = new Random();

        Scanner input = new Scanner(System.in);
        boolean done = false;
        while ( !done) {
            int index = rand.nextInt(templates.size());
            out.println("Enter an adjective (e.g., red, bright, smart):");
            String adjective = input.nextLine();
            out.println("Enter a noun (e.g., wizard, robot, mountain):");
            String noun = input.nextLine();
            out.println("Enter a verb (e.g., ran, cooked, danced):");
            String verb = input.nextLine();
            out.println("Enter an adverb (e.g., viciously, brightly, sometimes):");
            String adverb = input.nextLine();

            String rslt = replaceStringPlaceHolders(templates.get(index), adjective, noun, verb, adverb);

            out.println(rslt);
            out.println("Play again? (y/n)");
            if(input.nextLine().toLowerCase().equals("n")) {
                done = true;
            }
        }
        input.close();
        out.println("Thank you for playing MadLib");


    }

    static String replaceStringPlaceHolders(String input, String adjective, String noun, String verb, String adverb) {
        input = input.replace("{adjective}", adjective);
        input = input.replace("{noun}", noun);
        input = input.replace("{verb}", verb);
        input = input.replace("{adverb}", adverb);
        return input;
    }

}