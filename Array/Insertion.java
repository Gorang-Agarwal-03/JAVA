public class Insertion {
    public static void Array(int arr[]) {
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

}
    public static void main(String args[]) {
        int arr[] = {9,49,6,21,55,77,97,99,56,76,33,78,76,77};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        Array(arr);
        
    }
}
