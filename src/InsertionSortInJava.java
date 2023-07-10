public class InsertionSortInJava {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={23,14,45,56,12,90};
        System.out.println("Array before sorting");
        display(arr);
        System.out.println("Array after sorting");
        sort(arr);
        display(arr);

    }
}