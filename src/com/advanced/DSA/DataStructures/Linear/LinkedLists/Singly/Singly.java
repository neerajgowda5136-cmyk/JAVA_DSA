package com.advanced.DSA.DataStructures.Linear.LinkedLists.Singly;
 class LL {
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public class Node {
        String data;//the data of the node->String type
        Node next;//the addres of the next node
        Node (String data){
            this.data = data;
            this.next= null;//intialy node is connected to null
            size++;//increment the size
        }



    }
    public void printList(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //create a new node
        Node newNode=new Node(data);
        //point the next node to new node to new head
        newNode.next=head;
        //this new node is the new head of the node
        //point the head of the new node
        head=newNode;
    }
    public void addLast(String data){
        Node newNode= new Node(data);
        // if the list is empty - head will point to null
        if(head==null){
            head=newNode;//the newnode becomes the head of the list
            return;
        }
        //for mutiple elements -> we need to find the last(null
        Node last=head;
        while(last.next != null){
            last=last.next;
        }
        // After this loop is over we stand at last node
        //point the last node nexxt to new node
        last.next=newNode;

    }
    public void removeList(){
        //empty List
        if(head == null){
            System.out.println("List is Empty Can't Remove");
            return;
        }
        //single element or multiple
        //for a single elemnt -> if deleted -> head becomes the null
        // for multiple element -> the next node will become th head
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("can.t remove");
            return;
        }
        //single element
        if(head.next==null){
            head=null;
            return;
        }
    }
    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("FHAAA");
        sll.addFirst("5jfn");
        sll.addFirst("fhccjh");
        sll.addFirst("wkekeg");
        sll.addFirst("wjdekckwec");
        sll.addFirst("jbckwbc");
        sll.printList();
        sll.addLast("56575");
        sll.addLast("987689");
        sll.addLast("65432315");
        sll.addLast("last but not end");
        sll.printList();
        sll.removeList();
        sll.printList();
        sll.removeLast();
        sll.printList();

    }


}