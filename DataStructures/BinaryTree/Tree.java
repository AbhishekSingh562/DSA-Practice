import java.sql.SQLOutput;
import java.util.*;
public class Tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        preOrder(root);
        postOrder(root);
        int height = getHeight(root);
        System.out.println("Height of the binary tree is "+height);
        int sizeOfBT = sizeOfBinaryTree(root);
        System.out.println("Size of the binary tree is "+sizeOfBT);
        int max = getMaxOfBT(root);
        System.out.println("Maximum value present in this binary tree is "+ max);
        int min = getMinOfBT(root);
        System.out.println("Minimum value present in this binary tree is "+ min);
    }
    static Node createTree(){
        Node root = null;
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        if(data == -1) return null;
        root = new Node(data);

        System.out.println();
        System.out.print("Enter left for "+ data);
        root.left = createTree();

        System.out.println();
        System.out.print("Enter right for "+ data);
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
    static int getHeight(Node root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0.
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1; // Add 1 to account for the current node.
        }
    }

    static int sizeOfBinaryTree(Node root){
        if(root == null) return 0;
        else return sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right)+1;
    }

    static int getMaxOfBT(Node root){
        if(root == null) return Integer.MIN_VALUE;

        else return Math.max(root.data, Math.max(getMaxOfBT(root.left),getMaxOfBT(root.right)));
    }

    static int getMinOfBT(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Return the maximum possible integer value to indicate an empty tree.
        } else {
            int leftMin = getMinOfBT(root.left);
            int rightMin = getMinOfBT(root.right);
            return Math.min(root.data, Math.min(leftMin, rightMin));
        }
    }


}

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.data = data;
    }
}