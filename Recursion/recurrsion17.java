import java.util.ArrayList;

public class recurrsion17 {
    public static void findsubset(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printsubset(int n,ArrayList<Integer>subset) {
        if(n==0){
            findsubset(subset);
            return;
        }

        subset.add(n);
        printsubset(n-1, subset);

        subset.remove(subset.size()-1);
        printsubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printsubset(n, subset);
    }
}
