public class Recurrsion5 {

    public static void reverse(String str , int indx) {
        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }

        System.out.print(str.charAt( indx));
        reverse(str, indx - 1);
        
    }
    public static void main(String[] args) {
        reverse("GORANG", 5);
        
    }
}
