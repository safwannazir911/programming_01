package dsa.p3;

class TreeNode {
    TreeNode(int data) {
        this.data = data;
    }

    int data;
    TreeNode right;
    TreeNode left;
}

class BSTree {
    TreeNode root;

    BSTree(int data) {
        this.root = new TreeNode(data);
    }

    void insertNode(TreeNode root, int data) {

        if (root == null) {
            return;
        }

        TreeNode node = new TreeNode(data);

        if (data < root.data) {
            if (root.left == null) {
                root.left = node;
            } else {
                insertNode(root.left, data);
            }
        } else if (data >= root.data) {
            if (root.right == null) {
                root.right = node;
            } else {
                insertNode(root.right, data);
            }
        }

    }

    void printNodes(TreeNode root) {

        if (root == null) {
            return;
        }

        printNodes(root.left);
        System.out.print(root.data + " ");
        printNodes(root.right);

    }

    int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;

    }

    void swap(TreeNode root) {
        if (root.left != null && root.right != null) {
            int temp = root.left.data;
            root.left.data = root.right.data;
            root.right.data = temp;
        } else if (root.left == null) {
            root.left = root.right;
            root.right = null;
        } else {
            root.right = root.left;
            root.left = null;
        }
    }

    void invert(TreeNode root) {

        if (root != null && (root.left != null || root.right != null)) {
            if (root.left != null) {
                invert(root.left);
            }
            if (root.right != null) {
                invert(root.right);
            }
            swap(root);
        }

    }


}


public class BST {


    public static void main(String[] args) {
        BSTree tree = new BSTree(25);

        tree.insertNode(tree.root, 20);
        tree.insertNode(tree.root, 36);
        tree.insertNode(tree.root, 10);
        tree.insertNode(tree.root, 22);
        tree.insertNode(tree.root, 30);

        tree.printNodes(tree.root);

        tree.invert(tree.root);

        tree.printNodes(tree.root);

        System.out.print(tree.height(tree.root));


    }

}
