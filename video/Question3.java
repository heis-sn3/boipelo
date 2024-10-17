package video;

public class Question3 {
    public static String[] removeDuplicates(String[] arr) {
        String[] tempArray = new String[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i].equals(tempArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempArray[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        String[] uniqueArray = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        String[] testArray = {"apple", "banana", "apple", "orange", "banana"};
        String[] result = removeDuplicates(testArray);
        
        // Print the result
        for (String element : result) {
            System.out.print(element + " "); // Output: apple banana orange 
        }
    }
}
