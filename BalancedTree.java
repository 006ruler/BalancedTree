public class BalancedTree {
    private Node root;

    public BalancedTree() {
        root = new Node();
    }

    public BalancedTree(Object data) {
        root = new Node(null, null, null, (Comparable) data);
    }

    public void addNode(Object data) {
        Node tempNode = this.root;
        Node newNode = new Node(null, null, null, (Comparable) data);
        while(newNode.getParent() == null) {
            if(tempNode.oompareTo(newNode) < 0) {
                if(tempNode.getLeft() == null) {
                    tempNode.setLeft(newNode);
                    newNode.setParent(tempNode);
                }
                else {
                    tempNode = tempNode.getLeft();
                }
            }
            //TODO equal to, and greather than
        }
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

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public A getData() {
        return this.data;
    }
    public Node getParent() { return this.parent;}
    public Node getLeft() { return this.left;}
    public Node getRight() { return this.right;}

}