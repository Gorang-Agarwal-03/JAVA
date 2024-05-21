public class Recurrsion2 {
    public static int fact(int n) {
        if(n==1 || n==0){
            return 1;
        }
       int a = fact(n-1); 
       int b = n*a;
       return b;
        
    }
    public static void main(String args[]) {
        int ans = fact(5);
        System.out.print(ans); 
        
    }
    }

