import java.util.Scanner;

public class FactorialCalculator{
    public static void main(String[] args) {
       int n = getNonNegativeInteger();
       calculateFactorial(n);
    }
    public static int getNonNegativeInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    public static void calculateFactorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.print("The Factorial of "+ n +" is: "+ factorial);
        
    }
}