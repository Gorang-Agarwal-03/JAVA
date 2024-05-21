public class recurrsion16 { 
    public static int printmethord(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = printmethord(n-1);

        int ways2 =(n-1)* printmethord( n-2);

        return ways1+ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(printmethord(n));
    }
}
