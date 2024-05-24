package conditions;

import java.util.Scanner;

public class program_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the height of rectangle here:");
        int h = sc.nextInt();

        System.out.println("Entre the width of the rectangle here:");
        int w = sc.nextInt();

         int area = h*w;

         int peri = (h+w)*2;

         if(area > peri){
            System.out.println("Area of rectangle is greater the perimeter");
         }
         else{
            System.out.println("Perimeter of rectangle is greater then the area ");
         }
    }
}
