package conditions;

import java.util.Scanner;

public class program_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre Your Digit Here: ");
        int num = sc.nextInt();

        if(num %2 ==0){
            System.out.println("Your number is Even");
        }
        else{
            System.out.println("Your number is odd");
        }
    }
}
