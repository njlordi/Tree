/*
 */
package tree;

public class TreeNode {

    public int someValue;
    public static int sizeOfTree;
    public TreeNode parent;
    public TreeNode leftChild;
    public TreeNode rightChild;

    // Constructor for root
    public TreeNode(int someValue) {
        this.someValue = someValue;
        parent = null;
        leftChild = null;
        rightChild = null;
        sizeOfTree = 1;
    }
    
    // Contructor for child
    public TreeNode(int someValue, TreeNode a, TreeNode b) {
        this.someValue = someValue;
        parent = null;
        leftChild = a;
        rightChild = b;
        sizeOfTree++;
    }
    
    public void AddTreeNode(int newValue) {
        
        if (leftChild == null) {
            leftChild = new TreeNode(newValue, null, null);
        } else if (rightChild == null) {
            rightChild = new TreeNode(newValue, null, null);
        }
    }

    public void PrintTree() {
        System.out.println("Value is: " + this.someValue + " Size of tree is: " + sizeOfTree);
        if (leftChild != null) {
            leftChild.PrintTree();
        }
        if (rightChild != null){
            rightChild.PrintTree();
        }
    }

}
