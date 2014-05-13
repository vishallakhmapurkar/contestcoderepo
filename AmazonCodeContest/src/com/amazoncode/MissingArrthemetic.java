package com.amazoncode;
import java.io.*;
import java.util.Vector;
public class MissingArrthemetic {
	 public static void main(String[] args) throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int num = Integer.parseInt(br.readLine());
	        String[] numbers = br.readLine().split(" ");
	        Vector<Integer> ap = new Vector<Integer>();
	        for (String str: numbers){
	            ap.add(Integer.parseInt(str));
	        }
	        int first = ap.get(0);
	        int last = ap.get(ap.size()-1);
	        int incr = (last-first)/num;
	        for(int i = first; i<=last; i+= incr){
	            if(!ap.contains(i)){
	                System.out.println(i);
	                break;
	            }
	        }
	    }
}
