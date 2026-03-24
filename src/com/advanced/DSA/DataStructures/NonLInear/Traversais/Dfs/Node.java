package com.advanced.DSA.DataStructures.NonLInear.Traversais.Dfs;

public class Node {
    int data;//this is the data of the node
    Node left;//this is the address of the left child
    Node right;//this is the address of the right child
    Node(int data){
        this.data=data;
        this.left=this.right=null;//Node has no children initially
    }
    public static void preOrder(Node root){//data left right
        if (root !=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root){//left data right
        if (root !=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }
    public static void postOrder(Node root) {
        //left right data
        if (root != null) {

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        //construct the binary tree
        //we must construct the tree from
        //top-->to bottom left-->to right ,level by level
        //level -->0
        Node root=new Node(1);
        //level -->1
        root.left=new Node(2);
        root.right=new Node(3);
        //level -->2
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        //level -->3
        root.left.right.left=new Node(9);
        root.right.right.left=new Node(15);
        System.out.print("preorder traversing--->");
        preOrder(root);
        System.out.println();
        System.out.print("inorder traversing--->");
        inOrder(root);
        System.out.println();
        System.out.print("postorder traversing--->");
        postOrder(root);
        System.out.println();

    }
}
