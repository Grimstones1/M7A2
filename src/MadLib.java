import java.util.Scanner;

import static java.lang.System.out;

public class MadLib {
    public static void main(String[] args) {

        out.println("Mad Lib!");
        String template = "The {adjective} {noun} {adverb} {verb}.";
        String template1 = "The {adjective} {noun} will {verb} {adverb}.";
        out.println(template);

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
        template = replaceStringPlaceHolders(template, adjective, noun, verb, adverb);
        template1 = replaceStringPlaceHolders(template1, adjective, noun, verb, adverb);
        out.println(template);
        out.println(template1);
    }

    static String replaceStringPlaceHolders(String input, String adjective, String noun, String verb, String adverb) {
        input = input.replace("{adjective}", adjective);
        input = input.replace("{noun}", noun);
        input = input.replace("{verb}", verb);
        input = input.replace("{adverb}", adverb);
        return input;
    }

}