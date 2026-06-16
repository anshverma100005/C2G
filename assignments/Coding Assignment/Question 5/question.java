import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h=sc.next();
        if(h.charAt(0)=='R'){
            System.out.print("Stop");
        }
        else if(h.charAt(0)=='G'){
            System.out.print("Go");
        }
        else{
            System.out.print("Wait");
        }
    }
}