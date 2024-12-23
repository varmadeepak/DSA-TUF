import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {
    public static boolean rootToNodePath(BinaryTree.Node root,int targetNodeData,List<Integer> path){
        if(root == null) return false;

        path.add(root.data);
        if(root.data == targetNodeData) return true;

        boolean left = rootToNodePath(root.left,targetNodeData,path);
        boolean right = rootToNodePath(root.right,targetNodeData,path);

        if(left || right ) return true;

        path.remove(path.size()-1);
        return false;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new BinaryTree.Node(1);
        binaryTree.root.left = new BinaryTree.Node(2);
        binaryTree.root.right = new BinaryTree.Node(3);
        binaryTree.root.left.left = new BinaryTree.Node(4);
        binaryTree.root.left.right = new BinaryTree.Node(5);
        binaryTree.root.right.right = new BinaryTree.Node(6);
        binaryTree.root.left.right.left = new BinaryTree.Node(7);
        /*
         * Above Tree Would Look Like
         *
         *           1
         *       2       3
         *    4     5       6
         *         7
         * */

        List<Integer> path = new ArrayList<>();
        rootToNodePath(binaryTree.root,7,path);
        for(Integer p : path){
            System.out.print(p + "->");
        }
    }
}
