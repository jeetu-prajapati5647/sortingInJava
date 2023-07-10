public class majorityElement{
    public static void main(String[] args) {
        int a[]={3,2,1,2,2,2,2,5};
        int index=Integer.MIN_VALUE;
        int maxCount=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }
        }
        //    System.out.println(index);
        System.out.println(a[index]);
    }
}