import java.lang.reflect.Array;
import java.util.*;

public class Selection {
    public static void Array(int arr[]) {
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();}
    public static void main(String args[]) {
        int arr[] = {9,49,6,21,55,77,97,99,56,76,33,78,76,77};

        for( int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;


        }
        Array (arr);
        
    } 
}
