import java.util.HashSet;

public class Recurrsion11 {

    public static void commonout(String str,int indx ,String Newstring , HashSet<String>set){
        if(indx==str.length()){
            if(set.contains(Newstring)){
                return;
            }
            else{System.out.println(Newstring);
                set.add(Newstring);
                return;}
            
        }
        char currChar = str.charAt(indx);

        commonout(str, indx+1, Newstring+currChar,set);

        commonout(str, indx+1, Newstring,set);
    }
    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        commonout(str, 0, "",set);
    }
}
