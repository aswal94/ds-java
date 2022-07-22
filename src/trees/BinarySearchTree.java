package trees;

public class BinarySearchTree {
    Node root;

    public void add( int val){
        root = addRecursive(root, val);

    }

    private Node addRecursive(Node current, int val){
        Node t;
        if(current == null){
            t = new Node();
            t.val = val;
            current = t;
        }else{
            if(val < current.val){
                 current.left = addRecursive(current.left, val);
            }else if(val > current.val){
                current.right = addRecursive(current.right, val);
            }else{
                return current;
            }
        }
        return current;
    }

    public void printPreOrder(){
    }

    public void printInOrder(){
        printInOrderRecursive(root);
    }

    void printInOrderRecursive(Node current){
        if(current.left != null){
            printInOrderRecursive(current.left);
        } else if (current.right != null) {
            printInOrderRecursive(current.right);
        }
            System.out.println(" " + current.val + " ");

    }

    public void printPostOrder(){

    }

    public void remove(){

    }

    public void search(){}
}
