import java.io.Console;

public class MadLibsGame {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.exit(1);
        }

        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun = console.readLine("Enter a noun:  ");
        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");

        console.printf("Your MadLibs:\n---------\n");
        console.printf("%s is a(n) %s %s. ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
}
