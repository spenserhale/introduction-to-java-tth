public class Console {
    public static void main(String[] args) {
        java.io.Console console = System.console();
        if(console == null) {
            System.exit(1);
        }

        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
    }
}
