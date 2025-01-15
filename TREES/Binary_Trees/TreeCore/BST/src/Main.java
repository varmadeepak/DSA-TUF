

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

    public Node insertNode(Node root,int val){
        Node newNode = new Node(val);

        if(root == null) return newNode;

        Node parent = null;
        Node current = root;

        while(current != null){
            // assign previous node before moving onto next node
            parent = current;

            if(val > current.data){
                current = current.right;
            }
            else if(val < current.data){
                current = current.left;
            }
        }

        if(val > parent.data){
            parent.right = newNode;
        }
        else if(val < parent.data){
            parent.left = newNode;
        }
        return root;
    }

    void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + "-");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.insertNode(binaryTree.root,4);
        binaryTree.root = binaryTree.insertNode(binaryTree.root,2);
        binaryTree.root = binaryTree.insertNode(binaryTree.root,1);
        binaryTree.root = binaryTree.insertNode(binaryTree.root,7);
        binaryTree.root = binaryTree.insertNode(binaryTree.root,3);

        // Build the tree
        /*
         * Above Tree Would Look Like
         *
         *           4
         *       2       7
         *    1     3
         * */

        binaryTree.inOrderTraversal(binaryTree.root);

    }

}
