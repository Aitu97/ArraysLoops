package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
	
	/**
	 * Write a method that will return max value from array.
	 * 
	 * for example:
	 * {3,9,55,73,99,2,10} -> return 99
	 * 
	 * @param arrays of numbers
	 * @return maximum value from array 
	 */
	public int maxNum(int[] arrays) {
		//code
		//int [] numbers={3,9,55,73,99,2,10};
		System.out.println(Arrays.toString(arrays));
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		int n=arrays[arrays.length-1];
		return n;
	}
	
	/**
	 * Write a method that will remove duplicates from given array
	 * and return an array with only unique numbers
	 * 
	 * for example:
	 * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
	 * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
	 * 
	 * @param array of numbers
	 * @return array of unique numbers
	 */
	public int[] removeDuplicates(int[] array) {
		//code

		int [] number={3,6,8,3,2,7,9,9};
		int [] number2={-1,5,8,-1,-55,55,0};

		for (int i=0; i<number.length; i++){


		}


		return new int[0];
	}
	
	/**
	 * Write a method that will accept two array as parameters and return one new array
	 * will all values that have two arrays.
	 * 
	 * For Example: 
	 * first array: {"java", "code","fun","nine"}
	 * second array: {"hustle","until","get","a job"}
	 * -> return {"java", "code","fun","nine","hustle","until","get","a job"}
	 * 
	 * @param array1 of String
	 * @param array2 of String
	 * @return combined two arrays to one array
	 */
	public String[] combineArrays(String[] array1, String[] array2) {

		String [] string1= array1;
		String [] string2= array2;
		String [] result = new String[string1.length+string2.length];
		for(int i=0; i<string1.length; i++){
			result[i] = string1[i];
		}for(int j=0; j<string2.length; j++){
			result[j+string1.length]= string2[j];
		}
		System.out.println(Arrays.toString(result));
		//code
		return result;
		//code

	}

	/**
	  * 
 	  * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion. 
	  * Your method should switch the order of the first two values, 
	  * then switch the order of the next two, switch the order of the next two, and so on. 
	  * 
	  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
	  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
	  *  
	  * Method that is using String[]
	  * @param list
	  * @return switched pairs list
	  */
	public String[] switchPairs(String[] list){

		String [] switched = new String [list.length];
		for (int i = 1;i<list.length; i+=2){
			switched[i-1] = list[i];
			switched[i] = list[i-1];
		}
		if (list.length%2==1){
			switched[list.length-1] =list[list.length-1];
		}
		//code
		return switched;



	}
	
	/**
	 * Given an array of integers that represent pages of a book.
	 * Write a method that will identify the very first page which is out of order.
	 * if all pages in the order return -1;
	 * @param arr of book pages
	 * @return page that is out of order;
	 * 
	 * For example you given an array 
	 *  int[]pages={20,100,55,78,44,90}; -> method will return 55
	 *	int[]pages2={20,21,22,78,44,90};-> method will return 44
	 *  int[]pages3={20,21,22,78,84,90};-> method will return -1
	 */
	public int outOfOrder(int[] arr){

		for (int i=1; i<arr.length; i++){
			if (arr[i-1] > arr[i]){
				return arr[i];
			}
		}

		//code
		return -1;
	}
	
	/**
	 * Given an array of integers, return indices of the two numbers, sum of which will be equal to a target number.
	 * You may assume that each input would have exactly one solution, 
	 * You cannot use the same element twice.
	 * nums = [2, 7, 11, 15], target = 9, -> return [0, 1]
	 * nums = [5, 2, 4, 6, 3], target = 6, -> return [1, 2] 
	 * @param nums  an array of numbers nums
	 * @param target is a number sum of which you need to find
	 * @return an array of the indexes for the numbers from an array nums, sum of which will be equal to target
	 */
	public int[] twoSum(int[] nums, int target) {
		//code
		int [] indexes=new int[2];
		label: for ( int i=0; i<nums.length; i++){
			for (int a=0; a<nums.length; a++){
				int targetNum=nums[i] + nums[a];
				if (targetNum == target && i!=a){
					indexes[0]=i;
					indexes[1]=a;
					break label;
				}
			}
		}
	    return indexes;
	}
	
	/**
	 * Write a method that will return one long number of combined numbers from given array.
	 * If the number is negative accept it as positive
	 * 
	 * For example:
	 * {2,66,3,90,1,-10} -> return int 266390110
	 * {0,34,5,3,8} -> return int 34538
	 * 
	 * @param numbers
	 * @return combined numbers of array
	 */
	public long combineNumbers(int[] numbers) {
		//code
		return -1;
	}
}
