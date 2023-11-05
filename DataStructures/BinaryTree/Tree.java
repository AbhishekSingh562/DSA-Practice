import java.sql.SQLOutput;
import java.util.*;
public class Tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createTree();
    }
    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new Node(data);

        System.out.println("Enter left for "+ data);
        root.left = createTree();

        System.out.println("Enter right for "+ data);
        root.right = createTree();

        return root;
    }
    static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }
}

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.data = data;
    }
}