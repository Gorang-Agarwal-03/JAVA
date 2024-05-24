package conditions;

import java.util.Scanner;

public class program_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre the year here: ");
        int year = sc.nextInt();
        if(year %4==0 || year % 400==0 ){
            System.out.println("your year is an leap year");
        }
        else{
            System.out.println("your year is not an leap year");
        }
    }
}
