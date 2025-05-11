import java.util.Scanner;

public class FactorialUsingRecursion {
    int n;

    public FactorialUsingRecursion() {
        this.n = n;
    }

    public int factorial(int n){
        if (n >= 1){
            return n * factorial(n - 1);
        }else{
            return 1;
        }
    }

    public void input(){
        System.out.println("Enter a number to find its factorial: ");
        Scanner input = new Scanner(System.in);
        this.n = input.nextInt();
    }

    public void display(){
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }

    public static void main(String[] args) {
        FactorialUsingRecursion facto = new FactorialUsingRecursion();

        facto.input();
        facto.display();
    }
}