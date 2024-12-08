import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        FactorionChecker fc = new FactorionChecker();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower bound: ");
        int low = input.nextInt();
        System.out.println("Enter upper bound: ");
        int up = input.nextInt();
        int count = 0;
        for (int i = low; i <= up; i++) {
            if (fc.checkFact(i)) {
                System.out.println(i);
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Total factorion found in this range: " + count);
        }
        if (count == 0) {
            System.out.println("No factorion found in this range");
        }
    }
}
