public class preordertree {
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
    public static void preorder( Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
         int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;
         Binarytree tree = new Binarytree();
         Node root = tree.buildtree(nodes);
         //System.out.println(root.data);
         preorder(root);
    }
}
