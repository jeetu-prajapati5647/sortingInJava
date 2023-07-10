public class quickSortOne {
    static  void displayArr(int[] a){
        for(int no:a){
            System.out.print(a+" ");
        }

    }
    static void swap(int[] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static int partition(int[] a,int st,int end) {
        int pivot = a[0];
        int cnt = 0;
        for (int i = st + 1; i < end; i++) {
            if (a[i] < pivot) {
                cnt++;
            }
        }
            int pivotIdx = st + cnt;
            swap(a, st, pivotIdx);
            int f = st, j = end;
            while (f < pivotIdx && j > pivotIdx) {
                while (a[f] < pivot) f++;
                while (a[j] > pivot) j++;
                if (f < pivotIdx && j > pivotIdx) {
                    swap(a, f, j);
                    f++;
                    j--;
                }
            }
        return pivotIdx;
        }


    static void quickSort(int[] a,int st,int end){
        if(st>=end) return;
        int pi=partition(a,st,end);
        quickSort(a,0,pi-1);
        quickSort(a,pi+1,end);

    }
    public static void main(String[] args) {
        int[] a={12,16,3,8,9,3,20};
        System.out.println("Array before sorting ");
        displayArr(a);
        System.out.println("Array after sorting");
        quickSort(a,0,a.length-1);
        displayArr(a);

    }
}