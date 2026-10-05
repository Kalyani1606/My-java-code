import java.util.Scanner;
public class posornegnum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the number");
        if(num >0){
            System.out.println("The given number  "+ num + " is positive");
        }else if(num < 0){
            System.out.println("The given number  "+ num + " is negative");
        }else{
            System.out.println("The given number  "+ num + " is zero");
        }
    }
}
