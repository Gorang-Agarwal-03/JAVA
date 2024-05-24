package conditions;

import java.util.Scanner;

public class program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the positive number here: ");
        int num = sc.nextInt();
        if(num % 5==0 && num % 3!=0){
            System.out.println("Given number is divisible by 5 but not by 3");
        }
        else if(num % 5!=0 && num % 3==0){
            System.out.println("Given number is divisible by 3 but not by 5");
        }
        else if(num % 5==0 && num % 3==0){
            System.out.println("Your number is divisible by both 5 and 3");
        }
        else{
            System.out.println("your number is not divisible by both 5 and 3");
        }
    }
}
