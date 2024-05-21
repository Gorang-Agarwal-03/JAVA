

public class Triestructure {
    static class Node{
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for( int i = 0;i<26 ;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0;i<word.length() ;i++){
            int indx = word.charAt(i) - 'a';

            if(curr.children[indx] ==null){
                curr.children[indx] = new Node();
            }
            if( i == word.length()-1){
                curr.children[indx].eow = true;

            }

             curr = curr.children[indx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i< key.length();i++){
            int indx = key.charAt(i) - 'a';


            if(curr.children[indx] == null){
                return false;
            }
            if(i== key.length()-1 && curr.children[indx].eow == false ){
                return false;
            }
            curr = curr.children[indx];
        }
        return true;
    }
    public static void main(String args[]) {
        String word[] ={"the" , "a", "there" , "their" , "any"};
        for( int i = 0 ;i<word.length;i++){
            insert(word[i]);

            System.out.println(search("there"));
            System.out.println(search("an"));
            System.out.println(search("thor"));

        }
        
    }
}
