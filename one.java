import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int i=12,sum=0;

        while(i<=30){
            sum = sum+(i*i);
            System.out.print(i+"^2 ");
            i+=3;
            if (i <= 30) {
                System.out.print("+ ");
            }
        }
        System.out.println("= "+sum);
        
        int ko;
        Scanner num = new Scanner(System.in);
        System.out.print("entry number ");
        ko=num.nextInt();
        System.out.println(ko); 
        num.close();
    }
}