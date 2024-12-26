import java.util.ArrayList;
import java.util.List;

public class MorrisPreOrderTraversal {
    private static List<Integer> morrisPreOrderTraversal(BinaryTree.Node root) {
        List<Integer> preOrderTraversal = new ArrayList<>();
        BinaryTree.Node curr = root;

        while(curr != null){
            // case 1 => No Left Child

            if(curr.left == null){
                preOrderTraversal.add(curr.data);
                curr = curr.right;
            }else{
                // case 2 => Left Child exists , find the rightmost leaf in left sub tree
                BinaryTree.Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                // 2.1 check if thread already exists
                // if exists remove else add

                if(prev.right == null){
                    prev.right = curr;
                    preOrderTraversal.add(curr.data);
                    curr = curr.left;
                }else{
                    // thread already exists => remove thread , move to right sub tree
                    prev.right = null;
                    curr = curr.right;
                }

            }


        }
        return preOrderTraversal;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Build the tree

        binaryTree.root = new BinaryTree.Node(1);
        binaryTree.root.left = new BinaryTree.Node(2);
        binaryTree.root.right = new BinaryTree.Node(3);
        binaryTree.root.left.left = new BinaryTree.Node(4);
        binaryTree.root.left.right = new BinaryTree.Node(5);
        binaryTree.root.left.right.right= new BinaryTree.Node(6);

        List<Integer> preOrderTraversal = morrisPreOrderTraversal(binaryTree.root);

        for(Integer i : preOrderTraversal){
            System.out.print(i + "->");
        }

    }

}
