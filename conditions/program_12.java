package conditions;

import java.util.Scanner;

public class program_12 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Age of peron A here: ");
        int num1 = sc.nextInt();

        System.out.println("Entre the Age of person B here: ");
        int num2 = sc.nextInt();

        System.out.println("Entre the Age of person C here: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println("The least age between thee is: " +num1 );
        }
        else if(num2<num1 && num2<num3){
            System.out.println("The least age between thee is: " + num2);
        }
        else{
            System.out.println("The least age between thee is: " + num3);
        }
    }
}
