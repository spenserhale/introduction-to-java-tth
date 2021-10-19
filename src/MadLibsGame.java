import java.io.Console;

public class MadLibsGame {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.exit(1);
        }

        int age = Integer.parseInt(console.readLine("Enter age:  "));
        if(age <= 13) {
            console.printf("Sorry you must be older than 13.\n");
            System.exit(0);
        }

        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun;
        boolean isNounInvalid;
        do {
            noun = console.readLine("Enter a noun:  ");
            isNounInvalid = name.equalsIgnoreCase("dork") || name.equalsIgnoreCase("jerk");
            if(isNounInvalid) {
                console.printf("That language is not allowed. Try again. \n");
            }
        } while (isNounInvalid);

        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");

        console.printf("Your MadLibs:\n---------\n");
        console.printf("%s is a(n) %s %s. ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
}
