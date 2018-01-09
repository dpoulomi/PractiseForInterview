package whatnot;

public class LargestSumofContiguousArray {
    public static void main(String[] args) {
        int[] arr={1, -2, 3, 10, -4, 7, 2, -5};
        LargestSumofContiguousArray largestSumofContiguousArray=new LargestSumofContiguousArray();
        largestSumofContiguousArray.findLargestSum(arr);
    }

    private void findLargestSum(int[] arr) {

        int largestSum=arr[0];
        int currentSUm=arr[0];
        for(int i=1;i<arr.length;i++){
currentSUm=Math.max(arr[i],currentSUm+arr[i]);
largestSum=Math.max(largestSum,currentSUm);
        }
System.out.println(largestSum);
    }
}
