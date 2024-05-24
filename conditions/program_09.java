package conditions;

import java.util.Scanner;

public class program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Positive number here: ");
        int num = sc.nextInt();
        if(num % 5==0 && num % 3==0){
            System.out.println("Your number is divisible by both 5 and 3");
        }
        else if(num<0){
            System.out.println("Please entre the positive number");
        }
        else{
            System.out.println("your number is not divisible by both 5 and 3");
        }
    }
}
