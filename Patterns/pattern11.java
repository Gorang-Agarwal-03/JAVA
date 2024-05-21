
public class pattern11 {
    public static void main(String[] args) {
        //Outter Loop
        for (int i =1;i<=4;i++){
            //Inner Loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(4-i);
            for( int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //Outter Loop
        for (int i =4;i>=1;i--){
            //Inner Loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(4-i);
            for( int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}
    

