public class recurrsion15 {
    public static int printfloors(int n ,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically placed
        int verticalplace = printfloors(n-m, m);

        //horizontally place
        int horizontalplace = printfloors(n-1, m);

        return verticalplace+horizontalplace;
    }
    public static void main(String[] args) {
        int n=4 ,m=2;
       System.out.println(printfloors(n, m));  
    }
}
