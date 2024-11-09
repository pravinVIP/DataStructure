package array;
import java.util.Arrays;
import java.util.Collections;

public class programs {
	 public static void main(String arg[]) {
		 int arr[]=new int[]{1,1,2,3};
		 System.out.println(Arrays.toString(programs.removeDuplicates(arr)));
		 
	 } 
	 
	static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1); 
    }
	
	 public int sumDiagonal(int[][] a) {
	        int sum = 0;
	        for (int i=0; i<a.length;i++) {
	            sum+= a[i][i];
	        }
	        return sum;
	    }
	 
	 
	 static String firstSecond(Integer[] myArray) {
	        Integer[] arr = myArray;
	        Arrays.sort(arr, Collections.reverseOrder());
	        int first = arr[0];
	        Integer second = null;
	        for (int i=0; i<arr.length; i++) {
	          if (arr[i] != first) {
	            second = arr[i];
	            break;  
	          }
	        }
	        return first+" "+second;
	 
	  }
	 
	 
	 static int missingNumber(int[] arr, int totalCount) {
		    int expectedSum = 0;
		    int actualSum = 0;
		    for(int i = 1; i <= totalCount; ++i) {
		      expectedSum += i;
		      }
		    for (int i=0; i<arr.length; i++) {
		      actualSum += arr[i];
		 
		    }
		    System.out.println(expectedSum); // 5
		 
		    return expectedSum - actualSum;
		  }
	 
	 
	 private static int removeDuplicates(int a[], int n) {

	        if (n == 0 || n == 1) {

	            return n;

	        }

	        int j = 0;

	        for (int i = 0; i < n - 1; i++) {

	            if (a[i] != a[i + 1]) {

	                a[j++] = a[i];

	            }

	        }

	        a[j++] = a[n - 1];

	        return j;

	  }



	  public static int[] removeDuplicates(int[] arr) {

	    int result = removeDuplicates(arr, arr.length);
	    System.out.println(Arrays.toString(arr));

	    int[] newArray = new int[result];

	    for (int i = 0; i < result; i++) {

	            newArray[i] = arr[i];

	    }

	    return newArray;

	  }
	  
	  

	  public static String pairSum(int[] myArray, int sum) {
		    String result = "";
		    for(int i=0; i<myArray.length; i++) {
		      for(int j=i+1; j<myArray.length; j++) {
		        if (myArray[i]+myArray[j]==sum) {
		          result += myArray[i]+":"+myArray[j]+" ";
		        }
		      }
		    }
		    return result;
		  }
	 
	 
}
