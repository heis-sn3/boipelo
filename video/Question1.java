public class Question1 {
    public static boolean hasDuplicates(String[] arr) {
        //loops through the array
        for (int i = 0; i < arr.length; i++) {
            //loops to the other values to compare
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        String[] testArray = {"apple", "banana", "orange", "apple"};
        System.out.println(hasDuplicates(testArray)); 
    }
}