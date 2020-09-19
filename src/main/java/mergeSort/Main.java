package mergeSort;

public class Main {
    public static void main(String[] args) {
   int size =20;
   MergeSort mergeSort = new MergeSort(size);
   mergeSort.insert(64);
   mergeSort.insert(21);
   mergeSort.insert(33);
   mergeSort.insert(70);
   mergeSort.insert(12);
   mergeSort.insert(85);
   mergeSort.insert(44);
   mergeSort.insert(3);
   mergeSort.insert(99);
   mergeSort.insert(0);
   mergeSort.insert(108);
   mergeSort.insert(36);

   mergeSort.display();

   mergeSort.mergeSort();

   mergeSort.display();
    }

}
