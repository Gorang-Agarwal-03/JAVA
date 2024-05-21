public class queueusingLinkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }


    static class Queue{
        static Node tail = null;
        static Node head = null;

        public static boolean isEmpty() {
            return head==null && tail == null;
        }
        
        //enqueue

        public static void add (int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return; 
            }
            tail.next = newNode;
            tail = newNode;
        }
        // Dequeue (Subtracting from queue)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
             int front = head.data;
             if(head == tail){
                tail = null;
             }
             head=head.next;
             return front;
             }

        // Peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
    }    
        public static void main(String[] args) {
            Queue q =new Queue();
            q.add(1);
            q.add(2);
            q.add(6);
            q.add(8);
            q.add(9);
            
         
             

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
