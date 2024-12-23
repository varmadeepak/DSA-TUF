public class DFSTraversal {

    public static void preOrderTraversal(BinaryTree.Node root){
        // NODE -> LEFT -> RIGHT
        if(root == null) return; // BASE CASE

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(BinaryTree.Node root){
        // LEFT -> NODE -> RIGHT
        if(root == null) return; // BASE CASE

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(BinaryTree.Node root){
        // LEFT -> RIGHT -> NODE
        if(root == null) return; // BASE CASE

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
