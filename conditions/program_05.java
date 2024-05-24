package conditions;

import java.util.Scanner;

public class program_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the cost prize :");
        int cp = sc.nextInt();

        System.out.println("Entre the selling prize here:");
        int sp = sc.nextInt();

        int diff = sp-cp;

        if(diff<0){
            diff = diff *(-1);
            System.out.println("Seller made the lose of "+diff);
        }
        else{
            System.out.println("Seller made the profit of " +diff);
        }
    }
}
