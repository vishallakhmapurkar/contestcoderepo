package com.amazoncode;

public class Multiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getAllOneMultiple(13));

	}
	static String getAllOneMultiple(int n) {
		if(n==3)
			return "111";
		String res="";
		for (int i = 3; i < n; i++){
			if(i%3==0){
				 res=res+"1";
			}
	    }
		/*int div =0;
		int remindeer=0;
       while(n%3!=0){
    	   div =n/3;
    	   remindeer=n%3;
    	   if(remindeer==1){
    		   res=res+remindeer;
    	   }
    	   if(remindeer==3){
    		   res=res+"111";
    		   break;
    	   }
    	   n=div;
       }*/
    return res+"1";
    }
}
