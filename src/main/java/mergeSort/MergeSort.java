package mergeSort;

public class MergeSort {
    private long[] numbers;
    private int nElems;

    public MergeSort(int size) {
        numbers = new long[size];
        nElems = 0;
    }


    public void insert(long value) {
        numbers[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(numbers[j] + " ");
        System.out.println();
    }
    public void mergeSort(){
        long[]workSpace = new long[nElems];
        recMergeSort(workSpace,0,nElems-1);
    }
    private void recMergeSort(long[] workSpace,int lowerBound,int upperBound){
        if (lowerBound==upperBound){
            return;
        }else {
            int mid = (lowerBound+upperBound)/2;
            recMergeSort(workSpace,lowerBound,mid);
            recMergeSort(workSpace,mid+1,upperBound);

            merge(workSpace,lowerBound,mid+1,upperBound);
        }
    }
    private void merge(long[] workSpace,int lowPtr,int highPtr,int upperBound){
        int j=0;
        int lowerBound=lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1;

        while (lowPtr<=mid && highPtr<=upperBound)
            if (numbers[lowPtr] < numbers[highPtr])
                workSpace[j++] = numbers[lowPtr++];
            else workSpace[j++]= numbers[highPtr++];

            while (lowPtr<=mid)
                workSpace[j++] = numbers[lowPtr++];
            while (highPtr<=upperBound)
                workSpace[j++]=numbers[highPtr++];

            for (j=0;j<n;j++)
                numbers[lowerBound+j] = workSpace[j];
    }
}
