
public class queueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public void createQueue(int size){
        this.arr = new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue = -1;
        System.out.println("Queue has been successfully created ");
    }

    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(beginningOfQueue==-1 || beginningOfQueue==arr.length){
            return true;
        }else {
            return false;
        }
    }
    public void enQueue(int val){
        if(isFull()){
            System.out.println("The queue is full!");
        }else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue] = val;
            System.out.println("Successfully inserted the element in the link !!");
        }else{
            topOfQueue++;
            arr[topOfQueue] = val;
            System.out.println("Successfully inserted "+val +" in the queue.");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty !");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }return result;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("There is no queue present!!");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
    }

    public static void main(String[] args) {
        queueArray queue = new queueArray();
        queue.createQueue(5);
        queue.enQueue(15);
        queue.enQueue(20);
        queue.enQueue(25);
        queue.enQueue(30);
        System.out.println(queue.peek());
        queue.deQueue();
        System.out.println(queue.peek());


    }
}
