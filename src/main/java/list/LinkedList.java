package list;

import list.Node;

public class LinkedList {
    Node head;
    Node tail;
    private int counter = 0;

    public LinkedList(){
        head=null;
    }
    public int getSize(){
        return counter;
    }

    public void add(int data){
        Node node1 = new Node(data);
        node1.next=head;
        head=node1;

        counter++;
    }

    public void showInfo(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }




}
