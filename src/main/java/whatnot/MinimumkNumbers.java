package whatnot;/*
package com.home.zion.whatnot;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinimumkNumbers {

     class ReverseComparator implements Comparator<Integer>{

        public int compare(Integer no1, Integer no2) {
            int num1=no1.intValue();
            int num2=no2.intValue();
            if(num1<num2){
                return 0;
            }
            if(num1>num2){
                return 1;
            }
            return -1;
        }
     }

    public static void main(String[] args) {
        ReverseComparator comparator=MinimumkNumbers.new ReverseComparator();
        PriorityQueue maxQueue=null;
        maxQueue= new PriorityQueue<>(1, comparator);
        int input[]={1,2,3,4,5,6,7,8};
        int k=4;
        int output[]=new int[k];
        MinimumkNumbers minimumkNumbers=new MinimumkNumbers();
        minimumkNumbers.getMinimumkNumbers(input,maxQueue,k);
        Iterator<Integer> iter=maxQueue.iterator();
        for(int i=0;i<maxQueue.size();i++) {
            output[i] = iter.next();;

        }
    }


    public void getMinimumkNumbers(int[] input,PriorityQueue maxQueue,int k){
        maxQueue.clear();
        for(int i=0;i<maxQueue.size();i++) {
            if (maxQueue.size() - 1 < k) {
                maxQueue.add(input[i]);

            }else{
                Object max=maxQueue.peek();
                Integer num=new Integer(input[i]);
                if(max.compare.comparator(num)>0){
                    maxQueue.poll();
                    maxQueue.add(num);

                }

            }
        }

    }
}
*/
