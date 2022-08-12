package trees;

import trees.tree.Tree;

import static trees.modules.ConsoleReader.readDeepFromConsole;
import static trees.modules.ConsoleWriter.print;
import static trees.modules.TreeManager.buildTree;

public class TreesLab {
    public static void main(String args[]) {
        System.out.println("Binary Tree Example");
        int rootValue = 10;

        print("Building tree with root value " + rootValue);
        Tree tree = buildTree(rootValue);

        tree.printTree();

        int height = tree.getHeight();
        print("Tree's height is: " + height);

        print("Please, input deeps to find the number of elements:");
        int deep = readDeepFromConsole();

        int numOfElementsByDeep = tree.getElementFromLevel(deep);

        print("Tree's number of elements on deep " + deep + " is: " + numOfElementsByDeep);
    }
}
