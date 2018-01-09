package whatnot.Practise.practiseid;/*
package com.home.zion.whatnot.Practise.practiseid;

import java.util.Stack;

*/
/*You are given two integer arrays, one of which is a sequence of numbers pushed into a stack
(supposing all numbers are unique). Please check whether the other array is a corresponding sequence popped
from the stack.
For example, if the pushing sequence is {1, 2, 3, 4, 5}, the sequence {4, 5, 3, 2, 1} is a corresponding popping
sequence, but {4, 3, 5, 1, 2} is not.*//*

public class CheckPushPopSequences {
	
	public static void main(String args[]){
		int arr1[]={1,2,3,4,5};
		int arr2[]={4,5,3,2,1};
		CheckPushPopSequences cpps=new CheckPushPopSequences();	
	boolean flag=cpps.checkForPoppingSequence(arr1, arr2);
	System.out.println(flag);
	}

	private boolean checkForPoppingSequence(int pPush,  int pPop, int nLength) {
			boolean bPossible = false;
			if(pPush != null && pPop != null && nLength > 0) {
			 int pNextPush = pPush;
			 int pNextPop = pPop;
			Stack<Integer> stackData;
			while(pNextPop - pPop < nLength) {
			// Push some numbers when the number to be popped is not
			// is not on the top of the stack
			while(stackData.empty() || stackData.peek() != pNextPop) {
			// Break when all numbers have been pushed
			if(pNextPush - pPush == nLength)
			break;
			stackData.push(pNextPush);
			pNextPush ++;
			}
			if(stackData.peek() != pNextPop)
			break;
			stackData.pop();
			pNextPop ++;
			}
			if(stackData.empty() && pNextPop - pPop == nLength)
			bPossible = true;
			}
			return bPossible;
			}

}
*/
