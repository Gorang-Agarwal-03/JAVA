//Bubble Sort



import java.util.*;

class Bubble {
    public static void Array(int arr[]) {
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

}
    public static void main(String args[]) {
        int arr[] = {9,49,6,21,55,77,97,99,56,76,33,78,76,77};


        for(int i=0;i<=arr.length-1; i++){
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        Array(arr);
    }
}
