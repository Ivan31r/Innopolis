package algorithmsAndDataStructures.simpAlgorithms.binaryMap;

public class BinaryMap {
    Node head;
    public BinaryMap(){
        head=null;
    }

    public void add(int data) {
       Node node = new Node(data);
       if (head==null){
           head=node;
       }else {
           Node current = head;
           Node parent;
           while (true){
               parent=current;
               if (data<current.data){
                   current=current.leftChild;
                   if (current==null){
                       parent.leftChild=node;
                       return;
                   }
               }
               else {
                   current=current.rightChild;
                   if (current==null){
                       parent.rightChild=node;
                       return;
                   }
               }
           }
       }
    }
    public boolean isEmpty(){
        return head==null;
    }

    @Override
    public String toString() {
        return "BinaryMap{" +
                "head=" + head +
                '}';
    }
}
