import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        String s=sc.next();
        if(s.length()>=8){
            a++;
        }
        if(s.indexOf(" ")==-1){
            a++;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' )||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                a++;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                a++;
                break;
            }
        }
        if(a==4){
            System.out.print("Valid");
        }
        else{
            System.out.print("Invalid");
        }
    }
}