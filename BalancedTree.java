public class BalancedTree {
    private Node root;

    public BalancedTree() {
        root = new Node();
    }

    public BalancedTree(Object data) {
        root = new Node(null, null, null, (Comparable) data);
    }
}

class Node<A extends Comparable<? super A>> {
    private Node left, right, parent;
    private A data;

    public Node() {
        left = null;
        right = null;
        parent = null;
        data = null;
    }

    public Node(Node parent, Node left, Node right, A data) {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }

    public int oompareTo(Node otherNode) {
        return this.data.compareTo((A) otherNode.getData());
    }

    public A getData() {
        return this.data;
    }

}