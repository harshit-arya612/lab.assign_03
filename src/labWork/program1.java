package labWork;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args){
        System.out.println(" enter the value");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double s=0;
        double i=1;
        while(i<=n){
            s=s+(1/i);
            i=i+1;
        }
        System.out.println(s);
    }
}
