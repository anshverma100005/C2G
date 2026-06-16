import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a<10){
            System.out.print("Slow");
        }
        else if(a>50){
            System.out.print("Fast");
        }
        else{
            System.out.print("Average");
        }
    }
}