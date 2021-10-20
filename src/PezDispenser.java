public class PezDispenser {
    public static final int MAX_PEZ = 12;
    private final String characterName;
    private int pezCount = 0;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void fill() {
        fill(MAX_PEZ);
    }

    public void fill(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many Pez");
        }

        pezCount = newAmount;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public boolean dispense()
    {
        if(!isEmpty()) {
            pezCount--;
            return true;
        }

        return false;
    }
}
