package whatnot;

public class MajorityElement {

    public static void main(String[] args) {
        int  arr[]={1, 2, 3, 2, 2, 2, 5, 4, 2};
        MajorityElement majorityElement=new MajorityElement();
       System.out.print(majorityElement.getMajorityElement(arr));
    }

    public int getMajorityElement(int[] arr){
        int times=1;
        int number=arr[0];
       for(int i=0;i<arr.length;i++){
           if(times==0){
                number=arr[i];
                times++;

           }
           if(arr[i]==number){
               number=arr[i];
               times++;

           }else{

               times--;

           }


       }

return number;

    }
}
