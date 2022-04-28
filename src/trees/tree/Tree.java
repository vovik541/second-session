package trees.tree;

import static java.util.Objects.*;
import static trees.modules.ConsoleWriter.print;

public class Tree {
    public Node rootNode;

    public Tree(int rootNumber) {
        this.rootNode = new Node(rootNumber);
    }

    private static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void add(int number) {
        insert(this.rootNode, number);
    }

    private void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                print("Inserted " + value + " to LEFT of " + node.value);
                System.out.println();
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                print("Inserted " + value + " to RIGHT of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder() {
        traverseInOrder(this.rootNode);
    }

    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public int getHeight() {
        return getTreeHeightRecurs(this.rootNode);
    }

    private int getTreeHeightRecurs(Node root) {
        int deep = 0;

        if (nonNull(root.left)) {
            deep = Integer.max(deep, getTreeHeightRecurs(root.left));
        }
        if (nonNull(root.right)) {
            deep = Integer.max(deep, getTreeHeightRecurs(root.right));
        }

        return deep + 1;
    }

    public int getElementFromLevel(int level) {
        int deep = 1;
        return getTreeElementsOnLevelRecurs(this.rootNode, level, deep);
    }

    private int getTreeElementsOnLevelRecurs(Node root, int level, int deep) {
        int elementsNum = 0;

        if (deep == level) {
            return 1;
        }

        if (nonNull(root.left)) {
            elementsNum += getTreeElementsOnLevelRecurs(root.left, level, deep + 1);
        }

        if (nonNull(root.right)) {
            elementsNum += getTreeElementsOnLevelRecurs(root.right, level, deep + 1);
        }

        return elementsNum;
    }

}