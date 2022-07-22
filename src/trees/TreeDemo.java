package trees;

public class TreeDemo {
    Node root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(14);
        bst.add(1);
        bst.add(17);

        bst.printInOrder();
    }
}
