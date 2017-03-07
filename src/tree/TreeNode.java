/*
 */
package tree;

public class TreeNode {

    public int someValue;
    public static int sizeOfTree;
    public TreeNode leftChild;
    public TreeNode rightChild;

    // Constructor for root
    public TreeNode(int someValue) {
        this.someValue = someValue;
        leftChild = null;
        rightChild = null;
        sizeOfTree = 1;
    }
    
    // Contructor for child
    public TreeNode(int someValue, TreeNode a, TreeNode b) {
        this.someValue = someValue;
        leftChild = a;
        rightChild = b;
    }
    
    public void AddTreeNode(int newValue) {
        if (leftChild == null) {
            leftChild = new TreeNode(newValue, null, null);
            sizeOfTree++;
        } else if (rightChild == null) {
            rightChild = new TreeNode(newValue, null, null);
            sizeOfTree++;
        } else if (sizeOfTree % 2 == 0) {
            leftChild.AddTreeNode(newValue);
        } else {
            rightChild.AddTreeNode(newValue);
        }
    }

    public void PrintTree() {
        
        System.out.println(this.someValue);
        
        if (leftChild != null) {
            leftChild.PrintTree();
        } 
        
        if (rightChild != null){
            rightChild.PrintTree();
        }
        
    }

}
