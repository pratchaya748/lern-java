import java.util.Scanner;

public interface array {
    public static void main(String[] args) {
        // Scanner n = new Scanner(System.in);
        // double sum=0,average;
        // double numarry[]=new double[10];
        // for (int i = 0; i <= 9; i++) {
        //     numarry[i] = n.nextDouble();
        //     sum+=numarry[i];
        // }
        // average=sum/10;
        // System.out.println("totle is "+sum);
        // System.out.println("average is "+average);
        // number(numarry);
        cha20();
    }
    public static void number(double[] numarry) {
        double h=0;
        h=numarry[0];
        for (int y = 0; y < numarry.length; y++) {
            if (h<numarry[y]) {
                h=numarry[y];
            } 
        }
        System.out.println("most number is "+h);
    }

    public static void cha20() {
        Scanner c=new Scanner(System.in);
        String []o=new String[20];
        String a;
        System.out.print(">>>");
        a=c.nextLine();
        for (int i = 0; i < o.length; i++) {
            o[i]=a.substring(i,i+1);
            System.out.print(o[i]+" ");
            dfgdlfgk
        }
        c.close();
        
    }
}