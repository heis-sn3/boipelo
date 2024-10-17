public class Question2 {
    public static int howMany(String[] arr, String val) {
        int count = 0;
        for (String element : arr) {
            if (element.equals(val)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] testArray = {"apple", "banana", "apple", "orange"};
        System.out.println(howMany(testArray, "apple")); // Output: 2
    }
}