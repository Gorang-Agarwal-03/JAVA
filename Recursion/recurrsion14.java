public class recurrsion14 {
    public static int printmoves(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwords
        int downword = printmoves(i+1, j, n, m);

        //rightmove
        int rightpath = printmoves(i, j +1, n, m);
        return downword+rightpath;
    }
    public static void main(String args[]) {
        int n=3,m=3;
       int totalmoves = printmoves(0, 0, n, m);
       System.out.println(totalmoves);
    }
}
