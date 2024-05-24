package conditions;

import java.util.Scanner;

public class program_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the positive number here: ");
        int num = sc.nextInt();
        if(num>=0){
            if(num % 5==0){
                System.out.println("Your number is divisible by 5");
            }
            else{
                System.out.println("Your number is not an divisible of 5");
            }
        }
        else{
            System.out.println("Please entre the positive number");
        }
    }
}
