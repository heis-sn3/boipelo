import java.util.Scanner;

public class isEven {
    public static boolean Even(int number) {
        while(number >= 2){
            number = number - 2;
        }

        return number == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an interger: ");

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("The number " + num + " is " + (Even(num)? "even" : "odd"));

        scanner.close();
    }
}

