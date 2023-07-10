public class SelectionSort_d4jt {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[]){
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;
        }

    }
    public static void main(String[] args) {
        int arr[]={-10,45,-50,34,12,456};
        display(arr);
        sort(arr);
        System.out.println("Array before sorting");
        display(arr);
        System.out.println("Array after sorting");
        sort(arr);
        display(arr);
    }
}
