import java.util.LinkedList;
import java.util.Queue;

public class Sumofnodes {
     static class Node{
        int data;
        Node right;
        Node left;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int indx = -1;
        public static  Node buildtree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

    }
    public static void postorder( Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(!q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }   
                }
                else{
                    System.out.println(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    public static int Sumofnodes(Node root){
        if(root == null){
           return 0;
        }
        
        int leftsum = Sumofnodes(root.left);
        int rightsum = Sumofnodes(root.right);
        return leftsum +rightsum + root.data;
    }
        
    
    public static void main(String[] args) {
         int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,} ;
         Binarytree tree = new Binarytree();
         Node root = tree.buildtree(nodes);
         //System.out.println(root.data);
         // levelOrder(root);
         System.out.println(Sumofnodes(root));
    }
}
