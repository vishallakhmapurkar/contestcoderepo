package com.amazoncode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostFrequestNumber {
public static void main(String[] args) {
	int[] a = {1 , 3,3, 4, 5, 2, 2, 3, 2};
	System.out.println(findMostFrequent(a));
}

static String findMostFrequent(int[] arr) {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i : arr) {
	    Integer count = map.get(i);
	    map.put(i, count != null ? ++count : 1);
	}
	Integer popularVal = Collections.max(map.entrySet(),
		    new Comparator<java.util.Map.Entry<Integer, Integer>>() {
		    @Override
		    public int compare(java.util.Map.Entry<Integer, Integer> o1, java.util.Map.Entry<Integer, Integer> o2) {
		        return o1.getValue().compareTo(o2.getValue());
		    }
		}).getValue();
	StringBuilder result =new StringBuilder();
	List<String> arrayList =new ArrayList<String>();
	for(Map.Entry<Integer, Integer> entry:map.entrySet()){
		if(entry.getValue().compareTo(popularVal)==0){
			arrayList.add(entry.getKey()+":"+entry.getValue());
		}
	}
	String listString = "";
    if(arrayList.size()>1){
    	
    	for (String s : arrayList)
    	{
    		listString += s + " ";
    	}
    }else{
    	listString =arrayList.get(0);
    }
    
    String[] arrStr =listString.split(" ");
    List<Integer> relarrayList =new ArrayList<Integer>();
    List<Integer> relarrayList1 =new ArrayList<Integer>();
    for (String string : arrStr) {
    	relarrayList.add(Integer.parseInt(string.split(":")[0]));
    	relarrayList1.add(Integer.parseInt(string.split(":")[1]));
	}
    Integer[] bar = relarrayList.toArray(new Integer[0]);
    Integer[] bar1 = relarrayList1.toArray(new Integer[0]);
    listString = getMinValue(bar)+": "+bar1[0];
	return listString;
}
public static int getMinValue(Integer[] bar){  
    int minValue = bar[0];  
    for(int i=1;i<bar.length;i++){  
    if(bar[i] < minValue){  
    minValue = bar[i];  
       }  
    }  
   return minValue;  
}  
}
