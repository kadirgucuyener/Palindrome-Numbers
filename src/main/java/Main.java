import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp > 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int number;

        do {
            System.out.print("Bir sayı giriniz: ");
            number = mec.nextInt();
            if (isPalindrome(number) == true)
                System.out.println(number + " Sayısı Palindromdur!");
            else

                System.out.println(number + " Sayısı Palindrom değildir!");

        } while (number >= 0);

    }
}