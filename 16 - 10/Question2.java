import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of eggs: ");
        int eggs = scanner.nextInt();

        int greatGross = eggs/1728;
        int dozen = (eggs%1728)/12;
        int leftover = (eggs%1728)%12;

        System.out.println("Your number of eggs is " + greatGross + " great gross, " + dozen + " dozen, and " + leftover + " extra, \n" + "Since " + eggs + " is equal to " + greatGross + " * 1728 + " + dozen + " * 12 + " + leftover + ".");

        scanner.close();

    }
}
