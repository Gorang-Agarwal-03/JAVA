public class circularqqueue {
    static class Queue{
        static int arr[];
        static int size;
        static int Rear = -1;
        static int front = -1;

        Queue(int size){
            arr= new int [size];
            this.size = size;
        }
        public static boolean isEmpty() {
            return Rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (Rear+1)%size == front;
        }
        //enqueue

        public static void add (int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front=0;
            }
             Rear = (Rear+1)%size;
            arr[Rear] = data;
        }
        // Dequeue (Subtracting from queue)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
             int result =arr[front];
             // For single element 
             if(front == Rear){
                Rear= front = -1;
             }
             else{
                front = (front+1)%size;
             }
             return result;
             }

        // Peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }    
        public static void main(String[] args) {
            Queue q =new Queue(5);
            q.add(1);
            q.add(2);
            q.add(6);
            System.out.println(q.remove());
            q.add(8);
            q.add(9);
            System.out.println(q.remove());
            q.add(0);
            q.add(100);
            System.out.println(q.remove());
            q.add(11);
         
             

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
