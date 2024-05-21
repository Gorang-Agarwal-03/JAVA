public class Recurrsion1 {
    public static void Sum(int i , int n , int sum) {
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum += i;
        Sum(i+1, n, sum);
        
    }
    public static void main(String args[]) {
        Sum(1, 10, 0);
        
    }
    
}
