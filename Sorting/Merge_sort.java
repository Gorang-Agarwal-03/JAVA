public class Merge_sort {
    public static void conqure(int arr[],int st, int mid,int en){
        int mrger[] = new int[en-st+1];
        int indx1 = st;
        int indx2 = mid+1;
        int x =0;

        while (indx1<=mid && indx2<=en){
            if(arr[indx1]<= arr[indx2]){
                mrger[x++] = arr[indx1++];}
            else{
                mrger[x++] = arr[indx2++];
            }
        }

        while(indx1 <=mid){
            mrger[x++] = arr[indx1++];
        }
        while(indx2 <=en){
            mrger[x++] = arr[indx2++];
        }
        for( int i=0, j=st;i<mrger.length;i++ , j++){
            arr[j]=mrger[i];
        }
    }
    public static void devide( int arr[],int st,int en){
        if(st>=en){
            return;
        }
        int mid = st + (en - st) / 2; // st+en /2 ka second form 
        devide(arr , st , mid);
        devide(arr , mid+1 , en);
        conqure(arr ,st ,mid,en);

    }
    public static void main(String args[]) {
        int arr[] = {6,5,8,2,9,10,12,11,14,13,4,17,16,18,1};
        int n = arr.length;
        
        devide(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println();
}
}
