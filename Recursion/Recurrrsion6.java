public class Recurrrsion6 {
    public static int first = -1;
    public static int last = -1;

    public static void accurance(String str , int indx , char element ){
        if(indx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(indx);
        if(currChar==element){
            if(first==-1){
                first=indx;
            }else{
                last=indx;
            }    
            
        }
        accurance(str, indx + 1, element);
}
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        accurance(str, 0, 'a');
        
    }
}
