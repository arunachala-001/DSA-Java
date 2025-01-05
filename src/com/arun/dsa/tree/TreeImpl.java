package com.arun.dsa.tree;

public class TreeImpl {

    public static void main(String[] args) {
        BinaryTreeImpl bst = new BinaryTreeImpl();

        bst.insert(15);
        bst.insert(5);
        bst.insert(2);
        bst.insert(135);
        bst.insert(30);
        bst.insert(9);

        bst.inOrder();

        //Search an element
        boolean isFound = bst.search(95);
        if(isFound)
            System.out.println("Element Found");
        else
            System.out.println("Not Found");
    }

}
