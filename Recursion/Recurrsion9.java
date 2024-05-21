public class Recurrsion9 {
    public static boolean[] map = new boolean[26];

    public static void callfunction(String str,int indx,String Newstring){
        if(indx==str.length()){
            System.out.println(Newstring);
            return;
        }
        char currChar = str.charAt(indx);
        if(map[currChar - 'a']==true){
            callfunction(str, indx+1, Newstring);
        }
        else{Newstring += currChar;
        map[currChar-'a']=true;
        callfunction(str, indx+1, Newstring);
    }
    }
    public static void main(String[] args) {
        String str="abccdafghusfeyghwjguyjoselj";
        callfunction(str, 0, "");
    }
}
