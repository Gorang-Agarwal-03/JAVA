package conditions;

import java.util.Scanner;

public class program_11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Entre the First number here: ");
        int num1 = sc.nextInt();

        System.out.println("Entre the Second number here: ");
        int num2 = sc.nextInt();

        System.out.println("Entre the Third number here: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num3<num2){
            System.out.println("The greatest number between thee is: " + num2);
        }
        else if(num1<num3 && num2<num3){
            System.out.println("The greatest number between thee is: " + num3);
        }
        else{
            System.out.println("The greatest number between thee is: " + num1);
        }
}
}
