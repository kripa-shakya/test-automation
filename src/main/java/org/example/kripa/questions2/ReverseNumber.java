package src.main.java.org.example.kripa.questions2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to reverse: ");
        int n = scanner.nextInt();

        while (n > 0)
        {
           int rev= n%10;
           System.out.println(rev);
           n = n/10;
        }


    }
}
