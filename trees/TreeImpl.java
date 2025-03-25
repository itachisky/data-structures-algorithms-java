package trees;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeImpl {
    Node root;

    public TreeImpl(int data) {
        this.root = new Node(data);
    }

    public void addLeft(Node parent, int data) {
        if (parent.left == null) {
            parent.left = new Node(data);
        } else {
            System.out.println("Left child already exists for node " + parent.data);
        }
    }

    public void addRight(Node parent, int data) {
        if (parent.right == null) {
            parent.right = new Node(data);
        } else {
            System.out.println("Right child already exists for node " + parent.data);
        }
    }

    public static void main(String[] args) {
        TreeImpl tree = new TreeImpl(5);

        tree.addLeft(tree.root, 5);
        tree.addRight(tree.root, 15);

        tree.addLeft(tree.root.left, 3);
        tree.addRight(tree.root.left, 7);

        tree.addLeft(tree.root.right, 12);
        tree.addRight(tree.root.right, 18);

    }
}
