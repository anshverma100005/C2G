import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=a*0.75;
        if(b>=c){
            System.out.print("Eligible");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}