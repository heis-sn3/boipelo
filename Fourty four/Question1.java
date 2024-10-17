import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for words to count
        System.out.print("List of words to count (separated by spaces): ");
        String inputLine = scanner.nextLine();
        String[] wordsToCount = inputLine.split("\\s+");

        // Normalize the words to lowercase
        for (int i = 0; i < wordsToCount.length; i++) {
            wordsToCount[i] = wordsToCount[i].toLowerCase();
        }

        // Create lists to store unique words and their counts
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        // Read the file and count occurrences
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Normalize the line to lowercase and split into words
                String[] words = line.toLowerCase().split("\\s+");

                // Count the occurrences of each word
                for (String word : words) {
                    // Remove non-alphabetical characters
                    String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                    if (!cleanWord.isEmpty()) {
                        // Check if the word is already in the uniqueWords list
                        int index = uniqueWords.indexOf(cleanWord);
                        if (index != -1) {
                            counts.set(index, counts.get(index) + 1);
                        } else {
                            uniqueWords.add(cleanWord);
                            counts.add(1); // Initialize count to 1
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return; // Exit the program if file reading fails
        }

        // Print the counts for the specified words
        for (String word : wordsToCount) {
            int count = 0;
            int index = uniqueWords.indexOf(word);
            if (index != -1) {
                count = counts.get(index);
            }
            System.out.println(word + ": " + count);
        }

        // Close the scanner
        scanner.close();
    }
}