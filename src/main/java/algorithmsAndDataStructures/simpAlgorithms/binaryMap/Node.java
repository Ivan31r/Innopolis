package algorithmsAndDataStructures.simpAlgorithms.binaryMap;

public class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
