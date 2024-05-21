public class Quick_sort {
    public static int partition(int arr[] , int low , int heigh){
        int pivot = arr[heigh];
        int i = low -1 ;

        for ( int j = low ; j < heigh; j++){
            if(arr[j] < pivot){
                i++;

                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[heigh] = temp;
        return i ;
    }
    public static void quick_sort(int arr[],int low , int heigh){
        if(low < heigh){
            int pivot = partition(arr , low ,heigh);

            quick_sort(arr, low, pivot -1);
            quick_sort(arr, pivot + 1, heigh);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2 , 5 , 4 , 1 , 3 , 9 , 8 , 7 , 6};
        int n = arr.length;
        quick_sort(arr, 0, n-1);
        
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
