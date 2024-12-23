import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTree{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    // Declaring a root of binary tree
    Node root;

    // making sure that whenever tree is initialized root is null
    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Build the tree

        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.right = new Node(6);

        /*
         * Above Tree Would Look Like
         *
         *           1
         *       2       3
         *    4     5       6
         * */

//        System.out.println("<---- PRE-ORDER-TRAVERSAL------>");
//        binaryTree.preOrderTraversal(binaryTree.root);
//
//        System.out.println("\n <---- IN-ORDER-TRAVERSAL------>");
//        binaryTree.inOrderTraversal(binaryTree.root);
//
//
//        System.out.println("\n <---- POST-ORDER-TRAVERSAL------>");
//        binaryTree.postOrderTraversal(binaryTree.root);

//        System.out.println("\n <---- LEVEL-ORDER-TRAVERSAL------>");
//        BFSTraversal.levelOrderTraversal(binaryTree.root);

    }

}
