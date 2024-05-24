package conditions;

import java.util.Scanner;

public class program_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number here: ");
        int n = sc.nextInt();

        if(n<0){
            n = n*(-1);
            System.out.println(" The absolute number is :" +n);
        }
        else{
            System.out.println("The absolute number is : "+n);
        }
    }
}
