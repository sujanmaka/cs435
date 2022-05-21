package test.sortroutines;

import test.runtime.Sorter;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a BST that handles Integer data. The insert method works only if
 * there are no duplicates.
 */
public class BSTSort extends Sorter {
    /**
     * The tree root.
     */
    private Node root;

    // start with an empty tree
    public BSTSort() {
        root = null;
    }

    /**
     * Prints the values in the nodes of the tree in sorted order.
     */
    public void printTree() {
        if (root == null) System.out.println("[]");
        else printTree(root);
    }

    public int[] printTree(Node t) {
        List<Integer> list = new ArrayList<>();
        if (t != null) {
            printTree(t.left);
            list.add(t.element);
            printTree(t.right);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    private boolean isLeafNode(Node n) {
        if (n == null) return false;
        return n.left == null && n.right == null;
    }

    // /////insertion methods

    public void insert(Integer x) {
        if (root == null) {
            root = new Node(x, null, null);
        } else {
            Node n = root;
            boolean inserted = false;
            while (!inserted) {
                if (x.compareTo(n.element) < 0) {
                    // space found on the left
                    if (n.left == null) {
                        n.left = new Node(x, null, null);
                        inserted = true;
                    } else {
                        n = n.left;
                    }
                } else if (x.compareTo(n.element) > 0) {
                    // space found on the right
                    if (n.right == null) {
                        n.right = new Node(x, null, null);
                        inserted = true;
                    } else {
                        n = n.right;
                    }
                } else { // in this case, x.compareTo(n.element) == 0 -- we have
                    // a duplicate
                    throw new RuntimeException("The element " + x + " is already in the tree; " + "duplicates are not allowed");
                }

            }

        }
    }

    // ///////// testing

    public static void main(String[] args) {
//        BSTSort bst = new BSTSort();
//        for (int i = 15; i >= 0; --i) {
//            bst.insert(2 * i);
//            bst.insert(2 * i - 5);
//        }

        int[] arr = new int[]{0, -1, 4, 5, 2, 3};
        BSTSort bst = new BSTSort();

        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }
        bst.printTree();
    }

    @Override
    public int[] sort(int[] arr) {
        BSTSort bst = new BSTSort();
        for (int j : arr) {
            bst.insert(j);
        }
        bst.printTree();
        return new int[0];
    }


    // //////// Node class

    private class Node {

        /////////////// Constructors

        @SuppressWarnings("unused")
        Node(Integer theElement) {
            this(theElement, null, null);
        }

        Node(Integer element, Node left, Node right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

        private Integer element; // The data in the node
        private Node left; // Left child
        private Node right; // Right child
    }
}
