package dsa.p1;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    Node root;

    // Constructor
    public BST() {
        root = null;
    }

    // Insert a new key into the dsa.p2.BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
            System.out.println(root.left.key);

        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }


    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);


    }
}
