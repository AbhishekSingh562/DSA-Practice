public class stackArray {
    int[] arr;
    int topOfTheArray;

    public void createStack(int size){
        this.arr = new int[size];
        this.topOfTheArray = -1;
        System.out.println("The stack has been created of size "+size);
    }

    public boolean isEmpty(){
        if(topOfTheArray ==-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        if(topOfTheArray == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }else{
            arr[topOfTheArray+1] = value;
            topOfTheArray++;
            System.out.println("Vlaue has been added successfully!!");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int topArray  = arr[topOfTheArray];
            topOfTheArray--;
            return topArray;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty !!");
            return -1;
        }else{
            return arr[topOfTheArray];
        }
    }
    public void deleteStack(){
        arr = null;
        System.out.println("The stack has been deleted");
    }

    public static void main(String[] args) {
        stackArray stack = new stackArray();
        stack.createStack(10);
        stack.push(15);
        stack.push(19);
        stack.push(44);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.push(1);
        System.out.println(stack.peek());
        stack.deleteStack();
    }
}
