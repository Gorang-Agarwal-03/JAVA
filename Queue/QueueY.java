public class QueueY {
    static class Queue{
        static int arr[];
        static int size;
        static int Rear = -1;

        Queue(int size){
            arr= new int [size];
            this.size = size;
        }
        public static boolean isEmpty() {
            return Rear == -1;
        }
        //enqueue

        public static void add (int data){
            if(Rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            Rear++;
            arr[Rear] = data;
        }
        // Dequeue (Subtracting from queue)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
             int front =arr[0];
             for( int i=0;i<Rear;i++){
                arr[i] = arr[i+1];
             }
             Rear--;
             return front;
             }

        // Peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }    
        public static void main(String[] args) {
            Queue q =new Queue(10);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(5);
            q.add(4);
            q.add(8);
            q.add(6);
            q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
