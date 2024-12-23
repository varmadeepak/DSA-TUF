import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {

    public static void findRootToLeafPaths(BinaryTree.Node root, List<List<Integer>> leafPaths,List<Integer> path){
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null){
            leafPaths.add(new ArrayList<>(path));
        }
        else{
            findRootToLeafPaths(root.left,leafPaths,path);
            findRootToLeafPaths(root.right,leafPaths,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Build the tree

        binaryTree.root = new BinaryTree.Node(1);
        binaryTree.root.left = new BinaryTree.Node(2);
        binaryTree.root.right = new BinaryTree.Node(3);
        binaryTree.root.left.left = new BinaryTree.Node(4);
        binaryTree.root.left.right = new BinaryTree.Node(5);
        binaryTree.root.right.right = new BinaryTree.Node(6);

        List<List<Integer>> leafPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        RootToLeafPaths.findRootToLeafPaths(binaryTree.root,leafPaths,path);

        for(List<Integer> leafPath : leafPaths){
            for(Integer i : leafPath){
                System.out.print(i + "->");
            }
            System.out.println("\n");
        }
    }
}


