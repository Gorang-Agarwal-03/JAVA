public class Recurrsion4 {

    public static int Calcpower(int x , int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpow1 = Calcpower(x, n-1);
        int xpow= x*xpow1;
        return xpow;
    }
    public static void main(String args[]) {
        int x=2 , n = 5;
        int ans =Calcpower(x, n);
        System.out.println(ans);
    }
}
