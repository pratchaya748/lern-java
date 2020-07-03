import java.util.Scanner;
import java.util.Formatter;


public class func {
    public static void main(String[] args) {
        //name("namo");
        // double w,h;
        // Scanner r = new Scanner(System.in);
        // System.out.print("entry width");
        // w=r.nextDouble();
        // System.out.print("entry height");
        // h=r.nextDouble();
        // triangle(w, h);
        // pow();
        // System.out.println(heightnum()); 
        // star();
        temperature();

    }

    public static void name(String me) {
        for (int i = 0; i <= 9; i++) {
            System.out.println("My name is "+ me);
        }
    }
    public static void triangle(double h,double w) {
        double area = 0.5*w*h;
        System.out.println("have an area = "+ area);
         
    }
    public static void pow() {
        int x;
        for (int i = 1; i <= 10; i++) {
            x =i*i*i;
            System.out.println(i +" exponent = "+x);

        }
    }

    public static void star() {
        int p=10;
        for (int u =1; u <= 10; u++) {  
            for(int i=1;i<=p;i++) {
                System.out.print("*");
            }
            System.out.println("");
            p--;
        }   
    }

    public static double heightnum() {
        Scanner input=new Scanner(System.in);
        double num1,num2;
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        if ((num1-num2  > num2-num1)) {
            return num1;
            // System.out.println(num1+"more then "+num2);
        } else {
            return num2;
            // System.out.println(num2 +"more then "+num1);
        }
    }
    

    public static void temperature() {
        double c,f,C,F;
        Scanner input=new Scanner(System.in);
        System.out.print("Pls entry Celsius");
        c=input.nextDouble();
        System.out.print("Pls entry Fahrenheit");
        f=input.nextDouble();

        System.out.print("Celsius \t Fahenheit \t Fahenheit \t Celsius");
        System.out.println("");
        C = (f-32)/1.80;
        F = (1.80*c) + 32;
        System.out.format("15%s15%s15%s\n",c,F,f,C);
        input.close();
        
     }
}