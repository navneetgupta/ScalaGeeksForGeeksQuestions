package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 01-March-2017
 */

object SmallestMissingNumber {
  /*
   * http://www.geeksforgeeks.org/find-the-first-missing-number/
   * 
   * Given a sorted array of n integers where each integer is in the range from 0 to m-1 and m > n. 
   * Find the smallest number that is missing from the array.
   * */
  
  /*
   * Method 1 (Use Binary Search)
			For i = 0 to m-1, do binary search for i in the array. If i is not present in the array then return i.
			Time Complexity: O(m log n)
	 */
  
  /*
   * Method 2 (Linear Search)
   * If arr[0] is not 0, return 0. Otherwise traverse the input array starting from index 0, and for each pair of 
   * elements a[i] and a[i+1], find the difference between them. if the difference is greater than 1 then a[i]+1 is the missing number.
   * Time Complexity: O(n)
   * */
 
  /*
   * Method 3 (Use Modified Binary Search)
			In the standard Binary Search process, the element to be searched is compared with the middle element and on the basis 
			of comparison result, we decide whether to search is over or to go to left half or right half.
			In this method, we modify the standard Binary Search algorithm to compare the middle element with its index and make 
			decision on the basis of this comparison.

      …1) If the first element is not same as its index then return first index
      …2) Else get the middle index say mid
      …………a) If arr[mid] greater than mid then the required element lies in left half.
      …………b) Else the required element lies in right half.
      
   *	This method doesn’t work if there are duplicate elements in the array.
      Time Complexity: O(Logn)
   */
  
  @tailrec
  def smallestMissingNumber(arr:Array[Int], start: Int, end: Int): Int = {
    if(start > end) end+1
    else if(start != arr(start)) start
    else {
      val mid = (start+end)/2
      if(arr(mid)>mid) smallestMissingNumber(arr, start, mid)
      else smallestMissingNumber(arr, mid+1, end)
    }
  }
  
}