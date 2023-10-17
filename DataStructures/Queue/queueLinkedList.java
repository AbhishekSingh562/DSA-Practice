import java.util.LinkedList;

public class queueLinkedList {
    LinkedList<Integer> list; // Declare and initialize the LinkedList

    public void createQueue() {
        list = new LinkedList<>(); // Initialize the LinkedList in the constructor
        System.out.println("Queue has been created type of linklist");
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void enQueue(int val){
        if(isEmpty()){
            list.addFirst(val);
        }else{
            list.add(val);
        }
    }

    public int deQueue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("Empty queue!!");
        }else {
            value = list.remove();
        }return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return -1;
        }else{
            return list.peek();
        }
    }

    public void deletionOfQueue(){
        list.clear();
    }

    public static void main(String[] args) {
        queueLinkedList qll = new queueLinkedList();
        qll.createQueue();
        qll.enQueue(14);
        qll.enQueue(20);
        qll.enQueue(25);
        System.out.println(qll.peek());
        qll.deQueue();
        qll.enQueue(55);
        qll.deQueue();
        qll.deQueue();
        System.out.println(qll.peek());
    }
}
