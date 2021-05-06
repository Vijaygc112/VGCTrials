import java.util.Scanner;

public class CheckIfANumberIsPrime {


    public static void main(String[] args) {

        System.out.println("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (checkPrime(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is a not Prime Number");
        }
    }

    private static boolean checkPrime(int n) {
        boolean flag = false;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
