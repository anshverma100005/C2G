import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b){
            System.out.print("Recharge Successful");
        }
        else{
            System.out.print("Insufficient Balance");
        }
    }
}