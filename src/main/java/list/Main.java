package list;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("linkedList size= " + linkedList.getSize());

        linkedList.showInfo();
    }

}
