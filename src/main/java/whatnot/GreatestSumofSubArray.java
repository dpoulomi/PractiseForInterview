package whatnot;

public class GreatestSumofSubArray {

    public static void main(String[] args) {
        int[] arr={1,-2,3,10,-4,7,2,-5};
        GreatestSumofSubArray greatestSumofSubArray=new GreatestSumofSubArray();
      System.out.println(greatestSumofSubArray.getSumOfArrays(arr));
    }

    private int getSumOfArrays(int[] arr) {
      int currentSum=0;
      int greatestSum=0;
      for(int i=0;i<arr.length;i++){
          if(currentSum<=0){
              currentSum=arr[i];
          }
        else if(currentSum>0){
              currentSum = currentSum + arr[i];
          }

          if(currentSum>greatestSum) {
              greatestSum = currentSum;
          }

      }
      return greatestSum;
    }
}
