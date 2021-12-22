package com.sparta.controller;

public class BinaryTree {
    Node root;

    private int i=0;

    private int[] sorted = {1};
    public int[] getsorted(){
        return sorted;
    }
    public void setSorted(int[] sorted){
        //sorted[index] = val;
        this.sorted = sorted;
    }


    public void addNode(int key) { //creating a new node
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root; //setting root as the node.
            Node parent; //for other nodes (with left or right children) but not root
            while (true) {
                parent = focusNode; //To start at the top of the tree and then can be traversed though(in-order)
                if (key < focusNode.key) {
                    focusNode = focusNode.left; //looks to the left child of the parent
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseT(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseT(focusNode.left); //goes to left(child) node of parent/focusNode passed in
            System.out.println(focusNode.toString());
            //sorted[i] = focusNode.key;
            //if(sorted[i] > 0 )
            //setSorted(i, sorted[i]);
            //i++;
            inOrderTraverseT(focusNode.right); //goes to the right(child) node of parent/focusNode passed in
        }
        //setSorted(sorted);

    }

    public Node findingNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }



}






class BinaryTreeG<T extends Comparable<? super T>>{
    public class Node {
        T key;
        Node left, right;

        public Node(T item) {
            key = item;
            left = right = null;
        }


    }

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(T key) {
        root = insertNode(root, key);
        setRoot(root);
    }

    public Node insertNode(Node root, T key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key.compareTo(root.key) < 0)
            root.left = insertNode(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertNode(root.right, key);
        setRoot(root);
        return root;
    }

    private int j = 0;
    private T[] sorted;
    public T[] getSorted() {
        return sorted;
    }

    public void setSorted(T[] sorted) {
        this.sorted = sorted;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);

            System.out.print(root.key + ", ");
            inOrder(root.right);
        }
        setSorted(sorted);


    }
}
