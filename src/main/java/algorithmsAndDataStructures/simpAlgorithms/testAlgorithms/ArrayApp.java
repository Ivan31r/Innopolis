package algorithmsAndDataStructures.simpAlgorithms.testAlgorithms;

public class ArrayApp {
    public static void main(String[] args) {
        int size = 20;
        ArrayIns arr = new ArrayIns(size);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.insertionSort();
        arr.display();

    }
}

class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public void insertionSort() {

        for (int i = 1; i < nElems; i++) {
            long temp = a[i];
            while (i > 0 && a[i - 1] >= temp) {
                a[i] = a[i - 1];
                --i;
            }
            a[i] = temp;
        }
    }

}
