package trees.modules;

import trees.tree.Tree;

public class TreeManager {

    public static Tree buildTree(int rootValue) {
        Tree tree = new Tree(rootValue);
        tree.add(8);
        tree.add(9);
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(5);
        tree.add(22);
        tree.add(12);
        tree.add(14);
        tree.add(11);
        tree.add(26);
        tree.add(25);
        tree.add(-1);
        return tree;
    }

    public static void printTree(Tree tree){

    }
}
