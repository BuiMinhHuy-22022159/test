import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if(num % 3 == 0) {
            System.out.println("Fizz");
        }
        else if(num % 5 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println("None");
        }
        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
    }
}