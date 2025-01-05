package com.arun.dsa.tree;

public class BinaryTreeImpl {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if(root == null) {
          return new Node(data);
        }
        if(root.data > data) {
            root.left = insertRec(root.left, data);
        }
        else
            root.right = insertRec(root.right, data);

        return root;
    }

    public void inOrder() {
        inOrderImpl(root);
    }

    private void inOrderImpl(Node root) {
        if(root != null) {
            inOrderImpl(root.left);
            System.out.print(root.data+" ");
            inOrderImpl(root.right);
        }
    }

    public boolean search(int data) {
        while(root != null) {
            if(root.data == data)
                return true;
            if(data < root.data)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }
}
