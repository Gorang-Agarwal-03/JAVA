public class Recurrsion8 {
    public static void converted(String str, int indx, int count, String Newstring){ 
        if(indx==str.length()){
            for( int i=0;i<count;i++){
                Newstring += 'x';
            }
            System.out.println(Newstring);
            return;
        }
        char currChar = str.charAt(indx);
        if(currChar=='x'){
            count++;
            converted(str, indx+1, count, Newstring);
        }else{Newstring+= currChar;
            converted(str, indx+1, count, Newstring);
        }


    }
    public static void main(String[] args) {
        String str="axbxcxxd";
        converted(str, 0, 0, "");
    }
}
