import java.time.LocalDate;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the birth year");
        int yearofbirth=inputScanner.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-yearofbirth;
        System.out.println(age);


    }
}