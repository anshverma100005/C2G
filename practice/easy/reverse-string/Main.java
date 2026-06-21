import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h=sc.nextLine();
        for(int i=h.length()-1;i>=0;i--){
            System.out.print(h.charAt(i));
        }
    }
}