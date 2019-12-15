package tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import methods.Methods;


public class Tests {
	static Methods method = new Methods();
	String[] array={ "a", "b", "c"};
	String[] array1={"one", "two", "three", "four", "five"};
	String[] array2={"tester", "developer", "scrum master", "tester2", "code", "in", "java", "language", "!"};
	String[] array3={"2", "1", "4", "3", "6", "5", "7"};
	String[] array4={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
	String[] array5={"java", "little", "nine", "door", "and", "seven", "yard", "with", "laptop"};
	String[] array6={"tiger", "zebra"};
	String[] array7={"code"};
		
	@Test
	public void twoSums(){
		int[] nums ={4, 3, 2, 55, 1, 6, 5};
		int target = 56;
		int[] expected ={3, 4};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	
	@Test
	public void twoSums2(){
		int[] nums ={3,2,4};
		int target =7;
		int[] expected ={0, 2};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums3(){
		int[] nums ={2, 7, 11, 15};
		int target =17;
		int[] expected ={0, 3};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums4(){
		int[] nums ={2, 3, 8, 7, 11, 15};
		int target =26;
		int[] expected ={4, 5};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void twoSums5(){
		int[] nums ={7, 3};
		int target =10;
		int[] expected ={0, 1};
		assertArrayEquals(expected, method.twoSum(nums, target));
	}
	@Test
	public void switchUsingArray(){
		
		String [] expected = {"b", "a", "c"};
		assertArrayEquals(expected, method.switchPairs(array));					
		
	}
	@Test
	public void switchUsingArray1(){
		String [] expected2 = { "two","one", "four","three", "five"};
		assertArrayEquals(expected2, method.switchPairs(array1));
	}
	@Test
	public void switchUsingArray2(){
		String [] expected3 = { "developer","tester",  "tester2","scrum master",  "in","code",  "language","java", "!"};
		assertArrayEquals(expected3, method.switchPairs(array2));
	}
	@Test
	public void switchUsingArray3(){
		String [] expected4 = { "1","2",  "3","4",  "5","6", "7"};
		assertArrayEquals(expected4, method.switchPairs(array3));
	}
	@Test
	public void switchUsingArray4(){
		String [] expected5 = {"flowers", "four", "eleven", "sun", "better", "cloud", "git"};
		assertArrayEquals(expected5, method.switchPairs(array4));
	}
	@Test
	public void switchUsingArray5(){
		String [] expected6 = {"little", "java", "door", "nine", "seven", "and", "with", "yard", "laptop"};
		assertArrayEquals(expected6, method.switchPairs(array5));
	}
	@Test
	public void switchUsingArray6(){
		String [] expected7 = {"zebra", "tiger"};
		assertArrayEquals(expected7, method.switchPairs(array6));
	}
	@Test
	public void switchUsingArray7(){
		String [] expected8 = {"code"};
		assertArrayEquals(expected8, method.switchPairs(array7));
	}

	@Test
	public void outOfOrder(){
		int [] pages={3,66,77,78,79,90,87};		
		assertEquals(87,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder2(){
		int [] pages={3,66,2,78,79,90,87};		
		assertEquals(2,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder3(){
		int [] pages={3,4,7,78,79,90,97};		
		assertEquals(-1,method.outOfOrder(pages) );
	}
	@Test
	public void outOfOrder4(){
		int [] pages={3,5,1};		
		assertEquals(1,method.outOfOrder(pages) );
	}
	@Test
	public void testCombineArrays1() {
		String[] combinedArrays={ "a", "b", "c","one", "two", "three", "four", "five"};
		assertArrayEquals(combinedArrays,method.combineArrays(array, array1));
	}
	
	@Test
	public void testCombineArrays2() {
		String[] combinedArrays1={"tiger", "zebra","code"};
		assertArrayEquals(combinedArrays1,method.combineArrays(array6, array7));
	}
	@Test
	public void testMaxNum1() {
		int[] maxNum1={6,99,3,45,0,-234};
		assertEquals(99,method.maxNum(maxNum1));
	}
	@Test
	public void testMaxNum2() {
		int[] maxNum2={-234,66,3,1,0,567,99};
		assertEquals(567,method.maxNum(maxNum2));
	}
	@Test
	public void testMaxNum3() {
		int[] maxNum3={-1};
		assertEquals(-1,method.maxNum(maxNum3));
	}
	@Test
	public void testRemoveDuplicates1() {
		int[] nums1={2,55,77,3,4,2};
		int[] expected= {2,55,77,3,4};
		assertArrayEquals(expected,method.removeDuplicates(nums1));
	}
	@Test
	public void testRemoveDuplicates2() {
		int[] nums2={-33,0,0,-33,5,1};
		int[] expected2= {-33,0,5,1};
		assertArrayEquals(expected2,method.removeDuplicates(nums2));
	}
	@Test
	public void testRemoveDuplicates3() {
		int[] nums3={5,7,1,99,5,5};
		int[] expected3= {5,7,1,99};
		assertArrayEquals(expected3,method.removeDuplicates(nums3));
	}
	@Test
	public void testRemoveDuplicates4() {
		int[] nums4={0,0,0};
		int[] expected4= {0};
		assertArrayEquals(expected4,method.removeDuplicates(nums4));
	}
	@Test
	public void testcombineNumbers1() {
		int[] nums1={0,0,0};
		int expected1= 0;
		assertEquals(expected1,method.combineNumbers(nums1));
	}
	@Test
	public void testcombineNumbers2() {
		int[] nums2={2,67,85,4};
		int expected2= 267854;
		assertEquals(expected2,method.combineNumbers(nums2));
	}
	@Test
	public void testcombineNumbers3() {
		int[] nums3={-1,2,67,85,4};
		int expected3= 1267854;
		assertEquals(expected3,method.combineNumbers(nums3));
	}
	
	private void assertArrayListEquals(ArrayList<String> expected, ArrayList<String> switchPairs) {
		for (int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i),switchPairs.get(i));
		}
		
	}
}
