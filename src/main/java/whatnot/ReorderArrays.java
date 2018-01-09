package whatnot;

public class ReorderArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,11};
        ReorderArrays reorderArrays=new ReorderArrays();
        reorderArrays.reorderArray(arr);
        
    }

    private void reorderArray(int[] arr) {
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0 && arr[j]%2==1){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i++;j--;
          }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
