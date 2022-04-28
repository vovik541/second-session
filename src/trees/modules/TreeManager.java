package trees.modules;

import trees.tree.Tree;

public class TreeManager {

    public static Tree buildTree(int rootValue) {
        Tree tree = new Tree(rootValue);
        tree.add(9);
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(5);
        tree.add(22);
        tree.add(12);
        tree.add(14);
        tree.add(26);

        return tree;
    }
}
