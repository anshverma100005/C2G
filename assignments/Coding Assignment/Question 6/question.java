import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=2){
            b=b+2;
        }
        else{
            b=b+a;
        }
        System.out.print(b);
    }
}