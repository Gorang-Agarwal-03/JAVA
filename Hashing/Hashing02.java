// Union of two arrays
import java.util.*;

public class Hashing02 {
    public static int Union (int  arr1[] ,int  arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for( int i =0; i <arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j = 0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    
    }



    public static void main(String[] args) {
        int arr1[] = {7,3,9,4,8};
        int arr2[] = {2,1,3,4,7,9,8,0,5,6};
        System.out.println(Union(arr1, arr2));  
    }
}
