package com.sparta.model;


import java.util.Enumeration;

public class BinaryTreeSort extends SuperSorter {

    class Node{

        private int data;
        private Node left;
        private Node right;
        public Node(int data) {
            super();
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


    public Node node;

    @Override
    public void sort(int[] numbers) {
        for (int data : numbers) {
            insert(this.node, data);
        }

        inOrder(this.node);

    }

    public BinaryTreeSort(int data) {
        this.node = new Node(data);
    }

    public Node insert(Node node, int data) {
        if(node == null) {
            return new Node(data);
        }

        if(data < node.data) {
            node.left = insert(node.left, data);
        }

        else if(data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void inOrder(Node node) {

        String output = "";

        if(node != null) {

            inOrder(node.left);

            if ((node.left != null) && (node.right != null)){
                System.out.println(node.left.data+" ("+node.data+") "+node.right.data);

            } else if ((node.left != null) || (node.right != null)){
                if (node.left != null){
                    System.out.println(node.left.data+" ("+node.data+") "+null);
                } else if (node.right != null){
                    System.out.println(null+" ("+node.data+") "+node.right.data);
                }

            } else {
                System.out.println(null+" ("+node.data+") "+null);

            }

            inOrder(node.right);

        }



    }









}
