import java.util.Scanner;

public class Polindrom {

    public static int isPolindrome(int number)
    {
        int temp = number, lastDigit, nextNumber, reverseNumber = 0;

        while (temp > 0) {
            lastDigit = temp % 10;
            nextNumber = temp / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp = nextNumber;
        }

        if(reverseNumber == number)
        {
            return 1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = input.nextInt();

        if ( isPolindrome(number) == 1 )
        {
            System.out.print("Girdiğiniz sayı bir polindrom sayıdır!!");
        } else {
            System.out.print("Girdiğiniz sayı bir polindrom sayı değildir!!");
        }

    }
}
