import java.util.Random; // Import the Random class for generating random numbers


public class Question1 {
    public static void main(String[] args) {
        // We create an instance of the Random class to generate random numbers.
        Random random = new Random();
        // We define the total number of rolls we want to simulate, which is 50 in this case.
        int totalRolls = 50;

        // Here, we declare counters for the different outcomes we want to track.
        int boxcarsCount = 0; // This counts how many times both dice show 6 (boxcars).
        int snakeEyesCount = 0; // This counts how many times both dice show 1 (snake eyes).
        int doubletsCount = 0; // This counts how many times both dice show the same number (doublets).
        int smallStraightCount = 0; // This counts how many times the dice show a small straight (increasing sequence).
        int aceDeucesCount = 0; // This counts how many times the sum of the dice equals 3 (ace deuces).

        // We also declare variables to track the first occurrence of each outcome.
        int boxcarsRolls = 0; // This will store the roll number when boxcars first occur.
        int snakeEyesRolls = 0; // This will store the roll number when snake eyes first occur.
        int doubletsRolls = 0; // This will store the roll number when doublets first occur.
        int smallStraightRolls = 0; // This will store the roll number when small straights first occur.
        int aceDeucesRolls = 0; // This will store the roll number when ace deuces first occur.

        // This loop will run 50 times to simulate rolling the dice.
        for (int i = 0; i < totalRolls; i++) { // The variable 'i' acts as our roll counter.
            // We generate random numbers between 1 and 6 for each die.
            int die1 = random.nextInt(6) + 1; // Roll the first die
            int die2 = random.nextInt(6) + 1; // Roll the second die
            // We print the results of the current roll, showing the values of both dice.
            System.out.println("Roll " + (i + 1) + ": Die 1 = " + die1 + ", Die 2 = " + die2);

            // Here we check the outcomes for each roll and update our counters accordingly.
            if (die1 == 6 && die2 == 6) { // Check if both dice show 6 for boxcars
                boxcarsCount++; // Increase the count for boxcars
                if (boxcarsRolls == 0) boxcarsRolls = i + 1; // Record the first occurrence
            }
            if (die1 == 1 && die2 == 1) { // Check if both dice show 1 for snake eyes
                snakeEyesCount++; // Increase the count for snake eyes
                if (snakeEyesRolls == 0) snakeEyesRolls = i + 1; // Record the first occurrence
            }
            if (die1 == die2) { // Check if the two dice show the same number for doublets
                doubletsCount++; // Increase the count for doublets
                if (doubletsRolls == 0) doubletsRolls = i + 1; // Record the first occurrence
            }
            // Check for small straights, which are defined as two consecutive numbers.
            if ((die1 == 1 && die2 == 2) || (die1 == 2 && die2 == 1) || 
                (die1 == 2 && die2 == 3) || (die1 == 3 && die2 == 2) ||
                (die1 == 3 && die2 == 4) || (die1 == 4 && die2 == 3) ||
                (die1 == 4 && die2 == 5) || (die1 == 5 && die2 == 4) ||
                (die1 == 5 && die2 == 6) || (die1 == 6 && die2 == 5)) {
                smallStraightCount++; // Increase the count for small straights
                if (smallStraightRolls == 0) smallStraightRolls = i + 1; // Record the first occurrence
            }
            // Check if the sum of the two dice equals 3 for ace deuces.
            if ((die1 + die2) == 3) {
                aceDeucesCount++; // Increase the count for ace deuces
                if (aceDeucesRolls == 0) aceDeucesRolls = i + 1; // Record the first occurrence
            }
        }

        // After all rolls are complete, we print the results.
        System.out.println("\nResults after 50 rolls:");
        System.out.println("Boxcars (6, 6) occurred " + boxcarsCount + " times, first at roll " + boxcarsRolls);
        System.out.println("Snake Eyes (1, 1) occurred " + snakeEyesCount + " times, first at roll " + snakeEyesRolls);
        System.out.println("Doublets occurred " + doubletsCount + " times, first at roll " + doubletsRolls);
        System.out.println("Small Straights occurred " + smallStraightCount + " times, first at roll " + smallStraightRolls);
        System.out.println("Ace Deuces occurred " + aceDeucesCount + " times, first at roll " + aceDeucesRolls);
    }
}