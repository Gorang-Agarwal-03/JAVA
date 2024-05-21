public class Recurrsion10 {
public static void Subsequence(String str,int indx, String Newstring){
    
    if(indx==str.length()){
        System.err.println(Newstring);
        return;
    }
    char currChar= str.charAt(indx);
    
    //If Intrested
    Subsequence(str, indx+1, Newstring+currChar);


    //If Not Intrested
    Subsequence(str, indx+1, Newstring);
}

    public static void main(String args[]) {
        String str= "abc";
        Subsequence(str, 0, "");
    }
    
}
