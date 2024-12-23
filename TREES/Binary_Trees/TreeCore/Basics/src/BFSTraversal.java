import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public static void levelOrderTraversal(BinaryTree.Node root){
        Queue<BinaryTree.Node> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();

            for(int i=0; i<currentLevelSize; i++){
                BinaryTree.Node currentNode = queue.peek();
                queue.remove();
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            System.out.println(" ");
        }
    }
}
