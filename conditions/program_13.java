package conditions;

import java.util.Scanner;

public class program_13 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Age of peron A here: ");
        int a = sc.nextInt();

        System.out.println("Entre the Age of person B here: ");
        int b = sc.nextInt();

        System.out.println("Entre the Age of person C here: ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (a+c)>b ){
            System.out.println("It is an triangle " );
        }
        else{
            System.out.println("This is not an triangle");
        }
    }
}
