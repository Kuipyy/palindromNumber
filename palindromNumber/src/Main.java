import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {

        int temp = number;
        int reverseNumber = 0;
        int lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }

        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("Enter a number to check if it's a palindrom number: ");
        number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.printf("%d is a palindrom number.", number);
        } else {
            System.out.printf("%d is not a palindrom number.", number);
        }

    }
}