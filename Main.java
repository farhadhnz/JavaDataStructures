import BinaryTrees.Tree;

class Main {
    public static void main(String[] args){
        var tree = new Tree();
        tree.insert(7);
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);

        var bool1 = tree.findNode(10);
        var bool2 = tree.findNode(9);
        var bool3 = tree.findNode(14);
        var bool4 = tree.findNode(1);
        System.out.println("Done");
    }
}