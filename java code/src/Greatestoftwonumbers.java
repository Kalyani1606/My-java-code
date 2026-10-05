import java.util.Scanner;
public class Greatestoftwonumbers {
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);

       System.out.println("Enter the num1 numbers");
       int num1 =sc.nextInt();

        System.out.println("Enter the num2  numbers");
        int num2 =sc.nextInt();


        if(num1 > num2){
            System.out.println("The greater number is " + num1);
        }else if(num2>num1){
            System.out.println("The greater number is " + num2);
        }else{
            System.out.println("both num are equall");
        }
    }
}
