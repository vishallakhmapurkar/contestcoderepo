package com.amazoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArray {

	public static void main(String [] arg) 
    {   
        int[] src = new int[] {3,1,6,5,4}; 
        int[] res= maximize(src,2);
        for (int i : res) {
			
        	System.out.println(i);
		}
    }
	static int[] maximize(int[] arr, int swaps) {
         int element = arr[swaps];
         List<Integer> relarrayList =new ArrayList<Integer>();
         relarrayList.add(element);
         for (int i : arr) {
			if(i!=element)
				relarrayList.add(i);
		}
         int[] ret = new int[relarrayList.size()];
         for (int i=0; i < ret.length; i++)
         {
             ret[i] = relarrayList.get(i).intValue();
         }
         return ret;
    }
}
