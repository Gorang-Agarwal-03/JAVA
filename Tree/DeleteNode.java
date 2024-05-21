public class DeleteNode {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data){
          this.data = data;
        }
  }

  public static Node insert(Node root ,int val){
      if(root == null){
          root = new Node(val);
          return root;
      }
      if(root.data > val){
          root.left = insert(root.left, val);
      }
      else{
          root.right = insert(root.right , val);
      }
      return root;
  }
  public static void inorder(Node root){
      if(root == null){
          return;
      }
      inorder(root.left);
      System.out.println(root.data + " ");
      inorder(root.right);
  }

  public static boolean search(Node root , int key){
    if(root == null){
        return false;
    }
    if(root.data > key){
        return search(root.left, key);
    }
    else if (root.data < key){
        return search(root.right , key);
    }
    else{
        return search(root, key);
    }
  }
  public static Node delete(Node root , int val){
    if(root.data > val){
        root.left = delete(root.left , val);
    }
    else if (root.data < val){
        root.right = delete(root.right , val);
    }
    else{ 
        // case 1
        if(root.left == null && root.right == null){
            return null;
        }
        // case2
        if(root.left == null){
            return root.right;
        }
        else if (root.right == null){
            return root.left;
        }
        // case3
        Node IS = inordersuccser(root.right);
        root.data = IS.data;
         root.right = delete(root.right , IS.data);
        }
        return root;
  }

  public static Node inordersuccser(Node root ){
    while(root.left != null){
        root = root.left;
    }
    return root;

  }


  public static void main(String[] args) {
      int value[] = { 8 , 5 , 3 , 1 , 4 , 2 , 9 , 14 , 11 , 13 }; 
      Node root = null;

      for(int i=0;i<value.length;i++){
          root = insert(root, value[i]);

      }
      inorder(root);
      System.out.println();

      delete(root , 14);
      inorder(root);
       // delete(root , 9);
  }
    
}
