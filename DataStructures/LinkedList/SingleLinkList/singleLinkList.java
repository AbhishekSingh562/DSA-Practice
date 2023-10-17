public class singleLinkList {
    public class Node{
        int value;
        Node next;
    }
    Node head;
    Node tail;
    int size;

    public Node createSingleLinkedList(int val){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = val;
        head = node;
        tail = node;
        size=1;
        System.out.println("Link list has been created!!");

        return head;
    }

    public void insertion(int val,int position){
        Node node = new Node();
        node.value = val;
        if(head == null){
            createSingleLinkedList(val);
            return;
        }else if(position==0){
            node.next = head;
            head = node;
        }else if(position>=size){
            node.next = null;
            tail.next = null;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index<position-1) {
                tempNode= tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
        System.out.println("insertion has been successfull");
    }

    public void traversal(){
        if(head == null){
            System.out.println("LinkedList not found");
        }else{
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        singleLinkList csll = new singleLinkList();
        csll.createSingleLinkedList(15);
        csll.insertion(19,0);
        csll.insertion(18,1);
        csll.insertion(24,2);
        csll.traversal();
    }
}
