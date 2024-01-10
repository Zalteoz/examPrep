
package Aufgabe1;
import java.util.*;
public class Square {
	
    public static void main(String[] args) {
    	int[][] t = { 
    			{0, 3, 5, 7, 2}, 
    			{2, 7, 4, 3, 0}, 
    			{4, 4, 6, 1, 4}, 
    			{7, 7, 4, 3, 3}, 
    			{0, 3, 5, 7, 2} 
    		};

    	System.out.println(checkProperty(t));
    }

    static boolean checkProperty(int[][] x) {
 	
    	ArrayList<Integer> topList = new ArrayList<Integer>();
    	ArrayList<Integer> bottomList = new ArrayList<Integer>();
    	int n = x.length;
    	
    	//base cases 
    	if (n % 2 == 0) {
    		return false;
    	} else if (n == 0 || n < 2) {
    		return true;
    	}
    	
    	
    	for (int i = 0; i <= n/2; i++) {
    		for (int j = i; j <= (n - 1) - i; j++) {
    			//int toAdd = x[i][j];
    			//System.out.print("toAdd");
    			topList.add(x[i][j]);
    		}
    	}
    	
    	for (int k = n - 1; k >= n/2; k--) {
    		for (int l = n - k - 1; l <= k; l++) {
    			bottomList.add(x[k][l]);
    		}
    	}
    	
    	System.out.print(bottomList);
    	System.out.print(topList);
    	
    	for(int i = 0; i < Math.max(bottomList.size(), topList.size()); i++) {
    		if(bottomList.get(i) != topList.get(i)) {
    			return false;
    		}
    	}
    	return true;
    }

}
    
