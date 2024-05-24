package conditions;

import java.util.Scanner;

public class program_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the height of rectangle here:");
        int l = sc.nextInt();

        System.out.println("Entre the width of the rectangle here:");
        int b = sc.nextInt();

        if(l==b){
            System.out.println("Square");
        }
        else{
            System.out.println("Not a Square");
        }

    }
}
