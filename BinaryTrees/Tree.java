package BinaryTrees;

public class Tree {
    
    private Node root;

    private class Node {
        
        private int value;

        private Node leftNode;
        private Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    public void insert(int value){
        var node = new Node(value);

        if (root == null){
            root = node;
            return;
        }

        var current = root;
        while (true){
            if (value < current.value)
            {
                if (current.leftNode == null)
                {
                    current.leftNode = node;
                    break;
                }
                current = current.leftNode;
            }
            else {
                if (current.rightNode == null)
                {
                    current.rightNode = node;
                    break;
                }
                current = current.rightNode;
            }
        }
    }

    public boolean findNode(int value){
        var current = root;

        while (current.value != value)
        {
            if (current.value > value)
            {
                if (current.leftNode == null)
                    return false;
                current = current.leftNode;
            }
            else
            {
                if (current.rightNode == null)
                    return false;
                current = current.rightNode;
            }
        }
        return true;
    }
}
