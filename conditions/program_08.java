package conditions;

import java.util.Scanner;

public class program_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the Positive number here:");
        int n = sc.nextInt();

        if(n>99 && n<1000){
            System.out.println("Yes,It is an three digit number");
        }
        else if(n>0 && n<99 && n>1000){
            System.out.println("NO,It is not an three digit number");
        }
        else{
            System.out.println("Please entre positive value");
        }
        
    }
}
