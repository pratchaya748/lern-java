import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int op;
        Scanner num = new Scanner(System.in);
        System.out.print("enter your number ");
        op = num.nextInt();
        if (op%2 == 0) {
            System.out.println(op+" is even");
        } else {
            System.out.println(op+" is odd");
        }
        num.close();

        
    }
}