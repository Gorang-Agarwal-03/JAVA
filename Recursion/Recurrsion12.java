public class Recurrsion12 {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void Printcombination(String str,int indx,String combination){
        
        if(indx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar= str.charAt(indx);
        String mapping = keypad[currChar-'0'];

        for(int i =0;i<mapping.length();i++){
            Printcombination(str, indx+1, combination+mapping.charAt(i));
        }

    }
        public static void main(String args[]) {
        String str="23";
        Printcombination(str, 0, "");

    }
}
