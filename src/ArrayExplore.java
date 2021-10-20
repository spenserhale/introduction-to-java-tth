import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayExplore {
    public static void main(String[] args) {
        loopExamples();
        mutatingExamples();
        sortingExamples();
        methodDeclarations();
    }

    private static void loopExamples() {
        String[] friends = {"Ben", "Alena", "Pasan"};

        // Enhanced for
        for (String friend : friends) {
            System.out.printf("Hey %s! The movie starts at 7, C U there! %n", friend);
        }

        // Traditional for
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < friends.length; i++) {
            System.out.printf("Hey %s! The movie starts at 7, C U there! %n", friends[i]);
        }

        int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        for (int i = 0; i < bensScoreCard.length; i++) {
            System.out.printf("Hole #%d: %d %n", i + 1, bensScoreCard[i]);
        }

        int[][] scoreCards = {
                {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
                {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
                {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
        };

        for (int friendIndex = 0; friendIndex < friends.length; friendIndex++) {
            System.out.printf("%s %n %n", friends[friendIndex]);
            for (int scoreIndex = 0; scoreIndex < scoreCards[friendIndex].length; scoreIndex++) {
                System.out.printf("Hole #%d: %d %n", scoreIndex + 1, scoreCards[friendIndex][scoreIndex]);
            }
        }
    }

    private static void mutatingExamples() {
        String[] friends = {"Ben", "Alena", "Pasan"};

        // Initializing larger array
        String[] friendsAndMe = new String[4];

        // Traditional
        System.arraycopy(friends, 0, friendsAndMe, 0, friends.length);
        friendsAndMe[3] = "Craig";

        // Utility Class
        String[] moreFriends = Arrays.copyOf(friends, friends.length + 1);
        moreFriends[3] = "Josh";
    }

    private static void sortingExamples() {
        String[] friends = { "Treasure", "Ben", "Alena", "Pasan", "Craig"};

        // sort using objects compareTo() method - which with strings is Alpha
        Arrays.sort(friends);

        // sort by length of name asc
        Arrays.sort(friends, Comparator.comparing(String::length));

        // sort by length of name asc
        Arrays.sort(friends, Comparator.comparing(String::length).reversed());
    }

    private static void methodDeclarations() {
        String spot = pickLunchSpot("Round Table", "Aztec's", "Panda");

        System.out.printf("Picked %s as today's lunch spot. %n", spot);
    }

    private static String pickLunchSpot(String... spots) {
        System.out.printf("Randomly picking of %d lunch spots. %n", spots.length);

        if(spots.length == 0) {
            throw new IllegalArgumentException("Must provide at least on spot to be chosen at random");
        }

        Random random = new Random();

        return spots[random.nextInt(spots.length)];
    }
}
