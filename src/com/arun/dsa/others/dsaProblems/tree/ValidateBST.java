package com.arun.dsa.others.dsaProblems.tree;

import java.util.LinkedList;
import java.util.List;

public class ValidateBST {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private boolean validateBST(TreeNode root) {
        List<Integer> inOrderElement = new LinkedList<>();

        storeInLinkedList(root, inOrderElement);
        inOrderElement.stream().forEach(System.out::println);
        int prev = 0;
        boolean isBST = true;
        for(int i = 1; i < inOrderElement.size(); i++) {
            if(inOrderElement.get(i) < inOrderElement.get(prev)) {
                isBST = false;
                prev++;
            }

        }
        return isBST;
    }

    private void storeInLinkedList(TreeNode root, List<Integer> inOrderElement) {
        if(root != null) {
            storeInLinkedList(root.left, inOrderElement);
            inOrderElement.add(root.data);
            storeInLinkedList(root.right, inOrderElement);
        }
    }

    public static void main(String[] args) {
        ValidateBST bst = new ValidateBST();

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(25);
        root.right.right = new TreeNode(75);

        boolean isBST = bst.validateBST(root);
        System.out.println(isBST);


    }



}
