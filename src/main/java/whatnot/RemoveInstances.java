package whatnot;

public class RemoveInstances {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 2, 3, 6};
        int val = 2;
        RemoveInstances removeInstances = new RemoveInstances();
       // removeInstances.removeAllInstances(arr, val);
        removeInstances.remove_solution2(arr,val);
    }

   /* private void removeAllInstances(int[] arr, int val) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j++]=arr[i];

            }

        }
    }*/

    private int removeAllInstances(int[] arr, int val) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            if (arr[i] == val) {
                if (arr[j] != val) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                j--;
            }

        }
        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i]);
        }
        return j + 1;

    }

    int remove_solution2(int numbers[], int n) {
        int p1 = 0;
        while(p1 < numbers.length && numbers[p1] != n)
            ++p1;
        int p2 = numbers.length - 1;
        while(p1 < p2){
            while(p1 < numbers.length && numbers[p1] != n)
                ++p1;
            while(p2 > 0 && numbers[p2] == n)
                --p2;
            if(p1 < p2){
                numbers[p1] = numbers[p2];
                numbers[p2] = n;
            }
        }
        return p1; }

}


