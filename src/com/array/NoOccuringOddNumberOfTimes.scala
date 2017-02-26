package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 26-Feb-2017
 */

object NoOccuringOddNumberOfTimes {
  /*
   * http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
   * 
   * Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. 
   * Find the number in O(n) time & constant space.
   * 
   * A Simple Solution is to run two nested loops. The outer loop picks all elements one by one and inner loop counts number of occurrences of the element picked by outer loop. Time complexity of this solution is O(n2).
	 * A Better Solution is to use Hashing. Use array elements as key and their counts as value. Create an empty hash table. One by one traverse the given array elements and store counts. Time complexity of this solution is O(n). But it requires extra space for hashing.
	 * The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring element. Please note that XOR of two elements is 0 if both elements are same and XOR of a number x with 0 is x.
   * */
  
  def getOddOccurenceNumber(arr: Array[Int]): Int = 
    arr.foldLeft(0)((a,b) => a ^ b)
  
}