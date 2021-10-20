public class PezConsole {
    public static void main(String[] args) {
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with delicious PEZ...");
        dispenser.fill();
        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        while (dispenser.dispense()) {
            System.out.println("Pez!!");
        }

        try {
            dispenser.fill(400);
        } catch (IllegalArgumentException e) {
            System.out.printf("There was an error: %s", e.getMessage());
        }
    }
}
